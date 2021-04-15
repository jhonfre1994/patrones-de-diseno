/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.composite;

import java.util.ArrayList;

/**
 *
 * @author jhonfre
 */
public class CompositeProduct extends AbstractProduct {

    private ArrayList<AbstractProduct> hijo = new ArrayList<AbstractProduct>();

    public CompositeProduct(String name) {
        super(name, 0);
    }

    @Override
    public double getTotalPrice() {
        double price = 0d;
        for (AbstractProduct child : hijo) {
            price += child.getTotalPrice();
        }
        return price;
    }
  
    @Override
    public void addProduct(AbstractProduct c) {
        this.hijo.add(c);
    }

    @Override
    public void deleteProduct(AbstractProduct c) {
        hijo.remove(c);
    }

    @Override
    public void showProducts() {
        System.out.println(name);
        for (int i = 0; i < hijo.size(); i++) {
            hijo.get(i).showProducts();
        }
    }
}
