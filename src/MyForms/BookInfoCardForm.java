package MyForms;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.util.logging.Level;
import java.util.logging.Logger;



public class BookInfoCardForm extends javax.swing.JFrame {

    
    MyClasses.Book book = new MyClasses.Book();
    MyClasses.Functions func = new MyClasses.Functions();
    MyClasses.Author author = new MyClasses.Author();
    MyClasses.Genre genre = new MyClasses.Genre();
    
    
    public BookInfoCardForm(int book_id) {
        initComponents();
        
        this.setLocationRelativeTo(null);
        //add boarder to the panel
        Border genreFormBorder = BorderFactory.createMatteBorder(2,2,2,2, new Color(250,130,49));
        genrePanel.setBorder(genreFormBorder);
        
        
        func.displayImage(45, 45, null, "/MyImages/Book_Add.png", genreLabel);
     
        
        Border jLabelImageBorder = BorderFactory.createMatteBorder(2,2,2,2, new Color(47,54,64));
        jLabel_Image.setBorder(jLabelImageBorder);
        
        // add a default image to the jlabel 
        func.displayImage(120, 120, null, "/MyImages/blank-profile.png", jLabel_Image);
        
        displayBookInfo(book_id);
        
    }
    
    // create a function to display the book info
    public void displayBookInfo(int _book_id) {
        try {
            
            MyClasses.Book SelectedBook = book.getBookById(_book_id);
            
            
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
                jLabel_Quantity.setText(String.valueOf(SelectedBook.getQuantity()));
                jLabel_DateReceived.setText(SelectedBook.getDate_received());
                jTextArea_Description.setText(SelectedBook.getDescription());
                
                
                
                byte[] image = SelectedBook.getCover();
                func.displayImage(140, 230,  image, "", jLabel_Image);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BookInfoCardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Search2 = new javax.swing.JTextField();
        jButton_Search2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        genrePanel = new javax.swing.JPanel();
        genreLabel = new javax.swing.JLabel();
        genreExit = new javax.swing.JLabel();
        jLabel_Image = new javax.swing.JLabel();
        jLabel_ISBN = new javax.swing.JLabel();
        jLabel_Name = new javax.swing.JLabel();
        jLabel_Author = new javax.swing.JLabel();
        jLabel_Genre = new javax.swing.JLabel();
        jLabel_Publisher = new javax.swing.JLabel();
        jLabel_Price = new javax.swing.JLabel();
        jLabel_Quantity = new javax.swing.JLabel();
        jLabel_DateReceived = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Description = new javax.swing.JTextArea();

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(6, 4, 6));
        jLabel6.setText("Value to Search:");

        jTextField_Search2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_Search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Search2ActionPerformed(evt);
            }
        });

        jButton_Search2.setText("search");
        jButton_Search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Search2ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Search by book name or description ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Search2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Search2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Search2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jButton_Search2))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        genrePanel.setBackground(new java.awt.Color(218, 186, 151));
        genrePanel.setPreferredSize(new java.awt.Dimension(420, 520));

        genreLabel.setBackground(new java.awt.Color(253, 150, 68));
        genreLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(243, 236, 236));
        genreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genreLabel.setText("Book Info Card");
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

        jLabel_Quantity.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_Quantity.setForeground(new java.awt.Color(102, 0, 0));
        jLabel_Quantity.setText("Quantity");

        jLabel_DateReceived.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_DateReceived.setForeground(new java.awt.Color(102, 0, 0));
        jLabel_DateReceived.setText("Date Received");

        jTextArea_Description.setColumns(20);
        jTextArea_Description.setRows(5);
        jTextArea_Description.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea_Description);

        javax.swing.GroupLayout genrePanelLayout = new javax.swing.GroupLayout(genrePanel);
        genrePanel.setLayout(genrePanelLayout);
        genrePanelLayout.setHorizontalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addComponent(genreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_DateReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel_Author, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel_Genre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel_Publisher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel_ISBN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        genrePanelLayout.setVerticalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(genrePanelLayout.createSequentialGroup()
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
                        .addComponent(jLabel_Price)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Quantity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_DateReceived))
                    .addComponent(jLabel_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(genrePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
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

    
    private void jTextField_Search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Search2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Search2ActionPerformed

    private void jButton_Search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Search2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Search2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel genreExit;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JPanel genrePanel;
    private javax.swing.JButton jButton_Search2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Author;
    private javax.swing.JLabel jLabel_DateReceived;
    private javax.swing.JLabel jLabel_Genre;
    private javax.swing.JLabel jLabel_ISBN;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Price;
    private javax.swing.JLabel jLabel_Publisher;
    private javax.swing.JLabel jLabel_Quantity;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_Description;
    private javax.swing.JTextField jTextField_Search2;
    // End of variables declaration//GEN-END:variables
}
