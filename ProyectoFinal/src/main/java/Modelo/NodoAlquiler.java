package Modelo;

import Modelo.Alquiler;

public class NodoAlquiler {
//  Atributos de la clase
    Alquiler alquiler;
    private NodoAlquiler atras;
    
//  Constructor vacio para ahorrar futuros problemas
    public NodoAlquiler() {
    }

    public NodoAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }
    
//    Getters y Setters de la clase
    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    public NodoAlquiler getAtras() {
        return atras;
    }

    public void setAtras(NodoAlquiler atras) {
        this.atras = atras;
    }
}
