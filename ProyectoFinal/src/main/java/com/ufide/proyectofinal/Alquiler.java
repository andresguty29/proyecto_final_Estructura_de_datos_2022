
package com.ufide.proyectofinal;

import java.util.Date;


public class Alquiler {
    String idSolicitud;
    String fechaAlquiler;
    String numeroPlaca;
    String cedula;
    String nombre;
    String categoria;
    double precioAlquierXDia;
    int cantidadDias;
    double IVA;
    double totalAPagar;

    public Alquiler() {
    }

    public Alquiler(String idSolicitud, String fechaAlquiler, String numeroPlaca, String cedula, String nombre, String categoria, double precioAlquierXDia, int cantidadDias, double IVA, double totalAPagar) {
        this.idSolicitud = idSolicitud;
        this.fechaAlquiler = fechaAlquiler;
        this.numeroPlaca = numeroPlaca;
        this.cedula = cedula;
        this.nombre=nombre;
        this.categoria = categoria;
        this.precioAlquierXDia = precioAlquierXDia;
        this.cantidadDias = cantidadDias;
        this.IVA = IVA;
        this.totalAPagar = totalAPagar;
    }

    public String getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(String fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecioAlquierXDia() {
        return precioAlquierXDia;
    }

    public void setPrecioAlquierXDia(double precioAlquierXDia) {
        this.precioAlquierXDia = precioAlquierXDia;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public double getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(double totalAPagar) {
        this.totalAPagar = totalAPagar;
    }
    
}
