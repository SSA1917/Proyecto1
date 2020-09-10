/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Components.Games;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author SANTIAGO SANCHES ALVAREZ
 */
public class GameTemplate extends JPanel {
    
    private GameComponent GameComponent;
    
    public GameTemplate(GameComponent GameComponent){
        this.GameComponent = GameComponent;
        
        this.setSize(1000,650);
        this.setLocation(0,70);
        this.setBackground(Color.GREEN);
        this.setVisible(true);
    }
    
}
