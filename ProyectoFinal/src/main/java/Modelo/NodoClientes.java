
package Modelo;

import Modelo.Clientes;

public class NodoClientes {
//  Atributos de la clase
    Clientes cliente;
    private NodoClientes siguiente;
    
//  Constructor vacio para ahorrar futuros problemas
    public NodoClientes() {
    }

//  Constructos de la clase
    public NodoClientes(Clientes cliente) {
        this.cliente = cliente;
    }
    
//    Getters y Setters de la clase
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
