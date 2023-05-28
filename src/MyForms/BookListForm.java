
package MyForms;
import MyClasses.Member;
import java.awt.Color;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
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
        func.displayImage(120, 120, null, "/MyImages/blank-profile.png", jLabel_Image);
        
        // display members in the jtable  
        populateJtableWithBooks("");
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Books = new javax.swing.JTable();
        jLabel_Image = new javax.swing.JLabel();
        jLabel_ISBN = new javax.swing.JLabel();
        jLabel_Name = new javax.swing.JLabel();
        jLabel_Author = new javax.swing.JLabel();
        jLabel_Genre = new javax.swing.JLabel();
        jLabel_Publisher = new javax.swing.JLabel();
        jLabel_Price = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Search = new javax.swing.JTextField();
        jButton_SearchByNameOrDescription = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton_SearchBetweenTwoDates = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

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

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(6, 4, 6));
        jLabel4.setText("Value to Search:");

        jTextField_Search.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SearchActionPerformed(evt);
            }
        });

        jButton_SearchByNameOrDescription.setText("search");
        jButton_SearchByNameOrDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchByNameOrDescriptionActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Search by book name or description ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_SearchByNameOrDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton_SearchByNameOrDescription))
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(6, 4, 6));
        jLabel7.setText("Date Received between: ");

        jButton_SearchBetweenTwoDates.setText("search");
        jButton_SearchBetweenTwoDates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchBetweenTwoDatesActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(51, 153, 255));
        jLabel8.setText("Search Between two Book");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(6, 4, 6));
        jLabel9.setText("and:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addGap(12, 12, 12)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jButton_SearchBetweenTwoDates, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_SearchBetweenTwoDates))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout genrePanelLayout = new javax.swing.GroupLayout(genrePanel);
        genrePanel.setLayout(genrePanelLayout);
        genrePanelLayout.setHorizontalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addComponent(genreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Author, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Genre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Publisher, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jLabel_Price, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jLabel_ISBN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(42, 42, 42))
        );
        genrePanelLayout.setVerticalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genrePanelLayout.createSequentialGroup()
                        .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
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
                        .addGap(20, 20, 20)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(genrePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(genrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genreExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genreExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_genreExitMouseClicked

     //create a function to populate the jtable with books
    public void populateJtableWithBooks(String query)
    {
        ArrayList <MyClasses.Book>  booksList = book.booksList(query);
        
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
    
    private void jButton_SearchByNameOrDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchByNameOrDescriptionActionPerformed
        // search and display data in the jtable
        String value = jTextField_Search.getText();
        // Search by name, publisher and  description
        String query = "SELECT * FROM `books` WHERE `name` LIKE '%"+value+"%' OR `publisher` LIKE '%"+value+"%' or `description` LIKE '%"+value+"%'";
        populateJtableWithBooks(query);
    }//GEN-LAST:event_jButton_SearchByNameOrDescriptionActionPerformed

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
                func.displayImage(120, 120,  image, "", jLabel_Image);
                
            } else {
                JOptionPane.showMessageDialog(null , "Member not found with the given ID", "Invalid ID", 3);
            }
            
        } catch (SQLException ex) {
            //Logger.getLogger(EditMemberForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null , "Enter a valid member ID", "Invalid ID", 3);
        }
    
    }//GEN-LAST:event_jTable_BooksMouseClicked

    private void jTextField_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SearchActionPerformed

    private void jTextField_Search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Search2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Search2ActionPerformed

    private void jButton_Search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Search2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Search2ActionPerformed

    private void jButton_SearchBetweenTwoDatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchBetweenTwoDatesActionPerformed
       // search and display data in the jtable
       try 
       {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = dateFormat.format  (jDateChooser1.getDate()); //get date 1
            String date2 = dateFormat.format  (jDateChooser2.getDate()); // get date 2
            // Search book between two date 
            String query = "SELECT * FROM `books` WHERE `date_received` BETWEEN '"+date1+"' AND '"+date2+"'";
            populateJtableWithBooks(query); 
       }
       catch(Exception ex)
       {
            JOptionPane.showMessageDialog(null , "Select The Two Date Before Clicking Search", "No Dates Selected", 2);
       } 
    }//GEN-LAST:event_jButton_SearchBetweenTwoDatesActionPerformed

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
    private javax.swing.JButton jButton_Search1;
    private javax.swing.JButton jButton_Search2;
    private javax.swing.JButton jButton_SearchBetweenTwoDates;
    private javax.swing.JButton jButton_SearchByNameOrDescription;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Author;
    private javax.swing.JLabel jLabel_Genre;
    private javax.swing.JLabel jLabel_ISBN;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Price;
    private javax.swing.JLabel jLabel_Publisher;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Books;
    private javax.swing.JTextField jTextField_Search;
    private javax.swing.JTextField jTextField_Search1;
    private javax.swing.JTextField jTextField_Search2;
    // End of variables declaration//GEN-END:variables
}
