/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.CCTProject;

import java.awt.Component;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JList;
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
    int userType;
    ResultSet rs;
    Stack<JPanel> panels = new Stack<JPanel>();

    /**
     * Creates new form CCTProjectUI
     */
    public CCTProjectUI() throws SQLException {

        initComponents();

        //display only welcome screen
        welcome_panel.setVisible(true);
        panel_1.setVisible(false);
        panel_2.setVisible(false);
        panel_3.setVisible(false);
        panel_4.setVisible(false);
        modify_success.setVisible(false);
        panel_5.setVisible(false);

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcome_panel = new javax.swing.JPanel();
        welcome_txt = new javax.swing.JLabel();
        login_btn = new javax.swing.JButton();
        signup_btn = new javax.swing.JButton();
        current_time = new javax.swing.JLabel();
        wrapper = new javax.swing.JPanel();
        panel_1 = new javax.swing.JPanel();
        login_username_label = new javax.swing.JLabel();
        login_password_label = new javax.swing.JLabel();
        login_username = new javax.swing.JTextField();
        login_btn2 = new javax.swing.JButton();
        login_password = new javax.swing.JPasswordField();
        error = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        panel_2 = new javax.swing.JPanel();
        member_welcome = new javax.swing.JLabel();
        member_modify = new javax.swing.JButton();
        member_equation = new javax.swing.JButton();
        sign_out_2 = new javax.swing.JButton();
        panel_3 = new javax.swing.JPanel();
        logged_in_msg = new javax.swing.JLabel();
        logged_in_username = new javax.swing.JLabel();
        logged_in_modify = new javax.swing.JButton();
        logged_in_viewall = new javax.swing.JButton();
        sign_out_3 = new javax.swing.JButton();
        panel_4 = new javax.swing.JPanel();
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
        back_btn_4 = new javax.swing.JLabel();
        panel_5 = new javax.swing.JPanel();
        back_btn_5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        viewall_deletebtn = new javax.swing.JButton();
        viewall_delete_value = new javax.swing.JTextField();
        viewall_delete_success = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        welcome_txt.setText("Welcome!");

        login_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        login_btn.setText("Login");
        login_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_btnMouseClicked(evt);
            }
        });

        signup_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        signup_btn.setText("Sign up");
        signup_btn.setToolTipText("");
        signup_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcome_panelLayout.createSequentialGroup()
                .addContainerGap(304, Short.MAX_VALUE)
                .addGroup(welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(signup_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(welcome_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(current_time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(261, 261, 261))
        );
        welcome_panelLayout.setVerticalGroup(
            welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcome_panelLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(welcome_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(current_time)
                .addGap(18, 18, 18)
                .addComponent(login_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signup_btn)
                .addContainerGap(127, Short.MAX_VALUE))
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

        login_btn2.setBackground(new java.awt.Color(204, 204, 255));
        login_btn2.setText("Login");
        login_btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_btn2MouseClicked(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/CCTProject/images/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout panel_1Layout = new javax.swing.GroupLayout(panel_1);
        panel_1.setLayout(panel_1Layout);
        panel_1Layout.setHorizontalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(panel_1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_1Layout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_1Layout.createSequentialGroup()
                        .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_1Layout.createSequentialGroup()
                                .addComponent(login_username_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(login_username, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE))
                            .addGroup(panel_1Layout.createSequentialGroup()
                                .addComponent(login_password_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(login_btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                                    .addComponent(login_password))))
                        .addGap(93, 93, 93))))
        );
        panel_1Layout.setVerticalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_1Layout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_username_label)
                    .addComponent(login_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_password_label)
                    .addComponent(login_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_btn2)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        member_welcome.setToolTipText("");

        member_modify.setText("Modify profile");
        member_modify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                member_modifyMouseClicked(evt);
            }
        });

        member_equation.setText("Solve!");

        sign_out_2.setText("Sign out");
        sign_out_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sign_out_2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_2Layout = new javax.swing.GroupLayout(panel_2);
        panel_2.setLayout(panel_2Layout);
        panel_2Layout.setHorizontalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(member_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(member_equation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(member_modify, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addComponent(sign_out_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        panel_2Layout.setVerticalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(member_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(member_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(member_equation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(sign_out_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        logged_in_msg.setText("Logged In Successfully!");

        logged_in_modify.setText("Edit your profile");
        logged_in_modify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logged_in_modifyMouseClicked(evt);
            }
        });

        logged_in_viewall.setText("View all users");
        logged_in_viewall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logged_in_viewallMouseClicked(evt);
            }
        });

        sign_out_3.setBackground(new java.awt.Color(255, 0, 0));
        sign_out_3.setText("Sign out");
        sign_out_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sign_out_3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_3Layout = new javax.swing.GroupLayout(panel_3);
        panel_3.setLayout(panel_3Layout);
        panel_3Layout.setHorizontalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_3Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(logged_in_username, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logged_in_modify, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logged_in_msg)
                    .addComponent(logged_in_viewall, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sign_out_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        panel_3Layout.setVerticalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(logged_in_username, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(logged_in_msg)
                .addGap(18, 18, 18)
                .addComponent(logged_in_modify)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logged_in_viewall)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(sign_out_3)
                .addGap(47, 47, 47))
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

        back_btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/CCTProject/images/arrow.png"))); // NOI18N
        back_btn_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_btn_4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_4Layout = new javax.swing.GroupLayout(panel_4);
        panel_4.setLayout(panel_4Layout);
        panel_4Layout.setHorizontalGroup(
            panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_4Layout.createSequentialGroup()
                .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back_btn_4))
                    .addGroup(panel_4Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panel_4Layout.createSequentialGroup()
                                    .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(modify_label_password)
                                        .addComponent(modify_label_username))
                                    .addGap(28, 28, 28)
                                    .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(modify_value_password, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(modify_value_username, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_4Layout.createSequentialGroup()
                                    .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(modify_label_firstname)
                                        .addComponent(modify_label_lastname))
                                    .addGap(25, 25, 25)
                                    .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(modify_savebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(modify_value_firstname)
                                        .addComponent(modify_value_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panel_4Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(modify_success)))))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        panel_4Layout.setVerticalGroup(
            panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back_btn_4)
                .addGap(59, 59, 59)
                .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modify_value_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modify_label_username))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modify_value_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modify_label_password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modify_value_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modify_label_firstname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modify_value_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modify_label_lastname))
                .addGap(18, 18, 18)
                .addComponent(modify_savebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modify_success)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        back_btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/CCTProject/images/arrow.png"))); // NOI18N
        back_btn_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_btn_5MouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(table);

        viewall_deletebtn.setText("Delete");
        viewall_deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewall_deletebtnMouseClicked(evt);
            }
        });

        viewall_delete_value.setText("Select Id");
        viewall_delete_value.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                viewall_delete_valueFocusGained(evt);
            }
        });

        javax.swing.GroupLayout panel_5Layout = new javax.swing.GroupLayout(panel_5);
        panel_5.setLayout(panel_5Layout);
        panel_5Layout.setHorizontalGroup(
            panel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_5Layout.createSequentialGroup()
                        .addComponent(back_btn_5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_5Layout.createSequentialGroup()
                                .addComponent(viewall_delete_success)
                                .addGap(318, 318, 318))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_5Layout.createSequentialGroup()
                                .addGroup(panel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(viewall_delete_value)
                                    .addComponent(viewall_deletebtn))
                                .addGap(263, 263, 263))))))
        );
        panel_5Layout.setVerticalGroup(
            panel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back_btn_5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewall_delete_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewall_deletebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(viewall_delete_success))
        );

        javax.swing.GroupLayout wrapperLayout = new javax.swing.GroupLayout(wrapper);
        wrapper.setLayout(wrapperLayout);
        wrapperLayout.setHorizontalGroup(
            wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
            .addGroup(wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wrapperLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wrapperLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wrapperLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(panel_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(30, 30, 30)))
            .addGroup(wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wrapperLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wrapperLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        wrapperLayout.setVerticalGroup(
            wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
            .addGroup(wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wrapperLayout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(panel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
            .addGroup(wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wrapperLayout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(panel_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
            .addGroup(wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wrapperLayout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(panel_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(53, Short.MAX_VALUE)))
            .addGroup(wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wrapperLayout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(panel_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
            .addGroup(wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wrapperLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(welcome_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(welcome_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(82, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signup_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_btnMouseClicked

    }//GEN-LAST:event_signup_btnMouseClicked

    private void login_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btnMouseClicked
        // TODO add your handling code here:

        switchPanel(welcome_panel, panel_1);


    }//GEN-LAST:event_login_btnMouseClicked

    private void login_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_usernameFocusGained
        error.setText("");
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

    private void login_btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btn2MouseClicked
        // TODO add your handling code here:

        String username = login_username.getText();
        String password = login_password.getText();
        if (!username.isEmpty() && !password.isEmpty()) {
            String sql = "Select * from user Where username='" + username + "' and password='" + password + "'";
            try {
                rs = statement.executeQuery(sql);
                if (rs.next()) {
                    userType = rs.getInt(2);
                    System.out.println(userType);
                    login_password.setText("");
                    //admin
                    if (userType == 1) {
                        switchPanel(panel_1, panel_3);
                        logged_in_username.setText("Admin - " + rs.getString(3));
                        
                    } //member
                    else {
                        switchPanel(panel_1, panel_2);
                        member_welcome.setText("Welcome, how are you " + rs.getString(3) +"?");
                    }
                    //display info panel

                } else {
                    error.setText("Incorrect username or password, try again");
                }
            } catch (SQLException ex) {

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

        switchPanel(panel_3, panel_4);

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
            Statement statement2 = connectDB().createStatement();
            table.setModel(DbUtils.resultSetToTableModel(statement2.executeQuery("select * from user")));
            switchPanel(panel_3, panel_5);
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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        current_time.setText(java.time.LocalTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME));
    }//GEN-LAST:event_formWindowActivated

    private void viewall_delete_valueFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_viewall_delete_valueFocusGained
        // TODO add your handling code here:
        viewall_delete_value.setText("");
    }//GEN-LAST:event_viewall_delete_valueFocusGained

    private void back_btn_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btn_4MouseClicked
        // TODO add your handling code here:
        panel_4.setVisible(false);
        panels.pop().setVisible(true);
        modify_success.setText("");
    }//GEN-LAST:event_back_btn_4MouseClicked

    private void back_btn_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btn_5MouseClicked
        // TODO add your handling code here:
        panel_5.setVisible(false);
        panels.pop().setVisible(true);
    }//GEN-LAST:event_back_btn_5MouseClicked

    private void member_modifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member_modifyMouseClicked
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

        switchPanel(panel_2, panel_4);
    }//GEN-LAST:event_member_modifyMouseClicked

    private void sign_out_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_out_3MouseClicked
        // TODO add your handling code here:
        panel_3.setVisible(false);
        panels.pop().setVisible(true);
    }//GEN-LAST:event_sign_out_3MouseClicked

    private void sign_out_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_out_2MouseClicked
        // TODO add your handling code here:
        panel_2.setVisible(false);
        panels.pop().setVisible(true);
    }//GEN-LAST:event_sign_out_2MouseClicked

    private void switchPanel(JPanel old, JPanel next) {
        old.setVisible(false);

        next.setVisible(true);
        panels.push(old);

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
    private javax.swing.JLabel back_btn_4;
    private javax.swing.JLabel back_btn_5;
    private javax.swing.JLabel current_time;
    private javax.swing.JLabel error;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logged_in_modify;
    private javax.swing.JLabel logged_in_msg;
    private javax.swing.JLabel logged_in_username;
    private javax.swing.JButton logged_in_viewall;
    private javax.swing.JButton login_btn;
    private javax.swing.JButton login_btn2;
    private javax.swing.JPasswordField login_password;
    private javax.swing.JLabel login_password_label;
    private javax.swing.JTextField login_username;
    private javax.swing.JLabel login_username_label;
    private javax.swing.JLabel logo;
    private javax.swing.JButton member_equation;
    private javax.swing.JButton member_modify;
    private javax.swing.JLabel member_welcome;
    private javax.swing.JLabel modify_label_firstname;
    private javax.swing.JLabel modify_label_lastname;
    private javax.swing.JLabel modify_label_password;
    private javax.swing.JLabel modify_label_username;
    private javax.swing.JButton modify_savebtn;
    private javax.swing.JLabel modify_success;
    private javax.swing.JTextField modify_value_firstname;
    private javax.swing.JTextField modify_value_lastname;
    private javax.swing.JTextField modify_value_password;
    private javax.swing.JTextField modify_value_username;
    private javax.swing.JPanel panel_1;
    private javax.swing.JPanel panel_2;
    private javax.swing.JPanel panel_3;
    private javax.swing.JPanel panel_4;
    private javax.swing.JPanel panel_5;
    private javax.swing.JButton sign_out_2;
    private javax.swing.JButton sign_out_3;
    private javax.swing.JButton signup_btn;
    private javax.swing.JTable table;
    private javax.swing.JLabel viewall_delete_success;
    private javax.swing.JTextField viewall_delete_value;
    private javax.swing.JButton viewall_deletebtn;
    private javax.swing.JPanel welcome_panel;
    private javax.swing.JLabel welcome_txt;
    private javax.swing.JPanel wrapper;
    // End of variables declaration//GEN-END:variables
}
