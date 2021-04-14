/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bridge;

import com.mycompany.bridge.brigde.Amazon;
import com.mycompany.bridge.brigde.RepartoAmazon;
import com.mycompany.bridge.impl.EnvioColombia;


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
        
        Amazon mexito = new Amazon(new EnvioColombia());
        System.out.println(mexito.entregarPaquete());
    }
    
}
