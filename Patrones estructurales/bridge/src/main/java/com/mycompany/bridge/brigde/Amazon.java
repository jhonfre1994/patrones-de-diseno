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
public class Amazon {
    
    protected EnvioInterface envioInterface;

    public Amazon(EnvioInterface envioInterface) {
        this.envioInterface = envioInterface;
    }
    
    public String procesarPedido(){
        return envioInterface.procesarPedido();
    }
    
    public String enviarPaquete(){
        return envioInterface.enviar();
    }
    
    public String entregarPaquete(){
        return envioInterface.entregar();
    }
    
    
}
