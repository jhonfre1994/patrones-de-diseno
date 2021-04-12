/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import interfaces.DrawFigure;

/**
 *
 * @author jhonfre
 */
public class ErrorFigure implements DrawFigure{

    @Override
    public String draw() {
        return "Error al especificar un tipo de figura";
    }
    
     
}
