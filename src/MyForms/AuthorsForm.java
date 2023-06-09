package MyForms;

import MyClasses.Functions;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class AuthorsForm extends javax.swing.JFrame {

    MyClasses.Functions func = new Functions();
    MyClasses.Author author = new MyClasses.Author();

    public AuthorsForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        func.displayImage(50, 50, null, "/MyImages/notepad.png", AuthorLabel);

        //Custom the jtable
        func.customTable(Author_Table);
        func.customTableHeader(Author_Table);

        //Populate Jtable With Authors
        AuthorList();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genrePanel = new javax.swing.JPanel();
        AuthorLabel = new javax.swing.JLabel();
        genreExit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Author_ID = new javax.swing.JTextField();
        jLabel_EmptyFirstName = new javax.swing.JLabel();
        Author_FirstName = new javax.swing.JTextField();
        Author_Expertise = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_EmptyLastName = new javax.swing.JLabel();
        Author_LastName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Author_About = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        Author_Table = new javax.swing.JTable();
        Author_Add = new javax.swing.JLabel();
        EditGenre = new javax.swing.JLabel();
        DeleteGenre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        genrePanel.setBackground(new java.awt.Color(218, 186, 151));
        genrePanel.setBorder(BorderFactory.createMatteBorder(3,3,3,3, new Color(164,106,106)));

        AuthorLabel.setBackground(new java.awt.Color(164, 106, 106));
        AuthorLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        AuthorLabel.setForeground(new java.awt.Color(243, 236, 236));
        AuthorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AuthorLabel.setText("  Manage Authors");
        AuthorLabel.setOpaque(true);

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

        Author_ID.setBackground(new java.awt.Color(243, 236, 236));
        Author_ID.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Author_ID.setForeground(new java.awt.Color(6, 4, 6));
        Author_ID.setEnabled(false);

        jLabel_EmptyFirstName.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel_EmptyFirstName.setForeground(new java.awt.Color(250, 0, 0));
        jLabel_EmptyFirstName.setText("   ");

        Author_FirstName.setBackground(new java.awt.Color(243, 236, 236));
        Author_FirstName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Author_FirstName.setForeground(new java.awt.Color(6, 4, 6));
        Author_FirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Author_FirstNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Author_FirstNameFocusLost(evt);
            }
        });

        Author_Expertise.setBackground(new java.awt.Color(243, 236, 236));
        Author_Expertise.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Author_Expertise.setForeground(new java.awt.Color(6, 4, 6));
        Author_Expertise.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Author_ExpertiseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Author_ExpertiseFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(6, 4, 6));
        jLabel6.setText("Expertise:");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(6, 4, 6));
        jLabel7.setText("About:");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(6, 4, 6));
        jLabel8.setText("Last Name:");

        jLabel_EmptyLastName.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel_EmptyLastName.setForeground(new java.awt.Color(250, 0, 0));
        jLabel_EmptyLastName.setText("   ");

        Author_LastName.setBackground(new java.awt.Color(243, 236, 236));
        Author_LastName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Author_LastName.setForeground(new java.awt.Color(6, 4, 6));
        Author_LastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Author_LastNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Author_LastNameFocusLost(evt);
            }
        });

        Author_About.setBackground(new java.awt.Color(243, 236, 236));
        Author_About.setColumns(20);
        Author_About.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Author_About.setForeground(new java.awt.Color(6, 4, 6));
        Author_About.setRows(5);
        Author_About.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Author_AboutFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Author_AboutFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(Author_About);

        Author_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Author_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Author_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Author_Table);

        Author_Add.setBackground(new java.awt.Color(0, 117, 98));
        Author_Add.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Author_Add.setForeground(new java.awt.Color(243, 236, 236));
        Author_Add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Author_Add.setText("Add");
        Author_Add.setOpaque(true);
        Author_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Author_AddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Author_AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Author_AddMouseExited(evt);
            }
        });

        EditGenre.setBackground(new java.awt.Color(0, 117, 98));
        EditGenre.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        EditGenre.setForeground(new java.awt.Color(243, 236, 236));
        EditGenre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EditGenre.setText("Edit");
        EditGenre.setOpaque(true);
        EditGenre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditGenreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EditGenreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EditGenreMouseExited(evt);
            }
        });

        DeleteGenre.setBackground(new java.awt.Color(0, 117, 98));
        DeleteGenre.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        DeleteGenre.setForeground(new java.awt.Color(243, 236, 236));
        DeleteGenre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeleteGenre.setText("Delete");
        DeleteGenre.setOpaque(true);
        DeleteGenre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteGenreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteGenreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteGenreMouseExited(evt);
            }
        });

        javax.swing.GroupLayout genrePanelLayout = new javax.swing.GroupLayout(genrePanel);
        genrePanel.setLayout(genrePanelLayout);
        genrePanelLayout.setHorizontalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genrePanelLayout.createSequentialGroup()
                        .addComponent(Author_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EditGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_EmptyLastName))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Author_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Author_FirstName)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_EmptyFirstName))
                    .addComponent(Author_LastName)
                    .addComponent(jLabel6)
                    .addComponent(Author_Expertise)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addComponent(AuthorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        genrePanelLayout.setVerticalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AuthorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Author_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel_EmptyFirstName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Author_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel_EmptyLastName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Author_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Author_Expertise, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Author_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(genrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void Author_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Author_TableMouseClicked
        // Display the selected author
        // get the selected row index
        int index = Author_Table.getSelectedRow();

        //get values
        String id = Author_Table.getValueAt(index, 0).toString();
        String firstName = Author_Table.getValueAt(index, 1).toString();
        String lastName = Author_Table.getValueAt(index, 2).toString();
        String expertise = Author_Table.getValueAt(index, 3).toString();
        String about = Author_Table.getValueAt(index, 4).toString();

        // show data in textfields
        Author_ID.setText(id);
        Author_FirstName.setText(firstName);
        Author_LastName.setText(lastName);
        Author_Expertise.setText(expertise);
        Author_About.setText(about);
    }//GEN-LAST:event_Author_TableMouseClicked

    private void Author_FirstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Author_FirstNameFocusGained
        Author_FirstName.setBorder(new LineBorder(new Color(86, 76, 62), 2));
    }//GEN-LAST:event_Author_FirstNameFocusGained

    private void Author_FirstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Author_FirstNameFocusLost
        Author_FirstName.setBorder(new LineBorder(new Color(218, 186, 151), 2));
    }//GEN-LAST:event_Author_FirstNameFocusLost

    private void Author_LastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Author_LastNameFocusGained
        Author_LastName.setBorder(new LineBorder(new Color(86, 76, 62), 2));
    }//GEN-LAST:event_Author_LastNameFocusGained

    private void Author_LastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Author_LastNameFocusLost
        Author_LastName.setBorder(new LineBorder(new Color(218, 186, 151), 2));
    }//GEN-LAST:event_Author_LastNameFocusLost

    private void Author_ExpertiseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Author_ExpertiseFocusGained
        Author_Expertise.setBorder(new LineBorder(new Color(86, 76, 62), 2));
    }//GEN-LAST:event_Author_ExpertiseFocusGained

    private void Author_ExpertiseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Author_ExpertiseFocusLost
        Author_Expertise.setBorder(new LineBorder(new Color(218, 186, 151), 2));
    }//GEN-LAST:event_Author_ExpertiseFocusLost

    private void Author_AboutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Author_AboutFocusGained
        Author_About.setBorder(new LineBorder(new Color(86, 76, 62), 2));
    }//GEN-LAST:event_Author_AboutFocusGained

    private void Author_AboutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Author_AboutFocusLost
        Author_About.setBorder(new LineBorder(new Color(218, 186, 151), 2));
    }//GEN-LAST:event_Author_AboutFocusLost

    private void Author_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Author_AddMouseClicked
        // add a new author
        String fname = Author_FirstName.getText();
        String lname = Author_LastName.getText();
        String expertise = Author_Expertise.getText();
        String about = Author_About.getText();

        // Check if the textField are empty
        if (fname.trim().equals("")) {
            jLabel_EmptyFirstName.setText("*Enter first name");
        } else if (lname.trim().equals("")) {
            jLabel_EmptyFirstName.setText("  ");
            jLabel_EmptyLastName.setText("*Enter last name");
        } else //if the textField is not empty
        {
            jLabel_EmptyLastName.setText("  ");
            author.addAuthor(fname, lname, expertise, about);

            // refresh the Jtable Authors
            AuthorList();
        }
    }//GEN-LAST:event_Author_AddMouseClicked

    private void Author_AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Author_AddMouseEntered
        Author_Add.setBackground(new Color(0, 92, 77));
    }//GEN-LAST:event_Author_AddMouseEntered

    private void Author_AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Author_AddMouseExited
        Author_Add.setBackground(new Color(0, 117, 98));
    }//GEN-LAST:event_Author_AddMouseExited

    private void EditGenreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditGenreMouseClicked
        //edit the selected author 
        String fname = Author_FirstName.getText();
        String lname = Author_LastName.getText();
        String expertise = Author_Expertise.getText();
        String about = Author_About.getText();

        // Check if the textField are empty
        if (fname.trim().equals("")) {
            jLabel_EmptyFirstName.setText("*Enter first name");
        } else if (lname.trim().equals("")) {
            jLabel_EmptyFirstName.setText("  ");
            jLabel_EmptyLastName.setText("*Enter last name");
        } else //if the textField is not empty
        {
            int id = Integer.parseInt(Author_ID.getText());
            author.EditAuthor(id, fname, lname, expertise, about);

            // refresh the Jtable Authors
            AuthorList();
        }
    }//GEN-LAST:event_EditGenreMouseClicked

    private void EditGenreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditGenreMouseEntered
        EditGenre.setBackground(new Color(0, 92, 77));
    }//GEN-LAST:event_EditGenreMouseEntered

    private void EditGenreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditGenreMouseExited
        EditGenre.setBackground(new Color(0, 117, 98));
    }//GEN-LAST:event_EditGenreMouseExited

    private void DeleteGenreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteGenreMouseClicked
        // Delete the selected author
        try {
            int id = Integer.parseInt(Author_ID.getText());

            //Confirmation message
            int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this author?", "Delete Author", JOptionPane.YES_NO_OPTION);

            if (confirmation == JOptionPane.YES_OPTION) {
                author.removeAuthor(id);
            }

            // refresh the Jtable Authors
            AuthorList();

            // clear text form the textfields
            Author_ID.setText("");
            Author_FirstName.setText("");
            Author_LastName.setText("");
            Author_Expertise.setText("");
            Author_About.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid Author ID - " + ex.getMessage(), "Error!", 0);
        }
    }//GEN-LAST:event_DeleteGenreMouseClicked

    private void DeleteGenreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteGenreMouseEntered
        DeleteGenre.setBackground(new Color(0, 92, 77));
    }//GEN-LAST:event_DeleteGenreMouseEntered

    private void DeleteGenreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteGenreMouseExited
        DeleteGenre.setBackground(new Color(0, 117, 98));
    }//GEN-LAST:event_DeleteGenreMouseExited
    
    private void AuthorList() {
        //populates the jtable with authors
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
        Author_Table.setModel(model);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < Author_Table.getColumnCount(); i++) {
            Author_Table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        Author_Table.getColumnModel().getColumn(0).setMinWidth(0);
        Author_Table.getColumnModel().getColumn(0).setMaxWidth(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorLabel;
    private javax.swing.JTextArea Author_About;
    private javax.swing.JLabel Author_Add;
    private javax.swing.JTextField Author_Expertise;
    private javax.swing.JTextField Author_FirstName;
    private javax.swing.JTextField Author_ID;
    private javax.swing.JTextField Author_LastName;
    private javax.swing.JTable Author_Table;
    private javax.swing.JLabel DeleteGenre;
    private javax.swing.JLabel EditGenre;
    private javax.swing.JLabel genreExit;
    private javax.swing.JPanel genrePanel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_EmptyFirstName;
    private javax.swing.JLabel jLabel_EmptyLastName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
