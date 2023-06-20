
package MyForms;
import MyClasses.Member;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;



public class MemberListForm extends javax.swing.JFrame {

    
    MyClasses.Member member = new MyClasses.Member();
    MyClasses.Functions func = new MyClasses.Functions();
    
    public MemberListForm() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        func.displayImage(45, 45, null, "/MyImages/add_user.png", MemberList);
        
        //Custom the jtable
        func.customTable(Member_Table);
        
        //Custom the jtable header ROW
        func.customTableHeader(Member_Table);
        
        // display members in the jtable  
        populateJtableWithMembers("");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genrePanel = new javax.swing.JPanel();
        MemberList = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SearchBar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Member_Table = new javax.swing.JTable();
        Member_Image = new javax.swing.JLabel();
        JLabel1 = new javax.swing.JLabel();
        JLabel2 = new javax.swing.JLabel();
        JLabel3 = new javax.swing.JLabel();
        JLabel4 = new javax.swing.JLabel();
        Member_Search = new javax.swing.JLabel();
        Member_Fullname = new javax.swing.JLabel();
        Member_Phone = new javax.swing.JLabel();
        Member_Email = new javax.swing.JLabel();
        Member_Gender = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        genrePanel.setBackground(new java.awt.Color(218, 186, 151));
        genrePanel.setBorder(BorderFactory.createMatteBorder(3,3,3,3, new Color(164,106,106)));

        MemberList.setBackground(new java.awt.Color(164, 106, 106));
        MemberList.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        MemberList.setForeground(new java.awt.Color(243, 236, 236));
        MemberList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MemberList.setText("Members List");
        MemberList.setOpaque(true);

