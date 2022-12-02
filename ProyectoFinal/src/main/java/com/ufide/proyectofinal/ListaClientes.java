/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufide.proyectofinal;

import java.util.ArrayList;

public class ListaClientes {
    
    private NodoClientes cabeza;
    
    public void insertar(Clientes p){
        NodoClientes temp = new NodoClientes (p);
        if (cabeza == null){
            cabeza = temp;
        } else { 
            // Esto busca enlazar la cabeza con el nodo actual
            NodoClientes current = cabeza;
            // Aqui recorre la lista hasta llegar al ultimo nodo
            while (current.getSiguiente()!= null){
                current = current.getSiguiente();
            }
            current.setSiguiente(temp);
        }
    }
   
    public void modificar(Clientes p){
        if (cabeza != null){
            NodoClientes aux = cabeza;
            while (aux != null && aux.getCliente().getCedula()
                !=p.getCedula()){
                aux = aux.getSiguiente();
            }
            if (aux != null && aux.getCliente().getCedula()
                    == p.getCedula()){
                aux.getCliente().setNombre(p.getNombre());
                aux.getCliente().setApellido1(p.getApellido1());
                aux.getCliente().setApellido2(p.getApellido2());
                aux.getCliente().setCategoria(p.getCategoria());
                aux.getCliente().setCorreo(p.getCorreo());
                aux.getCliente().setFechaNacimiento(p.getFechaNacimiento());
            }
        }
    }
    public Clientes consultar (String p){
        String consulta = null;
        if (this.cabeza != null){
            if(cabeza.getCliente().getCedula().equals(p)){
                consulta = cabeza.getCliente().cedula + " " + cabeza.getCliente().nombre;
            }
        } else {
            // Falta crear la logica para los casos que no calzan
        }  
        // Falta agregar el return correcto
        return null;
    }
    
    public Clientes buscar(String cedula){
        Clientes buscado=null;
        
        if(this.cabeza!=null){
            if(cabeza.getCliente().getCedula().equals(cedula)){
                buscado=cabeza.getCliente();
            }else{
                NodoClientes aux=cabeza;
                while(aux.getSiguiente()!=null){
                    if(aux.getSiguiente()!=null && 
                            aux.getSiguiente().getCliente().getCedula().equals(cedula)){
                        buscado=aux.getSiguiente().getCliente();
                        aux=aux.getSiguiente();
                    }
                }
            }
        }
        
        return buscado;
    }
    
    public void elimina (String cedula) {
        if(this.cabeza!=null){
            if(cabeza.getCliente().getCedula().equals(cedula)){
                cabeza = cabeza.getSiguiente();
            }else{
                NodoClientes aux=cabeza;
                while(aux.getSiguiente()!=null){
                    aux=aux.getSiguiente();
                    if(aux.getSiguiente()!=null && 
                            aux.getSiguiente().getCliente().getCedula().equals(cedula)){
                        aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    }else if(aux.getSiguiente()==null){
                        aux.setSiguiente(null);
                    }
                }
            }
        }
    }
    
    
    public ArrayList<NodoClientes> listaClientes() {
        ArrayList<NodoClientes> listaClientes = new ArrayList<>();
        NodoClientes aux = cabeza;
        while (aux != null) {
            listaClientes.add(aux);
            aux = aux.getSiguiente();
        }
        return listaClientes;
    }
    
    
}
