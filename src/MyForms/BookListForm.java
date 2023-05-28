
package MyForms;
import MyClasses.Member;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class BookListForm extends javax.swing.JFrame {

    
    MyClasses.Book book = new MyClasses.Book();
    MyClasses.Functions func = new MyClasses.Functions();
    MyClasses.Author author = new MyClasses.Author();
    MyClasses.Genre genre = new MyClasses.Genre();
    
    public BookListForm() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        //add boarder to the panel
        Border genreFormBorder = BorderFactory.createMatteBorder(2,2,2,2, new Color(250,130,49));
        genrePanel.setBorder(genreFormBorder);
        
        
        func.displayImage(45, 45, null, "/MyImages/Book_Add.png", genreLabel);
        
        //Custom the jtable
        func.customTable(jTable_Books);
        
        //Custom the jtable header ROW
        func.customTableHeader(jTable_Books);
        
        Border jLabelImageBorder = BorderFactory.createMatteBorder(2,2,2,2, new Color(47,54,64));
        jLabel_Image.setBorder(jLabelImageBorder);
        
        // add a default image to the jlabel 
        func.displayImage(100, 75, null, "/MyImages/blank-profile.png", jLabel_Image);
        
        // display members in the jtable  
        populateJtableWithBooks("");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genrePanel = new javax.swing.JPanel();
        genreLabel = new javax.swing.JLabel();
        genreExit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Search = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Books = new javax.swing.JTable();
        jButton_Search = new javax.swing.JButton();
        jLabel_Image = new javax.swing.JLabel();
        jLabel_ISBN = new javax.swing.JLabel();
        jLabel_Name = new javax.swing.JLabel();
        jLabel_Author = new javax.swing.JLabel();
        jLabel_Genre = new javax.swing.JLabel();
        jLabel_Publisher = new javax.swing.JLabel();
        jLabel_Price = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        genrePanel.setBackground(new java.awt.Color(218, 186, 151));

        genreLabel.setBackground(new java.awt.Color(253, 150, 68));
        genreLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(243, 236, 236));
        genreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genreLabel.setText("Books List");
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

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(6, 4, 6));
        jLabel4.setText("Value to Search:");

        jTextField_Search.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SearchActionPerformed(evt);
            }
        });

        jTable_Books.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable_Books.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        jTable_Books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_BooksMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Books);
        if (jTable_Books.getColumnModel().getColumnCount() > 0) {
            jTable_Books.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            jTable_Books.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            jTable_Books.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            jTable_Books.getColumnModel().getColumn(3).setHeaderValue("Title 4");
            jTable_Books.getColumnModel().getColumn(4).setHeaderValue("Title 5");
            jTable_Books.getColumnModel().getColumn(5).setHeaderValue("Title 6");
            jTable_Books.getColumnModel().getColumn(6).setHeaderValue("Title 7");
            jTable_Books.getColumnModel().getColumn(7).setHeaderValue("Title 8");
            jTable_Books.getColumnModel().getColumn(8).setHeaderValue("Title 9");
        }

        jButton_Search.setText("search");
        jButton_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchActionPerformed(evt);
            }
        });

        jLabel_Image.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Image.setOpaque(true);

        jLabel_ISBN.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_ISBN.setForeground(new java.awt.Color(102, 0, 0));
        jLabel_ISBN.setText("ISBN");

        jLabel_Name.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_Name.setForeground(new java.awt.Color(102, 0, 0));
        jLabel_Name.setText("Name");

        jLabel_Author.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_Author.setForeground(new java.awt.Color(102, 0, 0));
        jLabel_Author.setText("Author");

        jLabel_Genre.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_Genre.setForeground(new java.awt.Color(102, 0, 0));
        jLabel_Genre.setText("Genre");

        jLabel_Publisher.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_Publisher.setForeground(new java.awt.Color(102, 0, 0));
        jLabel_Publisher.setText("Publisher");

        jLabel_Price.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_Price.setForeground(new java.awt.Color(102, 0, 0));
        jLabel_Price.setText("Price");

        javax.swing.GroupLayout genrePanelLayout = new javax.swing.GroupLayout(genrePanel);
        genrePanel.setLayout(genrePanelLayout);
        genrePanelLayout.setHorizontalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_Author, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_Genre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_Publisher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_Price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_ISBN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(genreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        genrePanelLayout.setVerticalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jButton_Search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_ISBN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Author)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Genre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Publisher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Price)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void genreExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genreExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_genreExitMouseClicked

     //create a function to populate the jtable with books
    public void populateJtableWithBooks(String query)
    {
        ArrayList <MyClasses.Book>  booksList = book.booksList();
        
        // jtable columns
        // we will not display the book description and cover
        String[] colNames = {"ID","ISBN","Title","Author","Genre","Quantity","Publisher","Price","Date-RCV"};
        
        // Row
        Object [][] rows = new Object [booksList.size()][colNames.length];
        
        for (int i = 0; i < booksList.size(); i++)
        {
          rows[i][0] = booksList.get(i).getId();
          rows[i][1] = booksList.get(i).getIsbn();
          rows[i][2] = booksList.get(i).getName();
          rows[i][3] = booksList.get(i).getAuthor_id();
          rows[i][4] = booksList.get(i).getGenre_id();
          rows[i][5] = booksList.get(i).getQuantity();
          rows[i][6] = booksList.get(i).getPublisher();
          rows[i][7] = booksList.get(i).getPrice();
          rows[i][8] = booksList.get(i).getDate_received();
        }
        
        DefaultTableModel model = new DefaultTableModel (rows,colNames);
        jTable_Books.setModel(model);
        
    }
    
    private void jTextField_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SearchActionPerformed

    private void jButton_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchActionPerformed
        // search and display data in the jtable
        String value = jTextField_Search.getText();
        // Search by name, description
        String query = "";
        populateJtableWithBooks(query);
    }//GEN-LAST:event_jButton_SearchActionPerformed

    private void jTable_BooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_BooksMouseClicked
        // Display the selected book data 
        
         MyClasses.Book SelectedBook;
        try {
            Integer rowIndex = jTable_Books.getSelectedRow(); // Get the selected jTable row index 
            // get the book id from the Jtable (the id is the fist column [0] )
            Integer id = Integer.parseInt(jTable_Books.getModel().getValueAt(rowIndex, 0).toString());  

            SelectedBook = book.getBookById(id);
            
            if (SelectedBook != null)
            {
                jLabel_ISBN.setText(SelectedBook.getIsbn());
                jLabel_Name.setText(SelectedBook.getName());
                // we need to display the author name
                jLabel_Author.setText(author.getAuthorById(SelectedBook.getAuthor_id()).getFirstName() + " " + author.getAuthorById(SelectedBook.getAuthor_id()).getLastName());
                // we need to display the genre name
                jLabel_Genre.setText(genre.getGenreById(SelectedBook.getGenre_id()).getName());
                jLabel_Publisher.setText(SelectedBook.getPublisher());
                jLabel_Price.setText(String.valueOf(SelectedBook.getPrice()));
                
                
                
                byte[] image = SelectedBook.getCover();
                func.displayImage(100, 100,  image, "", jLabel_Image);
                
            } else {
                JOptionPane.showMessageDialog(null , "Member not found with the given ID", "Invalid ID", 3);
            }
            
        } catch (SQLException ex) {
            //Logger.getLogger(EditMemberForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null , "Enter a valid member ID", "Invalid ID", 3);
        }
    
    }//GEN-LAST:event_jTable_BooksMouseClicked

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
            java.util.logging.Logger.getLogger(BookListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookListForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel genreExit;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JPanel genrePanel;
    private javax.swing.JButton jButton_Search;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Author;
    private javax.swing.JLabel jLabel_Genre;
    private javax.swing.JLabel jLabel_ISBN;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Price;
    private javax.swing.JLabel jLabel_Publisher;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Books;
    private javax.swing.JTextField jTextField_Search;
    // End of variables declaration//GEN-END:variables
}
