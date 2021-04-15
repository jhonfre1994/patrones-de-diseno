/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.composite;

/**
 *
 * @author jhonfre
 */
public abstract class AbstractProduct {

    protected String name;
    protected double price;

    public AbstractProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract public void addProduct(AbstractProduct c);

    abstract public void deleteProduct(AbstractProduct c);

    abstract public void showProducts();

    abstract public double getTotalPrice();

}
