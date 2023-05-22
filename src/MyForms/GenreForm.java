package MyForms;

import MyClasses.Functions;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class GenreForm extends javax.swing.JFrame {

    MyClasses.Functions func = new Functions();
    
    /**
     * Creates new form GenreForm
     */
    
    MyClasses.Genre genre = new MyClasses.Genre();
    
    public GenreForm() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        Border genreFormBorder = BorderFactory.createMatteBorder(2,2,2,2, new Color(164,106,106));
        genrePanel.setBorder(genreFormBorder);
        
        func.displayImage(60, 60, "/MyImages/book_genres.png", genreLabel);
        
        
        //Custom the jtable
        func.customTable(jTable_Genres);
        
        //Custom the jtable header ROW
        func.customTableHeader(jTable_Genres);
        
        //Populate Jtable With Genres
        populateJtableWithGenres();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jTable_Genres = new javax.swing.JTable();
        jLabel_EmptyGenre = new javax.swing.JLabel();
        addGenre = new javax.swing.JLabel();
        EditGenre = new javax.swing.JLabel();
        deleteGenre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        genrePanel.setBackground(new java.awt.Color(218, 186, 151));

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

        Genre.setBackground(new java.awt.Color(243, 236, 236));
        Genre.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Genre.setForeground(new java.awt.Color(6, 4, 6));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTable_Genres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Genres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_GenresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Genres);

        jLabel_EmptyGenre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_EmptyGenre.setForeground(new java.awt.Color(250, 0, 0));
        jLabel_EmptyGenre.setText("    ");

        addGenre.setBackground(new java.awt.Color(0, 117, 98));
        addGenre.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        addGenre.setForeground(new java.awt.Color(243, 236, 236));
        addGenre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addGenre.setText("Add");
        addGenre.setOpaque(true);
        addGenre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addGenreMouseClicked(evt);
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
        });

        deleteGenre.setBackground(new java.awt.Color(0, 117, 98));
        deleteGenre.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        deleteGenre.setForeground(new java.awt.Color(243, 236, 236));
        deleteGenre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteGenre.setText("Delete");
        deleteGenre.setOpaque(true);
        deleteGenre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteGenreMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout genrePanelLayout = new javax.swing.GroupLayout(genrePanel);
        genrePanel.setLayout(genrePanelLayout);
        genrePanelLayout.setHorizontalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(addGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EditGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addComponent(genreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_EmptyGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ID, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addComponent(Genre)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        genrePanelLayout.setVerticalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genreLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Genre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_EmptyGenre)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(genrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(genrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genreExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genreExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_genreExitMouseClicked

    
    private void jTable_GenresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_GenresMouseClicked
        // Display the selected genre
        // get the selected row index
        int index = jTable_Genres.getSelectedRow();
        
        //get values
        String id = jTable_Genres.getValueAt(index, 0).toString();
        String name = jTable_Genres.getValueAt(index,1).toString();
        
        // show data in textfields
        ID.setText(id);
        Genre.setText(name);
    }//GEN-LAST:event_jTable_GenresMouseClicked

    //create a function to populate the jtable with genres
    public void populateJtableWithGenres(){
        ArrayList <MyClasses.Genre>  genresList = genre.genreList();
        
        // jtable columns
        String[] colNames = {"ID","Genre"};
        //String[] colNames = {"Genre"};
        
        // Row
        Object [][] rows = new Object [genresList.size()][colNames.length];
        
        for (int i = 0; i < genresList.size(); i++)
        {
          rows[i][0] = genresList.get(i).getId();
          rows[i][1] = genresList.get(i).getName();
        }
        
        DefaultTableModel model = new DefaultTableModel (rows,colNames);
        jTable_Genres.setModel(model);
    }
    /* Some debugging happening, don't touch HAHAHA
    public void populateJtableWithGenres() {
        ArrayList<MyClasses.Genre> genresList = genre.genreList();

        // JTable column name
        String[] colNames = {"Genre"};

        // Rows
        Object[][] rows = new Object[genresList.size()][colNames.length];

        for (int i = 0; i < genresList.size(); i++) {
            rows[i][0] = genresList.get(i).getName();
        }

        DefaultTableModel model = new DefaultTableModel(rows, colNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        jTable_Genres.setModel(model);

        // Get ID value when a row is selected
        jTable_Genres.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selectedRow = jTable_Genres.getSelectedRow();
                if (selectedRow != -1) {
                    String id = genresList.get(selectedRow).getId();
                    System.out.println(id);
                }
            }
        });
    }*/

    
    
    private void addGenreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addGenreMouseClicked
        // add a new genre
        String name = Genre.getText();

        // Check if the textField is empty
        if(name.isEmpty())
        {
            jLabel_EmptyGenre.setText("*Enter genre");
        }
        else //if the textField is not empty
        {
            genre.addGenre(name);

            // refresh the Jtable Genres
            populateJtableWithGenres();
        }
    }//GEN-LAST:event_addGenreMouseClicked

    private void EditGenreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditGenreMouseClicked
        //edit the selected genre 
        String name = Genre.getText();
        
        // Check if the textField is empty
        if(name.isEmpty())
        {
           jLabel_EmptyGenre.setVisible(true);
        }
        else //if the textField is not empty
        {
            try
            {
                int id = Integer.parseInt(ID.getText());
                genre.EditGenre(id, name);
                
                // refresh the Jtable Genres
                populateJtableWithGenres();
            }
            catch(NumberFormatException ex)
            {    
            JOptionPane.showMessageDialog(null , "Invalid Genre, check your input and try again", "Error!", 0);
            }
        
        }
    }//GEN-LAST:event_EditGenreMouseClicked

    private void deleteGenreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteGenreMouseClicked
        // Delete the selected genre
        try
        {
            int id = Integer.parseInt(ID.getText());
            genre.removeGenre(id);

            // refresh the Jtable Genres
            populateJtableWithGenres();

            // clear text form the textfields
            ID.setText("");
            Genre.setText("");
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null , "Invalid Genre, check your input and try again", "Error!", 0);
        }
    }//GEN-LAST:event_deleteGenreMouseClicked

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
            java.util.logging.Logger.getLogger(GenreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenreForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EditGenre;
    private javax.swing.JTextField Genre;
    private javax.swing.JTextField ID;
    private javax.swing.JLabel addGenre;
    private javax.swing.JLabel deleteGenre;
    private javax.swing.JLabel genreExit;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JPanel genrePanel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_EmptyGenre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Genres;
    // End of variables declaration//GEN-END:variables
}
