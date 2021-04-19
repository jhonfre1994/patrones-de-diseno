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
public class PositiveProcessor extends Processor {

    public PositiveProcessor(Processor processor) {
        super(processor);
    }

    public void process(Number request) {
        if (request.getNumber() > 0) {
            System.out.println("PositiveProcessor : " + request.getNumber());
        } else {
            super.process(request);
        }
    }
}
