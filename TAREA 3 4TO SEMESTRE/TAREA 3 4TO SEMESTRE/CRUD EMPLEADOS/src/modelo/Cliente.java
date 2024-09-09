
package modelo;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

public class Cliente extends Persona{
    private String nit;
    private int id;
    Conexion cn;
    
    public Cliente(){}

    public Cliente(int id, String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.id = id;
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public void crear(){
        try {
            PreparedStatement parametro;
            cn = new Conexion();
            cn.abrir_conexion();
            String query = "INSERT INTO clientes (nit, nombres, apellidos, direccion, telefono, fecha_nacimiento) VALUES ( ?, ?, ?, ?, ?, ?);";
            parametro = (PreparedStatement) cn.conexionDB.prepareStatement(query);
            parametro.setString(1, getNit());
            parametro.setString(2, getNombres());
            parametro.setString(3, getApellidos());
            parametro.setString(4, getDireccion());
            parametro.setString(5, getTelefono());
            parametro.setString(6, getFecha_nacimiento());
            int executar = parametro.executeUpdate();
            
             JOptionPane.showMessageDialog(null,"Ingreso Exitoso"  + Integer.toString(executar));
            cn.cerrar_conexion();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Ingreso Exitoso"  + ex.getMessage());
            //System.out.println("Error en crear: "+ ex.getMessage());
        }
    }
    
    @Override
    public DefaultTableModel leer(){
        DefaultTableModel tabla = new DefaultTableModel();
        try{
            cn = new Conexion();
            cn.abrir_conexion();
            String query = "Select * from clientes;";
            ResultSet consulta = cn.conexionDB.createStatement().executeQuery(query);
            String encabezado[] = {"id_clientes","nit", "nombres","apellidos","direccion","telefono","fecha_nacimiento"};
            tabla.setColumnIdentifiers(encabezado);
            String datos[] = new String[7];
            while(consulta.next()){
                datos[0]= consulta.getString("id_clientes");
                datos[1]= consulta.getString("nit");
                datos[2]= consulta.getString("nombres");
                datos[3]= consulta.getString("apellidos");
                datos[4]= consulta.getString("direccion");
                datos[5]= consulta.getString("telefono");
                datos[6]= consulta.getString("fecha_nacimiento");
                tabla.addRow(datos);
        }
            cn.cerrar_conexion();
        }catch(SQLException ex){
            cn.cerrar_conexion();
             JOptionPane.showMessageDialog(null,"Error al leer los datos"  + ex.getMessage());
           // System.out.println("Error leer: " + ex.getMessage());
        }
        
        
        return tabla;
    }
    
    @Override
    public void actualizar(){    
        try {
            PreparedStatement parametro;
            cn = new Conexion();
            cn.abrir_conexion();
            String query = "update clientes set nit = ?, nombres = ?, apellidos = ?, direccion = ?, telefono = ?, fecha_nacimiento = ?" + 
                    "where id_clientes = ?";
            parametro = (PreparedStatement) cn.conexionDB.prepareStatement(query);
            parametro.setString(1, getNit());
            parametro.setString(2, getNombres());
            parametro.setString(3, getApellidos());
            parametro.setString(4, getDireccion());
            parametro.setString(5, getTelefono());
            parametro.setString(6, getFecha_nacimiento());
            parametro.setInt(7, getId());
            int executar = parametro.executeUpdate();
             JOptionPane.showMessageDialog(null,"Actualizacion Exitosa"  + Integer.toString(executar));
            //System.out.println("Actualizacion exitosa..." + Integer.toString(executar));
            cn.cerrar_conexion();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Actualizacion Exitosa"  + ex.getMessage());
        
            //System.out.println("Error al actualizar: " + ex.getMessage());
        }
    }
    @Override
    public void eliminar(){try {
            PreparedStatement parametro;
            cn = new Conexion();
            cn.abrir_conexion();
            String query = "delete from clientes where id_clientes = ?";
            parametro = (PreparedStatement) cn.conexionDB.prepareStatement(query);
            parametro.setInt(1, getId());
            int executar = parametro.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro Eliminado"  + Integer.toString(executar));
            //System.out.println("Registro eliminado..." + Integer.toString(executar));
            cn.cerrar_conexion();
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Error al eliminar"  + ex.getMessage());
            //System.out.println("Error al eliminar: "+ ex.getMessage());
        }
        }
}
