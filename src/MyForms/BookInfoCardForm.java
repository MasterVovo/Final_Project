package MyForms;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class BookInfoCardForm extends javax.swing.JFrame {

    MyClasses.Book book = new MyClasses.Book();
    MyClasses.Functions func = new MyClasses.Functions();
    MyClasses.Author author = new MyClasses.Author();
    MyClasses.Genre genre = new MyClasses.Genre();

    public BookInfoCardForm(int book_id) {
        initComponents();
        this.setLocationRelativeTo(null);
        func.displayImage(45, 45, null, "/MyImages/Book_Add.png", genreLabel);

        displayBookInfo(book_id);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Description = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        genrePanel.setBackground(new java.awt.Color(218, 186, 151));
        genrePanel.setBorder(BorderFactory.createMatteBorder(3,3,3,3, new Color(164,106,106)));
        genrePanel.setPreferredSize(new java.awt.Dimension(420, 520));

        genreLabel.setBackground(new java.awt.Color(164, 106, 106));
        genreLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(243, 236, 236));
        genreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genreLabel.setText("Book Info Card");
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
        jLabel_Image.setBorder(BorderFactory.createMatteBorder(1,1,1,1, new Color(6,4,6)));
        jLabel_Image.setOpaque(true);

        jLabel_ISBN.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_ISBN.setForeground(new java.awt.Color(6, 4, 6));
        jLabel_ISBN.setText("ISBN");

        jLabel_Name.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_Name.setForeground(new java.awt.Color(6, 4, 6));
        jLabel_Name.setText("Title");

        jLabel_Author.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_Author.setForeground(new java.awt.Color(6, 4, 6));
        jLabel_Author.setText("Author");

        jLabel_Genre.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_Genre.setForeground(new java.awt.Color(6, 4, 6));
        jLabel_Genre.setText("Genre");

        jLabel_Publisher.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_Publisher.setForeground(new java.awt.Color(6, 4, 6));
        jLabel_Publisher.setText("Publisher");

        jLabel_Price.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_Price.setForeground(new java.awt.Color(6, 4, 6));
        jLabel_Price.setText("Price");

        jTextArea_Description.setBackground(new java.awt.Color(218, 186, 151));
        jTextArea_Description.setColumns(20);
        jTextArea_Description.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextArea_Description.setForeground(new java.awt.Color(6, 4, 6));
        jTextArea_Description.setRows(5);
        jTextArea_Description.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea_Description);

        javax.swing.GroupLayout genrePanelLayout = new javax.swing.GroupLayout(genrePanel);
        genrePanel.setLayout(genrePanelLayout);
        genrePanelLayout.setHorizontalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addComponent(genreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(20, 20, 20))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_ISBN)
                            .addComponent(jLabel_Name)
                            .addComponent(jLabel_Author)
                            .addComponent(jLabel_Genre)
                            .addComponent(jLabel_Price)
                            .addComponent(jLabel_Publisher))
                        .addContainerGap(398, Short.MAX_VALUE))))
        );
        genrePanelLayout.setVerticalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jLabel_ISBN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Author)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Genre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Publisher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Price))
                    .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(genrePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(genrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void displayBookInfo(int _book_id) {
        try {
            // display the book info
            MyClasses.Book SelectedBook = book.getBookById(_book_id);

            if (SelectedBook != null) {
                jLabel_ISBN.setText("ISBN: " + SelectedBook.getIsbn());
                jLabel_Name.setText("Title: " + SelectedBook.getName());

                // we need to display the author name
                jLabel_Author.setText("Author: " + author.getAuthorById(SelectedBook.getAuthor_id()).getFirstName() + " " + author.getAuthorById(SelectedBook.getAuthor_id()).getLastName());

                // we need to display the genre name
                jLabel_Genre.setText("Genre: " + genre.getGenreById(SelectedBook.getGenre_id()).getName());

                jLabel_Publisher.setText("Publisher: " + SelectedBook.getPublisher());
                jLabel_Price.setText("Price: " + String.valueOf(SelectedBook.getPrice()));
                jTextArea_Description.setText(SelectedBook.getDescription());

                byte[] image = SelectedBook.getCover();
                func.displayImage(160, 200, image, "", jLabel_Image);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BookInfoCardForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void genreExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genreExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_genreExitMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel genreExit;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JPanel genrePanel;
    private javax.swing.JLabel jLabel_Author;
    private javax.swing.JLabel jLabel_Genre;
    private javax.swing.JLabel jLabel_ISBN;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Price;
    private javax.swing.JLabel jLabel_Publisher;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_Description;
    // End of variables declaration//GEN-END:variables
}
