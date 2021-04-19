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
public class Originator {
    
    private Game game;

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    
    public Memento saveGame(){
        return new Memento(game);
    }
    
    public void restoreGame(Memento m){
        this.game = m.getGame();
    }
}
