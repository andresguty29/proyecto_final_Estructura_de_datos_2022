package com.ufide.proyectofinal;

public class Configuracion {
    String carpeta="C:\\Users\\roberto.cervantes\\Documents\\NetBeansProjects\\"
            + "proyecto_final_Estructura_de_datos_2022-main\\ProyectoFinal\\";
    String archivoVehiculos="Vehiculos.txt";

    public Configuracion() {
    }

    public String getCarpeta() {
        return carpeta;
    }

    public void setCarpeta(String carpeta) {
        this.carpeta = carpeta;
    }

    public String getArchivoVehiculos() {
        return archivoVehiculos;
    }

    public void setArchivoVehiculos(String archivoVehiculos) {
        this.archivoVehiculos = archivoVehiculos;
    }
    
    
}
