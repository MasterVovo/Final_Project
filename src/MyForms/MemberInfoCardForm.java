package MyForms;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class MemberInfoCardForm extends javax.swing.JFrame {

    MyClasses.Member member = new MyClasses.Member();
    MyClasses.Functions func = new MyClasses.Functions();
    MyClasses.Author author = new MyClasses.Author();
    MyClasses.Genre genre = new MyClasses.Genre();

    public MemberInfoCardForm(int member_id) {
        initComponents();

        this.setLocationRelativeTo(null);

        func.displayImage(45, 45, null, "/MyImages/Book_Add.png", genreLabel);
        displayMemberInfo(member_id);

    }

    // create a function to display the member info
    public void displayMemberInfo(int member_id) {
        try {

            MyClasses.Member SelectedMember = member.getMemberById(member_id);

            if (SelectedMember != null) {
                jLabel_ID.setText(String.valueOf(SelectedMember.getId()));
                jLabel_Name.setText(SelectedMember.getFirstName() + " " + SelectedMember.getLastName());
                jLabel_Email.setText(SelectedMember.getEmail());
                jLabel_Phone.setText(SelectedMember.getPhoneNumber());
                jLabel_Gender.setText(SelectedMember.getGender());

                byte[] image = SelectedMember.getPicture();
                func.displayImage(150, 150, image, "", jLabel_Image);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MemberInfoCardForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genrePanel = new javax.swing.JPanel();
        genreLabel = new javax.swing.JLabel();
        genreExit = new javax.swing.JLabel();
        jLabel_Image = new javax.swing.JLabel();
        jLabel_ID = new javax.swing.JLabel();
        jLabel_Name = new javax.swing.JLabel();
        jLabel_Phone = new javax.swing.JLabel();
        jLabel_Email = new javax.swing.JLabel();
        jLabel_Gender = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        genrePanel.setBackground(new java.awt.Color(218, 186, 151));
        genrePanel.setBorder(BorderFactory.createMatteBorder(3,3,3,3, new Color(164,106,106)));
        genrePanel.setPreferredSize(new java.awt.Dimension(420, 520));

        genreLabel.setBackground(new java.awt.Color(164, 106, 106));
        genreLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(243, 236, 236));
        genreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genreLabel.setText("Member Info Card");
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

        jLabel_Image.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Image.setOpaque(true);

        jLabel_ID.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_ID.setForeground(new java.awt.Color(102, 0, 0));
        jLabel_ID.setText("ID:");

        jLabel_Name.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_Name.setForeground(new java.awt.Color(102, 0, 0));
        jLabel_Name.setText("Name:");

        jLabel_Phone.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_Phone.setForeground(new java.awt.Color(102, 0, 0));
        jLabel_Phone.setText("Phone:");

        jLabel_Email.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_Email.setForeground(new java.awt.Color(102, 0, 0));
        jLabel_Email.setText("Email:");

        jLabel_Gender.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_Gender.setForeground(new java.awt.Color(102, 0, 0));
        jLabel_Gender.setText("Gender:");

        javax.swing.GroupLayout genrePanelLayout = new javax.swing.GroupLayout(genrePanel);
        genrePanel.setLayout(genrePanelLayout);
        genrePanelLayout.setHorizontalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addComponent(genreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Email)
                            .addComponent(jLabel_Phone)
                            .addComponent(jLabel_Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_ID))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jLabel_Gender)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        genrePanelLayout.setVerticalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jLabel_ID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Phone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Gender))
                    .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(genrePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(genrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genreExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genreExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_genreExitMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel genreExit;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JPanel genrePanel;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_Gender;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Phone;
    // End of variables declaration//GEN-END:variables
}
