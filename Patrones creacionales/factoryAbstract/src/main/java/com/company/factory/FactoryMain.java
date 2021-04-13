/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.factory;

import com.company.factory.factory.FactoryAbstractInterface;
import com.company.factory.interfaces.ChairInterface;
import com.company.factory.interfaces.TableInterface;

/**
 *
 * @author jhonfre
 */
public class FactoryMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // se crea la fabria para las sillas.
        FactoryAbstractInterface producrer = FactoryProducer.getFactory("chair");
        // se obtiene la instancia de la silla de tipo moderna.
        ChairInterface modernChair = producrer.getChairInterface("modern");
        System.out.println(modernChair.sellChair());

        // se obtiene la instancia de la silla tipo art deco.
        ChairInterface artDecoChair = producrer.getChairInterface("artDeco");
        System.out.println(artDecoChair.getColor());
        
        
        // se crea la fabrica para las mesas.
        FactoryAbstractInterface tableProducer = FactoryProducer.getFactory("table");
        // se obtiene la instancia de la mesa tipo moderna.
        TableInterface modernTable = tableProducer.getTableInterface("modern");
        System.out.println(modernTable.getTam());

    }

}
