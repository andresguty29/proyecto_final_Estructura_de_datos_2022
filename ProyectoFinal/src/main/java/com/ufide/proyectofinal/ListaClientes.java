/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufide.proyectofinal;

import java.util.HashSet;
import java.util.Set;

public class ListaClientes {
    
    private NodoClientes cabeza;
    
    private void insertar(Clientes p){
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
   
    private void modifica(Clientes p){
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
}
