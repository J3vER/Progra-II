
package modelo;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

public class Empleado extends Persona{
    private String cod;
    private int id;
    private String po;
    Conexion cn;
    
    public Empleado(){}

    public Empleado(int id, String cod, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento, String po) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.id = id;
        this.cod = cod;
        this.po = po;
    }
        
        public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPo() {
        return po;
    }

    public void setPo(String po) {
        this.po = po;
    }

    public void crearp(){
        try {
            PreparedStatement parametro;
            cn = new Conexion();
            cn.abrir_conexion();
            String query = "INSERT INTO empleados (codigo, nombres, apellidos, direccion, telefono, fecha_nacimiento,id_puesto) VALUES (?,?,?,?,?,?,?);";
            parametro = (PreparedStatement) cn.conexionDB.prepareStatement(query);
            parametro.setString(1, getCod());
            parametro.setString(2, getNombres());
            parametro.setString(3, getApellidos());
            parametro.setString(4, getDireccion());
            parametro.setString(5, getTelefono());
            parametro.setString(6, getFecha_nacimiento());
            parametro.setString(7, getPo());
            int executar = parametro.executeUpdate();
             JOptionPane.showMessageDialog(null,"Ingreso Exitoso"  + Integer.toString(executar));
            cn.cerrar_conexion();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al ingresar los datos"  + ex.getMessage());
        }
    }
    
    public DefaultTableModel leerp(){
        DefaultTableModel tabla = new DefaultTableModel();
        try{
            cn = new Conexion();
            cn.abrir_conexion();
            String query = "select b.id_empleados, b.codigo, b.nombres, b.apellidos, b.direccion,b.telefono,b.fecha_nacimiento,a.puesto from empleados b inner join puestos a on a.id_puesto = b.id_puesto";
            ResultSet consulta = cn.conexionDB.createStatement().executeQuery(query);
            String encabezado[] = {"id_empleados","codigo", "nombres","apellidos","direccion","telefono","fecha_nacimiento","puesto"};
            tabla.setColumnIdentifiers(encabezado);
            String datos[] = new String[8];
            while(consulta.next()){
                datos[0]= consulta.getString("id_empleados");
                datos[1]= consulta.getString("codigo");
                datos[2]= consulta.getString("nombres");
                datos[3]= consulta.getString("apellidos");
                datos[4]= consulta.getString("direccion");
                datos[5]= consulta.getString("telefono");
                datos[6]= consulta.getString("fecha_nacimiento");
                datos[7]= consulta.getString("puesto");
                tabla.addRow(datos);
        }
            cn.cerrar_conexion();
        }catch(SQLException ex){
            cn.cerrar_conexion();
             JOptionPane.showMessageDialog(null,"Error al leer los datos"  + ex.getMessage());
        }
        return tabla;
    }
    
    public void actualizarp(){    
        try {
            PreparedStatement parametro;
            cn = new Conexion();
            cn.abrir_conexion();
            String query = "update empleados set codigo = ?, nombres = ?, apellidos = ?, direccion = ?, telefono = ?, fecha_nacimiento = ?, id_puesto = ?" + 
                    "where id_empleados= ?;";
            parametro = (PreparedStatement) cn.conexionDB.prepareStatement(query);
            parametro.setString(1, getCod());
            parametro.setString(2, getNombres());
            parametro.setString(3, getApellidos());
            parametro.setString(4, getDireccion());
            parametro.setString(5, getTelefono());
            parametro.setString(6, getFecha_nacimiento());
            parametro.setString(7, getPo());
            parametro.setInt(8, getId());
            int executar = parametro.executeUpdate();
             JOptionPane.showMessageDialog(null,"Actualizacion Exitosa"  + Integer.toString(executar));
            cn.cerrar_conexion();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Actualizacion Exitosa"  + ex.getMessage());
        }
    }
    public void eliminarp(){try {
            PreparedStatement parametro;
            cn = new Conexion();
            cn.abrir_conexion();
            String query = "delete from empleados where id_empleados = ?";
            parametro = (PreparedStatement) cn.conexionDB.prepareStatement(query);
            parametro.setInt(1, getId());
            int executar = parametro.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro Eliminado"  + Integer.toString(executar));
            cn.cerrar_conexion();
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Error al eliminar"  + ex.getMessage());
        }
        }
}

  
