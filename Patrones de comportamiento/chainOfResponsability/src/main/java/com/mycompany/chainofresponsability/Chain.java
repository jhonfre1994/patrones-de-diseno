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
public class Chain {

    Processor chain;

    public Chain() {
        buildChain();
    }

    private void buildChain() {
        chain = new NegativeProcessor(new ZeroProcessor(new PositiveProcessor(null)));
    }

    public void process(Number request) {
        chain.process(request);
    }

}
