
package Modelo;

import java.util.Date;
/*Solicitarle al usuario, la cantidad de días que desea alquilar el vehículo, la cantidad mínima de pasajeros que debe permitir el vehículo, si tiene alguna preferencia por alguna marca, modelo o año en particular, y si requiere que el vehículo tenga alguna(s) extra(s) en particular.
Si el cliente hace una solicitud por 30 días o más automáticamente el sistema lo subirá de categoría. Por ejemplo, si el cliente que hace la solicitud tiene categoría plata y hace una solicitud de alquiler por 40 días, el sistema le asignará la categoría oro.*/
public class Solicitudes {
//  Atributos de la clase Solicitudes
    String idSolicitud;
    String estadoSolicitud;
    String fechaSolicitud;
    int cedula;
    String nombre;
    String categoria;
    int cantidadDias;
    int cantidadMinimaPasajeros;
    String marca;
    String modelo;
    String annio;
    boolean arranqueSinLLave;
    boolean cargadorInalambrico;
    boolean navegadorTraffico;
    boolean sensores;
    boolean camaraTrasera;
    boolean wifi;
    boolean monitoreoSatelital;

//  Constructor vacio para ahorrar futuros problemas
    public Solicitudes() {
    }

//  Constructor de la clase
    public Solicitudes(String idSolicitud, String estadoSolicitud, 
            String fechaSolicitud, int cedula, String nombre, 
            String categoria, int cantidadDias, int cantidadMinimaPasajeros, 
            String marca, String modelo, String annio, boolean arranqueSinLLave, 
            boolean cargadorInalambrico, boolean navegadorTraffico, 
            boolean sensores, boolean camaraTrasera, boolean wifi, 
            boolean monitoreoSatelital) {
        this.idSolicitud = idSolicitud;
        this.estadoSolicitud = estadoSolicitud;
        this.fechaSolicitud = fechaSolicitud;
        this.cedula = cedula;
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidadDias = cantidadDias;
        this.cantidadMinimaPasajeros = cantidadMinimaPasajeros;
        this.marca = marca;
        this.modelo = modelo;
        this.annio = annio;
        this.arranqueSinLLave = arranqueSinLLave;
        this.cargadorInalambrico = cargadorInalambrico;
        this.navegadorTraffico = navegadorTraffico;
        this.sensores = sensores;
        this.camaraTrasera = camaraTrasera;
        this.wifi = wifi;
        this.monitoreoSatelital = monitoreoSatelital;
    }

//    Getters y Setters de la clase
    public String getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getEstadoSolicitud() {
        return estadoSolicitud;
    }

    public void setEstadoSolicitud(String estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public int getCantidadMinimaPasajeros() {
        return cantidadMinimaPasajeros;
    }

    public void setCantidadMinimaPasajeros(int cantidadMinimaPasajeros) {
        this.cantidadMinimaPasajeros = cantidadMinimaPasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnnio() {
        return annio;
    }

    public void setAnnio(String annio) {
        this.annio = annio;
    }

    public boolean isArranqueSinLLave() {
        return arranqueSinLLave;
    }

    public void setArranqueSinLLave(boolean arranqueSinLLave) {
        this.arranqueSinLLave = arranqueSinLLave;
    }

    public boolean isCargadorInalambrico() {
        return cargadorInalambrico;
    }

    public void setCargadorInalambrico(boolean cargadorInalambrico) {
        this.cargadorInalambrico = cargadorInalambrico;
    }

    public boolean isNavegadorTraffico() {
        return navegadorTraffico;
    }

    public void setNavegadorTraffico(boolean navegadorTraffico) {
        this.navegadorTraffico = navegadorTraffico;
    }

    public boolean isSensores() {
        return sensores;
    }

    public void setSensores(boolean sensores) {
        this.sensores = sensores;
    }

    public boolean isCamaraTrasera() {
        return camaraTrasera;
    }

    public void setCamaraTrasera(boolean camaraTrasera) {
        this.camaraTrasera = camaraTrasera;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isMonitoreoSatelital() {
        return monitoreoSatelital;
    }

    public void setMonitoreoSatelital(boolean monitoreoSatelital) {
        this.monitoreoSatelital = monitoreoSatelital;
    }
    
    
    
}
