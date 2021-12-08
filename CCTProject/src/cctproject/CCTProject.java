/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ali
 */
public class CCTProject {

    
    static Scanner scan = new Scanner(System.in);
    static final String dbURL = "jdbc:mysql://localhost:3306/users";
    static final String username = "root";
    static final String password = "admin123";
    static Connection conn;
    static menuOptions menu = new menuOptions();
    static int user = 0;

    public static void main(String[] args) throws SQLException {
        conn = DriverManager.getConnection(dbURL, username, password);
        Statement statement = conn.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
        // displays menu and returns user selection
        int userSelection = loginInit();
        switch (userSelection) {

            case 1:
                int status = 1;
                //gets the key value pair of username and password from user
                while (status != 0) {
                    String[] details = login().toString().split("=");
                    if (details[0] != null && details[1] != null) {

                        String sql = "Select * from user Where username='" + details[0].replace("{", "") + "' and password='" + details[1].replace("}", "") + "'";
                        ResultSet rs = statement.executeQuery(sql);
                        
                        if (rs.next()) {
                            user = rs.getInt(1);
                            System.out.println("Logged in! Please wait...");
                            while (status != 2) {
                                uiBuild(rs);
                            }
                            status = 0;
                        } else {
                            System.out.println("User not found, to retry please press 1 or press 0 to exit");//in this case enter when  result size is zero  it means user is invalid
                            status = scan.nextInt();
                        }
                    }
                }

                break;
            case 2:
                signUp(conn);
                break;
        }

    }

 
    private static int loginInit() {

        System.out.println("****WELCOME****\nPlease select an option\n1- Login\n2- Sign Up");
        int response = scan.nextInt();
        return response;
    }

    private static Map login() {
        HashMap<String, String> loginPair = new HashMap<>();
        System.out.print("Username: ");
        String username = scan.next();
        System.out.print("Password: ");
        String password = scan.next();
        loginPair.put(username, password);
        return loginPair;
    }

    private static void signUp(Connection conn) {
        String query = "insert into user (userType, first_Name, last_Name,userName,password)" + " values (?, ?, ?, ?, ?)";
        try {
            PreparedStatement que = conn.prepareStatement(query);
            que.setInt(1, 2);
            System.out.print("First Name: ");
            que.setString(2, scan.next());
            System.out.print("Last Name: ");
            que.setString(3, scan.next());
            System.out.print("Username: ");
            que.setString(4, scan.next());
            System.out.print("Password: ");
            que.setString(5, scan.next());
            //get info and add ezz

            que.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CCTProject.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void uiBuild(ResultSet rs) throws SQLException {

        //building UI if usertype is 'admin'
        if (rs.getString(2).equalsIgnoreCase("1")) {

            switch (menu.displayOptions(rs)) {
                case 1:
                    menu.profileModifier(rs);
                    break;
                case 2:
                    menu.viewUsers(conn);                    
                    break;
            }

        } //building UI if usertype is 'member'
        else {
            //display menu
            
          
            switch (menu.displayOptions(rs)) {
                case 1:
                    menu.equationSolver();
                    break;
                case 2:
                    menu.profileModifier(rs);
            }
        }

    }


}
