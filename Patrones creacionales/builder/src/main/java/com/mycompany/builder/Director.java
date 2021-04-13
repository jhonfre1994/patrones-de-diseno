/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.builder;

import com.mycompany.builder.interfaces.Builder;
import com.mycompany.builder.model.Engine;
import com.mycompany.builder.model.TripComputer;
import com.mycompany.builder.utils.CarType;
import com.mycompany.builder.utils.Transmission;

/**
 * esta clase dice en que orden se debe ejecutar los paso para obtener el
 * tipo de carro que se desea construir
 * @author jhonfre
 */
public class Director {
    
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer("digital", "negro", 100));
    }
    
    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(4);
        builder.setTransmission(Transmission.AUTOMATIC);
    }
    
}
