/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Servicio;

import java.awt.Color;
import java.awt.Cursor;





/**
 *
 * @author SANTIAGO SANCHEZ ALVAREZ
 */
public class RecursosService {
    private Color colorVerde,colorAzul;
    private Cursor cMano;
    
    
    static private RecursosService servicio;
    
    private RecursosService(){}
    ///------------------------------------------------------------
     public Color getColorVerde(){
        colorVerde = new Color(20,130,20);
        return colorVerde;
    } 
     public Color getColorazul(){
         colorAzul = new Color(50,100,200,50);
         return colorAzul;
     }
     ///---------------------------------------------------
     public Cursor getCursorMano(){
        cMano = new Cursor(Cursor.HAND_CURSOR);
        return cMano;
     }
    
    ///-----------------------------------------------------------
    public static RecursosService getService(){
        
        if(servicio == null){
            servicio = new RecursosService();
        }
        return servicio;
    }
}
