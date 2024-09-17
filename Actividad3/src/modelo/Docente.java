package modelo;

import java.sql.Timestamp;

public class Docente {
    
    public double salario;
    public String codigo_docente, fecha_ingreso ;
    public java.sql.Timestamp fecha_registro ;
    Conexion cn;
    
    public Docente(){}

    public Docente(String codigo_docente, double salario, String fecha_ingreso, java.sql.Timestamp fecha_registro) {
      this.codigo_docente = codigo_docente;
      this.salario = salario;
      this.fecha_ingreso = fecha_ingreso;
      this.fecha_registro = fecha_registro;
      
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Timestamp getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(java.sql.Timestamp fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getCodigo_docente() {
        return codigo_docente;
    }

    public void setCodigo_docente(String codigo_docente) {
        this.codigo_docente = codigo_docente;
    }
    
    
    protected void crear(){}
    protected void leer(){}
    protected void eliminar(){}
    protected void actualizar(){} 
}

    
    
   