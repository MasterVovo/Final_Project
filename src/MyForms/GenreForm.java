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

public final class GenreForm extends javax.swing.JFrame {

    MyClasses.Functions func = new Functions();
    MyClasses.Genre genre = new MyClasses.Genre();

    public GenreForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        func.displayImage(60, 60, null, "/MyImages/book_genres.png", genreLabel);

        //Custom the jtable
        func.customTable(GenresTable);
        func.customTableHeader(GenresTable);

        //Populate Jtable With Genres
        BookGenres();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genrePanel = new javax.swing.JPanel();
        genreLabel = new javax.swing.JLabel();
        genreExit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Genre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        GenresTable = new javax.swing.JTable();
        jLabel_EmptyGenre = new javax.swing.JLabel();
        AddGenre = new javax.swing.JLabel();
        EditGenre = new javax.swing.JLabel();
        DeleteGenre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        genrePanel.setBackground(new java.awt.Color(218, 186, 151));
        genrePanel.setBorder(BorderFactory.createMatteBorder(3,3,3,3, new Color(164,106,106)));

        genreLabel.setBackground(new java.awt.Color(164, 106, 106));
        genreLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(243, 236, 236));
        genreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genreLabel.setText("  Manage Genres");
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
        jLabel4.setText("Genre:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(6, 4, 6));
        jLabel5.setText("ID:");

        ID.setBackground(new java.awt.Color(243, 236, 236));
        ID.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ID.setForeground(new java.awt.Color(6, 4, 6));
        ID.setEnabled(false);

        Genre.setBackground(new java.awt.Color(243, 236, 236));
        Genre.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Genre.setForeground(new java.awt.Color(6, 4, 6));
        Genre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GenreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                GenreFocusLost(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setHorizontalScrollBar(null);

        GenresTable.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        GenresTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        GenresTable.setToolTipText("");
        GenresTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GenresTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(GenresTable);

        jLabel_EmptyGenre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_EmptyGenre.setForeground(new java.awt.Color(250, 0, 0));
        jLabel_EmptyGenre.setText(" ");

        AddGenre.setBackground(new java.awt.Color(0, 117, 98));
        AddGenre.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        AddGenre.setForeground(new java.awt.Color(243, 236, 236));
        AddGenre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddGenre.setText("Add");
        AddGenre.setOpaque(true);
        AddGenre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddGenreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddGenreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddGenreMouseExited(evt);
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
                .addComponent(genreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(AddGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EditGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_EmptyGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Genre, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        genrePanelLayout.setVerticalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genreLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(Genre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptyGenre)
                        .addGap(27, 27, 27)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EditGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addComponent(genrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genreExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genreExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_genreExitMouseClicked

    private void GenresTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenresTableMouseClicked
        // Display the selected genre
        // get the selected row index
        int index = GenresTable.getSelectedRow();

        //get values
        String id = GenresTable.getValueAt(index, 0).toString();
        String name = GenresTable.getValueAt(index, 1).toString();

        // show data in textfields
        ID.setText(id);
        Genre.setText(name);
    }//GEN-LAST:event_GenresTableMouseClicked

    //create a function to populate the jtable with genres
    public void BookGenres() {
        ArrayList<MyClasses.Genre> genresList = genre.genreList();
        // jtable columns
        String[] colNames = {"ID", "Genre"};

        // Row
        Object[][] rows = new Object[genresList.size()][colNames.length];

        for (int i = 0; i < genresList.size(); i++) {
            rows[i][0] = genresList.get(i).getId();
            rows[i][1] = genresList.get(i).getName();
        }
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        GenresTable.setModel(model);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < GenresTable.getColumnCount(); i++) {
            GenresTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        GenresTable.getColumnModel().getColumn(0).setMinWidth(0);
        GenresTable.getColumnModel().getColumn(0).setMaxWidth(0);
    }

    private void AddGenreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddGenreMouseClicked
        // add a new genre
        String name = Genre.getText();

        // Check if the textField is empty
        if (name.trim().isEmpty()) {
            jLabel_EmptyGenre.setText("*Enter genre");
        } else //if the textField is not empty
        {
            genre.addGenre(name);

            // hide jlabel
            jLabel_EmptyGenre.setText(" ");

            // refresh the Jtable Genres
            BookGenres();
        }
    }//GEN-LAST:event_AddGenreMouseClicked

    private void EditGenreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditGenreMouseClicked
        //edit the selected genre 
        String name = Genre.getText();

        // Check if the textField is empty
        if (name.trim().isEmpty()) {
            jLabel_EmptyGenre.setText("*Enter genre");
        } else //if the textField is not empty
        {
            try {
                int id = Integer.parseInt(ID.getText());
                genre.EditGenre(id, name);

                // hide jlabel
                jLabel_EmptyGenre.setText(" ");

                // refresh the Jtable Genres
                BookGenres();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Genre doesn't exist", "Error", 0);
            }

        }
    }//GEN-LAST:event_EditGenreMouseClicked

    private void DeleteGenreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteGenreMouseClicked
        String name = Genre.getText();

        // Check if the textField is empty
        if (name.trim().isEmpty()) {
            jLabel_EmptyGenre.setText("*Enter genre");
        } else //if the textField is not empty
        {
            // Delete the selected genre
            try {
                int id = Integer.parseInt(ID.getText());

                //Confirmation message
                int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this genre?", "Delete Genre", JOptionPane.YES_NO_OPTION);

                if (confirmation == JOptionPane.YES_OPTION) {
                    genre.removeGenre(id);
                }

                // refresh the Jtable Genres
                BookGenres();

                // clear text form the textfields
                ID.setText("");
                Genre.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Genre doesn't exist", "Error", 0);
            }
        }
    }//GEN-LAST:event_DeleteGenreMouseClicked

    private void AddGenreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddGenreMouseEntered
        AddGenre.setBackground(new Color(0, 92, 77));
    }//GEN-LAST:event_AddGenreMouseEntered

    private void AddGenreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddGenreMouseExited
        AddGenre.setBackground(new Color(0, 117, 98));
    }//GEN-LAST:event_AddGenreMouseExited

    private void EditGenreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditGenreMouseEntered
        EditGenre.setBackground(new Color(0, 92, 77));
    }//GEN-LAST:event_EditGenreMouseEntered

    private void EditGenreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditGenreMouseExited
        EditGenre.setBackground(new Color(0, 117, 98));
    }//GEN-LAST:event_EditGenreMouseExited

    private void DeleteGenreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteGenreMouseEntered
        DeleteGenre.setBackground(new Color(0, 92, 77));
    }//GEN-LAST:event_DeleteGenreMouseEntered

    private void DeleteGenreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteGenreMouseExited
        DeleteGenre.setBackground(new Color(0, 117, 98));
    }//GEN-LAST:event_DeleteGenreMouseExited

    private void GenreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GenreFocusGained
        Genre.setBorder(new LineBorder(new Color(86, 76, 62), 2));
    }//GEN-LAST:event_GenreFocusGained

    private void GenreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GenreFocusLost
        Genre.setBorder(new LineBorder(new Color(218, 186, 151), 2));
    }//GEN-LAST:event_GenreFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddGenre;
    private javax.swing.JLabel DeleteGenre;
    private javax.swing.JLabel EditGenre;
    private javax.swing.JTextField Genre;
    private javax.swing.JTable GenresTable;
    private javax.swing.JTextField ID;
    private javax.swing.JLabel genreExit;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JPanel genrePanel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_EmptyGenre;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
