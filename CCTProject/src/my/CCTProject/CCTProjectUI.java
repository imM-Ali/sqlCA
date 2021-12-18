/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.CCTProject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import static my.CCTProject.sqlConnection.connectDB;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Ali
 */
public class CCTProjectUI extends javax.swing.JFrame implements sqlConnection {

    //initial statement 
    Statement statement = connectDB().createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_UPDATABLE);
    int userType, userId;
    ResultSet rs;
    //stack to store all the windows turn by turn
    Stack<JPanel> panels = new Stack<JPanel>();

    public CCTProjectUI() throws SQLException {

        initComponents();

        //display only welcome screen
        welcome_panel.setVisible(true);
        panel_0.setVisible(false);
        panel_1.setVisible(false);
        panel_2.setVisible(false);
        panel_3.setVisible(false);
        panel_4.setVisible(false);
        modify_success.setVisible(false);
        panel_5.setVisible(false);
        panel_6.setVisible(false);
        panel_7.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcome_panel = new javax.swing.JPanel();
        welcome_txt = new javax.swing.JLabel();
        login_btn = new javax.swing.JButton();
        signup_btn = new javax.swing.JButton();
        wrapper = new javax.swing.JPanel();
        panel_0 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fname_value = new javax.swing.JTextField();
        lname_value = new javax.swing.JTextField();
        uname_value = new javax.swing.JTextField();
        pass_value = new javax.swing.JPasswordField();
        signup_btn2 = new javax.swing.JButton();
        login_btn_signup = new javax.swing.JButton();
        signup_success = new javax.swing.JLabel();
        panel_1 = new javax.swing.JPanel();
        login_username_label = new javax.swing.JLabel();
        login_password_label = new javax.swing.JLabel();
        login_username = new javax.swing.JTextField();
        login_btn2 = new javax.swing.JButton();
        login_password = new javax.swing.JPasswordField();
        error = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        signup_btn_lgin = new javax.swing.JButton();
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
        logged_in_history = new javax.swing.JButton();
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
        panel_6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        eq1_a = new javax.swing.JTextField();
        eq1_b = new javax.swing.JTextField();
        eq1_c = new javax.swing.JTextField();
        eq2_a = new javax.swing.JTextField();
        eq2_b = new javax.swing.JTextField();
        eq2_c = new javax.swing.JTextField();
        eq_solvebtn = new javax.swing.JButton();
        eq_answer = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        eq3_a = new javax.swing.JTextField();
        eq3_b = new javax.swing.JTextField();
        eq3_c = new javax.swing.JTextField();
        btn_33 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        eq3_d = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        eq2_d = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        eq1_d = new javax.swing.JTextField();
        panel_7 = new javax.swing.JPanel();
        historytbl = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        javax.swing.GroupLayout welcome_panelLayout = new javax.swing.GroupLayout(welcome_panel);
        welcome_panel.setLayout(welcome_panelLayout);
        welcome_panelLayout.setHorizontalGroup(
            welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcome_panelLayout.createSequentialGroup()
                .addContainerGap(285, Short.MAX_VALUE)
                .addGroup(welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(signup_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcome_panelLayout.createSequentialGroup()
                        .addComponent(welcome_txt)
                        .addGap(11, 11, 11)))
                .addGap(280, 280, 280))
        );
        welcome_panelLayout.setVerticalGroup(
            welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcome_panelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(welcome_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(login_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signup_btn)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("username");

        jLabel4.setText("Password");

        signup_btn2.setText("Sign up");
        signup_btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_btn2MouseClicked(evt);
            }
        });

        login_btn_signup.setText("Log in");
        login_btn_signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_btn_signupMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_0Layout = new javax.swing.GroupLayout(panel_0);
        panel_0.setLayout(panel_0Layout);
        panel_0Layout.setHorizontalGroup(
            panel_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_0Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(panel_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_0Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uname_value))
                    .addGroup(panel_0Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lname_value))
                    .addGroup(panel_0Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fname_value, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_0Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pass_value))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_0Layout.createSequentialGroup()
                        .addGroup(panel_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(signup_btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(login_btn_signup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_0Layout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addComponent(signup_success, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        panel_0Layout.setVerticalGroup(
            panel_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_0Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(panel_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fname_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lname_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(uname_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pass_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(signup_success, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signup_btn2)
                .addGap(18, 18, 18)
                .addComponent(login_btn_signup)
                .addContainerGap(100, Short.MAX_VALUE))
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

        signup_btn_lgin.setText("Sign up");
        signup_btn_lgin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_btn_lginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_1Layout = new javax.swing.GroupLayout(panel_1);
        panel_1.setLayout(panel_1Layout);
        panel_1Layout.setHorizontalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(login_password)
                                    .addComponent(signup_btn_lgin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(93, 93, 93))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
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
                .addGap(28, 28, 28)
                .addComponent(signup_btn_lgin)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        member_welcome.setToolTipText("");

        member_modify.setText("Modify profile");
        member_modify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                member_modifyMouseClicked(evt);
            }
        });

        member_equation.setText("Solve!");
        member_equation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                member_equationMouseClicked(evt);
            }
        });

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
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(member_equation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(member_modify, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(sign_out_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_2Layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addComponent(member_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        panel_2Layout.setVerticalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(member_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(member_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(member_equation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(sign_out_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
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

        logged_in_history.setText("View user history");
        logged_in_history.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logged_in_historyMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_3Layout = new javax.swing.GroupLayout(panel_3);
        panel_3.setLayout(panel_3Layout);
        panel_3Layout.setHorizontalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_3Layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(logged_in_username, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(panel_3Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(logged_in_modify, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logged_in_msg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logged_in_viewall, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sign_out_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logged_in_history, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_3Layout.setVerticalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(logged_in_username, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(logged_in_msg)
                .addGap(18, 18, 18)
                .addComponent(logged_in_modify)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logged_in_viewall)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logged_in_history)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
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
                        .addGroup(panel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(viewall_delete_value)
                            .addComponent(viewall_deletebtn))
                        .addGap(263, 263, 263))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewall_delete_success, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewall_delete_success, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        panel_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_6MouseEntered(evt);
            }
        });

        jLabel5.setText("Equation must be entered in the form -- ax+by = c  --");

        jLabel6.setText("Equation 1");

        jLabel7.setText("a");

        jLabel8.setText("b");

        jLabel9.setText("c");

        jLabel10.setText("Equation 2");

        jLabel11.setText("a");

        jLabel12.setText("b");

        jLabel13.setText("c");

        eq_solvebtn.setText("Solve!");
        eq_solvebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eq_solvebtnMouseClicked(evt);
            }
        });

        jLabel14.setText("Equation 3");

        jLabel15.setText("a");

        jLabel16.setText("b");

        jLabel17.setText("c");

        eq3_a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eq3_aMouseClicked(evt);
            }
        });

        eq3_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eq3_cActionPerformed(evt);
            }
        });

        btn_33.setText("3 Variables?");
        btn_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_33ActionPerformed(evt);
            }
        });

        jLabel18.setText("d");

        jLabel19.setText("d");

        jLabel20.setText("d");

        javax.swing.GroupLayout panel_6Layout = new javax.swing.GroupLayout(panel_6);
        panel_6.setLayout(panel_6Layout);
        panel_6Layout.setHorizontalGroup(
            panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_6Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_6Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(eq_answer))
                            .addComponent(eq_solvebtn))
                        .addGap(275, 275, 275))
                    .addGroup(panel_6Layout.createSequentialGroup()
                        .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_6Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel6))
                            .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_6Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(eq1_a, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                        .addComponent(eq1_b)))
                                .addGroup(panel_6Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(eq1_d, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(eq1_c, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(113, 113, 113)
                                .addComponent(jLabel14)
                                .addGap(83, 83, 83))
                            .addGroup(panel_6Layout.createSequentialGroup()
                                .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(eq2_d, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(eq2_a, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eq2_b, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eq2_c, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_6Layout.createSequentialGroup()
                                        .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel16)
                                                .addComponent(jLabel15))
                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(eq3_a)
                                            .addComponent(eq3_b)
                                            .addComponent(eq3_c, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panel_6Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel18)
                                        .addGap(18, 18, 18)
                                        .addComponent(eq3_d, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_33)
                .addGap(306, 306, 306))
            .addGroup(panel_6Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel5)
                .addContainerGap(178, Short.MAX_VALUE))
        );
        panel_6Layout.setVerticalGroup(
            panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btn_33)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel14))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_6Layout.createSequentialGroup()
                        .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(eq2_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(eq1_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_6Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel12))
                            .addGroup(panel_6Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(eq2_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(eq1_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(34, 34, 34)
                        .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(eq2_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eq1_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel17)
                            .addComponent(eq3_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_6Layout.createSequentialGroup()
                        .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(eq3_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(eq3_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(eq2_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eq1_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel18)
                    .addComponent(eq3_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(eq_solvebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eq_answer)
                .addGap(32, 32, 32))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        historytbl.setViewportView(jTable1);

        javax.swing.GroupLayout panel_7Layout = new javax.swing.GroupLayout(panel_7);
        panel_7.setLayout(panel_7Layout);
        panel_7Layout.setHorizontalGroup(
            panel_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
            .addGroup(panel_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(historytbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panel_7Layout.setVerticalGroup(
            panel_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
            .addGroup(panel_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(historytbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout wrapperLayout = new javax.swing.GroupLayout(wrapper);
        wrapper.setLayout(wrapperLayout);
        wrapperLayout.setHorizontalGroup(
            wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
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
            .addGroup(wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wrapperLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wrapperLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wrapperLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        wrapperLayout.setVerticalGroup(
            wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
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
            .addGroup(wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wrapperLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wrapperLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wrapperLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGap(0, 508, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(welcome_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(134, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signup_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_btnMouseClicked
        switchPanel(welcome_panel, panel_0);
    }//GEN-LAST:event_signup_btnMouseClicked

    private void login_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btnMouseClicked
        // TODO add your handling code here:

        switchPanel(welcome_panel, panel_1);


    }//GEN-LAST:event_login_btnMouseClicked

    private void login_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_usernameFocusGained
        //clears username field on click
        error.setText("");
        String username = login_username.getText().trim().toLowerCase();
        if (username.equals("username")) {
            login_username.setText("");
        }


    }//GEN-LAST:event_login_usernameFocusGained

    private void login_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_usernameFocusLost
        // fills username field with a placeholder if it is empty
        String username = login_username.getText().trim().toLowerCase();
        if (username.equals("")) {
            login_username.setText("username");
        }
    }//GEN-LAST:event_login_usernameFocusLost

    private void login_btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btn2MouseClicked
        // TODO add your handling code here:
//Gets the username and password from UI and checks usertype in DB and presents the next UI accordingly
        String username = login_username.getText();
        String password = login_password.getText();
        if (!username.isEmpty() && !password.isEmpty()) {
            String sql = "Select * from user Where username='" + username + "' and password='" + password + "'";
            try {
                rs = statement.executeQuery(sql);
                if (rs.next()) {
                    userType = rs.getInt(2);
                    userId = rs.getInt(1);
                    login_password.setText("");
                    //admin
                    if (userType == 1) {
                        switchPanel(panel_1, panel_3);
                        logged_in_username.setText("Admin - " + rs.getString(3));

                    } //member
                    else {
                        switchPanel(panel_1, panel_2);
                        member_welcome.setText("Welcome, how are you " + rs.getString(3) + "?");
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
           
        //all the text fields are filled by placeholders matching the present values in Db
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
            // Gets the data from DB and presents in a table
            Statement statement2 = connectDB().createStatement();
            table.setModel(DbUtils.resultSetToTableModel(statement2.executeQuery("select * from user")));
            switchPanel(panel_3, panel_5);
        } catch (SQLException ex) {
            Logger.getLogger(CCTProjectUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logged_in_viewallMouseClicked

    private void viewall_deletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewall_deletebtnMouseClicked
        // Deletes data and refreshes the page:
        int toBeDeletedId = Integer.parseInt(viewall_delete_value.getText());
        try {
            Statement statement2 = connectDB().createStatement();
            statement2.executeUpdate("Delete from user where id=" + toBeDeletedId);
            viewall_delete_success.setText("Deleted!");
            table.setModel(DbUtils.resultSetToTableModel(statement2.executeQuery("select * from user")));
        } catch (SQLException ex) {
            viewall_delete_success.setText("Something went wrong, try again");

        }

    }//GEN-LAST:event_viewall_deletebtnMouseClicked

    private void viewall_delete_valueFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_viewall_delete_valueFocusGained
        // TODO add your handling code here:
        viewall_delete_value.setText("");
    }//GEN-LAST:event_viewall_delete_valueFocusGained

    private void back_btn_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btn_4MouseClicked
        // current panel set to invisible and the popped panel from stack set to visible
        panel_4.setVisible(false);
        panels.pop().setVisible(true);
        modify_success.setText("");
    }//GEN-LAST:event_back_btn_4MouseClicked

    private void back_btn_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btn_5MouseClicked
        
        panel_5.setVisible(false);
        panels.pop().setVisible(true);
    }//GEN-LAST:event_back_btn_5MouseClicked

    private void member_modifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member_modifyMouseClicked
        
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

    private void signup_btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_btn2MouseClicked
        // TODO add your handling code here:
        String query = "insert into user (userType, first_Name, last_Name,userName,password)" + " values (?, ?, ?, ?, ?)";
        try {
            PreparedStatement que = connectDB().prepareStatement(query);
            que.setInt(1, 2);

            que.setString(2, fname_value.getText());

            que.setString(3, lname_value.getText());

            que.setString(4, uname_value.getText());

            que.setString(5, pass_value.getText());
            //get info and add ezz
            que.executeUpdate();

            signup_success.setText("Signed Up successfully, please login");
            fname_value.setText("");
            lname_value.setText("");
            uname_value.setText("");
            pass_value.setText("");
        } catch (SQLException e) {
            signup_success.setText("Oops, something went wrong, try again");
        }
    }//GEN-LAST:event_signup_btn2MouseClicked

    private void login_btn_signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btn_signupMouseClicked
        // TODO add your handling code here:
        switchPanel(panel_0, panel_1);
    }//GEN-LAST:event_login_btn_signupMouseClicked

    private void signup_btn_lginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_btn_lginMouseClicked
        // TODO add your handling code here:
        switchPanel(panel_1, panel_0);
    }//GEN-LAST:event_signup_btn_lginMouseClicked

    private void eq_solvebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eq_solvebtnMouseClicked
        
        //if 3x3 eq
        //ax+by+cz=d
        if (btn_33.isSelected()) {

            //will use pairs, so     eq1,eq2  &&& eq2,eq3
            //************************PAIR 1*********************************//
            double[][] pair1 = {{Double.parseDouble(eq1_a.getText()), Double.parseDouble(eq1_b.getText()), Double.parseDouble(eq1_c.getText())}, {Double.parseDouble(eq2_a.getText()), Double.parseDouble(eq2_b.getText()), Double.parseDouble(eq2_c.getText())}};
            double[] result1 = {Double.parseDouble(eq1_d.getText()), Double.parseDouble(eq2_d.getText())};

            //keeping the original values in seperate variables because we will need them when substituting found values
            double firstof2 = Double.parseDouble(eq2_a.getText());
            double firstof1 = Double.parseDouble(eq1_a.getText());
            double secondof2 = Double.parseDouble(eq2_b.getText());
            double equals = result1[0];
            
            //runs through equation variables and tries to make the co-efficients of X equal in both equations 
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == 0) {
                        pair1[i][j] = pair1[i][j] * firstof2;
                        if (j == 0) {
                            result1[0] = result1[0] * firstof2;
                        }

                    } else {
                        pair1[i][j] = pair1[i][j] * firstof1;
                        if (j == 0) {
                            result1[1] = result1[1] * firstof1;
                        }
                    }

                }
            }
            
            //if co-efficients of X are equal but have same sign, this reverses the sign on 1 equation so they can be minus'd
            if (pair1[0][0] == pair1[1][0]) {
                for (int j = 0; j < 3; j++) {
                    pair1[1][j] = pair1[1][j] * -1;
                    if (j == 0) {
                        result1[1] = result1[1] * -1;
                    }
                }
            }
            double b1 = (pair1[0][1] + pair1[1][1]);
            double c1 = (pair1[0][2] + pair1[1][2]);
            double d1 = result1[0] + result1[1];

            
            
            //*****************************PAIR 2**************************//
            double[][] pair2 = {{Double.parseDouble(eq2_a.getText()), Double.parseDouble(eq2_b.getText()), Double.parseDouble(eq2_c.getText())}, {Double.parseDouble(eq3_a.getText()), Double.parseDouble(eq3_b.getText()), Double.parseDouble(eq3_c.getText())}};
            double[] result2 = {Double.parseDouble(eq2_d.getText()), Double.parseDouble(eq3_d.getText())};

            firstof2 = Double.parseDouble(eq3_a.getText());
            firstof1 = Double.parseDouble(eq2_a.getText());
            secondof2 = Double.parseDouble(eq3_b.getText());
            equals = result2[0];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == 0) {
                        pair2[i][j] = pair2[i][j] * firstof2;
                        if (j == 0) {
                            result2[0] = result2[0] * firstof2;
                        }

                    } else {
                        pair2[i][j] = pair2[i][j] * firstof1;
                        if (j == 0) {
                            result2[1] = result2[1] * firstof1;
                        }
                    }

                }
            }

            if (pair2[0][0] == pair2[1][0]) {
                for (int j = 0; j < 3; j++) {
                    pair2[1][j] = pair2[1][j] * -1;
                    if (j == 0) {
                        result2[1] = result2[1] * -1;
                    }
                }
            }
            double b2 = (pair2[0][1] + pair2[1][1]);
            double c2 = (pair2[0][2] + pair2[1][2]);
            double d2 = result2[0] + result2[1];

            
            //******Now we will solve pair 1 result and pair 2 result equation just as a 2x2 linear equation********//   
            double[][] lhs = {{b1, c1}, {b2, c2}};
            double[] rhs = {d1, d2};

            firstof2 = b2 * -1;
            firstof1 = b1;
            equals = d2 * -1;
            secondof2 = c2 * -1;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    if (i == 0) {
                        lhs[i][j] = lhs[i][j] * firstof2;
                        if (j == 0) {
                            rhs[0] = rhs[0] * firstof2;
                        }

                    } else {
                        lhs[i][j] = lhs[i][j] * firstof1;
                        if (j == 0) {
                            rhs[1] = rhs[1] * firstof1;
                        }
                    }

                }
            }

            if (lhs[0][0] > 0 && lhs[1][0] > 0) {
                int i = 0;
                for (int j = 0; j < 2; j++) {
                    lhs[i][j] = lhs[i][j] * -1;
                    if (j == 0) {
                        rhs[i] = rhs[i] * -1;
                    }

                }
            }

            double sumLHS = lhs[0][1] + lhs[1][1];
            double sumRHS = rhs[0] + rhs[1];
            //value of z
            double z = sumRHS / sumLHS;
            //putting z value into any of resulting equations found from pair1 or pair2
            secondof2 = secondof2 * z;
            if (secondof2 > 0) {
                equals = equals - secondof2;
            } else if (secondof2 < 0) {
                equals = equals + secondof2;
            }

            double yfinal = equals / firstof2;
            double y = yfinal;
            eq_answer.setText("y=" + y + ", z =" + z);

            //now that we have y and z, we can put in any original equation to get X
            //  eq1_a*x + eq1_b*y +eq1_c*z = eq1_d;
            y = Double.parseDouble(eq1_b.getText()) * y;

            z = Double.parseDouble(eq1_c.getText()) * z;

            y = y + z;

            if (y < 0) {
                equals = Double.parseDouble(eq1_d.getText()) - y;
            } else if (y > 0) {
                equals = Double.parseDouble(eq1_d.getText()) + y;
            }
            double x = equals / Double.parseDouble(eq1_a.getText());
            eq_answer.setText("x=" + x + ", y=" + yfinal + ",z =" + z);
            
            //when we have solved our equation, it will be saved in the DB against the current logged in users' ID
            String query = "insert into equationhistory (userId, equation1, equation2, equation3)" + " values (?, ?,?,?)";
            try {
                PreparedStatement que = connectDB().prepareStatement(query);
                que.setInt(2, userId);

                que.setString(3, eq1_a.getText() + "x" + eq1_b.getText() + "y" + eq1_c.getText() + "z=" + eq1_d.getText());
                que.setString(4, eq2_a.getText() + "x" + eq2_b.getText() + "y" + eq2_c.getText() + "z=" + eq2_d.getText());
                que.setString(5, eq3_a.getText() + "x" + eq3_b.getText() + "y" + eq3_c.getText() + "z=" + eq3_d.getText());

                //get info and add ezz
                que.executeUpdate();

            } catch (SQLException e) {
                signup_success.setText("Oops, something went wrong, try again");
            }

        } 

//if 2x2
        else {
            double[][] lhs = {{Double.parseDouble(eq1_a.getText()), Double.parseDouble(eq1_b.getText())}, {Double.parseDouble(eq2_a.getText()), Double.parseDouble(eq2_b.getText())}};
            double[] rhs = {Double.parseDouble(eq1_c.getText()), Double.parseDouble(eq2_c.getText())};

            double firstof2 = Double.parseDouble(eq2_a.getText());
            double firstof1 = Double.parseDouble(eq1_a.getText());
            double secondof2 = Double.parseDouble(eq2_b.getText());
            double equals = rhs[0];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    if (i == 0) {
                        lhs[i][j] = lhs[i][j] * firstof2;
                        if (j == 0) {
                            rhs[0] = rhs[0] * firstof2;
                        }

                    } else {
                        lhs[i][j] = lhs[i][j] * firstof1;
                        if (j == 0) {
                            rhs[1] = rhs[1] * firstof1;
                        }
                    }

                }
            }

            if (lhs[0][0] > 0 && lhs[1][0] > 0) {
                int i = 0;
                for (int j = 0; j < 2; j++) {
                    lhs[i][j] = lhs[i][j] * -1;
                    if (j == 0) {
                        rhs[i] = rhs[i] * -1;
                    }

                }
            }

            double sumLHS = lhs[0][1] + lhs[1][1];
            double sumRHS = rhs[0] + rhs[1];

            double y = sumRHS / sumLHS;

            secondof2 = secondof2 * y;
            if (y > 0) {
                equals = equals - secondof2;
            } else if (y < 0) {
                equals = equals + secondof2;
            }
            double x = equals / firstof2;

            eq_answer.setText(x + "," + y);

            try {
                String query = "insert into equationhistory (userId, equation1, equation2, equation3)" + " values (?, ?,?,?)";
                PreparedStatement que = connectDB().prepareStatement(query);
                que.setInt(1, userId);

                que.setString(2, eq1_a.getText() + "x" + eq1_b.getText() + "y=" + eq1_c.getText() + "c");
                que.setString(3, eq2_a.getText() + "x" + eq2_b.getText() + "y=" + eq2_c.getText() + "c");

                //get info and add ezz
                que.executeUpdate();

            } catch (Exception e) {

            }

        }


    }//GEN-LAST:event_eq_solvebtnMouseClicked

    private void member_equationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member_equationMouseClicked
        // TODO add your handling code here:
        switchPanel(panel_2, panel_6);
    }//GEN-LAST:event_member_equationMouseClicked

    private void eq3_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eq3_cActionPerformed
        // TODO add your handling code here:
        eq3_a.setEnabled(false);
    }//GEN-LAST:event_eq3_cActionPerformed

    private void eq3_aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eq3_aMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_eq3_aMouseClicked

    private void panel_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_6MouseEntered
        // disables the 'D' field and 3rd equation for input if 3x3 not selected on Ui:

        if (btn_33.isSelected()) {
            eq3_a.setEditable(true);
            eq3_b.setEditable(true);
            eq3_c.setEditable(true);
            eq3_d.setEditable(true);
            eq1_d.setEditable(true);
            eq2_d.setEditable(true);
        } else {
            eq3_a.setEditable(false);
            eq3_b.setEditable(false);
            eq3_c.setEditable(false);
            eq3_d.setEditable(false);
            eq1_d.setEditable(false);
            eq2_d.setEditable(false);
        }
    }//GEN-LAST:event_panel_6MouseEntered

    private void btn_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_33ActionPerformed

    private void logged_in_historyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logged_in_historyMouseClicked
        // TODO add your handling code here:        
        try {
            // TODO add your handling code here:
            Statement statement2 = connectDB().createStatement();
            jTable1.setModel(DbUtils.resultSetToTableModel(statement2.executeQuery("select * from equationhistory")));
            switchPanel(panel_3, panel_7);
        } catch (SQLException ex) {
            Logger.getLogger(CCTProjectUI.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_logged_in_historyMouseClicked

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
    private javax.swing.JRadioButton btn_33;
    private javax.swing.JTextField eq1_a;
    private javax.swing.JTextField eq1_b;
    private javax.swing.JTextField eq1_c;
    private javax.swing.JTextField eq1_d;
    private javax.swing.JTextField eq2_a;
    private javax.swing.JTextField eq2_b;
    private javax.swing.JTextField eq2_c;
    private javax.swing.JTextField eq2_d;
    private javax.swing.JTextField eq3_a;
    private javax.swing.JTextField eq3_b;
    private javax.swing.JTextField eq3_c;
    private javax.swing.JTextField eq3_d;
    private javax.swing.JLabel eq_answer;
    private javax.swing.JButton eq_solvebtn;
    private javax.swing.JLabel error;
    private javax.swing.JTextField fname_value;
    private javax.swing.JScrollPane historytbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lname_value;
    private javax.swing.JButton logged_in_history;
    private javax.swing.JButton logged_in_modify;
    private javax.swing.JLabel logged_in_msg;
    private javax.swing.JLabel logged_in_username;
    private javax.swing.JButton logged_in_viewall;
    private javax.swing.JButton login_btn;
    private javax.swing.JButton login_btn2;
    private javax.swing.JButton login_btn_signup;
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
    private javax.swing.JPanel panel_0;
    private javax.swing.JPanel panel_1;
    private javax.swing.JPanel panel_2;
    private javax.swing.JPanel panel_3;
    private javax.swing.JPanel panel_4;
    private javax.swing.JPanel panel_5;
    private javax.swing.JPanel panel_6;
    private javax.swing.JPanel panel_7;
    private javax.swing.JPasswordField pass_value;
    private javax.swing.JButton sign_out_2;
    private javax.swing.JButton sign_out_3;
    private javax.swing.JButton signup_btn;
    private javax.swing.JButton signup_btn2;
    private javax.swing.JButton signup_btn_lgin;
    private javax.swing.JLabel signup_success;
    private javax.swing.JTable table;
    private javax.swing.JTextField uname_value;
    private javax.swing.JLabel viewall_delete_success;
    private javax.swing.JTextField viewall_delete_value;
    private javax.swing.JButton viewall_deletebtn;
    private javax.swing.JPanel welcome_panel;
    private javax.swing.JLabel welcome_txt;
    private javax.swing.JPanel wrapper;
    // End of variables declaration//GEN-END:variables
}
