/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.CCTProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ali
 */
public interface sqlConnection {

    public static Connection connectDB() throws SQLException {
        String dbURL = "jdbc:mysql://localhost:3306/users";
        String username = "root";
        String password = "admin123";
        Connection conn;
        conn = DriverManager.getConnection(dbURL, username, password);
        return conn;

    }

}
