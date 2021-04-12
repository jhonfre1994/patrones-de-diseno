/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factorymethod;

import impl.Circle;
import impl.ErrorFigure;
import impl.Square;
import impl.Triangle;
import interfaces.DrawFigure;

/**
 *
 * @author jhonfre
 */
public class Factory {

    /**
     * metodo para crear la instancia de un objeto dependiendo de un
     * identificador.
     *
     * @param nameFigure identificador
     * @return instancia de la clase solicitada
     */
    public DrawFigure getFigure(String nameFigure) {
        if (nameFigure == null) {

        }
        if (nameFigure.equalsIgnoreCase("square")) {
            return new Square();
        } else if (nameFigure.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (nameFigure.equalsIgnoreCase("triangle")) {
            return new Triangle();
        }

        return new ErrorFigure();
    }
}
