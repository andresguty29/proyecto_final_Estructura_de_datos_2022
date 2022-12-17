package Controlador;

import Modelo.NodoSolicitud;
import Modelo.Solicitudes;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class PilaSolicitudes{
//    Atributos de la clase
    private static NodoSolicitud cima;
    private Solicitudes solicitud;
    int tamano = 0;

    public PilaSolicitudes() {
        this.cima=null;
        tamano = 0;
    }
   
//  Metodo para agregar datos a una pila
    public void push(Solicitudes d){
        NodoSolicitud nodo = new NodoSolicitud (d);
        if(cima != null){
            nodo.setNext(cima);
            cima = nodo;
        } else if (cima == null){
             cima = nodo;
        }
    }
    
    public void estado (){
        solicitud.setEstadoSolicitud("Registrada");
        JOptionPane.showMessageDialog(null, "Su solicitud ha sido registrada "
                + "con éxito");
    }
    
//  Metodo que revisa que la pila este vacia o si contiene datos
    public boolean vacia (){
        return cima == null;
    }
    
//  Metodo que busca un dato de entrada tipo String idSolicitud y revisa 
//  si se encuentra dentro de la pila
    public NodoSolicitud buscar(String idSolicitud){
        NodoSolicitud nodo = null;
        return nodo;
    }
    
    
    public void Modificar(NodoSolicitud nodo){

    }
    //MODIFICIAR SOLICITUDES 
   /* public void pop(){
        if (!Vacia()) {
            // Asigna como primer node al siguiente de la pila.
            this.cima = this.cima.getSiguiente();
            // Decrementa el contador del tamaño de la pila
            this.largo--;
        }
    }
    
    public boolean search(int reference) {
        // Crea una copia de la pila.
        Node aux = cima;
        // Bandera para verificar si exist el elemento a search.
        boolean exist = false;
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while (exist != true && aux != null) {
            // Compara si el value del node es igual que al de reference.
            if (reference == aux.getValor()) {
                // Cambia el value de la bandera.
                exist = true;
            } else {
                // Avanza al siguiente node.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el value de la bandera.
        return exist;
    }
    
        public void popModificado(int reference){
        // Consulta si el value exist en la pila.
        if (search(reference)) {
            // Crea una pila auxiliar para guardar los valuees que se 
            // vayan desapilando de la pila original.
            Node cimapPilaAux = null;
            // Recoore la pila hasta llegar al node que tenga el value
            // igual que el de reference.
            while(reference != cima.getValor()){
                // Crea un node temporal para agregarlos a la pila auxiliar.
                Node temp = new Node();
                // Ingresa el value al node temporal.
                temp.setValor(cima.getValor());
                // Consulta si la pila auxiliar no a sido inicializada.
                if(cimapPilaAux == null){
                    // Inicializa la pila auxiliar.
                    cimapPilaAux = temp;
                }
                // Caso contrario si la pila auxiliar ya contiene elementos
                // los agrega al start.
                else{
                    temp.setSiguiente(cimapPilaAux);
                    cimapPilaAux = temp;
                }
                // Elimina el node del tope de la pila hasta llegar al node
                // que se desea eliminar.
                pop();
            }
            // Elimina el node que coincide con el de reference.
            pop();
            // Regresa los valuees de la pila auxiliar a la pila original
            // mientras la pila auxiliar tenga elementos.
            while(cimapPilaAux != null){
                // Utiliza el metodo push para regresar los elementos a 
                // la pila original.
                push(cimapPilaAux.getValor());
                // Avansa al siguiente node de la pila auxiliar.
                cimapPilaAux = cimapPilaAux.getSiguiente();
            }
            // Libera la memoria utilizada por la pila auxiliar.
            cimapPilaAux = null;
        }
        else{
            System.out.println("El nodo indicado no existe");
        }
    } */
    
//  Se crea el metodo tipo ArrayList de la listaSolicitudes
    public static ArrayList<NodoSolicitud> listaSolicitudes() {
        ArrayList<NodoSolicitud> listaSolicitud = new ArrayList<>();
        NodoSolicitud aux = cima;
        while (aux != null) {
            listaSolicitud.add(aux);
            aux = aux.getNext();
        }
//      Retorna la listaSolicitud la cual mostrará el contenido de la lista
//      guardada en un ArrayList<NodoSolicitud> previablemente llenada con el 
//      contenido del NodoSolicitud
        return listaSolicitud;
    }

}
