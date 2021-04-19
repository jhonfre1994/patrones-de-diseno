/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.decorador.decorador;

import com.mycompany.decorador.interfaces.AccountInterface;
import com.mycompany.decorador.model.Account;

/**
 *
 * @author jhonfre
 */
public class SafeAccount extends AccountDecorator {

    public SafeAccount(AccountInterface accountInterface) {
        super(accountInterface);
    }

    @Override
    public void openAccount(Account account) {
        super.openAccount(account); //To change body of generated methods, choose Tools | Templates.
        addSafeAccount(account);
    }

    public void addSafeAccount(Account account) {
        System.out.println("se agrega el seguro de vida para la cuenta " + account.getIdentification() + " para el propietario "
                + account.getName());
    }

}
