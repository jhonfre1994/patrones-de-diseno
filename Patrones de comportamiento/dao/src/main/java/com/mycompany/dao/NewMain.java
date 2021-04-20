/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.dao.interfaces.DaoPerson;
import com.mycompany.dao.interfaces.impl.PersonImpl;
import com.mycompany.dao.model.Person;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author jhonfre
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Person per = new Person(1, "jhon freddy", "salamanca cobos", 26);
        guardar(per);
        per.setEdad(40);
        editar(per);
        todos();
        eliminar(per);
        todos();

    }

    public static void todos() {
        try {
            DaoPerson impl = new PersonImpl();
            List<Person> lista = impl.listPeople();
            if (lista.size() > 0) {
                lista.stream().forEach((p) -> {
                    System.out.println(p.toString());
                });
            } else {
                System.out.println("No hay elemento en la base de datos");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void guardar(Person p) {
        try {
            DaoPerson impl = new PersonImpl();
            String res = impl.savePerson(p);
            System.out.println(res);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void editar(Person p) {
        try {
            DaoPerson impl = new PersonImpl();
            String res = impl.editPerson(p);
            System.out.println(res);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void eliminar(Person p) {
        try {
            DaoPerson impl = new PersonImpl();
            String res = impl.deletePerson(p);
            System.out.println(res);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
