package MyForms;

import java.awt.Color;
import java.awt.HeadlessException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import java.util.HashMap;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

public final class EditBookForm extends javax.swing.JFrame {

    MyClasses.Book book = new MyClasses.Book();
    AuthorsListForm authors = new AuthorsListForm();
    MyClasses.Member member = new MyClasses.Member();
    MyClasses.Author author = new MyClasses.Author();
    MyClasses.Functions func = new MyClasses.Functions();
    MyClasses.Genre genre = new MyClasses.Genre();
    HashMap<String, Integer> genresMap = genre.getGenresMap();

    String imagePath = "";

    public EditBookForm() {
        initComponents();
        SelectPicture.setVisible(false);
        this.setLocationRelativeTo(null);

        func.displayImage(45, 45, null, "/MyImages/Book_Add.png", genreLabel);

        // Populate jcombobox with Genres
        BookGenres();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genrePanel = new javax.swing.JPanel();
        genreLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SelectAuthor = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Author = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField_Publisher = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField_Price = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField_ISBN = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Description = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel_Image = new javax.swing.JLabel();
        jComboBox_Genre = new javax.swing.JComboBox<>();
        genreExit = new javax.swing.JLabel();
        jDateChooser_Date = new com.toedter.calendar.JDateChooser();
        jLabel_ImagePath = new javax.swing.JLabel();
        jLabel_Author_ID = new javax.swing.JLabel();
        jLabel_Genre_ID = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        SelectPicture = new javax.swing.JLabel();
        Book_Quantity = new javax.swing.JTextField();
        SearchIDorISBN = new javax.swing.JLabel();
        Clear_Fields = new javax.swing.JLabel();
        Edit_Book = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        genrePanel.setBackground(new java.awt.Color(218, 186, 151));
        genrePanel.setBorder(BorderFactory.createMatteBorder(3,3,3,3, new Color(164,106,106)));
        genrePanel.setEnabled(false);

        genreLabel.setBackground(new java.awt.Color(164, 106, 106));
        genreLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(243, 236, 236));
        genreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genreLabel.setText("Edit Book");
        genreLabel.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(6, 4, 6));
        jLabel5.setText("ISBN:");

        SelectAuthor.setBackground(new java.awt.Color(0, 117, 98));
        SelectAuthor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SelectAuthor.setForeground(new java.awt.Color(243, 236, 236));
        SelectAuthor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SelectAuthor.setText("Select Author");
        SelectAuthor.setOpaque(true);
        SelectAuthor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SelectAuthorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SelectAuthorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SelectAuthorMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(6, 4, 6));
        jLabel6.setText("Title:");

        jTextField_Name.setBackground(new java.awt.Color(243, 236, 236));
        jTextField_Name.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextField_Name.setForeground(new java.awt.Color(6, 4, 6));
        jTextField_Name.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(6, 4, 6));
        jLabel8.setText("Author:");

        jTextField_Author.setBackground(new java.awt.Color(243, 236, 236));
        jTextField_Author.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextField_Author.setForeground(new java.awt.Color(6, 4, 6));
        jTextField_Author.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(6, 4, 6));
        jLabel9.setText("Quantity:");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(6, 4, 6));
        jLabel13.setText("Publisher:");

        jTextField_Publisher.setBackground(new java.awt.Color(243, 236, 236));
        jTextField_Publisher.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextField_Publisher.setForeground(new java.awt.Color(6, 4, 6));
        jTextField_Publisher.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(6, 4, 6));
        jLabel14.setText("Price:");

        jTextField_Price.setBackground(new java.awt.Color(243, 236, 236));
        jTextField_Price.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextField_Price.setForeground(new java.awt.Color(6, 4, 6));
        jTextField_Price.setEnabled(false);
        jTextField_Price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PriceKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(6, 4, 6));
        jLabel15.setText("Date Received:");

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(6, 4, 6));
        jLabel16.setText("Genre:");

        jTextField_ISBN.setBackground(new java.awt.Color(243, 236, 236));
        jTextField_ISBN.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextField_ISBN.setForeground(new java.awt.Color(6, 4, 6));

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(6, 4, 6));
        jLabel17.setText("Book Cover:");

        jTextArea_Description.setBackground(new java.awt.Color(243, 236, 236));
        jTextArea_Description.setColumns(20);
        jTextArea_Description.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextArea_Description.setForeground(new java.awt.Color(6, 4, 6));
        jTextArea_Description.setRows(5);
        jTextArea_Description.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea_Description);

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(6, 4, 6));
        jLabel18.setText("Book Description:");

        jLabel_Image.setBackground(new java.awt.Color(218, 186, 151));
        jLabel_Image.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel_Image.setForeground(new java.awt.Color(6, 4, 6));
        jLabel_Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Image.setText("No Image");
        jLabel_Image.setBorder(BorderFactory.createMatteBorder(1,1,1,1, new Color(6,4,6)));
        jLabel_Image.setOpaque(true);

        jComboBox_Genre.setBackground(new java.awt.Color(243, 236, 236));
        jComboBox_Genre.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jComboBox_Genre.setForeground(new java.awt.Color(6, 4, 6));
        jComboBox_Genre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----" }));
        jComboBox_Genre.setEnabled(false);
        jComboBox_Genre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_GenreActionPerformed(evt);
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

        jDateChooser_Date.setBackground(new java.awt.Color(243, 236, 236));
        jDateChooser_Date.setForeground(new java.awt.Color(6, 4, 6));
        jDateChooser_Date.setEnabled(false);

        jLabel_ImagePath.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jLabel_ImagePath.setForeground(new java.awt.Color(6, 4, 6));
        jLabel_ImagePath.setText("*Image Path");

        jLabel_Author_ID.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel_Author_ID.setForeground(new java.awt.Color(6, 4, 6));
        jLabel_Author_ID.setText("ID");

        jLabel_Genre_ID.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel_Genre_ID.setForeground(new java.awt.Color(6, 4, 6));
        jLabel_Genre_ID.setText("ID");

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(6, 4, 6));
        jLabel19.setText("ID:");

        jTextField_ID.setBackground(new java.awt.Color(243, 236, 236));
        jTextField_ID.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextField_ID.setForeground(new java.awt.Color(6, 4, 6));

        SelectPicture.setBackground(new java.awt.Color(0, 117, 98));
        SelectPicture.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SelectPicture.setForeground(new java.awt.Color(243, 236, 236));
        SelectPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SelectPicture.setText("Browse");
        SelectPicture.setOpaque(true);
        SelectPicture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SelectPictureMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SelectPictureMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SelectPictureMouseExited(evt);
            }
        });

        Book_Quantity.setBackground(new java.awt.Color(243, 236, 236));
        Book_Quantity.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Book_Quantity.setForeground(new java.awt.Color(6, 4, 6));
        Book_Quantity.setEnabled(false);
        Book_Quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Book_QuantityKeyTyped(evt);
            }
        });

        SearchIDorISBN.setBackground(new java.awt.Color(0, 117, 98));
        SearchIDorISBN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SearchIDorISBN.setForeground(new java.awt.Color(243, 236, 236));
        SearchIDorISBN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SearchIDorISBN.setText("Search ID/ISBN");
        SearchIDorISBN.setOpaque(true);
        SearchIDorISBN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchIDorISBNMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SearchIDorISBNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SearchIDorISBNMouseExited(evt);
            }
        });

        Clear_Fields.setBackground(new java.awt.Color(0, 117, 98));
        Clear_Fields.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Clear_Fields.setForeground(new java.awt.Color(243, 236, 236));
        Clear_Fields.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Clear_Fields.setText("Clear Fields");
        Clear_Fields.setOpaque(true);
        Clear_Fields.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Clear_FieldsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Clear_FieldsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Clear_FieldsMouseExited(evt);
            }
        });

        Edit_Book.setBackground(new java.awt.Color(0, 117, 98));
        Edit_Book.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Edit_Book.setForeground(new java.awt.Color(243, 236, 236));
        Edit_Book.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Edit_Book.setText("Edit Book");
        Edit_Book.setOpaque(true);
        Edit_Book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Edit_BookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Edit_BookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Edit_BookMouseExited(evt);
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
                .addGap(30, 30, 30)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genrePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Clear_Fields, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(Edit_Book, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(genrePanelLayout.createSequentialGroup()
                                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(genrePanelLayout.createSequentialGroup()
                                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(SearchIDorISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(genrePanelLayout.createSequentialGroup()
                                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(genrePanelLayout.createSequentialGroup()
                                                        .addComponent(jTextField_Author, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel_Author_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(genrePanelLayout.createSequentialGroup()
                                                        .addComponent(jComboBox_Genre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel_Genre_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(SelectAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(12, 12, 12)
                                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel17)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_ImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Book_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(genrePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SelectPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        genrePanelLayout.setVerticalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Book_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(SearchIDorISBN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 19, Short.MAX_VALUE)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Author, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Author_ID)
                            .addComponent(SelectAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel_Genre_ID)
                            .addComponent(jComboBox_Genre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Clear_Fields, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Edit_Book, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SelectPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_ImagePath)
                        .addGap(70, 70, 70)))
                .addGap(46, 46, 46))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(genrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genreExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genreExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_genreExitMouseClicked

    private void jComboBox_GenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_GenreActionPerformed
        // display the selected genre id
        // if the jcombobox is empty an error will be thrown
        // so to avoid that we will add an empty try catch just in case
        try {
            int genreId = genresMap.get(jComboBox_Genre.getSelectedItem().toString());
            jLabel_Genre_ID.setText(String.valueOf(genreId));
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jComboBox_GenreActionPerformed

    private void SelectPictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelectPictureMouseClicked
        String path = func.selectPicture();
        jLabel_ImagePath.setText(path + " ");
        imagePath = path;
        func.displayImage(120, 150, null, path, jLabel_Image);
        jLabel_Image.setText("");
    }//GEN-LAST:event_SelectPictureMouseClicked

    private void SelectPictureMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelectPictureMouseEntered
        SelectPicture.setBackground(new Color(0, 92, 77));
    }//GEN-LAST:event_SelectPictureMouseEntered

    private void SelectPictureMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelectPictureMouseExited
        SelectPicture.setBackground(new Color(0, 117, 98));
    }//GEN-LAST:event_SelectPictureMouseExited

    private void Book_QuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Book_QuantityKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_Book_QuantityKeyTyped

    private void jTextField_PriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PriceKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PriceKeyTyped

    private void SelectAuthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelectAuthorMouseClicked
        AuthorsListForm.formType = "edit";
        authors.setVisible(true);
    }//GEN-LAST:event_SelectAuthorMouseClicked

    private void SelectAuthorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelectAuthorMouseEntered
        SelectAuthor.setBackground(new Color(0, 92, 77));
    }//GEN-LAST:event_SelectAuthorMouseEntered

    private void SelectAuthorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelectAuthorMouseExited
        SelectAuthor.setBackground(new Color(0, 117, 98));
    }//GEN-LAST:event_SelectAuthorMouseExited

    private void SearchIDorISBNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchIDorISBNMouseClicked
        // Search book by ID or ISNB 
        // check if the id fields or the isbn are empty
        if (jTextField_ID.getText().equals("") && jTextField_ISBN.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You Need To Enter The ID or The ISBN To Complete The Search", "Empty ID & ISBN", 2);
        } else {
            try {
                int id = 0;
                String isbn = jTextField_ISBN.getText();
                MyClasses.Book selectedBook = null;
                try {
                    id = Integer.parseInt(jTextField_ID.getText());
                    selectedBook = book.searchBookbyId_Isnb(id, isbn);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid ID/ISBN, check your input and try again", "Invalid input", 2);
                }
                jTextField_ID.setText(Integer.toString(selectedBook.getId()));
                jTextField_ISBN.setText(selectedBook.getIsbn());
                jTextField_Name.setText(selectedBook.getName());
                jTextField_Publisher.setText(selectedBook.getPublisher());
                jTextField_Price.setText(Double.toString(selectedBook.getPrice()));
                jTextArea_Description.setText(selectedBook.getDescription());
                Book_Quantity.setText(Integer.toString(selectedBook.getQuantity()));
                jLabel_Author_ID.setText(String.valueOf(selectedBook.getAuthor_id()));

                // display the author full name
                // you can use the "displayAuthorData" if you want
                String fullName = (author.getAuthorById(selectedBook.getAuthor_id())).getFirstName() + " "
                        + (author.getAuthorById(selectedBook.getAuthor_id())).getLastName();
                jTextField_Author.setText(fullName);

                jLabel_Genre_ID.setText(String.valueOf(selectedBook.getGenre_id()));

                // display the selected book genre in the jcombobox
                for (Map.Entry<String, Integer> entry : genresMap.entrySet()) {
                    if (Objects.equals(selectedBook.getGenre_id(), entry.getValue())) {
                        jComboBox_Genre.setSelectedItem(entry.getKey());
                    }
                }

                // display the date
                Date date_receive = new SimpleDateFormat("yyyy-MM-dd").parse(selectedBook.getDate_received());
                jDateChooser_Date.setDate(date_receive);

                byte[] image = selectedBook.getCover();
                func.displayImage(120, 150, image, "", jLabel_Image);
                jLabel_Image.setText("");

                jTextField_ID.setEnabled(false);
                jTextField_ISBN.setEnabled(false);
                jTextField_Name.setEnabled(true);
                SelectAuthor.setEnabled(true);
                jComboBox_Genre.setEnabled(true);
                jTextField_Publisher.setEnabled(true);
                jTextField_Price.setEnabled(true);
                jTextArea_Description.setEnabled(true);
                SelectPicture.setVisible(true);
                Book_Quantity.setEnabled(true);
                jDateChooser_Date.setEnabled(true);
            } catch (HeadlessException | ParseException ex) {
                JOptionPane.showMessageDialog(null, "This book doesn't exist", "Book Not Found", 2); // Have an error on ex.getMessage
            }
        }
    }//GEN-LAST:event_SearchIDorISBNMouseClicked

    private void SearchIDorISBNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchIDorISBNMouseEntered
        SearchIDorISBN.setBackground(new Color(0, 92, 77));
    }//GEN-LAST:event_SearchIDorISBNMouseEntered

    private void SearchIDorISBNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchIDorISBNMouseExited
        SearchIDorISBN.setBackground(new Color(0, 117, 98));
    }//GEN-LAST:event_SearchIDorISBNMouseExited

    private void Clear_FieldsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Clear_FieldsMouseClicked
        // clear all fields
        jTextField_ID.setText("");
        jTextField_ISBN.setText("");
        jTextField_Name.setText("");
        jTextField_Author.setText("");
        jLabel_Author_ID.setText("ID");
        jComboBox_Genre.setSelectedIndex(0);
        jTextField_Price.setText("");
        jTextField_Publisher.setText("");
        jTextArea_Description.setText("");
        Book_Quantity.setText("");
        jDateChooser_Date.setDate(null);
        jLabel_Image.setIcon(null);
        jLabel_Image.setText("*Image Path");
        jLabel_ImagePath.setText("*Image Path");
        jTextField_ID.setEnabled(true);
        jTextField_ISBN.setEnabled(true);
        jTextField_Name.setEnabled(false);
        SelectAuthor.setEnabled(false);
        jComboBox_Genre.setEnabled(false);
        jTextField_Publisher.setEnabled(false);
        jTextField_Price.setEnabled(false);
        jTextArea_Description.setEnabled(false);
        SelectPicture.setVisible(false);
        Book_Quantity.setEnabled(false);
        jDateChooser_Date.setEnabled(false);
    }//GEN-LAST:event_Clear_FieldsMouseClicked

    private void Clear_FieldsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Clear_FieldsMouseEntered
        Clear_Fields.setBackground(new Color(0, 92, 77));
    }//GEN-LAST:event_Clear_FieldsMouseEntered

    private void Clear_FieldsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Clear_FieldsMouseExited
        Clear_Fields.setBackground(new Color(0, 117, 98));
    }//GEN-LAST:event_Clear_FieldsMouseExited

    private void Edit_BookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit_BookMouseClicked
        // edit the selected book
        // we will not edit the isbn

        MyClasses.Book book = new MyClasses.Book();
        String isbn = jTextField_ISBN.getText();

        if (!verif()) {
            JOptionPane.showMessageDialog(null, "one or more fields are empty", "Empty Data", 2);

        } else {

            // get the image bytes  
            try {

                // get values
                int id = Integer.parseInt(jTextField_ID.getText());
                String name = jTextField_Name.getText();
                String publisher = jTextField_Publisher.getText();
                String description = jTextArea_Description.getText();

                Integer author_id = Integer.parseInt(jLabel_Author_ID.getText());// get author id
                Integer genre_id = Integer.parseInt(jLabel_Genre_ID.getText());// get the  genre id 
                Integer quantity = Integer.parseInt(Book_Quantity.getText());

                Double price = Double.parseDouble(jTextField_Price.getText());

                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String received_date = dateFormat.format(jDateChooser_Date.getDate());
                Path path = Paths.get(imagePath);

                try {
                    // if the user want to update the cover image to 
                    // get the image bytes
                    byte[] img = Files.readAllBytes(path);
                    book.editBook(id, isbn, name, author_id, genre_id, quantity, publisher, price, received_date, description, img);
                } catch (IOException ex)// if not 
                {
                    book.editBook(id, isbn, name, author_id, genre_id, quantity, publisher, price, received_date, description, null);

                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "You Entered Wrong Data in a Number Field", "Wrong Data", 2);
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "You Need To Select a Date", "Select Date", 2);
            }
        }
    }//GEN-LAST:event_Edit_BookMouseClicked

    private void Edit_BookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit_BookMouseEntered
        Edit_Book.setBackground(new Color(0, 92, 77));
    }//GEN-LAST:event_Edit_BookMouseEntered

    private void Edit_BookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit_BookMouseExited
        Edit_Book.setBackground(new Color(0, 117, 98));
    }//GEN-LAST:event_Edit_BookMouseExited
    // display the selected author data
    public static void displayAuthor(int id, String fullName) {
        jTextField_Author.setText(fullName);
        jLabel_Author_ID.setText(String.valueOf(id));
    }

    // create a function to verify the required fields
    public boolean verif() {

        return !(jTextField_ISBN.getText().equals("") || jTextField_Author.getText().equals("")
                || jTextField_Price.getText().equals("") || jTextField_Name.getText().equals("") || jLabel_Genre_ID.getText().equals("ID"));
    }

    // create a function to populate the jcombox with genre name and user id using hashmap 
    public void BookGenres() {
        for (String genreName : genresMap.keySet()) {
            jComboBox_Genre.addItem(genreName);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Book_Quantity;
    private javax.swing.JLabel Clear_Fields;
    private javax.swing.JLabel Edit_Book;
    private javax.swing.JLabel SearchIDorISBN;
    private javax.swing.JLabel SelectAuthor;
    private javax.swing.JLabel SelectPicture;
    private javax.swing.JLabel genreExit;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JPanel genrePanel;
    private javax.swing.JComboBox<String> jComboBox_Genre;
    private com.toedter.calendar.JDateChooser jDateChooser_Date;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private static javax.swing.JLabel jLabel_Author_ID;
    private javax.swing.JLabel jLabel_Genre_ID;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_ImagePath;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_Description;
    private static javax.swing.JTextField jTextField_Author;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_ISBN;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_Price;
    private javax.swing.JTextField jTextField_Publisher;
    // End of variables declaration//GEN-END:variables
}
