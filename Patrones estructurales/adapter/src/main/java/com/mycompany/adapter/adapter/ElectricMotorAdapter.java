/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adapter.adapter;

import com.mycompany.adapter.model.ElectricMotor;
import com.mycompany.adapter.model.Motor;

/**
 *
 * @author jhonfre
 */
public class ElectricMotorAdapter extends Motor {

    private ElectricMotor electricMotor;

    public ElectricMotorAdapter() {
        super();
        this.electricMotor = new ElectricMotor();
        System.out.println("Creando motor Electrico adapter");
    }

    @Override
    public void turnOn() {
        this.electricMotor.connect();
        this.electricMotor.activate();
    }

    @Override
    public void speedUp() {
        this.electricMotor.moveFaster();
    }

    @Override
    public void turnOff() {
        this.electricMotor.stop();
        this.electricMotor.disconnect();
    }

}
