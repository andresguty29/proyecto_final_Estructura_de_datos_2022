//
package Controlador;
//Se realizan el ingreso de vehiculos a una lista Simple

import Modelo.NodoVehiculos;
import Modelo.Vehiculos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaVehiculos {
//    Atributo de la clase
    private NodoVehiculos cabeza;

//    Metodo que recibe un nuevo dato con tipo Vehiculos p 
//    y lo inserta dentro de la lista de vehiculos
    public void inserta(Vehiculos p) {
        if (cabeza == null) {
            cabeza = new NodoVehiculos(p);
        } else if (p.getAnnio() < cabeza.getVehiculo().getAnnio()) {
            NodoVehiculos aux = new NodoVehiculos(p);
            aux.setAtras(cabeza);
            cabeza = aux;
        } else if (cabeza.getAtras() == null) {
            cabeza.setAtras(new NodoVehiculos(p));
        } else {
            NodoVehiculos aux = cabeza;
            while (aux.getAtras() != null
                    && aux.getAtras().getVehiculo().getAnnio()
                    < p.getAnnio()) {
                aux = aux.getAtras();
            }
            NodoVehiculos temp = new NodoVehiculos(p);
            temp.setAtras(aux.getAtras());
            aux.setAtras(temp);
        }
    }
// ESTA FUNCION HAY QUE REVISARLA PORQUE FUNCIONA A MEDIAS//

//    Metodo para buscar un dato tipo Vehiculos p dentro de la lista, y le 
//    modifica los datos
    public void modifica(Vehiculos p) {
        if (cabeza != null) {
            NodoVehiculos aux = cabeza;
//            Se crea un while para recorrer la lista en donde aux debe ser 
//            diferente a nulo y el aux.getVehiculo().getNumeroPlaca() es 
//            diferente a p.getNumeroPlaca(), la cual es el numero de placa que 
//            se solicita como entrada y el aux.getVehiculo().getNumeroPlaca() 
//              el que se desea encontrar haciendo que mientras esas condiciones 
//              se cumplan, recorrerá toda la lista
            while (aux != null && aux.getVehiculo().getNumeroPlaca()
                    != p.getNumeroPlaca()) {
                aux = aux.getAtras();
            }
//            Aqui se da la condicion importante la cual es que el numero de 
//            placa solicitado(p.getNumeroPlaca) se ha encontrado en la lista, 
//            por lo que la lista pasará a pedir los datos respectivos para 
//            modificar todos los datos, utilizando el aux.getVehiculo().set de 
//            cada dato y asignando las modificaciones con un p.get de los datos
            if (aux != null && aux.getVehiculo().getNumeroPlaca()
                    == p.getNumeroPlaca()) {
                //Solo cambia el resto 
                aux.getVehiculo().setMarca(p.getMarca());
                aux.getVehiculo().setModelo(p.getModelo());
                aux.getVehiculo().setAnnio(p.getAnnio());
                aux.getVehiculo().setColor(p.getColor());
                aux.getVehiculo().setCilindrada(p.getCilindrada());
                aux.getVehiculo().setTipoCombustible(
                        p.getTipoCombustible());
                aux.getVehiculo().setCapacidadPasajeros(
                        p.getCapacidadPasajeros());
                aux.getVehiculo().setPrecioAlquierXDia(
                        p.getPrecioAlquierXDia());
                aux.getVehiculo().setEstado(p.getEstado());
                aux.getVehiculo().setArranqueSinLLave(
                        p.isArranqueSinLLave());
                aux.getVehiculo().setCargadorInalambrico(
                        p.isCargadorInalambrico());
                aux.getVehiculo().setNavegadorTraffico(
                        p.isNavegadorTraffico());
                aux.getVehiculo().setSensores(p.isSensores());
                aux.getVehiculo().setCamaraTrasera(
                        p.isCamaraTrasera());
                aux.getVehiculo().setWifi(p.isWifi());
                aux.getVehiculo().setMonitoreoSatelital(
                        p.isMonitoreoSatelital());
            }
        }
    }
    
//  Metodo para verificar si un vehiculo existe dentro de la lista, utilizando
//  como parametro de entrada un String placa
    public Vehiculos buscar(String placa) {
        Vehiculos buscado = null;

        if (this.cabeza != null) {
//          Si el dato de cabeza.getVehiculo().getNumeroPlaca() es igual(equals)
//            al parametro buscado(placa), entraria en esta condicional 
//          convirtiendo la variable "buscado" en cabeza.getVehiculo()
            if (cabeza.getVehiculo().getNumeroPlaca().equals(placa)) {
                buscado = cabeza.getVehiculo();
            } else {
                NodoVehiculos aux = cabeza;
//              Se usa un while condicionante que determina que mientras 
//              aux.getAtras() sea diferente a nulo, el ciclo se ejecuta
                while (aux.getAtras() != null && buscado==null) {
//                  Si el aux.getAtras() es diferente a nulo y al mismo 
//                  tiempo, el getNumeroPlaca de aux es igual(equals)al parametro 
//                  placa que se pidio de entrada, en ese caso se entra en la 
//                  condicion
                    if (aux.getAtras() != null
                            && aux.getAtras().getVehiculo().getNumeroPlaca().
                                    equals(placa)) {
                        buscado = aux.getAtras().getVehiculo();
                    }
                    aux = aux.getAtras();
                }
            }
        }
//      Retorna el elemento buscado, el cual es el aux.getAtras().getVehiculo()
        return buscado;
    }

    // ESTA FUNCION HAY QUE REVISARLA PORQUE FUNCIONA A MEDIAS//
    
//  Metodo que se encarga de eliminar un vehiculo dentro de la lista, utiliza un
//  parametro de entrada tipo String placa
    public void elimina(String placa) {
        if (this.cabeza != null) {
            if (cabeza.getVehiculo().getNumeroPlaca().equals(placa)) {
                cabeza = cabeza.getAtras();
            } else {
                NodoVehiculos aux = cabeza;
                while (aux.getAtras() != null
                        && aux.getAtras().getVehiculo().getNumeroPlaca() 
                        != placa) {
                    aux = aux.getAtras();
                }
                if (aux.getAtras() != null
                        && aux.getAtras().getVehiculo().getNumeroPlaca().
                                equals(placa)) {

                    if (aux.getAtras().getVehiculo().getEstado().
                            equals("Alquilado")) {
                        JOptionPane.showMessageDialog(null,
                        "Estado en alquilado. No es posible eliminar");

                    } else {
                        aux.setAtras(aux.getAtras().getAtras());
                    }

                }//Posible cambio 
                else if (aux.getAtras() == null) {
                    aux.setAtras(null);
                }
            }
        }
    }

//  Se crea el metodo tipo ArrayList de la listaVehiculos
    public ArrayList<NodoVehiculos> listaVehiculos() {
        ArrayList<NodoVehiculos> listaVehiculos = new ArrayList<>();
        NodoVehiculos aux = cabeza;
        while (aux != null) {
            listaVehiculos.add(aux);
            aux = aux.getAtras();
        }
//      Retorna la listaVehiculos la cual mostrará el contenido de la lista
//      guardada en un ArrayList<NodoVehiculos> previablemente llenada con el 
//      contenido del NodoVehiculos
        return listaVehiculos;
    }

}
