
package MyForms;
import MyClasses.Member;
import java.awt.Color;
import java.io.File;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;



public class AddBookForm extends javax.swing.JFrame {

    
    MyClasses.Member member = new MyClasses.Member();
    MyClasses.Functions func = new MyClasses.Functions();
    
    public AddBookForm() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        //add boarder to the panel
        Border genreFormBorder = BorderFactory.createMatteBorder(2,2,2,2, new Color(250, 130, 49));
        genrePanel.setBorder(genreFormBorder);
       
        func.displayImage(45, 45, null, "/MyImages/Book_Add.png", genreLabel);
        
        
        //add black border to the jlabel Image
        //Border jLabelImageBorder = BorderFactory.createMatteBorder(2,2,2,2, new Color(47,54,64));
        //jLabel_Image.setBorder(jLabelImageBorder);
        
        // add a default image to the jlabel 
        //func.displayImage(100, 75, null, "/MyImages/blank-profile.png", jLabel_Image);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jTextField_ID2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField_ID6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField_ID5 = new javax.swing.JTextField();
        jButton_Add = new javax.swing.JButton();
        genrePanel = new javax.swing.JPanel();
        genreLabel = new javax.swing.JLabel();
        genreExit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_ID1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_ID3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField_ID7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField_ID8 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField_ID10 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel_Image = new javax.swing.JLabel();
        jButton_BrowseProfilePic = new javax.swing.JButton();
        jButton_ManageGenre = new javax.swing.JButton();
        jButton_Add1 = new javax.swing.JButton();
        jButton_Add2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(6, 4, 6));
        jLabel7.setText("ISBN:");

        jTextField_ID2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_ID2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ID2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(6, 4, 6));
        jLabel11.setText("Publisher:");

        jTextField_ID6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(6, 4, 6));
        jLabel10.setText("Quantity:");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(6, 4, 6));
        jLabel12.setText("Quantity:");

        jTextField_ID5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_ID5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ID5ActionPerformed(evt);
            }
        });

        jButton_Add.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton_Add.setText("Add new member");
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        genrePanel.setBackground(new java.awt.Color(218, 186, 151));

        genreLabel.setBackground(new java.awt.Color(253, 150, 68));
        genreLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(243, 236, 236));
        genreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genreLabel.setText("Add a New Book");
        genreLabel.setOpaque(true);

        genreExit.setBackground(new java.awt.Color(253, 150, 68));
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

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(6, 4, 6));
        jLabel5.setText("ISBN:");

        jTextField_ID.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(6, 4, 6));
        jLabel6.setText("Name:");

        jTextField_ID1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_ID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ID1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(6, 4, 6));
        jLabel8.setText("Author:");

        jTextField_ID3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_ID3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ID3ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(6, 4, 6));
        jLabel9.setText("Quantity:");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(6, 4, 6));
        jLabel13.setText("Publisher:");

        jTextField_ID7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_ID7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ID7ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(6, 4, 6));
        jLabel14.setText("Price:");

        jTextField_ID8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_ID8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ID8ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(6, 4, 6));
        jLabel15.setText("Date Received:");

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(6, 4, 6));
        jLabel16.setText("Genre:");

        jTextField_ID10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_ID10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ID10ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(6, 4, 6));
        jLabel17.setText("Book Cover:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(6, 4, 6));
        jLabel18.setText("Book Description:");

        jLabel_Image.setBackground(new java.awt.Color(153, 153, 255));
        jLabel_Image.setOpaque(true);

        jButton_BrowseProfilePic.setText("Browse");
        jButton_BrowseProfilePic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BrowseProfilePicActionPerformed(evt);
            }
        });

        jButton_ManageGenre.setBackground(new java.awt.Color(153, 51, 0));
        jButton_ManageGenre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_ManageGenre.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ManageGenre.setText("Select Picture");
        jButton_ManageGenre.setContentAreaFilled(false);
        jButton_ManageGenre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_ManageGenre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_ManageGenre.setOpaque(true);
        jButton_ManageGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ManageGenreActionPerformed(evt);
            }
        });

        jButton_Add1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton_Add1.setText("Add Book");
        jButton_Add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add1ActionPerformed(evt);
            }
        });

        jButton_Add2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton_Add2.setText("Cancel");
        jButton_Add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout genrePanelLayout = new javax.swing.GroupLayout(genrePanel);
        genrePanel.setLayout(genrePanelLayout);
        genrePanelLayout.setHorizontalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addComponent(genreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genrePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_ID3))
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_ID10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_ID8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_ID7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genrePanelLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(269, 269, 269))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genrePanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addGroup(genrePanelLayout.createSequentialGroup()
                                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton_ManageGenre, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton_BrowseProfilePic)))
                                .addContainerGap())))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jButton_Add1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Add2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        genrePanelLayout.setVerticalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_ID10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ID3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ID7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ID8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_BrowseProfilePic)
                            .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_ManageGenre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Add1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Add2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(genrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
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

    private void jTextField_ID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ID1ActionPerformed

    private void jTextField_ID2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ID2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ID2ActionPerformed

    private void jTextField_ID3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ID3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ID3ActionPerformed

    private void jTextField_ID5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ID5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ID5ActionPerformed

    private void jTextField_ID7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ID7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ID7ActionPerformed

    private void jTextField_ID8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ID8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ID8ActionPerformed

    private void jTextField_ID10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ID10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ID10ActionPerformed

    private void jButton_BrowseProfilePicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BrowseProfilePicActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Profile Picture");

        fileChooser.setCurrentDirectory(new File("C://Users"));

        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Image", ".png", ".jpg", ".jpeg");
        fileChooser.addChoosableFileFilter(extensionFilter);

        int filestate = fileChooser.showSaveDialog(null);
    
        if (filestate == JFileChooser.APPROVE_OPTION){
            String path = fileChooser.getSelectedFile().getAbsolutePath();
            //jLabel_ImagePath.setText(path);
           //imagePath = path;

            func.displayImage(100, 100, null, path, jLabel_Image);
        }
    }//GEN-LAST:event_jButton_BrowseProfilePicActionPerformed

    private void jButton_ManageGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ManageGenreActionPerformed
        GenreForm manageGenre = new GenreForm();
        manageGenre.setVisible(true);
    }//GEN-LAST:event_jButton_ManageGenreActionPerformed

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
        
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jButton_Add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add1ActionPerformed
    
        
    }//GEN-LAST:event_jButton_Add1ActionPerformed

    private void jButton_Add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Add2ActionPerformed

     
    
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
            java.util.logging.Logger.getLogger(AddBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel genreExit;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JPanel genrePanel;
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Add1;
    private javax.swing.JButton jButton_Add2;
    private javax.swing.JButton jButton_BrowseProfilePic;
    private javax.swing.JButton jButton_ManageGenre;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_ID1;
    private javax.swing.JTextField jTextField_ID10;
    private javax.swing.JTextField jTextField_ID2;
    private javax.swing.JTextField jTextField_ID3;
    private javax.swing.JTextField jTextField_ID5;
    private javax.swing.JTextField jTextField_ID6;
    private javax.swing.JTextField jTextField_ID7;
    private javax.swing.JTextField jTextField_ID8;
    // End of variables declaration//GEN-END:variables
}
