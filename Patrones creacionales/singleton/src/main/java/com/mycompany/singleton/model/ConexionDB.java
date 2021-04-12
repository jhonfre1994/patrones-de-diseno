/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.singleton.model;

/**
 *
 * @author jhonfre
 */
public class ConexionDB {

    //Declaración
    private static ConexionDB instancia;
    //private static Conexion instancia = new Conexion();

    //con el private se evita instanciar un objeto mediante operador "new"
    private ConexionDB() {

    }

    /*
    Para obtener la instancia unicamente por este metodo
    Notese la palabra reservada "static" hace posible el acceso mediante Clase.metodo
    en este metodo se valida que exista una instancia de la clase ConexionDB, si ya 
    existe una instancia retorna null y asi impide una nueva instancia del objeto
     */
    public static ConexionDB getInstancia() {
        if (instancia == null) {
            System.out.println("me voy a instanciar");
            instancia = new ConexionDB();
        }
        System.out.println("ya estoy instanciado");
        return instancia;
    }

    //Método de prueba
    public void conectar() {
        System.out.println("Me conecté a la BD");
    }

    //Método de prueba
    public void desconectar() {
        System.out.println("Me desconecté de la BD");
    }

}
