/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.builder;

import com.mycompany.builder.builder.CarBuilder;
import com.mycompany.builder.model.Car;

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

        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("tipo de carro:\n" + car.getCarType());
        
        
        CarBuilder builder2 = new CarBuilder();
        director.constructCityCar(builder2);
        
        Car car2 = builder2.getResult();
        
        System.out.println("tipo de carro:\n" + car2.getCarType());
        
        

    }

}
