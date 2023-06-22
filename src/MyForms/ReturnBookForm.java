package MyForms;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public final class ReturnBookForm extends javax.swing.JFrame {

    AuthorsListForm authors = new AuthorsListForm();
    MyClasses.Member member = new MyClasses.Member();
    MyClasses.Functions func = new MyClasses.Functions();
    MyClasses.Genre genre = new MyClasses.Genre();
    MyClasses.Book book = new MyClasses.Book();
    HashMap<String, Integer> genresMap = genre.getGenresMap();
    MyClasses.Issue_Book issue = new MyClasses.Issue_Book();

    // These varialbes will help us check if the book and member exist 
    boolean book_Exist = false;
    boolean member_Exist = false;

    String imagePath = "";

    public ReturnBookForm() {
        initComponents();

        this.setLocationRelativeTo(null);

        func.displayImage(45, 45, null, "/MyImages/organizer.png", genreLabel);

        //Custom the jtable
        func.customTable(jTable_Books);

        //Custom the jtable header ROW
        func.customTableHeader(jTable_Books);

        // add a border in the bottom of the book name and member name jlabel
        setBorderToJlabel(jLabel_BookName, new Color(218, 186, 151));
        setBorderToJlabel(jLabel_MemberName, new Color(218, 186, 151));

        //Populate table with issued books
        populateJtableIssuedBooks("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jTextField_ID2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField_ID6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField_ID5 = new javax.swing.JTextField();
        jButton_Add = new javax.swing.JButton();
        genrePanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton_Returned = new javax.swing.JButton();
        jButton_Lost = new javax.swing.JButton();
        jDateChooser_IssueDate = new com.toedter.calendar.JDateChooser();
        jLabel_BookName = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_MemberName = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jDateChooser_Return_Date = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Note = new javax.swing.JTextArea();
        genreLabel = new javax.swing.JLabel();
        genreExit = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Books = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jComboBox_Status = new javax.swing.JComboBox<>();
        jButton_Delete = new javax.swing.JButton();
        jSpinner_BookID = new javax.swing.JTextField();
        jSpinner_MemberID = new javax.swing.JTextField();

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(6, 4, 6));
        jLabel7.setText("ISBN:");

        jTextField_ID2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(6, 4, 6));
        jLabel11.setText("Publisher:");

        jTextField_ID6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(6, 4, 6));
        jLabel10.setText("Quantity:");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(6, 4, 6));
        jLabel12.setText("Quantity:");

        jTextField_ID5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jButton_Add.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton_Add.setText("Add new member");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        genrePanel.setBackground(new java.awt.Color(218, 186, 151));
        genrePanel.setBorder(BorderFactory.createMatteBorder(3,3,3,3, new Color(164,106,106)));
        genrePanel.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(6, 4, 6));
        jLabel5.setText("Book ID:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(6, 4, 6));
        jLabel15.setText("Issue Date:");

        jButton_Returned.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_Returned.setText("Return");
        jButton_Returned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ReturnedActionPerformed(evt);
            }
        });

        jButton_Lost.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_Lost.setText("Lost");
        jButton_Lost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LostActionPerformed(evt);
            }
        });

        jDateChooser_IssueDate.setEnabled(false);
        jDateChooser_IssueDate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel_BookName.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel_BookName.setForeground(new java.awt.Color(6, 4, 6));
        jLabel_BookName.setText("Book Name");
        jLabel_BookName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_BookName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BookNameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_BookNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_BookNameMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(6, 4, 6));
        jLabel8.setText("Member ID:");

        jLabel_MemberName.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel_MemberName.setForeground(new java.awt.Color(6, 4, 6));
        jLabel_MemberName.setText("Member Name");
        jLabel_MemberName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MemberName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MemberNameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MemberNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MemberNameMouseExited(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(6, 4, 6));
        jLabel16.setText("Return Date:");

        jDateChooser_Return_Date.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(6, 4, 6));
        jLabel17.setText("Note:");

        jTextArea_Note.setColumns(20);
        jTextArea_Note.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Note);

        genreLabel.setBackground(new java.awt.Color(164, 106, 106));
        genreLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(243, 236, 236));
        genreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genreLabel.setText(" Return Book");
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

        jTable_Books.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_BooksMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Books);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(6, 4, 6));
        jLabel6.setText("Select Book Status:");

        jComboBox_Status.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox_Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Issued", "Returned", "Lost" }));
        jComboBox_Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_StatusActionPerformed(evt);
            }
        });

        jButton_Delete.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_Delete.setText("Delete");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        jSpinner_BookID.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        javax.swing.GroupLayout genrePanelLayout = new javax.swing.GroupLayout(genrePanel);
        genrePanel.setLayout(genrePanelLayout);
        genrePanelLayout.setHorizontalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genrePanelLayout.createSequentialGroup()
                .addComponent(genreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genrePanelLayout.createSequentialGroup()
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser_IssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser_Return_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner_BookID, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner_MemberID, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel_BookName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_MemberName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genrePanelLayout.createSequentialGroup()
                        .addComponent(jButton_Returned, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Lost, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        genrePanelLayout.setVerticalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner_BookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_BookName)
                        .addGap(15, 15, 15)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner_MemberID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(jLabel_MemberName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser_IssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateChooser_Return_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genrePanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Lost, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Returned, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(genrePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(genrePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ReturnedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ReturnedActionPerformed
        // return a book 
        // update the return date 
        // the note
        // and the status to returned 
        // NOTE: if you change a book status from LOST to RETURNED you need to update the quantity
        // or you can prevent the user from changing the status when it's set to lost
        int _book_id = Integer.parseInt(jSpinner_BookID.getText());
        int _member_id = Integer.parseInt(jSpinner_MemberID.getText());
        String _note = jTextArea_Note.getText();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            String _return_date = dateFormat.format(jDateChooser_Return_Date.getDate());
            Date rtnDate = dateFormat.parse(_return_date);

            String _issue_date = dateFormat.format(jDateChooser_IssueDate.getDate());
            Date issDate = dateFormat.parse(_issue_date);

            if (rtnDate.before(issDate)) // if the return date is higher than the issue date 
            {
                JOptionPane.showMessageDialog(null, "The Return Date Must Be After The Issue Date", "Wrong Return Date", 2);
            } else {
                issue.updateIssue(_book_id, _member_id, "returned", _issue_date, _return_date, _note);
                // reset fields

                jSpinner_BookID.setText("");
                jSpinner_MemberID.setText("");
                jLabel_BookName.setText("Book Name");
                jLabel_MemberName.setText("Member Full-Name");
                jDateChooser_IssueDate.setDate(new Date());
                jDateChooser_Return_Date.setDate(new Date());
                jTextArea_Note.setText("");
                
                populateJtableIssuedBooks("");
            }
        } catch (HeadlessException | NullPointerException | ParseException ex) {
            JOptionPane.showMessageDialog(null, "Select A Item From The Table", "Select Date!", 2);
        }

    }//GEN-LAST:event_jButton_ReturnedActionPerformed


    private void jLabel_BookNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BookNameMouseClicked
        // display the book info card
        if (jSpinner_BookID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Book ID", "No Book ID", 2);
        } else {
            int book_id = Integer.parseInt(jSpinner_BookID.getText());
            BookInfoCardForm bookCardF = new BookInfoCardForm(book_id);
            bookCardF.setVisible(true);
        }
    }//GEN-LAST:event_jLabel_BookNameMouseClicked

    private void jLabel_MemberNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MemberNameMouseClicked
        // display the member info card
        if (jSpinner_MemberID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Member ID", "No Member ID", 2);
        } else {
            int member_id = Integer.parseInt(jSpinner_MemberID.getText());
            MemberInfoCardForm memberCardF = new MemberInfoCardForm(member_id);
            memberCardF.setVisible(true);
        }
    }//GEN-LAST:event_jLabel_MemberNameMouseClicked

    private void jLabel_BookNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BookNameMouseEntered
        // add a border in the bottom of the book name jlabel
        setBorderToJlabel(jLabel_BookName, new Color(250, 130, 49));
    }//GEN-LAST:event_jLabel_BookNameMouseEntered

    private void jLabel_BookNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BookNameMouseExited
        // add a brown border in the bottom of the book name jlabel
        setBorderToJlabel(jLabel_BookName, new Color(218, 186, 151));
    }//GEN-LAST:event_jLabel_BookNameMouseExited

    private void jLabel_MemberNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MemberNameMouseEntered
        // add a border in the bottom of the member name jlabel
        setBorderToJlabel(jLabel_MemberName, new Color(250, 130, 49));
    }//GEN-LAST:event_jLabel_MemberNameMouseEntered

    private void jLabel_MemberNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MemberNameMouseExited
        // add a brown border in the bottom of the member name jlabel
        setBorderToJlabel(jLabel_MemberName, new Color(218, 186, 151));
    }//GEN-LAST:event_jLabel_MemberNameMouseExited

    private void genreExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genreExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_genreExitMouseClicked

    private void jTable_BooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_BooksMouseClicked
        // Display the selected row data
        // get the selected row index
        int index = jTable_Books.getSelectedRow();

        //get values
        int bookId = Integer.parseInt(jTable_Books.getValueAt(index, 0).toString());
        int memberId = Integer.parseInt(jTable_Books.getValueAt(index, 1).toString());

        MyClasses.Book selectedBook;
        MyClasses.Member selectedMember;

        try {
            // There's no member with id '1'
            // Fix it Later (Error Part)
            selectedBook = book.getBookById(bookId);
            // display the book title/ name and ID
            jSpinner_BookID.setText(Integer.toString(selectedBook.getId()));
            selectedMember = member.getMemberById(memberId);

            jLabel_BookName.setText(selectedBook.getName());
            // display the member full-name and ID
            jSpinner_MemberID.setText(Integer.toString(selectedMember.getId()));
            jLabel_MemberName.setText(selectedMember.getFirstName() + " " + selectedMember.getLastName());

            //String status = jTable_Books.getValueAt(index, 2).toString();
            String issueDate = jTable_Books.getValueAt(index, 3).toString();
            String returnDate = jTable_Books.getValueAt(index, 4).toString();
            String note = jTable_Books.getValueAt(index, 5).toString();

            // display the date
            Date issDate = new SimpleDateFormat("yyyy-MM-dd").parse(issueDate);
            jDateChooser_IssueDate.setDate(issDate);

            Date rtnDate = new SimpleDateFormat("yyyy-MM-dd").parse(returnDate);
            jDateChooser_Return_Date.setDate(rtnDate);

            jTextArea_Note.setText(note);

        } catch (SQLException | ParseException ex) {
            Logger.getLogger(ReturnBookForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jTable_BooksMouseClicked

    private void jButton_LostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LostActionPerformed
        // the book is lost
        // we need to the book status to lost
        // and update the book quantity
        // the new quantity = the quantity - 1
        // even if the book is lost we will not change the return date

        int _book_id = Integer.parseInt(jSpinner_BookID.getText());
        int _member_id = Integer.parseInt(jSpinner_MemberID.getText());
        String _note = jTextArea_Note.getText();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            String _return_date = dateFormat.format(jDateChooser_Return_Date.getDate());

            String _issue_date = dateFormat.format(jDateChooser_IssueDate.getDate());

            issue.updateIssue(_book_id, _member_id, "lost", _issue_date, _return_date, _note);

            // now we need to update the book quantity (quantity-1)
            int quantity = new MyClasses.Book().getBookById(_book_id).getQuantity(); // get the book quantity
            book.setQuantity_Minus_One(_book_id, quantity - 1); // update the book quantity

            // the quantity must become 20(21-1)
            // reset fields
            jSpinner_BookID.setText("");
            jSpinner_MemberID.setText("");
            jLabel_BookName.setText("Book Name");
            jLabel_MemberName.setText("Member Full-Name");
            jDateChooser_IssueDate.setDate(new Date());
            jDateChooser_Return_Date.setDate(new Date());
            jTextArea_Note.setText("");
            
            populateJtableIssuedBooks("");
        } catch (HeadlessException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Select A Item From The Table", "Select Date!", 2);
        } catch (SQLException ex) {
            Logger.getLogger(ReturnBookForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton_LostActionPerformed

    private void jComboBox_StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_StatusActionPerformed
        String status = jComboBox_Status.getSelectedItem().toString();
        if (status.equals("All")) {
            status = "";
        }

        populateJtableIssuedBooks(status);
    }//GEN-LAST:event_jComboBox_StatusActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        // delete the selected issue from the database

        // get the selected row index
        int index = jTable_Books.getSelectedRow();

        try {
            //get values
            int _book_id = Integer.parseInt(jTable_Books.getValueAt(index, 0).toString());
            int _member_id = Integer.parseInt(jTable_Books.getValueAt(index, 1).toString());
            String _issued_date = jTable_Books.getValueAt(index, 3).toString();

            issue.removeFromIssuedTable(_book_id, _member_id, _issued_date);

            // clear fields
            jSpinner_BookID.setText("");
            jSpinner_MemberID.setText("");
            jLabel_BookName.setText("Book Name");
            jLabel_MemberName.setText("Member Full-Name");
            jDateChooser_IssueDate.setDate(new Date());
            jDateChooser_Return_Date.setDate(new Date());
            jTextArea_Note.setText("");

            populateJtableIssuedBooks("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Select the Element You Want To Delete From The Table" + ex.getMessage(), "Delete Error", 2);
        }


    }//GEN-LAST:event_jButton_DeleteActionPerformed

    // create a little function to set border
    public void setBorderToJlabel(JLabel label, Color color) {
        Border genreFormBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, color);
        label.setBorder(genreFormBorder);
    }

    //create a function to populate the jtable with books
    public void populateJtableIssuedBooks(String status) {

        ArrayList<MyClasses.Issue_Book> issBookList = issue.issuedBookList(status);

        // jtable columns
        String[] colNames = {"Book", "Member", "Status", "Issue", "Return", "Note"};

        // Row
        Object[][] rows = new Object[issBookList.size()][colNames.length];

        for (int i = 0; i < issBookList.size(); i++) {
            rows[i][0] = issBookList.get(i).getBook_id();
            rows[i][1] = issBookList.get(i).getMember_id();
            rows[i][2] = issBookList.get(i).getStatus();
            rows[i][3] = issBookList.get(i).getIssue_date();
            rows[i][4] = issBookList.get(i).getReturn_date();
            rows[i][5] = issBookList.get(i).getNote();
        }

        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Books.setModel(model);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < jTable_Books.getColumnCount(); i++) {
            jTable_Books.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel genreExit;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JPanel genrePanel;
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Lost;
    private javax.swing.JButton jButton_Returned;
    private javax.swing.JComboBox<String> jComboBox_Status;
    private com.toedter.calendar.JDateChooser jDateChooser_IssueDate;
    private com.toedter.calendar.JDateChooser jDateChooser_Return_Date;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_BookName;
    private javax.swing.JLabel jLabel_MemberName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jSpinner_BookID;
    private javax.swing.JTextField jSpinner_MemberID;
    private javax.swing.JTable jTable_Books;
    private javax.swing.JTextArea jTextArea_Note;
    private javax.swing.JTextField jTextField_ID2;
    private javax.swing.JTextField jTextField_ID5;
    private javax.swing.JTextField jTextField_ID6;
    // End of variables declaration//GEN-END:variables
}
