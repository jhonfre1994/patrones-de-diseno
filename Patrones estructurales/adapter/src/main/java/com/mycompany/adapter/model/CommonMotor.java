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
public class CommonMotor extends Motor {

    public CommonMotor() {
        super();
        System.out.println("Creando el motor comun");
    }

    @Override
    public void turnOn() {
        System.out.println("El motor comun se esta encendiendo");
    }

    @Override
    public void speedUp() {
        System.out.println("El motor comun se esta acelerando");
    }

    @Override
    public void turnOff() {
        System.out.println("El motor comun se esta apagado");
    }

}
