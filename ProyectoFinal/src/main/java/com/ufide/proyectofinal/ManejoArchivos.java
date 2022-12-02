package com.ufide.proyectofinal;

import java.io.File;
import java.io.FileInputStream;
import static java.lang.String.format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ManejoArchivos {
    
    FileInputStream inputStream;
    Workbook workbook;
    Sheet firstSheet;
    Iterator iterator;
    
    public ManejoArchivos(String rutaArchivoExcel, int libro) {
        try {
            this.inputStream = new FileInputStream(new File(rutaArchivoExcel));
            this.workbook = new XSSFWorkbook(inputStream);
            this.firstSheet = workbook.getSheetAt(libro);
            this.iterator = firstSheet.iterator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ListaVehiculos leerArchivoVehiculos(){ 
        ListaVehiculos lista=new ListaVehiculos();
        try {
            DataFormatter formatter = new DataFormatter();
            while (iterator.hasNext()) {
                String numeroPlaca="";
                String marca="";
                String modelo="";
                int annio=0;
                String color="";
                String cilindrada="";
                String tipoCombustible="";
                int capacidadPasajeros=0;
                double precioAlquierXDia=0;
                String estado="";
                boolean arranqueSinLLave=false;
                boolean cargadorInalambrico=false;
                boolean navegadorTraffico=false;
                boolean sensores=false;
                boolean camaraTrasera=false;
                boolean wifi=false;
                boolean monitoreoSatelital=false;
                
                Row nextRow = (Row) iterator.next();
                Iterator cellIterator = nextRow.cellIterator();
                while(cellIterator.hasNext()) {
                    Cell cell = (Cell) cellIterator.next();
                    System.out.println(cell.getColumnIndex());
                    String contenidoCelda = formatter.formatCellValue(cell);
                    System.out.println("celda: " + contenidoCelda);
                    switch (cell.getColumnIndex()) {
                        case 0:
                            numeroPlaca=contenidoCelda;
                            break;
                        case 1:
                            marca=contenidoCelda;
                            break;
                        case 2:
                            modelo=contenidoCelda;
                            break;
                        case 3:
                            annio=Integer.parseInt(contenidoCelda);
                            break;
                        case 4:
                            color=contenidoCelda;
                            break;
                        case 5:
                            cilindrada=contenidoCelda;
                            break;
                        case 6:
                            tipoCombustible=contenidoCelda;
                            break;
                        case 7:
                            capacidadPasajeros=Integer.parseInt(contenidoCelda);
                            break;    
                        case 8:
                            precioAlquierXDia= Double.parseDouble(contenidoCelda);
                            break;
                        case 9:
                            estado=contenidoCelda;
                            break;
                        case 10:
                            arranqueSinLLave=Boolean.parseBoolean(contenidoCelda);
                            break;
                        case 11:
                            cargadorInalambrico=Boolean.parseBoolean(contenidoCelda);
                            break;
                        case 12:
                            navegadorTraffico=Boolean.parseBoolean(contenidoCelda);
                            break;
                        case 13:
                            sensores=Boolean.parseBoolean(contenidoCelda);
                            break;
                        case 14:
                            camaraTrasera=Boolean.parseBoolean(contenidoCelda);
                            break;
                        case 15:
                            wifi=Boolean.parseBoolean(contenidoCelda);
                            break;
                        case 16:
                            monitoreoSatelital=Boolean.parseBoolean(contenidoCelda);
                            break;
                    }
                }
                lista.inserta(new Vehiculos(
                    numeroPlaca,
                    marca,
                    modelo,
                    annio,
                    color,
                    cilindrada,
                    tipoCombustible,
                    capacidadPasajeros,
                    precioAlquierXDia,
                     estado,
                    arranqueSinLLave,
                    cargadorInalambrico,
                    navegadorTraffico,
                    sensores,
                    camaraTrasera,
                    wifi,
                    monitoreoSatelital
                    ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public ListaClientes leerArchivoClientes(){ 
        ListaClientes lista=new ListaClientes();
        try {
            DataFormatter formatter = new DataFormatter();
            while (iterator.hasNext()) {
                String cedula="";
                String nombre="";
                String apellido1="";
                String apellido2="";
                String fecha="";
                String correo="";
                String categoria="";
                
                Row nextRow = (Row) iterator.next();
                Iterator cellIterator = nextRow.cellIterator();
                while(cellIterator.hasNext()) {
                    Cell cell = (Cell) cellIterator.next();
                    System.out.println(cell.getColumnIndex());
                    String contenidoCelda = formatter.formatCellValue(cell);
                    System.out.println("celda: " + contenidoCelda);
                    switch (cell.getColumnIndex()) {
                        case 0:
                            cedula=contenidoCelda;
                            break;
                        case 1:
                            nombre=contenidoCelda;
                            break;
                        case 2:
                            apellido1=contenidoCelda;
                            break;
                        case 3:
                            apellido2=contenidoCelda;
                            break;
                        case 4:
                            fecha=contenidoCelda;
                            break;
                        case 5:
                            correo=contenidoCelda;
                            break;
                        case 6:
                            categoria=contenidoCelda;
                            break;
                    }
                }
                lista.insertar(new Clientes(
                    cedula,
                    nombre,
                    apellido1,
                    apellido2,
                    fecha,
                    correo,
                    categoria
                    ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
}
