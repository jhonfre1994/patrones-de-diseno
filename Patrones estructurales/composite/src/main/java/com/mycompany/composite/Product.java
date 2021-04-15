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
public class Product extends AbstractProduct {

    public Product(String name, double price) {
        super(name, price);
    }

    @Override
    public void addProduct(AbstractProduct c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteProduct(AbstractProduct c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showProducts() {
        System.out.println("- " + this.name + " precio: " + this.price);
    }

    @Override
    public double getTotalPrice() {
        return this.price;
    }

}
