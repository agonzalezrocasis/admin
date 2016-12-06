/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alberto
 */
public class DbConnection {
    
    private static Connection conn = null;
    
    public static Connection getConnection() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:sqlite.SQLite");
            return conn;
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    
}
