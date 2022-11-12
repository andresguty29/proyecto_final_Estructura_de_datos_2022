/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufide.proyectofinal;

/**
 *
 * @author User
 */
public class NodoVehiculos {
    private Vehiculos vehiculo;
    private NodoVehiculos atras;

    public NodoVehiculos(Vehiculos vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Vehiculos getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculos vehiculo) {
        this.vehiculo = vehiculo;
    }

    public NodoVehiculos getAtras() {
        return atras;
    }

    public void setAtras(NodoVehiculos atras) {
        this.atras = atras;
    }
}
