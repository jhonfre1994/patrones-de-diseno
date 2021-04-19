/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.memento.model;

/**
 *
 * @author jhonfre
 */
public class Game {
    
    
    private String nombre;
    private int checkpoint;

    public Game(String nombre, int checkpoint) {
        this.nombre = nombre;
        this.checkpoint = checkpoint;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(int checkpoint) {
        this.checkpoint = checkpoint;
    }

    @Override
    public String toString() {
        return "Game{" + "nombre=" + nombre + ", checkpoint=" + checkpoint + '}';
    }
    
    
    
    
}
