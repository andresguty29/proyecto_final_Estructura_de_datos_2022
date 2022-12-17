
package Modelo;

import Modelo.Solicitudes;

public class NodoSolicitud {
//    Atributos de la clase
    Solicitudes solicitud;
    private NodoSolicitud next;

//    Constructor de la clase
    public NodoSolicitud(Solicitudes solicitud) {
        this.solicitud = solicitud;
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
