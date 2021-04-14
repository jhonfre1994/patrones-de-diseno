/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adapter;

import com.mycompany.adapter.adapter.ElectricMotorAdapter;
import com.mycompany.adapter.model.Motor;
import com.mycompany.adapter.model.CommonMotor;
import com.mycompany.adapter.model.EconomicMotor;

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

        
        System.out.println("------------------- MOTOR COMUN ---------------------");
        Motor motor = new CommonMotor();
        motor.turnOn();
        motor.speedUp();
        motor.turnOff();
        
        
        System.out.println("------------------- MOTOR ECONOMIDO ---------------------");
        Motor motorComun = new EconomicMotor();
        motorComun.turnOn();
        motorComun.speedUp();
        motorComun.turnOff();
        
        System.out.println("------------------- MOTOR ELECTRICO ---------------------");
        Motor motorElectrico = new ElectricMotorAdapter();
        motorElectrico.turnOn();
        motorElectrico.speedUp();
        motorElectrico.turnOff();
    }

}
