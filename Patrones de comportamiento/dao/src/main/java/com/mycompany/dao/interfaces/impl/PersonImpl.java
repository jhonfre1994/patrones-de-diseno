/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao.interfaces.impl;

import com.mycompany.dao.dataBase.ConnectionDB;
import com.mycompany.dao.interfaces.DaoPerson;
import com.mycompany.dao.model.Person;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhonfre
 */
public class PersonImpl extends ConnectionDB implements DaoPerson {

    /*
    public void crearTabla() throws SQLException {
        try {
            this.connectDB();
            PreparedStatement st = this.connection.prepareStatement("CREATE TABLE persona (\n"
                    + "  id INT AUTO_INCREMENT  PRIMARY KEY,\n"
                    + "  nombres VARCHAR(250) NOT NULL,\n"
                    + "  apellidos VARCHAR(250) NOT NULL,\n"
                    + "  edad INT DEFAULT NULL\n"
                    + ");");
            st.execute();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            this.closeDB();
        }
    }
     */
    @Override
    public String savePerson(Person p) throws Exception {
        try {
            this.connectDB();
            PreparedStatement st = this.connection.prepareStatement("INSERT INTO persona(id, nombres, apellidos, edad) values (?,?,?,?)");
            st.setInt(1, p.getId());
            st.setString(2, p.getNombres());
            st.setString(3, p.getApellidos());
            st.setInt(4, p.getEdad());
            st.execute();

        } catch (Exception e) {
            System.out.println(e);
            return "ocurrio un error al guardar la persona";
        } finally {
            this.closeDB();
        }
        return "se guardo correctamente el usuario con nombres " + p.getNombres();
    }

    @Override
    public String editPerson(Person p) throws Exception {
        try {
            String sql = "UPDATE persona SET nombres= ?, apellidos= ?, edad= ? WHERE ID= ?";
            this.connectDB();
            PreparedStatement st = this.connection.prepareStatement(sql);
            st.setString(1, p.getNombres());
            st.setString(2, p.getNombres());
            st.setInt(3, p.getEdad());
            st.setInt(4, p.getId());
            st.execute();
        } catch (Exception e) {
            System.out.println(e);
            return "ocurrio un error al actualizar la persona";
        } finally {
            this.closeDB();
        }
        return "se actualizo correctamente el usuario con nombres " + p.getNombres();
    }

    @Override
    public String deletePerson(Person p) throws Exception {
        try {
            String sql = "DELETE from persona WHERE id=" + p.getId();
            this.connectDB();
            PreparedStatement st = this.connection.prepareStatement(sql);
            st.execute();
        } catch (Exception e) {
            System.out.println(e);
            return "ocurrio un error al eliminar la persona";
        } finally {
            this.closeDB();
        }
        return "se elimino correctamente el usuario con nombres " + p.getNombres();
    }

    @Override
    public List<Person> listPeople() throws Exception {
        List<Person> result = null;
        try {
            this.connectDB();
            PreparedStatement st = this.connection.prepareCall("Select * from persona");
            result = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Person pe = new Person();
                pe.setId(rs.getInt("id"));
                pe.setNombres(rs.getString("nombres"));
                pe.setApellidos(rs.getString("apellidos"));
                pe.setEdad(rs.getInt("edad"));
                result.add(pe);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            connection.close();
        }
        return result;
    }

}
