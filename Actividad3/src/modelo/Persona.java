package modelo;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.text.ParseException;

public class Persona extends Docente {
    private String nit ,nombres, apellidos, direccion, telefono, fecha_nacimiento;
    Conexion cn;
    private int id_docente,id_persona;
    
    public Persona(){}

    public Persona(String nit, String codigo_docente, double salario, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento, String fecha_ingreso, java.sql.Timestamp fecha_registro) {
        super(codigo_docente, salario, fecha_ingreso, fecha_registro);
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nit = nit;
    }
    public Persona(String nit, String codigo_docente, double salario, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento, String fecha_ingreso, java.sql.Timestamp fecha_registro, int id_docente, int id_persona) {
        super(codigo_docente, salario, fecha_ingreso, fecha_registro);
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nit = nit;
        this.id_docente = id_docente;
        this.id_persona = id_persona;
    }
    
    public int getId_docente() {
        return id_docente;
    }

    public void setId_docente(int id_docente) {
        this.id_docente = id_docente;
    }
    
       public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    

 public void crearp() throws ParseException{
        try {
            PreparedStatement parametroPersona;
            PreparedStatement parametroDocente;
            cn = new Conexion();
            cn.abrir_conexion();
            cn.conexionDB.setAutoCommit(false);
            String queryPersona = "INSERT INTO Persona (nombres, apellidos, direccion, nit, telefono, fecha_nacimiento, codigo_docente) VALUES (?, ?, ?, ?, ?,?, ?)";
            String queryDocente = "INSERT INTO Docente (codigo_docente, salario, ingreso_laboral, fecha_registro) VALUES (?, ?, ?, ?)";
            
            parametroPersona = (PreparedStatement) cn.conexionDB.prepareStatement(queryPersona);
            parametroPersona.setString(1, getNombres());
            parametroPersona.setString(2, getApellidos());
            parametroPersona.setString(3, getDireccion());
            parametroPersona.setString(4, getNit());
            parametroPersona.setString(5, getTelefono());
            parametroPersona.setString(6, getFecha_nacimiento());
            parametroPersona.setString(7, getCodigo_docente());
            int executar = parametroPersona.executeUpdate();
            
            parametroDocente = (PreparedStatement) cn.conexionDB.prepareStatement(queryDocente);
            parametroDocente.setString(1, getCodigo_docente());
            parametroDocente.setDouble(2, getSalario());
            parametroDocente.setString(3, getFecha_ingreso());
            java.sql.Timestamp Fecha_registro = new java.sql.Timestamp(System.currentTimeMillis());
            parametroDocente.setTimestamp(4, Fecha_registro);
           int executarDocente = parametroDocente.executeUpdate();
        
            cn.conexionDB.commit();
          JOptionPane.showMessageDialog(null, "Ingreso Exitoso de la Persona");
    } catch (SQLException ex) {
        try {
            if (cn.conexionDB != null) {
                cn.conexionDB.rollback();
            }
        } catch (SQLException rollbackEx) {
        }
        JOptionPane.showMessageDialog(null, "Error al ingresar los datos: " + ex.getMessage());
    } finally {
        try {
            if (cn.conexionDB != null) {
                cn.conexionDB.setAutoCommit(true);
            }
            cn.cerrar_conexion();
        } catch (SQLException ex) {
        }
    }
}

    
    public DefaultTableModel leerp(){
        DefaultTableModel tabla = new DefaultTableModel();
        try{
            cn = new Conexion();
            cn.abrir_conexion();
            String query = "select b.nombres, a.id_docente, b.apellidos, b.direccion, b.nit, b.telefono, b.fecha_nacimiento, a.codigo_docente, a.salario, a.ingreso_laboral, b.id_persona, a.id_docente from persona b inner join docente a on a.codigo_docente = b.codigo_docente;";
            ResultSet consulta = cn.conexionDB.createStatement().executeQuery(query);
            String encabezado[] = {"codigo_docente","nombres", "apellidos","direccion","nit","telefono","fecha_nacimiento","salario","ingreso_laboral","id_persona","id_docente"};
            tabla.setColumnIdentifiers(encabezado);
            String datos[] = new String[11];
            while(consulta.next()){
                datos[0]= consulta.getString("codigo_docente");
                datos[1]= consulta.getString("nombres");
                datos[2]= consulta.getString("apellidos");
                datos[3]= consulta.getString("direccion");
                datos[4]= consulta.getString("nit");
                datos[5]= consulta.getString("telefono");
                datos[6]= consulta.getString("fecha_nacimiento");
                datos[7]= consulta.getString("salario");
                datos[8]= consulta.getString("ingreso_laboral");
                datos[9]= consulta.getString("id_persona");
                datos[10]= consulta.getString("id_docente");
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
            PreparedStatement parametroPersona;
            PreparedStatement parametroDocente;
            cn = new Conexion();
            cn.abrir_conexion();
            cn.conexionDB.setAutoCommit(false);
            String queryPersona = "update persona set nombres = ?, apellidos = ?, direccion = ?, nit = ?, telefono = ?, fecha_nacimiento = ?, codigo_docente = ? " + " where id_persona = ?; ";
            String queryDocente = "update docente set codigo_docente = ?, salario = ?, ingreso_laboral = ?, fecha_registro = ? " + " where id_docente = ?; ";
            
            parametroPersona = (PreparedStatement) cn.conexionDB.prepareStatement(queryPersona);
            parametroPersona.setString(1, getNombres());
            parametroPersona.setString(2, getApellidos());
            parametroPersona.setString(3, getDireccion());
            parametroPersona.setString(4, getNit());
            parametroPersona.setString(5, getTelefono());
            parametroPersona.setString(6, getFecha_nacimiento());
            parametroPersona.setString(7, getCodigo_docente());
            parametroPersona.setInt(8, getId_persona());
            int executar = parametroPersona.executeUpdate();
            
            parametroDocente = (PreparedStatement) cn.conexionDB.prepareStatement(queryDocente);
            parametroDocente.setString(1, getCodigo_docente());
            parametroDocente.setDouble(2, getSalario());
            parametroDocente.setString(3, getFecha_ingreso());
            java.sql.Timestamp Fecha_registro = new java.sql.Timestamp(System.currentTimeMillis());
            parametroDocente.setTimestamp(4, Fecha_registro);
            parametroDocente.setInt(5, getId_docente());
           int executarDocente = parametroDocente.executeUpdate();
        
            cn.conexionDB.commit();
          JOptionPane.showMessageDialog(null, "Actualizacion Exitosa de la Persona");
    } catch (SQLException ex) {
        try {
            if (cn.conexionDB != null) {
                cn.conexionDB.rollback();
            }
        } catch (SQLException rollbackEx) {
        }
        JOptionPane.showMessageDialog(null, "Error al actualizar los datos: " + ex.getMessage());
    } finally {
        try {
            if (cn.conexionDB != null) {
                cn.conexionDB.setAutoCommit(true);
            }
            cn.cerrar_conexion();
        } catch (SQLException ex) {
        }
    }
}
    
    public void eliminarp(){try {
            PreparedStatement parametroPersona;
            PreparedStatement parametroDocente;
            cn = new Conexion();
            cn.abrir_conexion();
            String queryd = "delete from docente where id_docente = ?";
            String queryp = "delete from persona where id_persona = ?";
            parametroDocente = (PreparedStatement) cn.conexionDB.prepareStatement(queryd);
            parametroDocente.setInt(1, getId_docente());
            int executarDocente = parametroDocente.executeUpdate();
            parametroPersona = (PreparedStatement) cn.conexionDB.prepareStatement(queryp);
            parametroPersona.setInt(1, getId_persona()); 
            int executar = parametroPersona.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro Eliminado"  + Integer.toString(executar));
            cn.cerrar_conexion();
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Error al eliminar"  + ex.getMessage());
        }
        }
        
}
