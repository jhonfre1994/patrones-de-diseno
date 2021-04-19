/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.memento.memento;

import com.mycompany.memento.model.Game;

/**
 *
 * @author jhonfre
 */
public class Memento {
    
    private Game game;

    public Memento(Game game) {
        this.game = game;
    }
    
    public Game getGame(){
        return game;
    }
}
