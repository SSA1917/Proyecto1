/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import javax.swing.ImageIcon;

/**
 *
 * @author JERE
 */
public class Accion {
    private ImageIcon imagenAccion;
    
    public ImageIcon getimagenAccion(){
        return imagenAccion;
    }
    
    public void setimagenAccion(ImageIcon imagenAccion){
        this.imagenAccion = imagenAccion;
    }
}
