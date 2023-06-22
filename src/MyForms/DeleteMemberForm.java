package MyForms;

import MyClasses.Functions;
import MyClasses.Member;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class DeleteMemberForm extends javax.swing.JFrame {

    Functions func = new Functions();
    Member member = new MyClasses.Member();
    String imagePath = null;

    public DeleteMemberForm() {
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
        Member_ID = new javax.swing.JTextField();
        jLabel_EmptyID = new javax.swing.JLabel();
        Delete_Member = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        genrePanel.setBackground(new java.awt.Color(218, 186, 151));
        genrePanel.setBorder(BorderFactory.createMatteBorder(3,3,3,3, new Color(164,106,106)));

        genreLabel.setBackground(new java.awt.Color(164, 106, 106));
        genreLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(243, 236, 236));
        genreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genreLabel.setText("  Delete Member");
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
        jLabel4.setText("Enter ID:");

        Member_ID.setBackground(new java.awt.Color(243, 236, 236));
        Member_ID.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Member_ID.setForeground(new java.awt.Color(6, 4, 6));
        Member_ID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Member_IDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Member_IDFocusLost(evt);
            }
        });
        Member_ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Member_IDKeyTyped(evt);
            }
        });

        jLabel_EmptyID.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel_EmptyID.setForeground(new java.awt.Color(250, 0, 0));
        jLabel_EmptyID.setText("    ");

        Delete_Member.setBackground(new java.awt.Color(0, 117, 98));
        Delete_Member.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Delete_Member.setForeground(new java.awt.Color(243, 236, 236));
        Delete_Member.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Delete_Member.setText("Delete Member");
        Delete_Member.setOpaque(true);
        Delete_Member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Delete_MemberMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Delete_MemberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Delete_MemberMouseExited(evt);
            }
        });

        javax.swing.GroupLayout genrePanelLayout = new javax.swing.GroupLayout(genrePanel);
        genrePanel.setLayout(genrePanelLayout);
        genrePanelLayout.setHorizontalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Delete_Member, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_EmptyID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Member_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        genrePanelLayout.setVerticalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Member_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_EmptyID)
                .addGap(18, 18, 18)
                .addComponent(Delete_Member, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(genrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(genrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genreExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genreExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_genreExitMouseClicked

    private void Delete_MemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete_MemberMouseClicked
        // add a new member
        try {
            int id = Integer.parseInt(Member_ID.getText());
            int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this member?", "Delete Member", JOptionPane.YES_NO_OPTION);

            if (confirmation == JOptionPane.YES_OPTION) {
                member.removeMember(id);
                // clear textfields
                Member_ID.setText("");
                // hide jLabel (empty messege)
                jLabel_EmptyID.setText("  ");
            }
        } catch (HeadlessException | NumberFormatException e) {
            jLabel_EmptyID.setText("*Enter Member ID");
        }
    }//GEN-LAST:event_Delete_MemberMouseClicked

    private void Delete_MemberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete_MemberMouseEntered
        Delete_Member.setBackground(new Color(0, 92, 77));
    }//GEN-LAST:event_Delete_MemberMouseEntered

    private void Delete_MemberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete_MemberMouseExited
        Delete_Member.setBackground(new Color(0, 117, 98));
    }//GEN-LAST:event_Delete_MemberMouseExited

    private void Member_IDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Member_IDFocusGained
        Member_ID.setBorder(new LineBorder(new Color(86, 76, 62), 2));
    }//GEN-LAST:event_Member_IDFocusGained

    private void Member_IDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Member_IDFocusLost
        Member_ID.setBorder(new LineBorder(new Color(218, 186, 151), 2));
    }//GEN-LAST:event_Member_IDFocusLost

    private void Member_IDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Member_IDKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_Member_IDKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Delete_Member;
    private javax.swing.JTextField Member_ID;
    private javax.swing.JLabel genreExit;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JPanel genrePanel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_EmptyID;
    // End of variables declaration//GEN-END:variables
}
