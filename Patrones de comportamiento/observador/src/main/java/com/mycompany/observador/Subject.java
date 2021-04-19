/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.observador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhonfre
 */
public class Subject {

    private List<Observador> observadores = new ArrayList<Observador>();
    private int estado;

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
        notificarTodosObservadores();
    }

    public void agregar(Observador observador) {
        observadores.add(observador);
    }

    public void notificarTodosObservadores() {
        observadores.forEach(x -> x.actualizar());
    }

}
