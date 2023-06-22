package MyForms;

import MyClasses.Functions;
import MyClasses.Member;
import java.awt.Color;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class AddMemberForm extends javax.swing.JFrame {

    Functions func = new Functions();
    Member member = new MyClasses.Member();
    String imagePath = null;

    public AddMemberForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        func.displayImage(45, 45, null, "/MyImages/add_user.png", genreLabel);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genrePanel = new javax.swing.JPanel();
        genreLabel = new javax.swing.JLabel();
        genreExit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_EmptyFirstName = new javax.swing.JLabel();
        Member_Firstname = new javax.swing.JTextField();
        Member_PhoneNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_EmptyLastName = new javax.swing.JLabel();
        Member_Lastname = new javax.swing.JTextField();
        jLabel_EmptyPhoneNumber = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Member_Email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Member_Gender = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        Image_Path = new javax.swing.JLabel();
        MemberImage = new javax.swing.JLabel();
        Add_Member = new javax.swing.JLabel();
        Browse_Image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        genrePanel.setBackground(new java.awt.Color(218, 186, 151));
        genrePanel.setBorder(BorderFactory.createMatteBorder(3,3,3,3, new Color(164,106,106)));

        genreLabel.setBackground(new java.awt.Color(164, 106, 106));
        genreLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(243, 236, 236));
        genreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genreLabel.setText("  Add Member");
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

        jLabel_EmptyFirstName.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel_EmptyFirstName.setForeground(new java.awt.Color(250, 0, 0));
        jLabel_EmptyFirstName.setText("   ");

        Member_Firstname.setBackground(new java.awt.Color(243, 236, 236));
        Member_Firstname.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Member_Firstname.setForeground(new java.awt.Color(6, 4, 6));
        Member_Firstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Member_FirstnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Member_FirstnameFocusLost(evt);
            }
        });

        Member_PhoneNumber.setBackground(new java.awt.Color(243, 236, 236));
        Member_PhoneNumber.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Member_PhoneNumber.setForeground(new java.awt.Color(6, 4, 6));
        Member_PhoneNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Member_PhoneNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Member_PhoneNumberFocusLost(evt);
            }
        });
        Member_PhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Member_PhoneNumberKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(6, 4, 6));
        jLabel6.setText("Phone Number:");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(6, 4, 6));
        jLabel8.setText("Last Name:");

        jLabel_EmptyLastName.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel_EmptyLastName.setForeground(new java.awt.Color(250, 0, 0));
        jLabel_EmptyLastName.setText("   ");

        Member_Lastname.setBackground(new java.awt.Color(243, 236, 236));
        Member_Lastname.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Member_Lastname.setForeground(new java.awt.Color(6, 4, 6));
        Member_Lastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Member_LastnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Member_LastnameFocusLost(evt);
            }
        });

        jLabel_EmptyPhoneNumber.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel_EmptyPhoneNumber.setForeground(new java.awt.Color(250, 0, 0));
        jLabel_EmptyPhoneNumber.setText("   ");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(6, 4, 6));
        jLabel9.setText("Email:");

        Member_Email.setBackground(new java.awt.Color(243, 236, 236));
        Member_Email.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Member_Email.setForeground(new java.awt.Color(6, 4, 6));
        Member_Email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Member_EmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Member_EmailFocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(6, 4, 6));
        jLabel10.setText("Gender:");

        Member_Gender.setBackground(new java.awt.Color(243, 236, 236));
        Member_Gender.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Member_Gender.setForeground(new java.awt.Color(6, 4, 6));
        Member_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        Member_Gender.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Member_GenderFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Member_GenderFocusLost(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(6, 4, 6));
        jLabel11.setText("Profile Picture:");

        Image_Path.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        Image_Path.setForeground(new java.awt.Color(6, 4, 6));
        Image_Path.setText("*Image Path");

        MemberImage.setBackground(new java.awt.Color(218, 186, 151));
        MemberImage.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        MemberImage.setForeground(new java.awt.Color(6, 4, 6));
        MemberImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MemberImage.setText("No Image");
        MemberImage.setBorder(BorderFactory.createMatteBorder(1,1,1,1, new Color(6,4,6)));
        MemberImage.setOpaque(true);

        Add_Member.setBackground(new java.awt.Color(0, 117, 98));
        Add_Member.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Add_Member.setForeground(new java.awt.Color(243, 236, 236));
        Add_Member.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add_Member.setText("Add Member");
        Add_Member.setOpaque(true);
        Add_Member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_MemberMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Add_MemberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Add_MemberMouseExited(evt);
            }
        });

        Browse_Image.setBackground(new java.awt.Color(0, 117, 98));
        Browse_Image.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Browse_Image.setForeground(new java.awt.Color(243, 236, 236));
        Browse_Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Browse_Image.setText("Browse");
        Browse_Image.setOpaque(true);
        Browse_Image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Browse_ImageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Browse_ImageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Browse_ImageMouseExited(evt);
            }
        });

        javax.swing.GroupLayout genrePanelLayout = new javax.swing.GroupLayout(genrePanel);
        genrePanel.setLayout(genrePanelLayout);
        genrePanelLayout.setHorizontalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(Member_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Add_Member, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_EmptyLastName))
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_EmptyFirstName))
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_EmptyPhoneNumber))
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(Member_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addComponent(Browse_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(MemberImage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Image_Path, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Member_Firstname, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Member_Lastname, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Member_PhoneNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        genrePanelLayout.setVerticalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel_EmptyFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Member_Firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel_EmptyLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Member_Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel_EmptyPhoneNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Member_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Member_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Member_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Image_Path))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MemberImage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Browse_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Add_Member, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(genrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(genrePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genreExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genreExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_genreExitMouseClicked

    private void Member_PhoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Member_PhoneNumberKeyTyped
        // Allow only numbers on phone jtextfields
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_Member_PhoneNumberKeyTyped

    private void Add_MemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_MemberMouseClicked
        // add a new member
        String fname = Member_Firstname.getText();
        String lname = Member_Lastname.getText();
        String phone = Member_PhoneNumber.getText();
        String email = Member_Email.getText();
        String gender = Member_Gender.getSelectedItem().toString();

        // Check if the textField are empty
        if (fname.trim().isEmpty()) {
            jLabel_EmptyFirstName.setText("*Enter first name");
            jLabel_EmptyLastName.setText(" ");
            jLabel_EmptyPhoneNumber.setText(" ");
        } else if (lname.trim().isEmpty()) {
            jLabel_EmptyFirstName.setText(" ");
            jLabel_EmptyLastName.setText("*Enter last name");
            jLabel_EmptyPhoneNumber.setText(" ");
        } else if (phone.trim().isEmpty()) {
            jLabel_EmptyFirstName.setText(" ");
            jLabel_EmptyLastName.setText(" ");
            jLabel_EmptyPhoneNumber.setText("*Enter phone number");
        } else //if the textField is not empty
        {
            jLabel_EmptyFirstName.setText(" ");
            jLabel_EmptyLastName.setText(" ");
            jLabel_EmptyPhoneNumber.setText(" ");
            byte[] img = null;

            if (imagePath != null) {
                try {
                    Path path = Paths.get(imagePath);
                    img = Files.readAllBytes(path);
                    member.addMember(fname, lname, phone, email, gender, img);
                } catch (IOException ex) {
                    Logger.getLogger(AddMemberForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No Image Selected", "Add member", 2);
            }
        }
    }//GEN-LAST:event_Add_MemberMouseClicked

    private void Add_MemberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_MemberMouseEntered
        Add_Member.setBackground(new Color(0, 92, 77));
    }//GEN-LAST:event_Add_MemberMouseEntered

    private void Add_MemberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_MemberMouseExited
        Add_Member.setBackground(new Color(0, 117, 98));
    }//GEN-LAST:event_Add_MemberMouseExited

    private void Browse_ImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Browse_ImageMouseClicked
        String path = func.selectPicture();
        if (!path.equals("")) {
            Image_Path.setText(path);
            imagePath = path;
        }
        func.displayImage(100, 100, null, imagePath, MemberImage);
        MemberImage.setText("");
    }//GEN-LAST:event_Browse_ImageMouseClicked

    private void Browse_ImageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Browse_ImageMouseEntered
        Browse_Image.setBackground(new Color(0, 92, 77));
    }//GEN-LAST:event_Browse_ImageMouseEntered

    private void Browse_ImageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Browse_ImageMouseExited
        Browse_Image.setBackground(new Color(0, 117, 98));
    }//GEN-LAST:event_Browse_ImageMouseExited

    private void Member_FirstnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Member_FirstnameFocusGained
        Member_Firstname.setBorder(new LineBorder(new Color(86, 76, 62), 2));
    }//GEN-LAST:event_Member_FirstnameFocusGained

    private void Member_FirstnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Member_FirstnameFocusLost
        Member_Firstname.setBorder(new LineBorder(new Color(218, 186, 151), 2));
    }//GEN-LAST:event_Member_FirstnameFocusLost

    private void Member_LastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Member_LastnameFocusGained
        Member_Lastname.setBorder(new LineBorder(new Color(86, 76, 62), 2));
    }//GEN-LAST:event_Member_LastnameFocusGained

    private void Member_LastnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Member_LastnameFocusLost
        Member_Lastname.setBorder(new LineBorder(new Color(218, 186, 151), 2));
    }//GEN-LAST:event_Member_LastnameFocusLost

    private void Member_PhoneNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Member_PhoneNumberFocusGained
        Member_PhoneNumber.setBorder(new LineBorder(new Color(86, 76, 62), 2));
    }//GEN-LAST:event_Member_PhoneNumberFocusGained

    private void Member_PhoneNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Member_PhoneNumberFocusLost
        Member_PhoneNumber.setBorder(new LineBorder(new Color(218, 186, 151), 2));
    }//GEN-LAST:event_Member_PhoneNumberFocusLost

    private void Member_EmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Member_EmailFocusGained
        Member_Email.setBorder(new LineBorder(new Color(86, 76, 62), 2));
    }//GEN-LAST:event_Member_EmailFocusGained

    private void Member_EmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Member_EmailFocusLost
        Member_Email.setBorder(new LineBorder(new Color(218, 186, 151), 2));
    }//GEN-LAST:event_Member_EmailFocusLost

    private void Member_GenderFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Member_GenderFocusGained
        Member_Gender.setBorder(new LineBorder(new Color(86, 76, 62), 2));
    }//GEN-LAST:event_Member_GenderFocusGained

    private void Member_GenderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Member_GenderFocusLost
        Member_Gender.setBorder(new LineBorder(new Color(218, 186, 151), 2));
    }//GEN-LAST:event_Member_GenderFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_Member;
    private javax.swing.JLabel Browse_Image;
    private javax.swing.JLabel Image_Path;
    private javax.swing.JLabel MemberImage;
    private javax.swing.JTextField Member_Email;
    private javax.swing.JTextField Member_Firstname;
    private javax.swing.JComboBox<String> Member_Gender;
    private javax.swing.JTextField Member_Lastname;
    private javax.swing.JTextField Member_PhoneNumber;
    private javax.swing.JLabel genreExit;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JPanel genrePanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_EmptyFirstName;
    private javax.swing.JLabel jLabel_EmptyLastName;
    private javax.swing.JLabel jLabel_EmptyPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
