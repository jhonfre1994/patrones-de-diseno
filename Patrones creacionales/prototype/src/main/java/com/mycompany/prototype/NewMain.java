/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prototype;

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

        // se crea un objeto de tipo curculo, este se le puede llamar el 
        // objeto "original"
        Circle originalCircle = new Circle();
        originalCircle.setColor("Rojo");
        originalCircle.setRadio(10);
        System.out.println("original: "+ originalCircle.toString());
        
        
        // se crea un objeto llamando el metodo clonar del objeto original.
        // este metodo clonar crea una nueva instancia con los mismos datos 
        // del objeto original
        Circle copyCircle1 = originalCircle.clonar();
        
        System.out.println("copia sin modificar: " + copyCircle1.toString());
        copyCircle1.setColor("Amarillo");
        System.out.println("copia modificada: " + copyCircle1.toString());
        
      
        System.out.println(originalCircle == copyCircle1);
    }

}
