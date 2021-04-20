/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao.interfaces;

import com.mycompany.dao.model.Person;
import java.util.List;

/**
 *
 * @author jhonfre
 */
public interface DaoPerson {

    public String savePerson(Person p) throws Exception;

    public String editPerson(Person p) throws Exception;

    public String deletePerson(Person p) throws Exception;

    public List<Person> listPeople() throws Exception;

}
