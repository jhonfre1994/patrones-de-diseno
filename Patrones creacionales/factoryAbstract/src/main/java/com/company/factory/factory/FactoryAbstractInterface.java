/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.factory.factory;

import com.company.factory.interfaces.ChairInterface;
import com.company.factory.interfaces.TableInterface;

/**
 *
 * @author jhonfre
 */
public interface FactoryAbstractInterface {

    ChairInterface getChairInterface(String typeChair);

    TableInterface getTableInterface(String typeTable);

}
