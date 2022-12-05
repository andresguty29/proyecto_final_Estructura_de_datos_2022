
package com.ufide.proyectofinal;

import com.ufide.proyectofinal.NodoAlquiler;
import java.util.ArrayList;

public class ColaAlquiler {
    private static NodoAlquiler frente;
    private static NodoAlquiler ultimo;

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
    
    public NodoAlquiler atiende(){
        NodoAlquiler aux=frente;
        if(frente!=null){
            frente=frente.getAtras();
            aux.setAtras(null);
        }
        return aux;
    }
    
    public void modificar(Alquiler a){
        if (frente != null){
            NodoAlquiler aux = frente;
            while (aux != null && aux.getAlquiler().getIdSolicitud()
                != a.getIdSolicitud()) {
                aux = aux.getAtras();
            }
            if (aux != null && aux.getAlquiler().getIdSolicitud()
                    == a.idSolicitud){
                aux.getAlquiler().setIdSolicitud(a.idSolicitud);
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
    }
    
    public void insertar(Alquiler a){
        NodoAlquiler temp = new NodoAlquiler ();
        if (frente == null){
            frente = temp;
        } else { 
            // Esto busca enlazar la cabeza con el nodo actual
            NodoAlquiler current = frente;
            // Aqui recorre la lista hasta llegar al ultimo nodo
            while (current.getAtras()!= null){
                current = current.getAtras();
            }
            current.setAtras(temp);
        }
    }
    
    public void elimina (String idSolicitud) {
        if(this.frente!=null){
            if(frente.getAtras().getAlquiler().getIdSolicitud().equals(idSolicitud)){
                frente = frente.getAtras();
            }else{
                NodoAlquiler aux=frente;
                while(aux.getAtras()!=null){
                    aux=aux.getAtras();
                    if(aux.getAtras()!=null && 
                            aux.getAtras().getAlquiler().getIdSolicitud().equals(idSolicitud)){
                        aux.setAtras(aux.getAtras().getAtras());
                    }else if(aux.getAtras()==null){
                        aux.setAtras(null);
                    }
                }
            }
        }
    }
    
    public Alquiler buscar(String solicitud){
        Alquiler buscado=null;
        
        if(this.frente!=null){
            if(frente.getAlquiler().getIdSolicitud().equals(solicitud)){
                buscado=frente.getAlquiler();
            }else{
                NodoAlquiler aux=this.frente;
                while(aux.getAtras()!=null){
                    if(aux.getAtras()!=null && 
                            aux.getAtras().getAlquiler().getNumeroPlaca().equals(solicitud)){
                        buscado=aux.getAtras().getAlquiler();
                        aux=aux.getAtras();
                    }
                }
            }
        }
        return buscado;
    }
    
    public static ArrayList<NodoAlquiler> listaAlquiler() {
        ArrayList<NodoAlquiler> listaAlquileres = new ArrayList<>();
        NodoAlquiler aux = frente;
        while (aux != null) {
            listaAlquileres.add(aux);
            aux = aux.getAtras();
        }
        return listaAlquileres;
    }
    
}
