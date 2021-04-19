/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.memento.memento;

import com.mycompany.memento.model.Game;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhonfre
 */
public class CareTaker {

    private ArrayList<Memento> gameList = new ArrayList<>();

    public void addMememto(Memento m) {
        gameList.add(m);
    }

    public Memento getMemento(int index) {
        return gameList.get(index);
    }

}
