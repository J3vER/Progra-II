package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private final String puerto = "3306";
    private final String db = "actividad_3";
    private final String urlConexion = "jdbc:mysql://localhost:3306/actividad_3";
    private final String usuario= "root";
    private final String contraseña= "Jever2024.";
    private final String jbdc =  "com.mysql.cj.jdbc.Driver";    
    
    public Connection conexionDB;
    public void abrir_conexion(){
        try{
            Class.forName(jbdc);
            conexionDB = DriverManager.getConnection(urlConexion,usuario,contraseña);
            System.out.println("Conexion Exitosa");
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Algo salio mal :("+ ex.getMessage());
        }
    
}
        public void cerrar_conexion(){
        try{
            conexionDB.close();
        }catch(SQLException ex){
            System.out.println("Algo salio mal :("+ ex.getMessage());
        }
    
}
}