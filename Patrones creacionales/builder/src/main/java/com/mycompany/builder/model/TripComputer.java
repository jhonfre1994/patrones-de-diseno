/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.builder.model;

/**
 *
 * @author jhonfre
 */
public class TripComputer {

    private String typeComputer;
    private String color;
    private int maxSpeed;

    public TripComputer(String typeComputer, String color, int maxSpeed) {
        this.typeComputer = typeComputer;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getTypeComputer() {
        return typeComputer;
    }

    public void setTypeComputer(String typeComputer) {
        this.typeComputer = typeComputer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
