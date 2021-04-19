/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chainofresponsability;

/**
 *
 * @author jhonfre
 */
public class NegativeProcessor extends Processor 
{ 
    public NegativeProcessor(Processor processor){
        super(processor);
          
    }
  
    public void process(Number request) 
    { 
        if (request.getNumber() < 0) 
        { 
            System.out.println("NegativeProcessor : " + request.getNumber()); 
        } 
        else
        { 
            super.process(request); 
        } 
    } 
} 
