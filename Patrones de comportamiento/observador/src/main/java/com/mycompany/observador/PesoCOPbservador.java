/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.observador;

/**
 *
 * @author jhonfre
 */
public class PesoCOPbservador extends Observador {

    private double valorCambio = 29.86;

    public PesoCOPbservador(Subject sujeto) {
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }

    @Override
    public void actualizar() {
        System.out.println("COP: " + (sujeto.getEstado() * valorCambio));
    }

}
