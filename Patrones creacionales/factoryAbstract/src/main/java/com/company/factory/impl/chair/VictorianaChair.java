/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.factory.impl.chair;

import com.company.factory.interfaces.ChairInterface;

/**
 *
 * @author jhonfre
 */
public class VictorianaChair implements ChairInterface {

    @Override
    public String sellChair() {
        return "Proceso de venta para una silla de tipo Victoriana";
    }

    @Override
    public String getColor() {
        return "El color de la silla es negra";
    }

}
