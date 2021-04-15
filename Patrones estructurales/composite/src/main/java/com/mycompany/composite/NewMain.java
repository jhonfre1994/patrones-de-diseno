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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CompositeProduct cajaGrande = new CompositeProduct("caja grande");
        Product xiaomi = new Product("xiaomi mi 9t", 1000000);
        Product portatil = new Product("pc games", 2500000);
        cajaGrande.addProduct(xiaomi);
        cajaGrande.addProduct(portatil);

        CompositeProduct cajaMediana = new CompositeProduct("caja mediana");
        Product monitor = new Product("LG 40", 800000);
        cajaMediana.addProduct(monitor);
        cajaGrande.addProduct(cajaMediana);

        CompositeProduct cajaPequena = new CompositeProduct("caja pequeña");
        Product mouse = new Product("Acer gamer", 100000);
        cajaPequena.addProduct(mouse);
        cajaMediana.addProduct(cajaPequena);

        cajaGrande.showProducts();
        System.out.println("Total: " + cajaPequena.getTotalPrice());

    }

}
