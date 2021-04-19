/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.decorador.impl;

import com.mycompany.decorador.interfaces.AccountInterface;
import com.mycompany.decorador.model.Account;

/**
 *
 * @author jhonfre
 */
public class CuentaCorriente implements AccountInterface {

    @Override
    public void openAccount(Account account) {
        if (account.getAge() >= 18) {
            System.out.println("Se abre una cuenta para el señor " + account.getName());
        } else {
            System.out.println("No se puede abrir la cuenta por el que solicitante es menos de edad");
        }
    }
}
