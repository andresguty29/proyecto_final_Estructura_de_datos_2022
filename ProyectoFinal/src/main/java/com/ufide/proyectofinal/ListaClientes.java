/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufide.proyectofinal;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaClientes {
//    Atributo de la clase
    private NodoClientes cabeza;
    
//    Metodo que recibe un nuevo dato con tipo Clientes p 
//    y lo inserta dentro de la lista de clientes 
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
   
//    Metodo para buscar un dato tipo Clientes p dentro de la lista, y le 
//    modifica los datos
    public void modificar(Clientes p){
        if (cabeza != null){
            NodoClientes aux = cabeza;
//            Se crea un while para recorrer la cola en donde aux debe ser 
//            diferente a nulo y el aux.getCliente().getCedula() es 
//            diferente a p.getCedula(), la cual es la cedula que se solicita 
//            como entrada y el aux.getCliente().getCedula el que se desea 
//            encontrar haciendo que mientras esas condiciones se cumplan, 
//            recorrerá toda la lista
            while (aux != null && aux.getCliente().getCedula()
                !=p.getCedula()){
                aux = aux.getSiguiente();
            }
//            Aqui se da la condicion importante la cual es que la cedula 
//            solicitada(p.getCedula) se ha encontrado en la lista, por lo que
//            la lista pasará a pedir los datos respectivos para modificar todos
//            los datos, utilizando el aux.getCliente().set de cada dato y asignando las
//            modificaciones con un p.get de los datos    
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
    
//    Este metodo se encarga de consultar con una entrada tipo String p, 
//    si un cliente se encuentra en la lista mediante el uso de su cedula, 
//    brindando al final la cedula y el nombre del cliente
    public String consultar (String p){
        String consulta = null;
        if (this.cabeza != null){
            if(cabeza.getCliente().getCedula().equals(p)){
                consulta = cabeza.getCliente().cedula + " " + cabeza.getCliente().nombre;
            }
        } else {
            consulta = "No se han encontrado resultados";
            // Falta crear la logica para los casos que no calzan
            //Falta verificar si la logica funciona
        }  
        // Falta agregar el return correcto
        //Falta verificar si el return funciona
        return consulta;
    }
    
//  Metodo para verificar si un cliente existe dentro de la lista, utilizando
//  como parametro de entrada un String cedula
    public Clientes buscar(String cedula){
        Clientes buscado=null;
        if(this.cabeza!=null){
//          Si el dato de cabeza.getCliente().getCedula() es igual(equals) al 
//          parametro buscado(cedula), entraria en esta condicional 
//          convirtiendo la variable "buscado" en cabeza.getCliente()
            if(cabeza.getCliente().getCedula().equals(cedula)){
                buscado=cabeza.getCliente();
            }else{
                NodoClientes aux=cabeza;
//                Se usa un while condicionante que determina que mientras 
//                aux.getSiguiente() sea diferente a nulo, el ciclo se ejecuta
                while(aux.getSiguiente()!=null){
//                  Si el aux.getSiguiente() es diferente a nulo y al mismo 
//                  tiempo, el getCedula de aux es igual(equals)al parametro 
//                  cedula que se pidio de entrada, en ese caso se entra en la 
//                  condicion
                    if(aux.getSiguiente()!=null && 
                            aux.getSiguiente().getCliente().getCedula().equals(cedula)){
                        buscado=aux.getSiguiente().getCliente();
                        aux=aux.getSiguiente();
                    }
                }
            }
        }
//      Retorna el elemento buscado, el cual es el aux.getSiguiente().getCliente()
        return buscado;
    }
    
//  Metodo que se encarga de eliminar un cliente dentro de la lista, utiliza un
//  parametro de entrada tipo String cedula
    public void elimina (String cedula) {
        if(this.cabeza!=null){
            
            if(cabeza.getCliente().getCedula().equals(cedula)){
                cabeza = cabeza.getSiguiente();
            }else{
                NodoClientes aux=cabeza;
                NodoAlquiler ext= new NodoAlquiler();
                while(aux.getSiguiente()!=null){
                    aux=aux.getSiguiente();
                    if(aux.getSiguiente()!=null && 
                            aux.getSiguiente().getCliente().getCedula().equals(cedula)){
                       // if()AÑADIR SI EL USUARIO TIENE ALQUILERES NO SE PUEDE ELIMINAR
                       
                      //Falta verificar si esta condicion funciona
                       if(ext.getAtras().getAlquiler().getCedula().equals(cedula)){
                           JOptionPane.showMessageDialog(null, "El cliente contiene alquileres en vigencia.");
                       }
                        aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    }else if(aux.getSiguiente()==null){
                        aux.setSiguiente(null);
                    }
                }
            }
        }
    }
    
//  Se crea el metodo tipo ArrayList de la listaClientes
    public ArrayList<NodoClientes> listaClientes() {
        ArrayList<NodoClientes> listaClientes = new ArrayList<>();
        NodoClientes aux = cabeza;
        while (aux != null) {
            listaClientes.add(aux);
            aux = aux.getSiguiente();
        }
//      Retorna la listaClientes la cual mostrará el contenido de la lista
//      guardada en un ArrayList<NodoClientes> previablemente llenada con el 
//      contenido del NodoClientes
        return listaClientes;
    }
    
    
}
