/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.factory.impl;

import com.company.factory.interfaces.ChairInterface;
import com.company.factory.interfaces.TableInterface;

/**
 *
 * @author jhonfre
 */
public class ErrorTypeProduct implements ChairInterface, TableInterface {

    @Override
    public String sellChair() {
        return "Error al especificar el tipo de producto";
    }

    @Override
    public String getColor() {
        return "Error al especificar el tipo de producto";

    }

    @Override
    public String sellTable() {
        return "Error al especificar el tipo de producto";

    }

    @Override
    public String getTam() {
        return "Error al especificar el tipo de producto";

    }

}
