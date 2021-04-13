/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prototype;

/**
 *
 * @author jhonfre
 */
public class Circle {

    private String color;
    private int radio;

    public Circle() {
    }

    public Circle(Circle circle) {
        this.color = circle.getColor();
        this.radio = circle.getRadio();
    }

    // se crea un nuevo objeto devuelve la instancia de la clase actual.
    public Circle clonar() {
        return new Circle(this);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "{" + "color=" + color + ", radio=" + radio + '}';
    }

}
