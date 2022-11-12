
package com.ufide.proyectofinal;

public class NodoSolicitud {
    private Solicitudes solicitud;
    private NodoSolicitud next;
    private NodoSolicitud back;

    public NodoSolicitud(Solicitudes solicitud) {
        this.solicitud = solicitud;
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

    public NodoSolicitud getBack() {
        return back;
    }

    public void setBack(NodoSolicitud back) {
        this.back = back;
    }
    
}