        Exit.setBackground(new java.awt.Color(164, 106, 106));
        Exit.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(243, 236, 236));
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setText("X");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.setOpaque(true);
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(6, 4, 6));
        jLabel4.setText("Search by ID/First Name/Last Name: ");

        SearchBar.setBackground(new java.awt.Color(243, 236, 236));
        SearchBar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        SearchBar.setForeground(new java.awt.Color(6, 4, 6));
        SearchBar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SearchBarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SearchBarFocusLost(evt);
            }
        });
        SearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBarActionPerformed(evt);
            }
        });

        Member_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Member_TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Member_Table);

        Member_Image.setBackground(new java.awt.Color(218, 186, 151));
        Member_Image.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Member_Image.setForeground(new java.awt.Color(6, 4, 6));
        Member_Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Member_Image.setText("Member Image");
        Member_Image.setBorder(BorderFactory.createMatteBorder(1,1,1,1, new Color(6,4,6)));
        Member_Image.setOpaque(true);

        JLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        JLabel1.setForeground(new java.awt.Color(47, 72, 88));
        JLabel1.setText("Name: ");

        JLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        JLabel2.setForeground(new java.awt.Color(47, 72, 88));
        JLabel2.setText("Phone: ");

        JLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        JLabel3.setForeground(new java.awt.Color(47, 72, 88));
        JLabel3.setText("Email: ");

        JLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        JLabel4.setForeground(new java.awt.Color(47, 72, 88));
        JLabel4.setText("Gender: ");
        JLabel4.setToolTipText("");

        Member_Search.setBackground(new java.awt.Color(0, 117, 98));
        Member_Search.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Member_Search.setForeground(new java.awt.Color(243, 236, 236));
        Member_Search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Member_Search.setText("Search Member");
        Member_Search.setOpaque(true);
        Member_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Member_SearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Member_SearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Member_SearchMouseExited(evt);
            }
        });

        Member_Fullname.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        Member_Fullname.setForeground(new java.awt.Color(6, 4, 6));
        Member_Fullname.setText("   ");

        Member_Phone.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        Member_Phone.setForeground(new java.awt.Color(6, 4, 6));
        Member_Phone.setText("   ");

        Member_Email.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        Member_Email.setForeground(new java.awt.Color(6, 4, 6));
        Member_Email.setText("   ");

        Member_Gender.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        Member_Gender.setForeground(new java.awt.Color(6, 4, 6));
        Member_Gender.setText("   ");
        Member_Gender.setToolTipText("");

        javax.swing.GroupLayout genrePanelLayout = new javax.swing.GroupLayout(genrePanel);
        genrePanel.setLayout(genrePanelLayout);
        genrePanelLayout.setHorizontalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Member_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabel2)
                    .addComponent(JLabel1)
                    .addComponent(Member_Fullname)
                    .addComponent(Member_Phone)
                    .addComponent(JLabel3)
                    .addComponent(Member_Email)
                    .addComponent(JLabel4)
                    .addComponent(Member_Gender)
                    .addComponent(Member_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(193, Short.MAX_VALUE))
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addComponent(MemberList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        genrePanelLayout.setVerticalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MemberList, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel4)
                            .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Member_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(Member_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JLabel1)
                        .addGap(2, 2, 2)
                        .addComponent(Member_Fullname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLabel2)
                        .addGap(2, 2, 2)
                        .addComponent(Member_Phone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLabel3)
                        .addGap(2, 2, 2)
                        .addComponent(Member_Email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLabel4)
                        .addGap(2, 2, 2)
                        .addComponent(Member_Gender)))
                .addContainerGap(25, Short.MAX_VALUE))
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

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_ExitMouseClicked

     //create a function to populate the jtable with members
    public void populateJtableWithMembers(String query)
    {
        ArrayList <MyClasses.Member>  membersList = member.membersList(query);
        
        // jtable columns
        String[] colNames = {"ID", "F-Name", "L-Name", "Phone", "Email", "Gender"};
        
        // Row
        Object [][] rows = new Object [membersList.size()][colNames.length];
        
        for (int i = 0; i < membersList.size(); i++)
        {
          rows[i][0] = membersList.get(i).getId();
          rows[i][1] = membersList.get(i).getFirstName();
          rows[i][2] = membersList.get(i).getLastName();
          rows[i][3] = membersList.get(i).getPhoneNumber();
          rows[i][4] = membersList.get(i).getEmail();
          rows[i][5] = membersList.get(i).getGender();
        }
        
        DefaultTableModel model = new DefaultTableModel (rows,colNames);
        Member_Table.setModel(model);
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < Member_Table.getColumnCount(); i++) {
            Member_Table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        
    }
    
    private void SearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchBarActionPerformed

    private void Member_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Member_TableMouseClicked
        // Display the selected member data 
        Member SelectedMember;
        try {
            Integer rowIndex = Member_Table.getSelectedRow(); // Get the selected jTable row index 
            // get the member id from the Jtable (the id is the fist column [0] )
            Integer id = Integer.parseInt(Member_Table.getModel().getValueAt(rowIndex, 0).toString());  

            SelectedMember = member.getMemberById(id);
            
            if (SelectedMember != null)
            {
                Member_Fullname.setText(SelectedMember.getFirstName() + " " + SelectedMember.getLastName());
                Member_Phone.setText(SelectedMember.getPhoneNumber());
                Member_Email.setText(SelectedMember.getEmail() + " ");
                Member_Gender.setText(SelectedMember.getGender());
                
                byte[] image = SelectedMember.getPicture();
                func.displayImage(200, 200,  image, "", Member_Image);
                Member_Image.setText("");
                
            } else {
                JOptionPane.showMessageDialog(null , "Member not found with the given ID", "Invalid ID", 3);
            }
            
        } catch (SQLException | NumberFormatException ex) {
            //Logger.getLogger(EditMemberForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null , "Enter a valid member ID", "Invalid ID", 3);
        }
    }//GEN-LAST:event_Member_TableMouseClicked

    private void SearchBarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchBarFocusGained
        SearchBar.setBorder(new LineBorder(new Color(86,76,62), 2));
    }//GEN-LAST:event_SearchBarFocusGained

    private void SearchBarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchBarFocusLost
        SearchBar.setBorder(new LineBorder(new Color(218,186,151), 2));
    }//GEN-LAST:event_SearchBarFocusLost

    private void Member_SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Member_SearchMouseClicked
        // search and display data in the jtable
        String value = SearchBar.getText();
        // Search by first and last name
        String query = "SELECT * FROM `members` WHERE `firstName` LIKE'%"+value+"%' or `lastName` LIKE '%"+value+"%'";
        populateJtableWithMembers(query);
    }//GEN-LAST:event_Member_SearchMouseClicked

    private void Member_SearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Member_SearchMouseEntered
        Member_Search.setBackground(new Color(0, 92, 77));
    }//GEN-LAST:event_Member_SearchMouseEntered

    private void Member_SearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Member_SearchMouseExited
        Member_Search.setBackground(new Color(0,117,98));
    }//GEN-LAST:event_Member_SearchMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel JLabel1;
    private javax.swing.JLabel JLabel2;
    private javax.swing.JLabel JLabel3;
    private javax.swing.JLabel JLabel4;
    private javax.swing.JLabel MemberList;
    private javax.swing.JLabel Member_Email;
    private javax.swing.JLabel Member_Fullname;
    private javax.swing.JLabel Member_Gender;
    private javax.swing.JLabel Member_Image;
    private javax.swing.JLabel Member_Phone;
    private javax.swing.JLabel Member_Search;
    private javax.swing.JTable Member_Table;
    private javax.swing.JTextField SearchBar;
    private javax.swing.JPanel genrePanel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
