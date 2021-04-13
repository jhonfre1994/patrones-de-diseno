/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.builder.interfaces;

import com.mycompany.builder.model.Engine;
import com.mycompany.builder.model.TripComputer;
import com.mycompany.builder.utils.CarType;
import com.mycompany.builder.utils.Transmission;

/**
 * clase interfaz que especifica los pasos que se necesitan para construir
 * cualquier tipo de vehiculo. se debe tener en cuenta que algunos pasos 
 * pueden ser opcionales
 * @author jhonfre
 */
public interface Builder {

    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

}
