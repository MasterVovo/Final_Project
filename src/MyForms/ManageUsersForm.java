package MyForms;

import MyClasses.Functions;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public final class ManageUsersForm extends javax.swing.JFrame {

    MyClasses.Functions func = new Functions();
    MyClasses.Users user = new MyClasses.Users();

    public ManageUsersForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        func.displayImage(50, 50, null, "/MyImages/notepad.png", genreLabel);

        //Custom the jtable
        func.customTable(jTable_Users);
        func.customTableHeader(jTable_Users);

        //hide the jlabel "empty name messege"
        jLabel_EmptyFirstName.setVisible(false);
        jLabel_EmptyLastName.setVisible(false);
        jLabel_EmptyUserName.setVisible(false);
        jLabel_EmptyPassword.setVisible(false);

        //Populate Jtable With User
        UsersTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genrePanel = new javax.swing.JPanel();
        genreLabel = new javax.swing.JLabel();
        genreExit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jButton_Add = new javax.swing.JButton();
        jButton_Edit = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Users = new javax.swing.JTable();
        jLabel_EmptyFirstName = new javax.swing.JLabel();
        jTextField_FirstName = new javax.swing.JTextField();
        jTextField_Username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_EmptyLastName = new javax.swing.JLabel();
        jTextField_LastName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel_EmptyUserName = new javax.swing.JLabel();
        jLabel_EmptyPassword = new javax.swing.JLabel();
        jCheckBox_SetAdmin = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        genrePanel.setBackground(new java.awt.Color(218, 186, 151));
        genrePanel.setBorder(BorderFactory.createMatteBorder(3,3,3,3, new Color(164,106,106)));

        genreLabel.setBackground(new java.awt.Color(164, 106, 106));
        genreLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(243, 236, 236));
        genreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genreLabel.setText("  Manage Users");
        genreLabel.setOpaque(true);

        genreExit.setBackground(new java.awt.Color(164, 106, 106));
        genreExit.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        genreExit.setForeground(new java.awt.Color(243, 236, 236));
        genreExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genreExit.setText("X");
        genreExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        genreExit.setOpaque(true);
        genreExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                genreExitMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(6, 4, 6));
        jLabel4.setText("First Name:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(6, 4, 6));
        jLabel5.setText("ID:");

        jTextField_ID.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_ID.setEnabled(false);

        jButton_Add.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton_Add.setText("Add");
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });

        jButton_Edit.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton_Edit.setText("Edit");
        jButton_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditActionPerformed(evt);
            }
        });

        jButton_Delete.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton_Delete.setText("Delete");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        jTable_Users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_UsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Users);

        jLabel_EmptyFirstName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_EmptyFirstName.setForeground(new java.awt.Color(250, 0, 0));
        jLabel_EmptyFirstName.setText("*Enter the first name");
        jLabel_EmptyFirstName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyFirstNameMouseClicked(evt);
            }
        });

        jTextField_FirstName.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jTextField_Username.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(6, 4, 6));
        jLabel6.setText("Username:");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(6, 4, 6));
        jLabel8.setText("Last Name:");

        jLabel_EmptyLastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_EmptyLastName.setForeground(new java.awt.Color(250, 0, 0));
        jLabel_EmptyLastName.setText("*Enter the last name");
        jLabel_EmptyLastName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyLastNameMouseClicked(evt);
            }
        });

        jTextField_LastName.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(6, 4, 6));
        jLabel9.setText("Password:");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(6, 4, 6));
        jLabel10.setText("Retype Password:");

        jPasswordField1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jPasswordField2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel_EmptyUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_EmptyUserName.setForeground(new java.awt.Color(250, 0, 0));
        jLabel_EmptyUserName.setText("*Enter the username");
        jLabel_EmptyUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyUserNameMouseClicked(evt);
            }
        });

        jLabel_EmptyPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_EmptyPassword.setForeground(new java.awt.Color(250, 0, 0));
        jLabel_EmptyPassword.setText("*Enter the password");
        jLabel_EmptyPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyPasswordMouseClicked(evt);
            }
        });

        jCheckBox_SetAdmin.setBackground(new java.awt.Color(218, 186, 151));
        jCheckBox_SetAdmin.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jCheckBox_SetAdmin.setForeground(new java.awt.Color(6, 4, 6));
        jCheckBox_SetAdmin.setText("Make This user An Admin");
        jCheckBox_SetAdmin.setOpaque(true);

        javax.swing.GroupLayout genrePanelLayout = new javax.swing.GroupLayout(genrePanel);
        genrePanel.setLayout(genrePanelLayout);
        genrePanelLayout.setHorizontalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_EmptyLastName))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_EmptyPassword))
                    .addComponent(jLabel10)
                    .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, genrePanelLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, genrePanelLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel_EmptyFirstName))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, genrePanelLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel_EmptyUserName))
                        .addComponent(jTextField_Username))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField_LastName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                        .addComponent(jTextField_FirstName, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jCheckBox_SetAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genrePanelLayout.createSequentialGroup()
                .addComponent(genreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        genrePanelLayout.setVerticalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel_EmptyFirstName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel_EmptyLastName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel_EmptyUserName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel_EmptyPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox_SetAdmin)
                        .addGap(20, 20, 20)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(genrePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(genrePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genreExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genreExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_genreExitMouseClicked

    private void jButton_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditActionPerformed
        // edit user info
        String fname = jTextField_FirstName.getText();
        String lname = jTextField_LastName.getText();
        String username = jTextField_Username.getText();
        String password_1 = String.valueOf(jPasswordField1.getPassword());
        String password_2 = String.valueOf(jPasswordField2.getPassword());
        String userType = "user";

        if (jCheckBox_SetAdmin.isSelected()) {
            userType = "admin";
        }

        // Check if the textField are empty
        if (fname.trim().isEmpty()) {
            jLabel_EmptyFirstName.setVisible(true);
        } else if (lname.trim().isEmpty()) {
            jLabel_EmptyLastName.setVisible(true);
        } else if (username.trim().isEmpty()) {
            jLabel_EmptyUserName.setVisible(true);
        } else if (password_1.trim().isEmpty()) {
            jLabel_EmptyPassword.setVisible(true);
        } else if (!password_1.equals(password_2)) // check the password_1 doesn't equal the password_2
        {
            JOptionPane.showMessageDialog(null, "Retype The Correct Password", "Password Error!", 0);
        } else //if the textField is not empty
        {
            try {
                int id = Integer.parseInt(jTextField_ID.getText());
                // We need to check of this username already exist
                if (user.checkUsernameExists(id, username)) {
                    JOptionPane.showMessageDialog(null, "This Username Already Exists Try Another One", "Username Error", 0);
                } else {
                    user.editUsers(id, fname, lname, username, password_1, userType);

                    //refresh the Jtable Users
                    UsersTable();

                    // clear text form the textfields
                    jTextField_ID.setText("");
                    jTextField_FirstName.setText("");
                    jTextField_LastName.setText("");
                    jTextField_Username.setText("");
                    jPasswordField1.setText("");
                    jPasswordField2.setText("");
                    jCheckBox_SetAdmin.setSelected(false);

                    //hide jlabels
                    hideLabels();

                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Select The User you Want To Edit From The Table", "No ID Selected", 0);
            }
        }
    }//GEN-LAST:event_jButton_EditActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        // Delete the selected user
        try {
            int id = Integer.parseInt(jTextField_ID.getText());

            //Confirmation message
            int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this user?", "Delete User", JOptionPane.YES_NO_OPTION);

            if (confirmation == JOptionPane.YES_OPTION) {
                user.removeUser(id);
            }

            //refresh the Jtable Users
            UsersTable();

            // clear text form the textfields
            jTextField_ID.setText("");
            jTextField_FirstName.setText("");
            jTextField_LastName.setText("");
            jTextField_Username.setText("");
            jPasswordField1.setText("");
            jPasswordField2.setText("");
            jCheckBox_SetAdmin.setSelected(false);

            //hide jlabels
            hideLabels();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid User ID - " + ex.getMessage(), "Error!", 0);
        }
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
        // add a new user
        String fname = jTextField_FirstName.getText();
        String lname = jTextField_LastName.getText();
        String username = jTextField_Username.getText();
        String password_1 = String.valueOf(jPasswordField1.getPassword());
        String password_2 = String.valueOf(jPasswordField2.getPassword());
        String userType = "user";

        if (jCheckBox_SetAdmin.isSelected()) {
            userType = "admin";
        }

        // Check if the textField are empty
        if (fname.trim().isEmpty()) {
            jLabel_EmptyFirstName.setVisible(true);
        } else if (lname.trim().isEmpty()) {
            jLabel_EmptyLastName.setVisible(true);
        } else if (username.trim().isEmpty()) {
            jLabel_EmptyUserName.setVisible(true);
        } else if (password_1.trim().isEmpty()) {
            jLabel_EmptyPassword.setVisible(true);
        } else if (!password_1.equals(password_2)) // check the password_1 doesn't equal the password_2
        {
            JOptionPane.showMessageDialog(null, "Retype The Correct Password", "Password Error!", 0);
        } // We need to check of this username already exist
        else if (user.checkUsernameExists(0, username)) {
            JOptionPane.showMessageDialog(null, "This Username Already Exists Try Another One", "Username Error", 0);
        } else //if the textField is not empty
        {
            user.addUser(fname, lname, username, password_1, userType);
            //refresh the Jtable Users
            UsersTable();

            // clear text form the textfields
            jTextField_ID.setText("");
            jTextField_FirstName.setText("");
            jTextField_LastName.setText("");
            jTextField_Username.setText("");
            jPasswordField1.setText("");
            jPasswordField2.setText("");
            jCheckBox_SetAdmin.setSelected(false);

            // hide jlabels
            hideLabels();
        }
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jTable_UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_UsersMouseClicked
        // Display the selected member
        // get the selected row index
        int index = jTable_Users.getSelectedRow();

        //get values
        String id = jTable_Users.getValueAt(index, 0).toString();
        String firstName = jTable_Users.getValueAt(index, 1).toString();
        String lastName = jTable_Users.getValueAt(index, 2).toString();
        String userName = jTable_Users.getValueAt(index, 3).toString();
        String password = jTable_Users.getValueAt(index, 4).toString();
        String UserType = jTable_Users.getValueAt(index, 5).toString();

        // show data in textfields
        jTextField_ID.setText(id);
        jTextField_FirstName.setText(firstName);
        jTextField_LastName.setText(lastName);
        jTextField_Username.setText(userName);
        jPasswordField1.setText(password);
        jPasswordField2.setText(password);

        if (UserType.equals("admin")) {
            jCheckBox_SetAdmin.setSelected(true);
        } else {
            jCheckBox_SetAdmin.setSelected(false);
        }

    }//GEN-LAST:event_jTable_UsersMouseClicked

    //create a function to populate the jtable with users
    public void UsersTable() {

        ArrayList<MyClasses.Users> usersList = user.usersList();

        // jtable columns
        String[] colNames = {"ID", "F-Name", "L-Name", "UserName", "Password", "UserType"};

        // Row
        Object[][] rows = new Object[usersList.size()][colNames.length];

        for (int i = 0; i < usersList.size(); i++) {
            rows[i][0] = usersList.get(i).getID();
            rows[i][1] = usersList.get(i).getFirstName();
            rows[i][2] = usersList.get(i).getLastName();
            rows[i][3] = usersList.get(i).getUserName();
            rows[i][4] = usersList.get(i).getPassword();
            rows[i][5] = usersList.get(i).getUserType();

        }

        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Users.setModel(model);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < jTable_Users.getColumnCount(); i++) {
            jTable_Users.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }


    private void jLabel_EmptyLastNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyLastNameMouseClicked
        jLabel_EmptyLastName.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_EmptyLastNameMouseClicked

    private void jLabel_EmptyFirstNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyFirstNameMouseClicked
        // Hide this jlabel on click
        jLabel_EmptyFirstName.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_EmptyFirstNameMouseClicked

    private void jLabel_EmptyUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyUserNameMouseClicked
        jLabel_EmptyUserName.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_EmptyUserNameMouseClicked

    private void jLabel_EmptyPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyPasswordMouseClicked
        jLabel_EmptyPassword.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_EmptyPasswordMouseClicked

    // create a method to hide all jlabels (red messages)
    public void hideLabels() {
        jLabel_EmptyFirstName.setForeground(Color.red);
        jLabel_EmptyLastName.setForeground(Color.red);
        jLabel_EmptyPassword.setForeground(Color.red);
        jLabel_EmptyUserName.setForeground(Color.red);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel genreExit;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JPanel genrePanel;
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Edit;
    private javax.swing.JCheckBox jCheckBox_SetAdmin;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_EmptyFirstName;
    private javax.swing.JLabel jLabel_EmptyLastName;
    private javax.swing.JLabel jLabel_EmptyPassword;
    private javax.swing.JLabel jLabel_EmptyUserName;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Users;
    private javax.swing.JTextField jTextField_FirstName;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_LastName;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
