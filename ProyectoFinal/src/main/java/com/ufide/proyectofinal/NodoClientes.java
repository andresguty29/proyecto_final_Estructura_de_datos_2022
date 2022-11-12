
package com.ufide.proyectofinal;

public class NodoClientes {
    Clientes cliente;
    private NodoClientes siguiente;

    public NodoClientes() {
    }

    public NodoClientes(Clientes cliente) {
        this.cliente = cliente;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public NodoClientes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoClientes siguiente) {
        this.siguiente = siguiente;
    }
    
}
