
import impl.CuentaAhorros;
import interfaces.AccountInterface;
import model.Account;
import proxy.Proxy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

        Account cuenta = new Account("1088317765", "jhon freddy salamanca", 500000);
        AccountInterface cuentaI = new CuentaAhorros();
        Proxy proxy = new Proxy(cuentaI);
        proxy.depositMoney(cuenta, 10000);
        proxy.withdrawals(cuenta, 500000);
        proxy.showBalance(cuenta);
    }
    
}
