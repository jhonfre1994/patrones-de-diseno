/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.factory;

import com.company.factory.factory.FactoryAbstractInterface;
import com.company.factory.impl.ErrorTypeProduct;
import com.company.factory.impl.chair.ArtDecoChair;
import com.company.factory.impl.chair.ModernChair;
import com.company.factory.impl.chair.VictorianaChair;
import com.company.factory.interfaces.ChairInterface;
import com.company.factory.interfaces.TableInterface;

/**
 *
 * @author jhonfre
 */
public class ChairFactory implements FactoryAbstractInterface{

    @Override
    public ChairInterface getChairInterface(String typeChair) {
        if (typeChair == null) {

        }
        if (typeChair.equalsIgnoreCase("victoriana")) {
            return new VictorianaChair();
        } else if (typeChair.equalsIgnoreCase("artDeco")) {
            return new ArtDecoChair();
        } else if (typeChair.equalsIgnoreCase("modern")) {
            return new ModernChair();
        }
        return new ErrorTypeProduct();
    }

    @Override
    public TableInterface getTableInterface(String typeTable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
