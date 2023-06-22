package MyForms;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public final class IssueBookForm extends javax.swing.JFrame {

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

    public IssueBookForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        func.displayImage(45, 45, null, "/MyImages/organizer.png", genreLabel);

        // add a border in the bottom of the book name and member name jlabel
        setBorderToJlabel(jLabel_BookName, new Color(218, 186, 151));
        setBorderToJlabel(jLabel_MemberName, new Color(218, 186, 151));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genrePanel = new javax.swing.JPanel();
        genreLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton_Issue = new javax.swing.JButton();
        genreExit = new javax.swing.JLabel();
        jDateChooser_IssueDate = new com.toedter.calendar.JDateChooser();
        SearchBook = new javax.swing.JLabel();
        jLabel_BookName = new javax.swing.JLabel();
        SearchMember = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_MemberName = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_Availability = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jDateChooser_Return_Date = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Note = new javax.swing.JTextArea();
        Book_ID = new javax.swing.JTextField();
        Member_ID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        genrePanel.setBackground(new java.awt.Color(218, 186, 151));
        genrePanel.setBorder(BorderFactory.createMatteBorder(3,3,3,3, new Color(164,106,106)));
        genrePanel.setEnabled(false);

        genreLabel.setBackground(new java.awt.Color(164, 106, 106));
        genreLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(243, 236, 236));
        genreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genreLabel.setText(" Issue Book");
        genreLabel.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(6, 4, 6));
        jLabel5.setText("Enter Book ID:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(6, 4, 6));
        jLabel15.setText("Issue Date:");

        jButton_Issue.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_Issue.setText("Issue");
        jButton_Issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IssueActionPerformed(evt);
            }
        });

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

        jDateChooser_IssueDate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        SearchBook.setBackground(new java.awt.Color(0, 117, 98));
        SearchBook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SearchBook.setForeground(new java.awt.Color(243, 236, 236));
        SearchBook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SearchBook.setText("Search Book");
        SearchBook.setOpaque(true);
        SearchBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchBookMouseClicked(evt);
            }
        });

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

        SearchMember.setBackground(new java.awt.Color(0, 117, 98));
        SearchMember.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SearchMember.setForeground(new java.awt.Color(243, 236, 236));
        SearchMember.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SearchMember.setText("Search Member");
        SearchMember.setOpaque(true);
        SearchMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMemberMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(6, 4, 6));
        jLabel8.setText("Enter Member ID:");

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

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(6, 4, 6));
        jLabel9.setText("Book Availability:");

        jLabel_Availability.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Availability.setForeground(new java.awt.Color(0, 102, 255));
        jLabel_Availability.setText("Yes/No");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(6, 4, 6));
        jLabel16.setText("Return Date:");

        jDateChooser_Return_Date.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(6, 4, 6));
        jLabel17.setText("Note:");

        jTextArea_Note.setColumns(20);
        jTextArea_Note.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea_Note.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Note);

        Book_ID.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        Member_ID.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        javax.swing.GroupLayout genrePanelLayout = new javax.swing.GroupLayout(genrePanel);
        genrePanel.setLayout(genrePanelLayout);
        genrePanelLayout.setHorizontalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel_BookName))
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel_MemberName))
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel16)
                .addGap(12, 12, 12)
                .addComponent(jDateChooser_Return_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel17)
                .addGap(10, 10, 10)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton_Issue, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel9)
                .addGap(6, 6, 6)
                .addComponent(jLabel_Availability))
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel15)
                .addGap(12, 12, 12)
                .addComponent(jDateChooser_IssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Book_ID))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Member_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchMember, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        genrePanelLayout.setVerticalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Book_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel_BookName)
                .addGap(12, 12, 12)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Member_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(SearchMember, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel_MemberName)
                .addGap(12, 12, 12)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Availability, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser_IssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser_Return_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 103, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(jButton_Issue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
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

    private void jButton_IssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IssueActionPerformed
        // issue a book 
        int _book_id = Integer.parseInt(Book_ID.getText());
        int _member_id = Integer.parseInt(Member_ID.getText());
        String _note = jTextArea_Note.getText();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            String _issue_date = dateFormat.format(jDateChooser_IssueDate.getDate());
            String _return_date = dateFormat.format(jDateChooser_Return_Date.getDate());

            // before issuing a book we need to check 
            // if the return date came the issue date 
            // We need to check if the book and member exist
            Date issDate = dateFormat.parse(_issue_date);
            Date rtnDate = dateFormat.parse(_return_date);

            if (!book_Exist) // if the member doen't exist
            {
                JOptionPane.showMessageDialog(null, "You Need To Check If The Book Exist First By Clicking The Search Book Button", "Check If The Book Exist", 2);
            } else if (!member_Exist) //if the book doen't exist
            {
                JOptionPane.showMessageDialog(null, "You Need To Check If The Member Exist First By Clicking The Search Member Button", "Check If The Member Exist", 2);
            } // We need to check if this book is available          
            else if (!issue.checkBookAvailability(_book_id)) {
                JOptionPane.showMessageDialog(null, "This Book Is Not Available Right Now", "Book Not Available", 2);
            } else if (rtnDate.before(issDate)) // if the return date is higher than the issue date 
            {
                JOptionPane.showMessageDialog(null, "The Return Date Must Be After The Issue Date", "Wrong Return Date", 2);
            } else {
                issue.addIssue(_book_id, _member_id, "issued", _issue_date, _return_date, _note);
                // reset fields

                Book_ID.setText("");
                Member_ID.setText("");
                jLabel_BookName.setText("Book Name");
                jLabel_MemberName.setText("Member Full-Name");
                jLabel_Availability.setText("YES/NO");
                jLabel_Availability.setForeground(new Color(0, 102, 255));
                jDateChooser_Return_Date.setDate(new Date());
                book_Exist = false;
                member_Exist = false;
            }
        } catch (HeadlessException | NullPointerException | ParseException ex) {
            JOptionPane.showMessageDialog(null, "Select Issue Date & Return Date", "Select Date!", 2);
        }

    }//GEN-LAST:event_jButton_IssueActionPerformed

    private void SearchBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBookMouseClicked
        // get the book id
        try {
            int book_id = Integer.parseInt(Book_ID.getText());
            MyClasses.Book selectedBook = book.getBookById(book_id);
            if (selectedBook != null) {
                jLabel_BookName.setText(selectedBook.getName());
                // Set the book exist to true 
                book_Exist = true;

                // Display availability 
                if (issue.checkBookAvailability(book_id)) {
                    jLabel_Availability.setText("YES");
                    jLabel_Availability.setForeground(Color.GREEN);
                } else {
                    jLabel_Availability.setText("NO");
                    jLabel_Availability.setForeground(Color.RED);
                }

            } else {
                JOptionPane.showMessageDialog(null, "This book doesn't exist", "No Book Found", 2);
                jLabel_BookName.setText("Book Name");
                book_Exist = false;
                jLabel_Availability.setText("YES/NO");
                jLabel_Availability.setForeground(new Color(0, 102, 255));
            }
        } catch (HeadlessException | NumberFormatException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Enter Book ID", "No Book ID", 2);
        }
    }//GEN-LAST:event_SearchBookMouseClicked

    private void SearchMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMemberMouseClicked
        // search member by ID and display his full name 
        try {
            // get the member id
            int member_id = Integer.parseInt(Member_ID.getText());

            // get the member by ID
            MyClasses.Member selectedMember = member.getMemberById(member_id);
            if (selectedMember != null) { // if this member is exist
                // display the member full-name 

                jLabel_MemberName.setText(selectedMember.getFirstName() + " " + selectedMember.getLastName());
                // Set the member exist to true 
                member_Exist = true;
            } else // if this member doen't exist
            {
                JOptionPane.showMessageDialog(null, "This Member doesn't exist", "No Member Found", 2);
                jLabel_MemberName.setText("Member Name");
                member_Exist = false;

            }
        } catch (HeadlessException | NumberFormatException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Enter Member ID", "No Member ID", 2);
        }
    }//GEN-LAST:event_SearchMemberMouseClicked

    private void jLabel_BookNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BookNameMouseClicked
        // display the book info card
        if (Book_ID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Book ID", "No Book ID", 2);
        } else {
            int book_id = Integer.parseInt(Book_ID.getText());
            BookInfoCardForm bookCardF = new BookInfoCardForm(book_id);
            bookCardF.setVisible(true);
        }
    }//GEN-LAST:event_jLabel_BookNameMouseClicked

    private void jLabel_MemberNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MemberNameMouseClicked
        // display the member info card
        if (Member_ID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Member ID", "No Member ID", 2);
        } else {
            int member_id = Integer.parseInt(Member_ID.getText());
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

    // create a little function to set border
    public void setBorderToJlabel(JLabel label, Color color) {
        Border genreFormBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, color);
        label.setBorder(genreFormBorder);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Book_ID;
    private javax.swing.JTextField Member_ID;
    private javax.swing.JLabel SearchBook;
    private javax.swing.JLabel SearchMember;
    private javax.swing.JLabel genreExit;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JPanel genrePanel;
    private javax.swing.JButton jButton_Issue;
    private com.toedter.calendar.JDateChooser jDateChooser_IssueDate;
    private com.toedter.calendar.JDateChooser jDateChooser_Return_Date;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Availability;
    private javax.swing.JLabel jLabel_BookName;
    private javax.swing.JLabel jLabel_MemberName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_Note;
    // End of variables declaration//GEN-END:variables
}
