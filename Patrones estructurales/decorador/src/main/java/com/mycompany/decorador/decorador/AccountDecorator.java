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
public abstract class AccountDecorator implements AccountInterface {

    protected AccountInterface accountInterface;

    public AccountDecorator(AccountInterface accountInterface) {
        this.accountInterface = accountInterface;
    }

    @Override
    public void openAccount(Account account) {
        this.accountInterface.openAccount(account);
    }

}
