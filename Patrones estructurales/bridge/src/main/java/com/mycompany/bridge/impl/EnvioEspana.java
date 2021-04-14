/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bridge.impl;

import com.mycompany.bridge.interfaces.EnvioInterface;



/**
 *
 * @author jhonfre
 */
public class EnvioEspana implements EnvioInterface{

    @Override
    public String enviar() {
        return "Pedido enviado a españa";
    }

    @Override
    public String entregar() {
        return "Pedido entregado en españa";
    }

    @Override
    public String procesarPedido() {
        return "Pedido procesado con exito";
    }
    
}
