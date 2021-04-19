/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.util.logging.Logger;
import impl.CuentaAhorros;
import interfaces.AccountInterface;
import model.Account;

/**
 *
 * @author jhonfre
 */
public class Proxy implements AccountInterface {

    private AccountInterface cuentaReal;
    private final static Logger LOGGER = Logger.getLogger(Proxy.class.getName());

    public Proxy(AccountInterface cuentaReal) {
        this.cuentaReal = cuentaReal;
    }

    @Override
    public Account withdrawals(Account account, double monto) {
        LOGGER.info("----Cuenta Proxy - Retirar Dinero----");
        if (cuentaReal == null) {
            cuentaReal = new CuentaAhorros();
            return cuentaReal.withdrawals(account, monto);
        } else {
            return cuentaReal.withdrawals(account, monto);
        }
    }

    @Override
    public Account depositMoney(Account account, double monto) {
        LOGGER.info("----Cuenta Proxy - Depositar Dinero----");
        if (cuentaReal == null) {
            cuentaReal = new CuentaAhorros();
            return cuentaReal.depositMoney(account, monto);
        } else {
            return cuentaReal.depositMoney(account, monto);
        }
    }

    @Override
    public void showBalance(Account account) {
        LOGGER.info("----Cuenta Proxy - Mostrar Dinero----");
        if (cuentaReal == null) {
            cuentaReal = new CuentaAhorros();
            cuentaReal.showBalance(account);
        } else {
            cuentaReal.showBalance(account);
        }
    }

}
