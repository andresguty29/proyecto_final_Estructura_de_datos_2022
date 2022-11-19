//
package com.ufide.proyectofinal;
//Se realizan el ingreso de vehiculos a una lista Simple

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
            while (aux != null && aux.getVehiculo().getNumeroPlaca() != p.getNumeroPlaca()) {
                aux = aux.getAtras();
            }
            if (aux != null && aux.getVehiculo().getNumeroPlaca() == p.getNumeroPlaca()) {
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
}
