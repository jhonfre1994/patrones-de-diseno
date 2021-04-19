/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.memento;

import com.mycompany.memento.memento.CareTaker;
import com.mycompany.memento.memento.Originator;
import com.mycompany.memento.model.Game;

/**
 *
 * @author jhonfre
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Game juego = new Game("Mortal Kombat", 1);

        CareTaker taker = new CareTaker();
        Originator originator = new Originator();

        juego = new Game("Mortal Kombat", 2);
        originator.setGame(juego);

        juego = new Game("Mortal Kombat", 3);
        originator.setGame(juego);
        taker.addMememto(originator.saveGame());

        juego = new Game("Mortal Kombat", 4);
        originator.setGame(juego);

        juego = new Game("Mortal Kombat", 5);
        originator.setGame(juego);
        taker.addMememto(originator.saveGame());

        originator.restoreGame(taker.getMemento(0));
        juego = originator.getGame();
        System.out.println(juego.toString());

    }

}
