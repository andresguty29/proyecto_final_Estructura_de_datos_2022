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
    
    private void insertar(Clientes cliente){
        NodoClientes temp = new NodoClientes (cliente);
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
   
    
    
}
