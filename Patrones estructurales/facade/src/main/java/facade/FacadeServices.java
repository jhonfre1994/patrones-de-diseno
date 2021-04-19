/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import impl.Flights;
import impl.Hotels;

/**
 *
 * @author jhonfre
 */
public class FacadeServices {
    
    private Flights flights;
    private Hotels hotels;

    public FacadeServices() {
        this.flights = new Flights();
        this.hotels = new Hotels();
    }
    
    public void searchService(String destination, String initDate, String finalDate){
        flights.searchFligts(destination, initDate, finalDate);
        hotels.searchHotels(destination, initDate, finalDate);
    }
    
}
