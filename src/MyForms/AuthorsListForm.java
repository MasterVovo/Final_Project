package MyForms;

import MyClasses.Functions;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public final class AuthorsListForm extends javax.swing.JFrame {

    MyClasses.Functions func = new Functions();
    MyClasses.Author author = new MyClasses.Author();

    public static String formType = "";

    public AuthorsListForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        func.displayImage(50, 50, null, "/MyImages/notepad.png", genreLabel);

        //Custom the jtable
        func.customTable(jTable_Authors);
        func.customTableHeader(jTable_Authors);

        //Populate Jtable With Authors
        AuthorList();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genrePanel = new javax.swing.JPanel();
        genreLabel = new javax.swing.JLabel();
        genreExit = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Authors = new javax.swing.JTable();
        Select_Author = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        genrePanel.setBackground(new java.awt.Color(218, 186, 151));

        genreLabel.setBackground(new java.awt.Color(164, 106, 106));
        genreLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(243, 236, 236));
        genreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genreLabel.setText("  Authors List");
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

        jTable_Authors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable_Authors);

        Select_Author.setBackground(new java.awt.Color(0, 117, 98));
        Select_Author.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Select_Author.setForeground(new java.awt.Color(243, 236, 236));
        Select_Author.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Select_Author.setText("Select Author");
        Select_Author.setOpaque(true);
        Select_Author.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Select_AuthorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Select_AuthorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Select_AuthorMouseExited(evt);
            }
        });

        javax.swing.GroupLayout genrePanelLayout = new javax.swing.GroupLayout(genrePanel);
        genrePanel.setLayout(genrePanelLayout);
        genrePanelLayout.setHorizontalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Select_Author, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(genrePanelLayout.createSequentialGroup()
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Select_Author, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(genrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void Select_AuthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Select_AuthorMouseClicked
        int index = jTable_Authors.getSelectedRow();

        //get values
        int id = Integer.parseInt(jTable_Authors.getValueAt(index, 0).toString());
        String firstName = jTable_Authors.getValueAt(index, 1).toString();
        String lastName = jTable_Authors.getValueAt(index, 2).toString();

        String fullName = firstName + " " + lastName;

        if (formType.equals("edit")) // if this form is called from the edit book form
        {
            EditBookForm.displayAuthor(id, fullName);
        } else {
            AddBookForm.displayAuthor(id, fullName);
        }

        this.dispose();
    }//GEN-LAST:event_Select_AuthorMouseClicked

    private void Select_AuthorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Select_AuthorMouseEntered
        Select_Author.setBackground(new Color(0, 92, 77));
    }//GEN-LAST:event_Select_AuthorMouseEntered

    private void Select_AuthorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Select_AuthorMouseExited
        Select_Author.setBackground(new Color(0, 117, 98));
    }//GEN-LAST:event_Select_AuthorMouseExited

    public void AuthorList() {
        // populates the jtable with authors
        ArrayList<MyClasses.Author> authorsList = author.authorsList();

        // jtable columns
        String[] colNames = {"ID", "F-Name", "L-Name", "Expertise", "About"};

        // Row
        Object[][] rows = new Object[authorsList.size()][colNames.length];

        for (int i = 0; i < authorsList.size(); i++) {
            rows[i][0] = authorsList.get(i).getId();
            rows[i][1] = authorsList.get(i).getFirstName();
            rows[i][2] = authorsList.get(i).getLastName();
            rows[i][3] = authorsList.get(i).getField_Of_Expertise();
            rows[i][4] = authorsList.get(i).getAbout();
        }

        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Authors.setModel(model);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < jTable_Authors.getColumnCount(); i++) {
            jTable_Authors.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        jTable_Authors.getColumnModel().getColumn(0).setMinWidth(40);
        jTable_Authors.getColumnModel().getColumn(0).setMaxWidth(40);
        jTable_Authors.getColumnModel().getColumn(3).setMinWidth(0);
        jTable_Authors.getColumnModel().getColumn(3).setMaxWidth(0);
        jTable_Authors.getColumnModel().getColumn(4).setMinWidth(0);
        jTable_Authors.getColumnModel().getColumn(4).setMaxWidth(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Select_Author;
    private javax.swing.JLabel genreExit;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JPanel genrePanel;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable_Authors;
    // End of variables declaration//GEN-END:variables
}
