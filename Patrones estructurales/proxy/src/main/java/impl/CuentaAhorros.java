/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import interfaces.AccountInterface;
import model.Account;

/**
 *
 * @author jhonfre
 */
public class CuentaAhorros implements AccountInterface {

    @Override
    public Account withdrawals(Account account, double monto) {
        double saldoActual = account.getBalance() - monto;
        account.setBalance(saldoActual);
        System.out.println("Saldo actual: " + account.getBalance());
        return account;
    }

    @Override
    public Account depositMoney(Account account, double monto) {
        double saldoActual = account.getBalance() + monto;
        account.setBalance(saldoActual);
        System.out.println("Saldo actual: " + account.getBalance());
        return account;
    }

    @Override
    public void showBalance(Account account) {
        System.out.println("el valos que tiene acualmente es de: " + account.getBalance());
    }

}
