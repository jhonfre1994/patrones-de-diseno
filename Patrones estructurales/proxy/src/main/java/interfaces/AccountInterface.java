/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import model.Account;

/**
 *
 * @author jhonfre
 */
public interface AccountInterface {

    Account withdrawals(Account account, double monto);

    Account depositMoney(Account account, double monto);

    void showBalance(Account account);

}
