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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import static my.CCTProject.sqlConnection.connectDB;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Ali
 */
public class CCTProjectUI extends javax.swing.JFrame implements sqlConnection {

    Statement statement = connectDB().createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_UPDATABLE);
    int userId;
    ResultSet rs;

    /**
     * Creates new form CCTProjectUI
     */
    public CCTProjectUI() throws SQLException {
        initComponents();
        
        //display only welcome screen
        welcome_panel.setVisible(true);
        login_panel.setVisible(false);
        info_panel.setVisible(false);
        modify_panel.setVisible(false);
        modify_success.setVisible(false);
        viewall_panel.setVisible(false);
        back_Icon.setIcon(new ImageIcon(getClass().getResource("images/arrow.png")));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcome_panel = new javax.swing.JPanel();
        welcome_txt = new javax.swing.JLabel();
        login_btn = new javax.swing.JButton();
        signup_btn = new javax.swing.JButton();
        current_time = new javax.swing.JLabel();
        login_panel = new javax.swing.JPanel();
        back_Icon = new javax.swing.JLabel();
        login_username_label = new javax.swing.JLabel();
        login_password_label = new javax.swing.JLabel();
        login_username = new javax.swing.JTextField();
        login_password = new javax.swing.JTextField();
        login_btn2 = new javax.swing.JButton();
        info_panel = new javax.swing.JPanel();
        logged_in_msg = new javax.swing.JLabel();
        logged_in_username = new javax.swing.JLabel();
        logged_in_modify = new javax.swing.JButton();
        logged_in_solve = new javax.swing.JButton();
        logged_in_viewall = new javax.swing.JButton();
        modify_panel = new javax.swing.JPanel();
        modify_value_username = new javax.swing.JTextField();
        modify_value_password = new javax.swing.JTextField();
        modify_value_firstname = new javax.swing.JTextField();
        modify_label_username = new javax.swing.JLabel();
        modify_label_password = new javax.swing.JLabel();
        modify_label_firstname = new javax.swing.JLabel();
        modify_label_lastname = new javax.swing.JLabel();
        modify_value_lastname = new javax.swing.JTextField();
        modify_savebtn = new javax.swing.JButton();
        modify_success = new javax.swing.JLabel();
        viewall_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        viewall_deletebtn = new javax.swing.JButton();
        viewall_delete_value = new javax.swing.JTextField();
        viewall_delete_success = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        welcome_txt.setText("Welcome!");

        login_btn.setText("Login");
        login_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_btnMouseClicked(evt);
            }
        });

        signup_btn.setText("Sign up");
        signup_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_btnMouseClicked(evt);
            }
        });

        current_time.setText("TIME HERE");
        current_time.setToolTipText("");
        current_time.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout welcome_panelLayout = new javax.swing.GroupLayout(welcome_panel);
        welcome_panel.setLayout(welcome_panelLayout);
        welcome_panelLayout.setHorizontalGroup(
            welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcome_panelLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(signup_btn)
                        .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcome_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(current_time)
                            .addComponent(welcome_txt))
                        .addGap(9, 9, 9)))
                .addGap(166, 166, 166))
        );
        welcome_panelLayout.setVerticalGroup(
            welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcome_panelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(welcome_txt)
                .addGap(18, 18, 18)
                .addComponent(current_time)
                .addGap(35, 35, 35)
                .addComponent(login_btn)
                .addGap(18, 18, 18)
                .addComponent(signup_btn)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        login_username_label.setText("Username");

        login_password_label.setText("Password");

        login_username.setFont(new java.awt.Font("Liberation Sans", 1, 11)); // NOI18N
        login_username.setText("username");
        login_username.setToolTipText("Enter your username");
        login_username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        login_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                login_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                login_usernameFocusLost(evt);
            }
        });

        login_password.setText("*******");
        login_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                login_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                login_passwordFocusLost(evt);
            }
        });

        login_btn2.setText("Login");
        login_btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_btn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout login_panelLayout = new javax.swing.GroupLayout(login_panel);
        login_panel.setLayout(login_panelLayout);
        login_panelLayout.setHorizontalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(login_panelLayout.createSequentialGroup()
                        .addComponent(login_username_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(login_username, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(login_panelLayout.createSequentialGroup()
                        .addComponent(login_password_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(login_btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(login_password, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(93, 93, 93))
            .addGroup(login_panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(back_Icon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        login_panelLayout.setVerticalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(back_Icon)
                .addGap(58, 58, 58)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_username_label)
                    .addComponent(login_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_password_label)
                    .addComponent(login_password, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(login_btn2)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        logged_in_msg.setText("Logged In Successfully!");

        logged_in_modify.setText("Edit your profile");
        logged_in_modify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logged_in_modifyMouseClicked(evt);
            }
        });

        logged_in_solve.setText("Solve Equations");

        logged_in_viewall.setText("View all users");
        logged_in_viewall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logged_in_viewallMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout info_panelLayout = new javax.swing.GroupLayout(info_panel);
        info_panel.setLayout(info_panelLayout);
        info_panelLayout.setHorizontalGroup(
            info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_panelLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(logged_in_msg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logged_in_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(logged_in_viewall, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logged_in_modify, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addComponent(logged_in_solve, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        info_panelLayout.setVerticalGroup(
            info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_panelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(logged_in_msg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logged_in_username, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(logged_in_modify)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logged_in_solve)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logged_in_viewall)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        modify_value_username.setText("username");

        modify_value_password.setText("password");

        modify_value_firstname.setText("first name");

        modify_label_username.setText("Username");

        modify_label_password.setText("Password");

        modify_label_firstname.setText("First Name");

        modify_label_lastname.setText("Last name");

        modify_value_lastname.setText("last name");

        modify_savebtn.setText("Save");
        modify_savebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modify_savebtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout modify_panelLayout = new javax.swing.GroupLayout(modify_panel);
        modify_panel.setLayout(modify_panelLayout);
        modify_panelLayout.setHorizontalGroup(
            modify_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modify_panelLayout.createSequentialGroup()
                .addGroup(modify_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modify_panelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(modify_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(modify_panelLayout.createSequentialGroup()
                                .addGroup(modify_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modify_panelLayout.createSequentialGroup()
                                        .addComponent(modify_label_username)
                                        .addGap(18, 18, 18))
                                    .addGroup(modify_panelLayout.createSequentialGroup()
                                        .addComponent(modify_label_password)
                                        .addGap(20, 20, 20)))
                                .addGap(10, 10, 10)
                                .addGroup(modify_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(modify_value_password, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modify_value_username, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, modify_panelLayout.createSequentialGroup()
                                .addGroup(modify_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modify_label_firstname)
                                    .addComponent(modify_label_lastname))
                                .addGap(25, 25, 25)
                                .addGroup(modify_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modify_savebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(modify_value_firstname)
                                    .addComponent(modify_value_lastname)))))
                    .addGroup(modify_panelLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(modify_success)))
                .addGap(178, 178, 178))
        );
        modify_panelLayout.setVerticalGroup(
            modify_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modify_panelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(modify_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modify_value_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modify_label_username))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modify_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modify_value_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modify_label_password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modify_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modify_value_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modify_label_firstname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modify_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modify_value_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modify_label_lastname))
                .addGap(18, 18, 18)
                .addComponent(modify_savebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modify_success)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(table);

        viewall_deletebtn.setText("Delete");
        viewall_deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewall_deletebtnMouseClicked(evt);
            }
        });

        viewall_delete_value.setText("Select Id");

        javax.swing.GroupLayout viewall_panelLayout = new javax.swing.GroupLayout(viewall_panel);
        viewall_panel.setLayout(viewall_panelLayout);
        viewall_panelLayout.setHorizontalGroup(
            viewall_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewall_panelLayout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addGroup(viewall_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewall_panelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(viewall_delete_success))
                    .addGroup(viewall_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(viewall_delete_value)
                        .addComponent(viewall_deletebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(205, 205, 205))
            .addGroup(viewall_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewall_panelLayout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        viewall_panelLayout.setVerticalGroup(
            viewall_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewall_panelLayout.createSequentialGroup()
                .addContainerGap(341, Short.MAX_VALUE)
                .addComponent(viewall_delete_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewall_deletebtn)
                .addGap(2, 2, 2)
                .addComponent(viewall_delete_success))
            .addGroup(viewall_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewall_panelLayout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 81, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(welcome_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(info_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(modify_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(45, 45, 45)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(viewall_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(welcome_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(info_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(modify_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(47, 47, 47)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(viewall_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_formMouseClicked

    private void signup_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_btnMouseClicked

    }//GEN-LAST:event_signup_btnMouseClicked

    private void login_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btnMouseClicked
        // TODO add your handling code here:
        switchPanel(welcome_panel, login_panel);
    }//GEN-LAST:event_login_btnMouseClicked

    private void login_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_usernameFocusGained
        String username = login_username.getText().trim().toLowerCase();
        if (username.equals("username")) {
            login_username.setText("");
        }


    }//GEN-LAST:event_login_usernameFocusGained

    private void login_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_usernameFocusLost
        // TODO add your handling code here:
        String username = login_username.getText().trim().toLowerCase();
        if (username.equals("")) {
            login_username.setText("username");
        }
    }//GEN-LAST:event_login_usernameFocusLost

    private void login_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_passwordFocusGained
        // TODO add your handling code here:

        login_password.setText("");


    }//GEN-LAST:event_login_passwordFocusGained

    private void login_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_passwordFocusLost
        // TODO add your handling code here:
        if (login_password.getText().trim().equals("")) {
            this.login_password.setText("Enter a password");
        }
    }//GEN-LAST:event_login_passwordFocusLost

    private void login_btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btn2MouseClicked
        // TODO add your handling code here:
        String username = login_username.getText();
        String password = login_password.getText();
        if (!username.isEmpty() && !password.isEmpty()) {
            String sql = "Select * from user Where username='" + username + "' and password='" + password + "'";
            try {
                rs = statement.executeQuery(sql);
                if (rs.next()) {
                    userId = rs.getInt(1);
                    //display info panel
                    switchPanel(login_panel, info_panel);
                    logged_in_username.setText("Mr. / Ms./ " + rs.getString(3));
                }
            } catch (SQLException ex) {
                Logger.getLogger(CCTProjectUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_login_btn2MouseClicked

    private void logged_in_modifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logged_in_modifyMouseClicked
        // TODO add your handling code here:        
        try {
            // TODO add your handling code here:
            modify_value_username.setText(rs.getString(5));
            modify_value_password.setText(rs.getString(6));
            modify_value_firstname.setText(rs.getString(3));
            modify_value_lastname.setText(rs.getString(4));

        } catch (SQLException ex) {
            Logger.getLogger(CCTProjectUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        switchPanel(info_panel, modify_panel);

    }//GEN-LAST:event_logged_in_modifyMouseClicked

    private void modify_savebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modify_savebtnMouseClicked
        try {
            // TODO add your handling code here:
            rs.updateString(3, modify_value_firstname.getText());
            rs.updateString(4, modify_value_lastname.getText());
            rs.updateString(5, modify_value_username.getText());
            rs.updateString(6, modify_value_password.getText());
            rs.updateRow();
            modify_success.setVisible(true);
            modify_success.setText("Success!");
        } catch (SQLException ex) {
            Logger.getLogger(CCTProjectUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modify_savebtnMouseClicked

    private void logged_in_viewallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logged_in_viewallMouseClicked
        try {
            // TODO add your handling code here:
            
            ResultSet users = statement.executeQuery("select * from user");
            table.setModel(DbUtils.resultSetToTableModel(users));
            switchPanel(info_panel,viewall_panel);
        } catch (SQLException ex) {
            Logger.getLogger(CCTProjectUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logged_in_viewallMouseClicked

    private void viewall_deletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewall_deletebtnMouseClicked
        // TODO add your handling code here:
        int toBeDeletedId = Integer.parseInt(viewall_delete_value.getText());
        try {
            statement.executeUpdate("Delete from user where id=" + toBeDeletedId);
            viewall_delete_success.setText("Deleted!");            
            table.setModel(DbUtils.resultSetToTableModel(statement.executeQuery("select * from user")));
        } catch (SQLException ex) {
            viewall_delete_success.setText("Something went wrong, try again");
            
        }
        
    }//GEN-LAST:event_viewall_deletebtnMouseClicked

    private void switchPanel(JPanel old, JPanel next) {
        old.setVisible(false);
        next.setVisible(true);
    }

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CCTProjectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CCTProjectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CCTProjectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CCTProjectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CCTProjectUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CCTProjectUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back_Icon;
    private javax.swing.JLabel current_time;
    private javax.swing.JPanel info_panel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logged_in_modify;
    private javax.swing.JLabel logged_in_msg;
    private javax.swing.JButton logged_in_solve;
    private javax.swing.JLabel logged_in_username;
    private javax.swing.JButton logged_in_viewall;
    private javax.swing.JButton login_btn;
    private javax.swing.JButton login_btn2;
    private javax.swing.JPanel login_panel;
    private javax.swing.JTextField login_password;
    private javax.swing.JLabel login_password_label;
    private javax.swing.JTextField login_username;
    private javax.swing.JLabel login_username_label;
    private javax.swing.JLabel modify_label_firstname;
    private javax.swing.JLabel modify_label_lastname;
    private javax.swing.JLabel modify_label_password;
    private javax.swing.JLabel modify_label_username;
    private javax.swing.JPanel modify_panel;
    private javax.swing.JButton modify_savebtn;
    private javax.swing.JLabel modify_success;
    private javax.swing.JTextField modify_value_firstname;
    private javax.swing.JTextField modify_value_lastname;
    private javax.swing.JTextField modify_value_password;
    private javax.swing.JTextField modify_value_username;
    private javax.swing.JButton signup_btn;
    private javax.swing.JTable table;
    private javax.swing.JLabel viewall_delete_success;
    private javax.swing.JTextField viewall_delete_value;
    private javax.swing.JButton viewall_deletebtn;
    private javax.swing.JPanel viewall_panel;
    private javax.swing.JPanel welcome_panel;
    private javax.swing.JLabel welcome_txt;
    // End of variables declaration//GEN-END:variables
}
