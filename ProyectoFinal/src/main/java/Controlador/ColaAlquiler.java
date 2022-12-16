
package Controlador;

import Modelo.Alquiler;
import Modelo.NodoAlquiler;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ColaAlquiler {
//    Atributos de la clase
    private static NodoAlquiler frente;
    private static NodoAlquiler ultimo;

//  Constructor vacio para ahorrar futuros problemas
    public ColaAlquiler() {
    }
    
    public void enCola(NodoAlquiler d){
        if(frente==null){
            frente=d;
            ultimo=d;
        }else{
            ultimo.setAtras(d);
            ultimo=d;
        }
    }
    
    //Se saca la primera solicitud de la cola para luego "atenderla"
    public NodoAlquiler atiende(){
        NodoAlquiler aux=frente;
        if(frente!=null){
            frente=frente.getAtras();
            aux.setAtras(null);
        }
        //Se retorna el aux siendo este el que esta en el frente
        return aux;
    }
    
    //Se modifica la cola con una entrada Alquiler a
    public void modificar(Alquiler a){
        try {
            if (frente != null) {
                NodoAlquiler aux = frente;
//            Se crea un while para recorrer la cola en donde aux debe ser 
//            diferente a nulo y el aux.getAlquiler().getIdSolicitud es 
//            diferente a a.getIdSolicitud, la cual es la ID que se solicita 
//            como entrada y el aux.getAlquiler().getIdSolicitud el que se desea 
//            encontrar haciendo que mientras esas condiciones se cumplan, 
//            recorrerá toda la cola
                while (aux != null && aux.getAlquiler().getIdSolicitud()
                        != a.getIdSolicitud()) {
                    aux = aux.getAtras();
                }
//            Aqui se da la condicion importante la cual es que la ID 
//            solicitada(a.idSolicitud) se ha encontrado en la cola, por lo que
//            la cola pasará a pedir los datos respectivos para modificar todos
//            los datos, utilizando el aux.getAlquiler().set de cada dato y asignando las
//            modificaciones con un a.get de los datos        
                if (aux != null && aux.getAlquiler().getIdSolicitud()
                        == a.getIdSolicitud()) {
                    aux.getAlquiler().setIdSolicitud(a.getIdSolicitud());
                    aux.getAlquiler().setFechaAlquiler(a.getFechaAlquiler());
                    aux.getAlquiler().setNumeroPlaca(a.getNumeroPlaca());
                    aux.getAlquiler().setCedula(a.getCedula());
                    aux.getAlquiler().setNombre(a.getNombre());
                    aux.getAlquiler().setCategoria(a.getCategoria());
                    aux.getAlquiler().setPrecioAlquierXDia(a.getPrecioAlquierXDia());
                    aux.getAlquiler().setCantidadDias(a.getCantidadDias());
                    aux.getAlquiler().setIVA(a.getIVA());
                    aux.getAlquiler().setTotalAPagar(a.getTotalAPagar());
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una linea");
        }
    }
    
    
    //Se eliminan solicitudes de la cola, con una entrada String idSolicitud
    public void elimina (String idSolicitud) {
        try {
            if (this.frente != null) {
                if (frente.getAtras().getAlquiler().getIdSolicitud().equals(idSolicitud)) {
                    frente = frente.getAtras();
                } else {
                    NodoAlquiler aux = frente;
//              Con un while se busca que la cola mientras se recorre, 
//              no pase a estar vacia
                    while (aux.getAtras() != null) {
                        aux = aux.getAtras();
//                  Si el aux.getAtras(), que es la logica para recorrer la cola,
//                  es diferente a nulo y al mismo tiempo el get.IdSolicitud 
//                  deber ser igual(equals) al idSolicitud que se ha pedido 
//                  como parametro de entrada
                        if (aux.getAtras() != null
                                && aux.getAtras().getAlquiler().getIdSolicitud().equals(idSolicitud)) {
                            aux.setAtras(aux.getAtras().getAtras());
                        } else if (aux.getAtras() == null) {
                            aux.setAtras(null);
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una linea");
        }
    }
    
    //Se buscan solicitudes dentro de la cola con una entrada String solicitud
    public Alquiler buscar(String solicitud){
        Alquiler buscado=null;
        if(this.frente!=null){
//          Si el dato de frente.getAlquiler().getIdSolicitud() es igual(equals)
//          al parametro buscado(solicitud), entraria en esta condicional
//          convirtiendo la variable "buscado" en frente.getAlquiler()
            if(frente.getAlquiler().getIdSolicitud().equals(solicitud)){
                buscado=frente.getAlquiler();
            }else{
                NodoAlquiler aux=this.frente;
//              Se usa un while condicionante que determina que mientras 
//              aux.getAtras() sea diferente a nulo, el ciclo se ejecuta
                while(aux.getAtras()!=null){
                    if(aux.getAtras().getAlquiler().getIdSolicitud()
                            .equals(solicitud)){
                        buscado=aux.getAtras().getAlquiler();
                    }
                    aux=aux.getAtras();
                }
            }
        }
//      Se retorna el dato encontrado en el aux.getAtras().getAlquiler()
        return buscado;
    }
    
    //Se crea el metodo tipo ArrayList de la listaAlquiler
    public static ArrayList<NodoAlquiler> listaAlquiler() {
        ArrayList<NodoAlquiler> listaAlquileres = new ArrayList<>();
        NodoAlquiler aux = frente;
        while (aux != null) {
            listaAlquileres.add(aux);
            aux = aux.getAtras();
        }
//      Retorna la listaAlquileres la cual mostrará el contenido de la lista
//      guardada en un ArrayList<NodoAlquiler> previablemente llenada con el 
//      contenido del NodoAlquiler
        return listaAlquileres;
    }
    
}
