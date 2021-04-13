/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.factory;

import com.company.factory.factory.FactoryAbstractInterface;
import com.company.factory.impl.ErrorTypeProduct;
import com.company.factory.impl.table.ArtDecoTable;
import com.company.factory.impl.table.ModernTable;
import com.company.factory.impl.table.VictorianaTable;
import com.company.factory.interfaces.ChairInterface;
import com.company.factory.interfaces.TableInterface;

/**
 *
 * @author jhonfre
 */
public class TableFactory implements FactoryAbstractInterface {

    @Override
    public ChairInterface getChairInterface(String typeChair) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TableInterface getTableInterface(String typeTable) {
        if (typeTable == null) {

        }
        if (typeTable.equalsIgnoreCase("victoriana")) {
            return new VictorianaTable();
        } else if (typeTable.equalsIgnoreCase("artDeco")) {
            return new ArtDecoTable();
        } else if (typeTable.equalsIgnoreCase("modern")) {
            return new ModernTable();
        }
        return new ErrorTypeProduct();

    }
}
