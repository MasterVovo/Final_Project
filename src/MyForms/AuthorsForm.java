package MyForms;

import MyClasses.Functions;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class AuthorsForm extends javax.swing.JFrame {

    MyClasses.Functions func = new Functions();
    
    /**
     * Creates new form GenreForm
     */
    
    MyClasses.Author author = new MyClasses.Author();
    
    public AuthorsForm() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        Border genreFormBorder = BorderFactory.createMatteBorder(2,2,2,2, new Color(164,106,106));
        genrePanel.setBorder(genreFormBorder);
        
        func.displayImage(60, 60, "/MyImages/notepad.png", genreLabel);
        
        
        //Custom the jtable
        func.customTable(jTable_Authors);
        
        //Custom the jtable header ROW
        /*jTable_Authors.getTableHeader().setBackground(Color.red);//Need to fix it 
        jTable_Authors.getTableHeader().setForeground(Color.white);
        jTable_Authors.getTableHeader().setFont (new Font("Verdana",Font.BOLD, 16));
        jTable_Authors.getTableHeader().setOpaque(false); */
        func.customTableHeader(jTable_Authors, Color.red, 16);
        
        //hide the jlabel "empty name messege"
        jLabel_EmptyFirstName.setVisible(false);
        jLabel_EmptyLastName.setVisible(false);
        
        //Populate Jtable With Authors
        populateJtableWithAuthors();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
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
        jTable_Authors = new javax.swing.JTable();
        jLabel_EmptyFirstName = new javax.swing.JLabel();
        jTextField_FirstName = new javax.swing.JTextField();
        jTextField_Expertise = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_EmptyLastName = new javax.swing.JLabel();
        jTextField_LastName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_About = new javax.swing.JTextArea();

        jLabel2.setBackground(new java.awt.Color(164, 106, 106));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(243, 236, 236));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Genres");
        jLabel2.setOpaque(true);

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton2.setText("Add");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        genrePanel.setBackground(new java.awt.Color(218, 186, 151));

        genreLabel.setBackground(new java.awt.Color(164, 106, 106));
        genreLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(243, 236, 236));
        genreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genreLabel.setText("  Manage Authors");
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
        jLabel4.setText("First Name:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setText("ID:");

        jTextField_ID.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });

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

        jTable_Authors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Authors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_AuthorsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Authors);

        jLabel_EmptyFirstName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_EmptyFirstName.setForeground(new java.awt.Color(250, 0, 0));
        jLabel_EmptyFirstName.setText("*Enter the first name");
        jLabel_EmptyFirstName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyFirstNameMouseClicked(evt);
            }
        });

        jTextField_FirstName.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FirstNameActionPerformed(evt);
            }
        });

        jTextField_Expertise.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_Expertise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ExpertiseActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setText("Expertise:");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setText("About:");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
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
        jTextField_LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_LastNameActionPerformed(evt);
            }
        });

        jTextArea_About.setColumns(20);
        jTextArea_About.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextArea_About.setRows(5);
        jScrollPane2.setViewportView(jTextArea_About);

        javax.swing.GroupLayout genrePanelLayout = new javax.swing.GroupLayout(genrePanel);
        genrePanel.setLayout(genrePanelLayout);
        genrePanelLayout.setHorizontalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addComponent(genreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genrePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, genrePanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_EmptyLastName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Expertise, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(6, 6, 6))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_EmptyFirstName)
                    .addComponent(jLabel8)
                    .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField_FirstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                        .addComponent(jTextField_LastName)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        genrePanelLayout.setVerticalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptyFirstName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptyLastName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Expertise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(genrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jButton_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditActionPerformed
        //edit the selected author 
        String fname = jTextField_FirstName.getText();
        String lname = jTextField_LastName.getText();
        String expertise = jTextField_Expertise.getText();
        String about = jTextArea_About.getText();
        
        // Check if the textField are empty
        if(fname.isEmpty())
        {
           jLabel_EmptyFirstName.setVisible(true);
        }
        else if(lname.isEmpty())
        {
           jLabel_EmptyLastName.setVisible(true);
        }
        else //if the textField is not empty
        {
            try
            {
                int id = Integer.parseInt(jTextField_ID.getText());
                author.EditAuthor(id, fname, lname, expertise, about);
                
                // refresh the Jtable Genres
                //populateJtableWithGenres();
            }
            catch(NumberFormatException ex)
            {    
            JOptionPane.showMessageDialog(null , "Invalid Author ID - " + ex.getMessage(), "Error!", 0);
            }
        
        }
    }//GEN-LAST:event_jButton_EditActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        // Delete the selected author
         try
            {
                int id = Integer.parseInt(jTextField_ID.getText());
                author.removeAuthor(id);
                
                // refresh the Jtable Genres
                //populateJtableWithGenres();
                
                // clear text form the textfields
                jTextField_ID.setText("");
                jTextField_FirstName.setText("");
                jTextField_LastName.setText("");
                jTextField_Expertise.setText("");
                jTextArea_About.setText("");
            }
            catch(NumberFormatException ex)
            {    
            JOptionPane.showMessageDialog(null , "Invalid Author ID - " + ex.getMessage(), "Error!", 0);
            }
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
        // add a new author
        String fname = jTextField_FirstName.getText();
        String lname = jTextField_LastName.getText();
        String expertise = jTextField_Expertise.getText();
        String about = jTextArea_About.getText();
        
        // Check if the textField are empty
        if(fname.isEmpty())
        {
           jLabel_EmptyFirstName.setVisible(true);
        }
        else if(lname.isEmpty())
        {
           jLabel_EmptyLastName.setVisible(true);
        }
        else //if the textField is not empty
        {
            author.addAuthor(fname, lname, expertise, about);
            
            // refresh the Jtable Genres
            //populateJtableWithGenres();
        }
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jTable_AuthorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_AuthorsMouseClicked
        // Display the selected author
        // get the selected row index
        int index = jTable_Authors.getSelectedRow();
        
        //get values
        String id = jTable_Authors.getValueAt(index, 0).toString();
        String firstName = jTable_Authors.getValueAt(index,1).toString();
        String lastName = jTable_Authors.getValueAt(index, 2).toString();
        String expertise = jTable_Authors.getValueAt(index,3).toString();
        String about = jTable_Authors.getValueAt(index, 4).toString();
        
        
        // show data in textfields
        jTextField_ID.setText(id);
        jTextField_FirstName.setText(firstName);
        jTextField_LastName.setText(lastName);
        jTextField_Expertise.setText(expertise);
        jTextArea_About.setText(about);
                
        
        
    }//GEN-LAST:event_jTable_AuthorsMouseClicked

    //create a function to populate the jtable with authors
    public void populateJtableWithAuthors()
    {
        
        ArrayList <MyClasses.Author>  authorsList = author.authorsList();
        
        // jtable columns
        String[] colNames = {"ID", "F-Name", "L-Name", "Expertise", "About"};
        
        // Row
        Object [][] rows = new Object [authorsList.size()][colNames.length];
        
        for (int i = 0; i < authorsList.size(); i++)
        {
          rows[i][0] = authorsList.get(i).getId();
          rows[i][1] = authorsList.get(i).getFirstName();
          rows[i][2] = authorsList.get(i).getLastName();
          rows[i][3] = authorsList.get(i).getField_Of_Expertise();
          rows[i][4] = authorsList.get(i).getAbout();
        }
        
        DefaultTableModel model = new DefaultTableModel (rows,colNames);
        jTable_Authors.setModel(model);
        
    }
    
    
    private void jTextField_FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FirstNameActionPerformed

    private void jTextField_ExpertiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ExpertiseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ExpertiseActionPerformed

    private void jLabel_EmptyLastNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyLastNameMouseClicked
        
        jLabel_EmptyLastName.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyLastNameMouseClicked

    private void jLabel_EmptyFirstNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyFirstNameMouseClicked
        // Hide this jlabel on click
        jLabel_EmptyFirstName.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyFirstNameMouseClicked

    private void jTextField_LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_LastNameActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AuthorsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthorsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthorsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthorsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuthorsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel genreExit;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JPanel genrePanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_EmptyFirstName;
    private javax.swing.JLabel jLabel_EmptyLastName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Authors;
    private javax.swing.JTextArea jTextArea_About;
    private javax.swing.JTextField jTextField_Expertise;
    private javax.swing.JTextField jTextField_FirstName;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_LastName;
    // End of variables declaration//GEN-END:variables
}
