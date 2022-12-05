package com.ufide.proyectofinal;

public class NodoAlquiler {

    Alquiler alquiler;
    private NodoAlquiler atras;

    public NodoAlquiler() {
    }

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
