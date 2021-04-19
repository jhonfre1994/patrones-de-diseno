/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jhonfre
 */
public class Account {
    
    private String identification;
    private String name;
    private double actualBalance;

    public Account(String identification, String name, double actualBalance) {
        this.identification = identification;
        this.name = name;
        this.actualBalance = actualBalance;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return actualBalance;
    }

    public void setBalance(double actualBalance) {
        this.actualBalance = actualBalance;
    }
    
    
    
}
