
package Modelo;

import Modelo.Vehiculos;

public class NodoVehiculos {
//  Atributos de la clase
    private Vehiculos vehiculo;
    private NodoVehiculos atras;

//  Constructos de la clase
    public NodoVehiculos(Vehiculos vehiculo) {
        this.vehiculo = vehiculo;
    }
    
//    Getters y Setters de la clase
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
