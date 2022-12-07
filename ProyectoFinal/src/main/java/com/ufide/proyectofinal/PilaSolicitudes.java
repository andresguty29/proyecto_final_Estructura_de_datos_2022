package com.ufide.proyectofinal;

import java.util.ArrayList;


public class PilaSolicitudes{
    private static NodoSolicitud cima;
    private Solicitudes solicitud;
    int tamano = 0;

    public PilaSolicitudes() {
        this.cima=null;
    }

    public NodoSolicitud getCima() {
        return cima;
    }

    public void setCima(NodoSolicitud cima) {
        this.cima = cima;
    }
    
    
    public void push(NodoSolicitud d){
        if(this.vacia()){
            this.cima=d;
        }else{
        }
    }
    
    public boolean vacia (){
        return cima == null;
    }
    
    public NodoSolicitud buscar(String idSolicitud){
        NodoSolicitud nodo = null;
        return nodo;
    }
    
    public void Modificar(NodoSolicitud nodo){
        
    }
    
    public NodoSolicitud Elimina(NodoSolicitud nodo){
        NodoSolicitud auxiliar = cima;
        cima = cima.getNext();
        tamano --;
        return auxiliar;
    }
    
    public static ArrayList<NodoSolicitud> listaSolicitudes() {
        ArrayList<NodoSolicitud> listaSolicitud = new ArrayList<>();
        NodoSolicitud aux = cima;
        while (aux != null) {
            listaSolicitud.add(aux);
            aux = aux.getNext();
        }
        return listaSolicitud;
    }
    
    public void vaciar (){
        while (!vacia()){
            Elimina(cima);
        }
    }
}
