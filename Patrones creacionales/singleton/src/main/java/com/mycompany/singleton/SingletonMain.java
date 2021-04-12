/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.singleton;

import com.mycompany.singleton.model.ConexionDB;

/**
 *
 * @author jhonfre
 */
public class SingletonMain {

    /**
     * con este metodo validamos que el objeto este creado.
     *
     * @param clase clase a validar
     * @return true o false dependiendo si esta creado o no.
     */
    public static boolean validarInstancia(ConexionDB clase) {
        return clase instanceof ConexionDB;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Si se utiliza el operador "new" marca error.
        //ConexionDB b = new ConexionDB();
        // se crea la instancia por medio del metodo de clase.
        ConexionDB c = ConexionDB.getInstancia();

        c.conectar();
        c.desconectar();

        System.out.println(validarInstancia(c));
    }

}
