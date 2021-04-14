/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adapter.model;

/**
 *
 * @author jhonfre
 */
public class ElectricMotor {

    private boolean isConected = false;

    public ElectricMotor() {
        System.out.println("Creando motor electrico");
        this.isConected = false;
    }

    public void connect() {
        System.out.println("Conectando el motor electrico");
        this.isConected = true;
    }

    public void activate() {
        if (!this.isConected) {
            System.out.println("No se puede activar porque no "
                    + "esta conectado el motor electrico");
        } else {
            System.out.println("Esta conectado, activando motor"
                    + " electrico....");
        }
    }

    public void moveFaster() {
        if (!this.isConected) {
            System.out.println("No se puede mover rapido el motor "
                    + "electrico porque no esta conectado...");
        } else {
            System.out.println("Moviendo mas rapido");
        }
    }

    public void stop() {
        if (!this.isConected) {
            System.out.println("No se puede detener motor electrico"
                    + " porque no esta conectado");
        } else {
            System.out.println("Deteniendo motor electrico");
        }
    }

    public void disconnect() {
        System.out.println("Desconectando motor electrico...");
        this.isConected = false;
    }

}
