package com.ufide.proyectofinal;

public class Configuracion {
    //C:\Users\User\Documents\NetBeansProjects\GITHUB\proyecto_final_Estructura_de_datos_2022
    //C:\\Users\\roberto.cervantes\\Documents\\NetBeansProjects\\proyecto_final_Estructura_de_datos_2022-main\\ProyectoFinal\\
    //C:\Users\Extremetech\Documents\GitHub\Estructura_de_Datos\proyecto_final_Estructura_de_datos_2022\ProyectoFinal
    
        
        String carpeta="C:\\Users\\Extremetech\\Documents\\GitHub\\Estructura_de_Datos"
            + "\\proyecto_final_Estructura_de_datos_2022\\ProyectoFinal\\";
    String archivo="Datos.xlsx";

    public Configuracion() {
    }

    public String getCarpeta() {
        return carpeta;
    }

    public void setCarpeta(String carpeta) {
        this.carpeta = carpeta;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivoVehiculos) {
        this.archivo = archivoVehiculos;
    }
    
    
}
