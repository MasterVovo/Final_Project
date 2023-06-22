package MyForms;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.BorderFactory;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class DeleteBookForm extends javax.swing.JFrame {

    AuthorsListForm authors = new AuthorsListForm();
    MyClasses.Member member = new MyClasses.Member();
    MyClasses.Functions func = new MyClasses.Functions();
    MyClasses.Genre genre = new MyClasses.Genre();
    HashMap<String, Integer> genresMap = genre.getGenresMap();

    String imagePath = "";

    public DeleteBookForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        func.displayImage(45, 45, null, "/MyImages/Book_Add.png", genreLabel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genrePanel = new javax.swing.JPanel();
        genreLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        genreExit = new javax.swing.JLabel();
        Book_Id = new javax.swing.JTextField();
        Remove_Book = new javax.swing.JLabel();
        jLabel_EmptyID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        genrePanel.setBackground(new java.awt.Color(218, 186, 151));
        genrePanel.setBorder(BorderFactory.createMatteBorder(3,3,3,3, new Color(164,106,106)));
        genrePanel.setEnabled(false);

        genreLabel.setBackground(new java.awt.Color(164, 106, 106));
        genreLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(243, 236, 236));
        genreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genreLabel.setText("Remove Book");
        genreLabel.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(6, 4, 6));
        jLabel5.setText("Enter Book ID:");

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

        Book_Id.setBackground(new java.awt.Color(243, 236, 236));
        Book_Id.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Book_Id.setForeground(new java.awt.Color(6, 4, 6));
        Book_Id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Book_IdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Book_IdFocusLost(evt);
            }
        });
        Book_Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Book_IdKeyTyped(evt);
            }
        });

        Remove_Book.setBackground(new java.awt.Color(0, 117, 98));
        Remove_Book.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Remove_Book.setForeground(new java.awt.Color(243, 236, 236));
        Remove_Book.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Remove_Book.setText("Remove Book");
        Remove_Book.setOpaque(true);
        Remove_Book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Remove_BookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Remove_BookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Remove_BookMouseExited(evt);
            }
        });

        jLabel_EmptyID.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel_EmptyID.setForeground(new java.awt.Color(250, 0, 0));
        jLabel_EmptyID.setText("    ");

        javax.swing.GroupLayout genrePanelLayout = new javax.swing.GroupLayout(genrePanel);
        genrePanel.setLayout(genrePanelLayout);
        genrePanelLayout.setHorizontalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addComponent(genreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genrePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Remove_Book, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_EmptyID)
                    .addComponent(Book_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        genrePanelLayout.setVerticalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Book_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_EmptyID)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(Remove_Book, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
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

    private void Book_IdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Book_IdFocusGained
        Book_Id.setBorder(new LineBorder(new Color(86, 76, 62), 2));
    }//GEN-LAST:event_Book_IdFocusGained

    private void Book_IdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Book_IdFocusLost
        Book_Id.setBorder(new LineBorder(new Color(218, 186, 151), 2));
    }//GEN-LAST:event_Book_IdFocusLost

    private void Remove_BookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Remove_BookMouseClicked
        // delete book
        MyClasses.Book book = new MyClasses.Book();
        try {
            Integer id = Integer.parseInt(Book_Id.getText());

            //Confirmation message
            int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this Book?", "Delete Book", JOptionPane.YES_NO_OPTION);

            if (confirmation == JOptionPane.YES_OPTION) {
                book.removeBook(id);
                jLabel_EmptyID.setText(" ");
            }

        } catch (HeadlessException | NumberFormatException ex) {
            jLabel_EmptyID.setText("*Enter Book ID");
        }
    }//GEN-LAST:event_Remove_BookMouseClicked

    private void Remove_BookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Remove_BookMouseEntered
        Remove_Book.setBackground(new Color(0, 92, 77));
    }//GEN-LAST:event_Remove_BookMouseEntered

    private void Remove_BookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Remove_BookMouseExited
        Remove_Book.setBackground(new Color(0, 117, 98));
    }//GEN-LAST:event_Remove_BookMouseExited

    private void Book_IdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Book_IdKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_Book_IdKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Book_Id;
    private javax.swing.JLabel Remove_Book;
    private javax.swing.JLabel genreExit;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JPanel genrePanel;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_EmptyID;
    // End of variables declaration//GEN-END:variables
}
