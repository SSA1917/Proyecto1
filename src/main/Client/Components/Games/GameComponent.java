/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Components.Games;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author SANTIAGO SANCHEZ ALVAREZ
 */
public class GameComponent implements ActionListener{

    private GameTemplate GameTemplate;
    
    public GameComponent(){
        this.GameTemplate = new GameTemplate(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
    public GameTemplate getGameTemplate(){
        return this.GameTemplate;
    }
}
