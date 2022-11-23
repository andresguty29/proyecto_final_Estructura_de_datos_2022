//
package com.ufide.proyectofinal;
//Se realizan el ingreso de vehiculos a una lista Simple

import java.util.ArrayList;

public class ListaVehiculos {

    private NodoVehiculos cabeza;

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

    public void modifica(Vehiculos p) {
        if (cabeza != null) {
            NodoVehiculos aux = cabeza;
            while (aux != null && aux.getVehiculo().getNumeroPlaca()
                    != p.getNumeroPlaca()) {
                aux = aux.getAtras();
            }
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

            } else {
                String mensaje = "NO SE ENCUENTRA LA PLACA";
            }
        }
    }

    public Vehiculos verifica(String i) {
        Vehiculos verifica = null;
        if (cabeza != null) {
            if (cabeza.getVehiculo().getNumeroPlaca() == i) {
                cabeza = cabeza.getAtras();
            } else {
                NodoVehiculos aux = cabeza;
                while (aux.getAtras() != null && aux.getAtras().
                        getVehiculo().getNumeroPlaca() != i) {
                    aux = aux.getAtras();
                }
                if (aux.getAtras() != null && aux.getAtras().getVehiculo()
                        .getNumeroPlaca() == i) {
                    aux.getVehiculo().getAnnio();

                    verifica = aux.getAtras().getVehiculo();
                    aux.setAtras(aux.getAtras().getAtras());

                }

            }
        }

        return verifica;
    }

    public ArrayList<NodoVehiculos> listaVehiculos() {
        ArrayList<NodoVehiculos> listaVehiculos = new ArrayList<>();
        NodoVehiculos aux = cabeza;
        while (aux != null) {
            listaVehiculos.add(aux);
            aux = aux.getAtras();
        }
        return listaVehiculos;
    }

}
