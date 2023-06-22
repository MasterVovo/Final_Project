package MyForms;

import MyClasses.Functions;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.UUID;

public class LoginForm extends javax.swing.JFrame {

    MyClasses.Functions func = new Functions();
    ImageIcon logo = new ImageIcon("/MyImages/book_login_logo.png");
    
    public LoginForm() {
        initComponents();

        //Center the form
        this.setLocationRelativeTo(null);
        loginPassword.setEchoChar('*');

        //Displays the image
        func.displayImage(LoginLogo.getWidth(), LoginLogo.getHeight(), null, "/MyImages/book_login_logo.png", LoginLogo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LoginLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginUsername = new javax.swing.JTextField();
        loginPassword = new javax.swing.JPasswordField();
        Login = new javax.swing.JLabel();
        loginNoUsername = new javax.swing.JLabel();
        loginNoPassword = new javax.swing.JLabel();
        ShowPass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/MyImages/book_login_logo.png")));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(218, 186, 151));

        jPanel2.setBackground(new java.awt.Color(218, 186, 151));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(6, 4, 6));
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(6, 4, 6));
        jLabel3.setText("Password:");

        loginUsername.setBackground(new java.awt.Color(243, 236, 236));
        loginUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        loginUsername.setForeground(new java.awt.Color(6, 4, 6));
        loginUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginUsernameFocusLost(evt);
            }
        });

        loginPassword.setBackground(new java.awt.Color(243, 236, 236));
        loginPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        loginPassword.setForeground(new java.awt.Color(6, 4, 6));
        loginPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginPasswordFocusLost(evt);
            }
        });

        Login.setBackground(new java.awt.Color(0, 117, 98));
        Login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Login.setForeground(new java.awt.Color(243, 236, 236));
        Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Login.setText("Login");
        Login.setOpaque(true);
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginMouseExited(evt);
            }
        });

        loginNoUsername.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        loginNoUsername.setForeground(new java.awt.Color(255, 0, 0));
        loginNoUsername.setText("  ");

        loginNoPassword.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        loginNoPassword.setForeground(new java.awt.Color(255, 0, 0));
        loginNoPassword.setText("  ");

        ShowPass.setBackground(new java.awt.Color(218, 186, 151));
        ShowPass.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        ShowPass.setForeground(new java.awt.Color(6, 4, 6));
        ShowPass.setText("Show Pass");
        ShowPass.setOpaque(true);
        ShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(loginNoUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(loginNoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ShowPass, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(loginUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                        .addComponent(loginPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(loginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(loginNoUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginNoPassword)
                    .addComponent(ShowPass))
                .addGap(18, 18, 18)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(LoginLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String loadSession() {
        try ( BufferedReader br = new BufferedReader(new FileReader("session.txt"))) {
            String sessionInfo = br.readLine();
            String[] parts = sessionInfo.split(",");
            if (parts.length < 3) {
                // Invalid session file format
                return null;
            }
            String username = parts[0];
            String password = parts[1];
            UUID sessionId = UUID.fromString(parts[2]);
            boolean isValidSession = func.checkSessionID(username, sessionId);
            if (isValidSession) {
                MyClasses.Users user = new MyClasses.Users().tryLogin(username, password);
                return user.getUserType();
            }
        } catch (IOException e) {
        }
        return null;
    }


    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        String username = loginUsername.getText();
        String password = String.valueOf(loginPassword.getPassword());

        if (username.trim().equals("")) {
            loginNoUsername.setText("*No username entered");
        } else if (password.trim().equals("")) {
            loginNoUsername.setText("   ");
            loginNoPassword.setText("*No password entered");
        } else {
            loginNoPassword.setText("   ");
            MyClasses.Users user = new MyClasses.Users().tryLogin(username, password);
            if (user != null) {
                JOptionPane.showMessageDialog(null, "Login success", "Logged in", 1);

                func.saveSession(username, password);
                new DashboardForm(user.getUserType()).setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password", "Invalid Input", 0);
            }
        }
    }//GEN-LAST:event_LoginMouseClicked

    private void LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseExited
        Login.setBackground(new Color(0, 117, 98));
    }//GEN-LAST:event_LoginMouseExited

    private void LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseEntered
        Login.setBackground(new Color(0, 92, 77));
    }//GEN-LAST:event_LoginMouseEntered

    private void loginUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginUsernameFocusGained
        loginUsername.setBorder(new LineBorder(new Color(86, 76, 62), 2));
    }//GEN-LAST:event_loginUsernameFocusGained

    private void loginPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginPasswordFocusGained
        loginPassword.setBorder(new LineBorder(new Color(86, 76, 62), 2));
    }//GEN-LAST:event_loginPasswordFocusGained

    private void loginUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginUsernameFocusLost
        loginUsername.setBorder(new LineBorder(new Color(218, 186, 151), 2));
    }//GEN-LAST:event_loginUsernameFocusLost

    private void loginPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginPasswordFocusLost
        loginPassword.setBorder(new LineBorder(new Color(218, 186, 151), 2));
    }//GEN-LAST:event_loginPasswordFocusLost

    private void ShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPassActionPerformed
        if (ShowPass.isSelected()) {
            loginPassword.setEchoChar((char) 0);
        } else {
            loginPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowPassActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String usertype = new LoginForm().loadSession();
                if (usertype != null) {
                    new DashboardForm(usertype).setVisible(true);
                } else {
                    new LoginForm().setVisible(true);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login;
    private javax.swing.JLabel LoginLogo;
    private javax.swing.JCheckBox ShowPass;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel loginNoPassword;
    private javax.swing.JLabel loginNoUsername;
    private javax.swing.JPasswordField loginPassword;
    private javax.swing.JTextField loginUsername;
    // End of variables declaration//GEN-END:variables
}
