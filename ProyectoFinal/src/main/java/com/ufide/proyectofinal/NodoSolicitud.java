
package com.ufide.proyectofinal;

public class NodoSolicitud {
//    Atributos de la clase
    private Solicitudes solicitud;
    private NodoSolicitud next;

//    Constructor de la clase
    public NodoSolicitud(Solicitudes solicitud, NodoSolicitud next) {
        this.solicitud = solicitud;
        this.next = null;
 
    }
//  Constructor vacio para ahorrar futuros problemas
    public NodoSolicitud() {
    }

//    Getters y Setters de la clase
    public Solicitudes getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitudes solicitud) {
        this.solicitud = solicitud;
    }

    public NodoSolicitud getNext() {
        return next;
    }

    public void setNext(NodoSolicitud next) {
        this.next = next;
    }

}
