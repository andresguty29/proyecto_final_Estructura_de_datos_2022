
package Modelo;

import java.util.Date;

public class Clientes {
//  Atributos de la clase Clientes
    String cedula;
    String nombre;
    String apellido1;
    String apellido2;
    String fechaNacimiento;
    String correo;
    String categoria;

//  Constructor vacio para ahorrar futuros problemas
    public Clientes() {
    }

//  Constructor de la clase
    public Clientes(String cedula, String nombre, String apellido1, 
            String apellido2, String fechaNacimiento, String correo, 
            String categoria) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.categoria = categoria;
    }
    
//    Getters y Setters de la clase
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
