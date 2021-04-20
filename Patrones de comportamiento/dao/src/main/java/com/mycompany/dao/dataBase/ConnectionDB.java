/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao.dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jhonfre
 */
public class ConnectionDB {

    protected Connection connection;

    private final String JDBC_DRIVER = "org.h2.Driver";
    private final String DB_URL = "jdbc:h2:file:./testdb";
    private final String USER = "sa";
    private final String PASS = "";

    public void connectDB() {
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void closeDB() throws SQLException {
        if (connection != null) {
            if (!connection.isClosed()) {
                connection.close();
            }
        }
    }

}
