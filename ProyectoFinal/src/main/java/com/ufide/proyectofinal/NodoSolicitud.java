
package com.ufide.proyectofinal;

public class NodoSolicitud {
    private Solicitudes solicitud;
    private NodoSolicitud next;

    public NodoSolicitud(Solicitudes solicitud, NodoSolicitud next) {
        this.solicitud = solicitud;
        this.next = null;
 
    }
    public NodoSolicitud() {
    }

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
