/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Components.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import main.Client.Vista_Inicial.Vista1Component;

/**
 *
 * @author JERE
 */
public class MenuComponent implements ActionListener,MouseListener,MouseMotionListener {
    
    private MenuTemplate MenuTemplate;
    private Vista1Component Vista1Component;
    private int Xinicial, Yinicial;
      
    public MenuComponent(Vista1Component Vista1Component){
        this.MenuTemplate = new MenuTemplate(this);
        this.Vista1Component = Vista1Component;
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        this.Vista1Component.Mostrar(ae.getActionCommand());
        
    }
    
 

    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        Xinicial = me.getX();
        Yinicial = me.getY();
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
   
    }

    @Override
    public void mouseEntered(MouseEvent me) { 
    }

    @Override
    public void mouseExited(MouseEvent me) {
     
    }
    
    public MenuTemplate getMenuTemplate(){
        return this.MenuTemplate;
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        this.Vista1Component.Moverventana(me.getXOnScreen()-Xinicial
                ,me.getYOnScreen()-Yinicial);
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        
    }
}
