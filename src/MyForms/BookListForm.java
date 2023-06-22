package MyForms;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public final class BookListForm extends javax.swing.JFrame {

    MyClasses.Book book = new MyClasses.Book();
    MyClasses.Functions func = new MyClasses.Functions();
    MyClasses.Author author = new MyClasses.Author();
    MyClasses.Genre genre = new MyClasses.Genre();

    public BookListForm() {
        initComponents();

        this.setLocationRelativeTo(null);
        func.displayImage(45, 45, null, "/MyImages/Book_Add.png", genreLabel);

        //Custom the jtable
        func.customTable(jTable_Books);
        func.customTableHeader(jTable_Books);

        // display members in the jtable  
        BookList("");
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
        jLabel4 = new javax.swing.JLabel();
        jTextField_Search = new javax.swing.JTextField();
        Title_Search = new javax.swing.JLabel();
        Author_Search = new javax.swing.JLabel();
        Genre_Search = new javax.swing.JLabel();
        JLabel1 = new javax.swing.JLabel();
        JLabel2 = new javax.swing.JLabel();
        JLabel3 = new javax.swing.JLabel();
        JLabel4 = new javax.swing.JLabel();
        JLabel5 = new javax.swing.JLabel();
        JLabel6 = new javax.swing.JLabel();
        JLabel7 = new javax.swing.JLabel();
        Book_ID = new javax.swing.JLabel();
        JLabel8 = new javax.swing.JLabel();
        Book_Description = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(6, 4, 6));
        jLabel6.setText("Value to Search:");

        jTextField_Search2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jButton_Search2.setText("search");

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
        genrePanel.setBorder(BorderFactory.createMatteBorder(3,3,3,3, new Color(164,106,106)));

        genreLabel.setBackground(new java.awt.Color(164, 106, 106));
        genreLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(243, 236, 236));
        genreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genreLabel.setText("Books List");
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

        jTable_Books.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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

        jLabel_Image.setBackground(new java.awt.Color(218, 186, 151));
        jLabel_Image.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel_Image.setForeground(new java.awt.Color(6, 4, 6));
        jLabel_Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Image.setText("Book Cover");
        jLabel_Image.setBorder(BorderFactory.createMatteBorder(1,1,1,1, new Color(6,4,6)));
        jLabel_Image.setOpaque(true);

        jLabel_ISBN.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_ISBN.setForeground(new java.awt.Color(6, 4, 6));
        jLabel_ISBN.setText(" ");

        jLabel_Name.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_Name.setForeground(new java.awt.Color(6, 4, 6));
        jLabel_Name.setText("  ");

        jLabel_Author.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_Author.setForeground(new java.awt.Color(6, 4, 6));
        jLabel_Author.setText("  ");

        jLabel_Genre.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_Genre.setForeground(new java.awt.Color(6, 4, 6));
        jLabel_Genre.setText("  ");

        jLabel_Publisher.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_Publisher.setForeground(new java.awt.Color(6, 4, 6));
        jLabel_Publisher.setText("  ");

        jLabel_Price.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_Price.setForeground(new java.awt.Color(6, 4, 6));
        jLabel_Price.setText("   ");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(6, 4, 6));
        jLabel4.setText("Search:");

        jTextField_Search.setBackground(new java.awt.Color(243, 236, 236));
        jTextField_Search.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextField_Search.setForeground(new java.awt.Color(6, 4, 6));
        jTextField_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_SearchKeyTyped(evt);
            }
        });

        Title_Search.setBackground(new java.awt.Color(0, 117, 98));
        Title_Search.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Title_Search.setForeground(new java.awt.Color(243, 236, 236));
        Title_Search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title_Search.setText("Search by Title");
        Title_Search.setOpaque(true);
        Title_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Title_SearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Title_SearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Title_SearchMouseExited(evt);
            }
        });

        Author_Search.setBackground(new java.awt.Color(0, 117, 98));
        Author_Search.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Author_Search.setForeground(new java.awt.Color(243, 236, 236));
        Author_Search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Author_Search.setText("Search by Author ID");
        Author_Search.setOpaque(true);
        Author_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Author_SearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Author_SearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Author_SearchMouseExited(evt);
            }
        });

        Genre_Search.setBackground(new java.awt.Color(0, 117, 98));
        Genre_Search.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Genre_Search.setForeground(new java.awt.Color(243, 236, 236));
        Genre_Search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Genre_Search.setText("Search by Genre ID");
        Genre_Search.setOpaque(true);
        Genre_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Genre_SearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Genre_SearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Genre_SearchMouseExited(evt);
            }
        });

        JLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        JLabel1.setForeground(new java.awt.Color(47, 72, 88));
        JLabel1.setText("Book ID:");

        JLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        JLabel2.setForeground(new java.awt.Color(47, 72, 88));
        JLabel2.setText("ISBN:");

        JLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        JLabel3.setForeground(new java.awt.Color(47, 72, 88));
        JLabel3.setText("Title:");

        JLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        JLabel4.setForeground(new java.awt.Color(47, 72, 88));
        JLabel4.setText("Author:");

        JLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        JLabel5.setForeground(new java.awt.Color(47, 72, 88));
        JLabel5.setText("Genre:");

        JLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        JLabel6.setForeground(new java.awt.Color(47, 72, 88));
        JLabel6.setText("Publisher:");

        JLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        JLabel7.setForeground(new java.awt.Color(47, 72, 88));
        JLabel7.setText("Price:");

        Book_ID.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        Book_ID.setForeground(new java.awt.Color(6, 4, 6));
        Book_ID.setText(" ");

        JLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        JLabel8.setForeground(new java.awt.Color(47, 72, 88));
        JLabel8.setText("Description:");

        Book_Description.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        Book_Description.setForeground(new java.awt.Color(6, 4, 6));
        Book_Description.setText(" ");
        Book_Description.setVerticalAlignment(javax.swing.SwingConstants.TOP);

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
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Search)
                        .addGap(18, 18, 18)
                        .addComponent(Title_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Author_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Genre_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, genrePanelLayout.createSequentialGroup()
                                .addComponent(JLabel1)
                                .addGap(5, 5, 5)
                                .addComponent(Book_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(230, 230, 230)
                                .addComponent(JLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, genrePanelLayout.createSequentialGroup()
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(genrePanelLayout.createSequentialGroup()
                                        .addComponent(JLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_Name))
                                    .addGroup(genrePanelLayout.createSequentialGroup()
                                        .addComponent(JLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_Author))
                                    .addGroup(genrePanelLayout.createSequentialGroup()
                                        .addComponent(JLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_Genre))
                                    .addGroup(genrePanelLayout.createSequentialGroup()
                                        .addComponent(JLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(genrePanelLayout.createSequentialGroup()
                                        .addComponent(JLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_Publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(genrePanelLayout.createSequentialGroup()
                                        .addComponent(JLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Book_Description, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        genrePanelLayout.setVerticalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Title_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Author_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Genre_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabel1)
                            .addComponent(Book_ID)
                            .addComponent(JLabel8))
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JLabel2)
                                    .addComponent(jLabel_ISBN))
                                .addGap(12, 12, 12)
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JLabel3)
                                    .addComponent(jLabel_Name))
                                .addGap(12, 12, 12)
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JLabel4)
                                    .addComponent(jLabel_Author))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JLabel5)
                                    .addComponent(jLabel_Genre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JLabel7)
                                    .addComponent(jLabel_Price))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JLabel6)
                                    .addComponent(jLabel_Publisher)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genrePanelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(Book_Description, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genreExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genreExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_genreExitMouseClicked

    //create a function to populate the jtable with books
    public void BookList(String query) {
        ArrayList<MyClasses.Book> booksList = book.booksList(query);

        // jtable columns
        // we will not display the book description and cover
        String[] colNames = {"ID", "ISBN", "Title", "Author", "Genre", "Quantity", "Publisher", "Price", "Date-RCV"};

        // Row
        Object[][] rows = new Object[booksList.size()][colNames.length];

        for (int i = 0; i < booksList.size(); i++) {
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

        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Books.setModel(model);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < jTable_Books.getColumnCount(); i++) {
            jTable_Books.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        jTable_Books.getColumnModel().getColumn(0).setMinWidth(40);
        jTable_Books.getColumnModel().getColumn(0).setMaxWidth(40);
        jTable_Books.getColumnModel().getColumn(1).setMinWidth(150);
        jTable_Books.getColumnModel().getColumn(1).setMaxWidth(150);
        jTable_Books.getColumnModel().getColumn(3).setMinWidth(175);
        jTable_Books.getColumnModel().getColumn(3).setMaxWidth(175);
        jTable_Books.getColumnModel().getColumn(4).setMinWidth(150);
        jTable_Books.getColumnModel().getColumn(4).setMaxWidth(150);
        jTable_Books.getColumnModel().getColumn(5).setMinWidth(100);
        jTable_Books.getColumnModel().getColumn(5).setMaxWidth(100);
        jTable_Books.getColumnModel().getColumn(6).setMinWidth(175);
        jTable_Books.getColumnModel().getColumn(6).setMaxWidth(175);
        jTable_Books.getColumnModel().getColumn(7).setMinWidth(100);
        jTable_Books.getColumnModel().getColumn(7).setMaxWidth(100);
        jTable_Books.getColumnModel().getColumn(8).setMinWidth(0);
        jTable_Books.getColumnModel().getColumn(8).setMaxWidth(0);
    }

    private void jTable_BooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_BooksMouseClicked
        // Display the selected book data 
        MyClasses.Book SelectedBook;
        try {
            Integer rowIndex = jTable_Books.getSelectedRow(); // Get the selected jTable row index 
            // get the book id from the Jtable (the id is the fist column [0] )
            Integer id = Integer.parseInt(jTable_Books.getModel().getValueAt(rowIndex, 0).toString());

            SelectedBook = book.getBookById(id);

            if (SelectedBook != null) {
                Book_ID.setText(id.toString());
                jLabel_ISBN.setText(SelectedBook.getIsbn());
                jLabel_Name.setText(SelectedBook.getName());

                // we need to display the author name
                jLabel_Author.setText(author.getAuthorById(SelectedBook.getAuthor_id()).getFirstName() + " " + author.getAuthorById(SelectedBook.getAuthor_id()).getLastName());

                // we need to display the genre name
                jLabel_Genre.setText(genre.getGenreById(SelectedBook.getGenre_id()).getName());

                jLabel_Publisher.setText(SelectedBook.getPublisher());
                jLabel_Price.setText(String.valueOf(SelectedBook.getPrice()));
                Book_Description.setText(SelectedBook.getDescription());

                byte[] image = SelectedBook.getCover();
                func.displayImage(200, 250, image, "", jLabel_Image);
                jLabel_Image.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Member not found with the given ID", "Invalid ID", 3);
            }

        } catch (SQLException ex) {
            //Logger.getLogger(EditMemberForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Enter a valid member ID", "Invalid ID", 3);
        }

    }//GEN-LAST:event_jTable_BooksMouseClicked

    private void jTextField_SearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SearchKeyTyped
        // search and display data in the jtable
        String value = jTextField_Search.getText();
        // Search by name, publisher and  description
        String query = "SELECT * FROM `books` WHERE `name` LIKE '%" + value + "%' OR `publisher` LIKE '%" + value + "%' or `description` LIKE '%" + value + "%'";
        BookList(query);
    }//GEN-LAST:event_jTextField_SearchKeyTyped

    private void Title_SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Title_SearchMouseClicked
        // search and display data in the jtable
        String value = jTextField_Search.getText();
        // Search by name, publisher and  description
        String query = "SELECT * FROM `books` WHERE `name` LIKE '%" + value + "%'";
        BookList(query);
    }//GEN-LAST:event_Title_SearchMouseClicked

    private void Title_SearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Title_SearchMouseEntered
        Title_Search.setBackground(new Color(0, 92, 77));
    }//GEN-LAST:event_Title_SearchMouseEntered

    private void Title_SearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Title_SearchMouseExited
        Title_Search.setBackground(new Color(0, 117, 98));
    }//GEN-LAST:event_Title_SearchMouseExited

    private void Author_SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Author_SearchMouseClicked
        // search and display data in the jtable
        String value = jTextField_Search.getText();
        // Search by name, publisher and  description
        String query = "SELECT * FROM `books` WHERE `author_id` = '" + value + "'";
        BookList(query);
    }//GEN-LAST:event_Author_SearchMouseClicked

    private void Author_SearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Author_SearchMouseEntered
        Author_Search.setBackground(new Color(0, 92, 77));
    }//GEN-LAST:event_Author_SearchMouseEntered

    private void Author_SearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Author_SearchMouseExited
        Author_Search.setBackground(new Color(0, 117, 98));
    }//GEN-LAST:event_Author_SearchMouseExited

    private void Genre_SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Genre_SearchMouseClicked
        // search and display data in the jtable
        String value = jTextField_Search.getText();
        // Search by name, publisher and  description
        String query = "SELECT * FROM `books` WHERE `genre_id` = '" + value + "'";
        BookList(query);
    }//GEN-LAST:event_Genre_SearchMouseClicked

    private void Genre_SearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Genre_SearchMouseEntered
        Genre_Search.setBackground(new Color(0, 92, 77));
    }//GEN-LAST:event_Genre_SearchMouseEntered

    private void Genre_SearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Genre_SearchMouseExited
        Genre_Search.setBackground(new Color(0, 117, 98));
    }//GEN-LAST:event_Genre_SearchMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Author_Search;
    private javax.swing.JLabel Book_Description;
    private javax.swing.JLabel Book_ID;
    private javax.swing.JLabel Genre_Search;
    private javax.swing.JLabel JLabel1;
    private javax.swing.JLabel JLabel2;
    private javax.swing.JLabel JLabel3;
    private javax.swing.JLabel JLabel4;
    private javax.swing.JLabel JLabel5;
    private javax.swing.JLabel JLabel6;
    private javax.swing.JLabel JLabel7;
    private javax.swing.JLabel JLabel8;
    private javax.swing.JLabel Title_Search;
    private javax.swing.JLabel genreExit;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JPanel genrePanel;
    private javax.swing.JButton jButton_Search2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Author;
    private javax.swing.JLabel jLabel_Genre;
    private javax.swing.JLabel jLabel_ISBN;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Price;
    private javax.swing.JLabel jLabel_Publisher;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Books;
    private javax.swing.JTextField jTextField_Search;
    private javax.swing.JTextField jTextField_Search2;
    // End of variables declaration//GEN-END:variables
}
