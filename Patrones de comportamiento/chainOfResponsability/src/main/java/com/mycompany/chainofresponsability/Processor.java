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
public abstract class Processor {

    private Processor processor;

    public Processor(Processor processor) {
        this.processor = processor;
    }

    public void process(Number request) {
        if (processor != null) {
            processor.process(request);
        }
    }
}
