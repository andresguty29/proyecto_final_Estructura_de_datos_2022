package com.ufide.proyectofinal;

import java.io.*;

public class ManejoArchivos {
    
    public void crearArchivos(String archivo){
        PrintWriter pw=null;
        try {
            File fl=new File(archivo);
            if(!fl.exists()){
                pw = new PrintWriter(fl);
                pw.close();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } 
    }
    
    public void escribirArchivo(String archivo, String texto){
        PrintWriter pw=null;
        try {
            File fl=new File(archivo);
            pw = new PrintWriter(new FileWriter(fl,true));
            pw.println(texto);
            pw.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public ListaVehiculos leerArchivoVehiculos(String archivo){
        ListaVehiculos lista=new ListaVehiculos();
        try {
            File fl=new File(archivo);
            FileReader fr=new FileReader(fl);
            BufferedReader bf=new BufferedReader(fr);
            String linea;
            while ((linea=bf.readLine())!=null) {
                String[] datos= linea.split("%");
                lista.inserta(new Vehiculos(
                        datos[0],
                        datos[1],
                        datos[2],
                        Integer.parseInt(datos[3]),
                        datos[4],
                        datos[5],
                        datos[6],
                        Integer.parseInt(datos[7]),
                        Double.parseDouble(datos[8]),
                        datos[9],
                        Boolean.valueOf(datos[10]),
                        Boolean.valueOf(datos[11]),
                        Boolean.valueOf(datos[12]),
                        Boolean.valueOf(datos[13]),
                        Boolean.valueOf(datos[14]),
                        Boolean.valueOf(datos[15]),
                        Boolean.valueOf(datos[16])
                ));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    
    /*
        
    
    public void renombrarArchivo(String archivo, String nuevoNombre){
        File flAnterior = new File(archivo);
        File flNuevo = new File(nuevoNombre);
        if (flAnterior.renameTo(flNuevo)) {
            System.out.println("archivo renombrado");
        } else {
            System.out.println("error");
        }
    }
    
    public void escribirArchivo(String archivo, String texto){
        PrintWriter pw=null;
        try {
            File fl=new File(archivo);
            pw = new PrintWriter(new FileWriter(fl,true));
            pw.println(texto);
            pw.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public boolean verificarArchivo(String archivo){
        File fl=new File(archivo);
        if(fl.exists()){
            System.out.println("Archivo existe");
        }else{
            System.out.println("Archivo NO existe");
        }
            return fl.exists();
    }
    
    public void leerArchivo(String archivo){
        try {
            File fl=new File(archivo);
            FileReader fr=new FileReader(fl);
            BufferedReader bf=new BufferedReader(fr);
            String linea;
            while ((linea=bf.readLine())!=null) {
                System.out.println(linea);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void crearDirectorio(String directorio){
        File fl=new File(directorio);
        if(!fl.exists()){
            if(fl.mkdirs()){
                System.out.println("Directorio creado");
            }else{
                System.out.println("Error al crear directorio");
            }
        }else{
            System.out.println("Directorio ya existe");
        }
    }
    
    public void leerDirectorio(String directorio){
        File fl=new File(directorio);
        String[] archivos = fl.list();
        for (int i = 0; i < archivos.length; i++) {
            System.out.println(archivos[i]);
        }
    }
    
    public void verificardirectorio(String directorio){
        File fl=new File(directorio);
        if(fl.isDirectory()){
            System.out.println("es un directorio");
        }else{
            System.out.println("NO existe");
        }
    }
    
    public void listarDirectorio(String directorio){
        File fl=new File(directorio);
        String[] listado=fl.list();
        if(listado==null || listado.length==0){
            System.out.println("Carpeta vacia");
        }else{
            for (int i = 0; i < listado.length; i++) {
            System.out.println(listado[i]);
            }
        }
    }*/
}
