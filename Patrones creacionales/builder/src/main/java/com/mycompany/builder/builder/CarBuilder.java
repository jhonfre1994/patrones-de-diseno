/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.builder.builder;

import com.mycompany.builder.interfaces.Builder;
import com.mycompany.builder.model.Car;
import com.mycompany.builder.model.Engine;
import com.mycompany.builder.model.TripComputer;
import com.mycompany.builder.utils.CarType;
import com.mycompany.builder.utils.Transmission;

/**
 *
 * @author jhonfre
 */
public class CarBuilder implements Builder {

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer);
    }
    
}
