/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bridge.brigde;

import com.mycompany.bridge.interfaces.EnvioInterface;


/**
 *
 * @author jhonfre
 */
public class RepartoAmazon extends Amazon{
    
    private String idPedido;
    
    public RepartoAmazon(String idPedido, EnvioInterface envioInterface) {
        super(envioInterface);
        this.idPedido = idPedido;
    }
    
}
