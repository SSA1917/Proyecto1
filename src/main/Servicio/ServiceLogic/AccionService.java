/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Servicio.ServiceLogic;

import Models.Accion;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author JERE
 */
public class AccionService {
    private static  AccionService servicio;
    private ArrayList<Accion> acciones; 
    

    public static AccionService getService(){
    if(servicio == null){
        servicio = new AccionService();
    }
    return servicio;
}
    public AccionService(){
        acciones = new ArrayList<Accion>();   
        CargarDatos();
    }
    
    public void CargarDatos(){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null; 
        
        try {
            archivo = new File("src/Archivos/Acciones.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            
            String linea;
            while((linea = br.readLine())!= null){
                String[] atributos = linea.split(",");
                Accion accion = new Accion();
                accion.setimagenAccion(new ImageIcon(atributos[0]));
                acciones.add(accion);
            }
            fr.close();
        }
        catch(Exception e){
        e.printStackTrace();
    }
    }
}


