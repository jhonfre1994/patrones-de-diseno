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
public class FactoryProducer {
    
    public static FactoryAbstractInterface getFactory(String tipoFabrica) {

		if (tipoFabrica.equalsIgnoreCase("chair")) {
			return new ChairFactory();

		} else if (tipoFabrica.equalsIgnoreCase("table")) {
			return new TableFactory();
		}

		return null;
	}
    
}
