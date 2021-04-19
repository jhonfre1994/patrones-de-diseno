/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.decorador;

import com.mycompany.decorador.decorador.AccountDecorator;
import com.mycompany.decorador.decorador.SafeAccount;
import com.mycompany.decorador.impl.CuentaAhorros;
import com.mycompany.decorador.interfaces.AccountInterface;
import com.mycompany.decorador.model.Account;

/**
 *
 * @author jhonfre
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Account cuenta = new Account("1088317765", "jhon freddy salamanca", 18);
        
        AccountInterface accountI = new CuentaAhorros();
        SafeAccount cuentaAhorros = new SafeAccount(accountI);
        cuentaAhorros.openAccount(cuenta);
    }
    
}
