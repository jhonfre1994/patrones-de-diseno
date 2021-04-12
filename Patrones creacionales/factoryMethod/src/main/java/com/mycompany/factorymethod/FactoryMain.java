/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factorymethod;

import interfaces.DrawFigure;

/**
 *
 * @author jhonfre
 */
public class FactoryMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * se instancia clase fabrica.
         */
        Factory fa = new Factory();

        DrawFigure circle = fa.getFigure("circle");
        System.out.println(circle.draw());

        DrawFigure square = fa.getFigure("square");
        System.out.println(square.draw());

        DrawFigure triangle = fa.getFigure("triangle");
        System.out.println(triangle.draw());

        DrawFigure none = fa.getFigure("none");
        System.out.println(none.draw());
    }

}
