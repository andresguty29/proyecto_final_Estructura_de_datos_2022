
package com.ufide.proyectofinal;


public class Vehiculos {
//  Atributos de la clase Vehiculos
    String numeroPlaca;
    String marca;
    String modelo;
    int annio;
    String color;
    String cilindrada;
    String tipoCombustible;
    int capacidadPasajeros;
    double precioAlquierXDia;
    String estado;
    boolean arranqueSinLLave;
    boolean cargadorInalambrico;
    boolean navegadorTraffico;
    boolean sensores;
    boolean camaraTrasera;
    boolean wifi;
    boolean monitoreoSatelital;

//  Constructor vacio para ahorrar futuros problemas
    public Vehiculos() {
    }
    
//  Constructor de la clase
    public Vehiculos(String numeroPlaca, String marca, String modelo, int annio, 
            String color, String cilindrada, String tipoCombustible, 
            int capacidadPasajeros, double precioAlquierXDia, String estado, 
            boolean arranqueSinLLave, boolean cargadorInalambrico, 
            boolean navegadorTraffico, boolean sensores, boolean camaraTrasera, 
            boolean wifi, boolean monitoreoSatelital) {
        this.numeroPlaca = numeroPlaca;
        this.marca = marca;
        this.modelo = modelo;
        this.annio = annio;
        this.color = color;
        this.cilindrada = cilindrada;
        this.tipoCombustible = tipoCombustible;
        this.capacidadPasajeros = capacidadPasajeros;
        this.precioAlquierXDia = precioAlquierXDia;
        this.estado = estado;
        this.arranqueSinLLave = arranqueSinLLave;
        this.cargadorInalambrico = cargadorInalambrico;
        this.navegadorTraffico = navegadorTraffico;
        this.sensores = sensores;
        this.camaraTrasera = camaraTrasera;
        this.wifi = wifi;
        this.monitoreoSatelital = monitoreoSatelital;
    }

//    Getters y Setters de la clase
    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
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

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public double getPrecioAlquierXDia() {
        return precioAlquierXDia;
    }

    public void setPrecioAlquierXDia(double precioAlquierXDia) {
        this.precioAlquierXDia = precioAlquierXDia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
