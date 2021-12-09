/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctproject;

import static cctproject.CCTProject.scan;
import static cctproject.CCTProject.user;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Ali
 */
public class menuOptions {

    public int displayOptions(ResultSet rs) throws SQLException {
        if (rs.getInt(2) == 1) {
            System.out.println("****WELCOME MR/MS " + rs.getString(3) + "****\nPress 1 to modify your profile\nPress 2 to view all users");
            return scan.nextInt();
        } else {
            System.out.println("****WELCOME MR/MS " + rs.getString(3) + "****\nPress 1 to solve equations\nPress 2 to modify your profile");
            return scan.nextInt();
        }

    }

    public void equationSolver() {
        ArrayList<String> equation1 = new ArrayList<String>();
        System.out.println("Equation 1 : How many characters on the left of '='\nRemember! +/- are also characters & co-efficient cannot be nil");
        int size = scan.nextInt();
        if (size < 7) {
            System.out.println("SYNTAX : AX+BY=C");
        } else {
            System.out.println("SYNTAX : AX+BY+C=0");
        }

        System.out.println("Enter value of a");
        equation1.add(scan.next());
        System.out.println("Enter value of x");
        equation1.add(scan.next());
        System.out.println("Enter value of operator +/-");
        equation1.add(scan.next());
        System.out.println("Enter value of b");
        equation1.add(scan.next());
        System.out.println("Enter value of y");
        equation1.add(scan.next());
        if (size < 7) {
            equation1.add("=");
        } else {
            System.out.println("Enter value of operator +/-");
            equation1.add(scan.next());
            equation1.add("=");
            equation1.add("0");
            
        }
        System.out.println("Enter value of c");
        equation1.add(scan.next());
        equation1.forEach(e -> System.out.print(e));

    }

    public void profileModifier(ResultSet rs) throws SQLException {
        System.out.println("1) First Name: " + rs.getString(3) + "\n2) Last Name: " + rs.getString(4) + "\n3) Your Username: " + rs.getString(5) + "\nPlease select what you want to update");
        int tb = scan.nextInt();
        ResultSetMetaData rsmt = rs.getMetaData();
        System.out.print("New " + rsmt.getColumnName(tb + 2).replace('_', ' ') + ":");
        rs.updateString(tb + 2, scan.next());
        rs.updateRow();
        System.out.println("---SUCCESSFULLY CHANGED---");
    }

    public void viewUsers(Connection conn) throws SQLException {
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from user");
        String option = "";
        while (!option.equalsIgnoreCase("n")) {
            int index = 1;
            while (rs.next()) {
                System.out.println("---------!!!!!!!---------");
                System.out.println("" + index + ")\t" + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
                index++;
            }
            System.out.println("Would you like to remove any user? Y/N");
            if (scan.next().equalsIgnoreCase("y")) {
                System.out.println("Which user do you want to remove?");
                int tbr = scan.nextInt();
                if (tbr != user) {
                    st.executeUpdate("Delete from user where id=" + tbr);
                    System.out.println("user removed");
                    option = "n";
                } else {
                    System.out.println("Cannot delete your own account");
                }
            } else {
                option = "n";
            }

        }

    }

}
