
package MyForms;
import java.awt.Color;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.Map;
import java.util.Objects;






public class EditBookForm extends javax.swing.JFrame {

    MyClasses.Book book = new MyClasses.Book();
    AuthorsListForm authors = new AuthorsListForm();
    MyClasses.Member member = new MyClasses.Member();
    MyClasses.Author author = new MyClasses.Author();
    MyClasses.Functions func = new MyClasses.Functions();
    MyClasses.Genre genre = new MyClasses.Genre();
    HashMap <String, Integer> genresMap = genre.getGenresMap();
    
    String imagePath = "";
    
    public EditBookForm() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        //add boarder to the panel
        Border genreFormBorder = BorderFactory.createMatteBorder(2,2,2,2, new Color(250, 130, 49));
        genrePanel.setBorder(genreFormBorder);
       
        func.displayImage(45, 45, null, "/MyImages/Book_Add.png", genreLabel);
        
        // Populate jcombobox with Genres
        fillJcomboboxWithGenres();
        
        //add black border to the jlabel Image
        Border jLabelImageBorder = BorderFactory.createMatteBorder(2,2,2,2, new Color(47,54,64));
        jLabel_Image.setBorder(jLabelImageBorder);
        
        // add a default image to the jlabel 
        //func.displayImage(100, 75, null, "/MyImages/blank-profile.png", jLabel_Image);
        
        
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
        genreLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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
        jButton_SelectPicture = new javax.swing.JButton();
        jButton_Edit = new javax.swing.JButton();
        jButton_Cancel = new javax.swing.JButton();
        jComboBox_Genre = new javax.swing.JComboBox<>();
        jSpinner_Quantity = new javax.swing.JSpinner();
        genreExit = new javax.swing.JLabel();
        jDateChooser_Date = new com.toedter.calendar.JDateChooser();
        jLabel_ImagePath = new javax.swing.JLabel();
        jButton_SelectAuthor = new javax.swing.JButton();
        jLabel_Author_ID = new javax.swing.JLabel();
        jLabel_Genre_ID = new javax.swing.JLabel();
        jButton_Clear = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jButton_Search = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(6, 4, 6));
        jLabel7.setText("ISBN:");

        jTextField_ID2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_ID2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ID2ActionPerformed(evt);
            }
        });

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
        jTextField_ID5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ID5ActionPerformed(evt);
            }
        });

        jButton_Add.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton_Add.setText("Add new member");
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        genrePanel.setBackground(new java.awt.Color(218, 186, 151));
        genrePanel.setEnabled(false);

        genreLabel.setBackground(new java.awt.Color(253, 150, 68));
        genreLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(243, 236, 236));
        genreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genreLabel.setText("Add a New Book");
        genreLabel.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(6, 4, 6));
        jLabel5.setText("ISBN:");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(6, 4, 6));
        jLabel6.setText("Name:");

        jTextField_Name.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(6, 4, 6));
        jLabel8.setText("Author:");

        jTextField_Author.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_Author.setEnabled(false);
        jTextField_Author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AuthorActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(6, 4, 6));
        jLabel9.setText("Quantity:");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(6, 4, 6));
        jLabel13.setText("Publisher:");

        jTextField_Publisher.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_Publisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PublisherActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(6, 4, 6));
        jLabel14.setText("Price:");

        jTextField_Price.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PriceActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(6, 4, 6));
        jLabel15.setText("Date Received:");

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(6, 4, 6));
        jLabel16.setText("Genre:");

        jTextField_ISBN.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_ISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ISBNActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(6, 4, 6));
        jLabel17.setText("Book Cover:");

        jTextArea_Description.setColumns(20);
        jTextArea_Description.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Description);

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(6, 4, 6));
        jLabel18.setText("Book Description:");

        jLabel_Image.setBackground(new java.awt.Color(153, 153, 255));
        jLabel_Image.setOpaque(true);

        jButton_SelectPicture.setBackground(new java.awt.Color(153, 51, 0));
        jButton_SelectPicture.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_SelectPicture.setForeground(new java.awt.Color(255, 255, 255));
        jButton_SelectPicture.setText("Select Picture");
        jButton_SelectPicture.setContentAreaFilled(false);
        jButton_SelectPicture.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_SelectPicture.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_SelectPicture.setOpaque(true);
        jButton_SelectPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SelectPictureActionPerformed(evt);
            }
        });

        jButton_Edit.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton_Edit.setText("Edit Book");
        jButton_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditActionPerformed(evt);
            }
        });

        jButton_Cancel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton_Cancel.setText("Cancel");
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });

        jComboBox_Genre.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jComboBox_Genre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_Genre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_GenreActionPerformed(evt);
            }
        });

        jSpinner_Quantity.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

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

        jLabel_ImagePath.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel_ImagePath.setForeground(new java.awt.Color(6, 4, 6));
        jLabel_ImagePath.setText("Choose");

        jButton_SelectAuthor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_SelectAuthor.setText("Change Author");
        jButton_SelectAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SelectAuthorActionPerformed(evt);
            }
        });

        jLabel_Author_ID.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel_Author_ID.setText("ID");

        jLabel_Genre_ID.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel_Genre_ID.setText("ID");

        jButton_Clear.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton_Clear.setText("Clear");
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(6, 4, 6));
        jLabel19.setText("ID:");

        jTextField_ID.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });

        jButton_Search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Search.setText("Search by id or isbn");
        jButton_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout genrePanelLayout = new javax.swing.GroupLayout(genrePanel);
        genrePanel.setLayout(genrePanelLayout);
        genrePanelLayout.setHorizontalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13)
                            .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(genrePanelLayout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField_Publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, genrePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSpinner_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, genrePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox_Genre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_Genre_ID))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, genrePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_Author, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel_Author_ID))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, genrePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(jDateChooser_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_SelectAuthor))
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(genrePanelLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, genrePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_Name)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genrePanelLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(257, 257, 257))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_SelectPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_ImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jButton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(60, 60, 60))
        );
        genrePanelLayout.setVerticalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genrePanelLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_ImagePath))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_SelectPicture)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genrePanelLayout.createSequentialGroup()
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_ISBN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(genrePanelLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jButton_Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Author, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_SelectAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Author_ID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_Genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Genre_ID))
                        .addGap(25, 25, 25)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Publisher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(genrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jTextField_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NameActionPerformed

    private void jTextField_ID2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ID2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ID2ActionPerformed

    private void jTextField_AuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AuthorActionPerformed

    private void jTextField_ID5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ID5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ID5ActionPerformed

    private void jTextField_PublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PublisherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PublisherActionPerformed

    private void jTextField_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PriceActionPerformed

    private void jTextField_ISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ISBNActionPerformed

    private void jButton_SelectPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SelectPictureActionPerformed
        /*  GenreForm manageGenre = new GenreForm();
        manageGenre.setVisible(true); */
        
        String path = func.selectPicture();
        jLabel_ImagePath.setText(path);
        imagePath = path;
      
        func.displayImage(175, 150, null, path, jLabel_Image);
        
    }//GEN-LAST:event_jButton_SelectPictureActionPerformed

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
        
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jButton_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditActionPerformed
        // edit the selected book
        // we will not edit the isbn
       
        MyClasses.Book book  = new MyClasses.Book();
        String isbn = jTextField_ISBN.getText();
        
        if (!verif()) {
            JOptionPane.showMessageDialog(null , "one or more fields are empty", "Empty Data", 2);
            
        }
        /*
        // we will not check if the isbn already exist 
        // because we will not edit 
        //
        else if (book.isISBNexists(isbn)) {
             JOptionPane.showMessageDialog(null , "this ISBN already exists", "Wrong ISBN", 2);
        }
        
        */
        else
        {
       
             // get the image bytes  
        try {
            
        // get values
        int id = Integer.parseInt(jTextField_ID.getText());
        String name = jTextField_Name.getText();
        String publisher = jTextField_Publisher.getText();
        String description = jTextArea_Description.getText();
        
        Integer author_id = Integer.parseInt(jLabel_Author_ID.getText());// get author id
        Integer genre_id = Integer.parseInt(jLabel_Genre_ID.getText());// get the  genre id 
        Integer quantity = Integer.parseInt(jSpinner_Quantity.getValue().toString());
        
        
        Double price = Double.parseDouble(jTextField_Price.getText());
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String received_date = dateFormat.format (jDateChooser_Date.getDate());
            Path path = Paths.get(imagePath);
            
            try {
                // if the user want to update the cover image to 
                // get the image bytes
                byte[] img = Files.readAllBytes(path);
                book.editBook(id, isbn, name, author_id, genre_id, quantity, publisher, price, received_date, description, img);   
            }
            catch (IOException ex)// if not 
            {
                book.editBook(id, isbn, name, author_id, genre_id, quantity, publisher, price, received_date, description, null );
            
            }
            
             
        
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null , "You Entered Wrong Data in a Number Field", "Wrong Data", 2);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null , "You Need To Select a Date", "Select Date", 2);
        } 
      }
    }//GEN-LAST:event_jButton_EditActionPerformed

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        // close the window
        this.dispose();
    }//GEN-LAST:event_jButton_CancelActionPerformed

    private void jComboBox_GenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_GenreActionPerformed
        // display the selected genre id
        // if the jcombobox is empty an error will be thrown
        // so to avoid that we will add an empty try catch just an case
        try {
            int genreId = genresMap.get(jComboBox_Genre.getSelectedItem().toString());
            jLabel_Genre_ID.setText(String.valueOf(genreId));
        }catch(Exception ex) {
            System.out.println("Error From jComboBox_GenreActionPerformed  " + ex.getMessage());
        }
        
    }//GEN-LAST:event_jComboBox_GenreActionPerformed

    private void jButton_SelectAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SelectAuthorActionPerformed
        // Show author form
        AuthorsListForm authorsForm = new AuthorsListForm();
        authorsForm.formType = "edit";
        authors.setVisible(true);
        
        /* Kinomment ko kasi nag eerror, baka may baguhin din dito pero dito muna yan HAHAHA
            AuthorsListForm authors = new AuthorsListForm();
            authors.setVisible(true);
            // get the selected row index
            int index = authors.jTable_Authors.getSelectedRow();

            String id = authors.jTable_Authors.getValueAt(index, 0).toString();
            String firstName = authors.jTable_Authors.getValueAt(index,1).toString();
            String lastName = authors.jTable_Authors.getValueAt(index, 2).toString();
        */
        
    }//GEN-LAST:event_jButton_SelectAuthorActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
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
        jSpinner_Quantity.setValue(0);
        jDateChooser_Date.setDate(new java.util.Date());
        
        jLabel_Image.setIcon(null);
        jLabel_ImagePath.setText("Choose");
    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jButton_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchActionPerformed
        // Search book by ID or ISNB 
        // check if the id fields or the isbn are empty
        if (jTextField_ID.getText().equals("") && jTextField_ISBN.getText().equals("")) {
            JOptionPane.showMessageDialog(null , "You Need To Enter The ID or The ISBN To Complete The Search", "Empty ID & ISBN", 2);
        }
        else {
            
            try{
                int id = 0;
                String isbn = jTextField_ISBN.getText();
                MyClasses.Book selectedBook = null;
                try {
                     id = Integer.parseInt(jTextField_ID.getText());
                     selectedBook = book.searchBookbyId_Isnb(id, isbn);
            }     
             catch(NumberFormatException ex) {
                 selectedBook = book.searchBookbyId_Isnb(id, isbn);
             }
           
                jTextField_ID.setText(String.valueOf(selectedBook.getId()));
                jTextField_ISBN.setText(selectedBook.getIsbn());
                jTextField_Name.setText(selectedBook.getName());
                jTextField_Publisher.setText(selectedBook.getPublisher());
                jTextField_Price.setText(Double.toString(selectedBook.getPrice()));
                jTextArea_Description.setText(selectedBook.getDescription());
                jSpinner_Quantity.setValue(selectedBook.getQuantity());
                jLabel_Author_ID.setText(String.valueOf(selectedBook.getAuthor_id()));
                
                // display the author full name
                // you can use the "displayAuthorData" if you want
                String fullName = (author.getAuthorById(selectedBook.getAuthor_id())).getFirstName() + " " +
                                  (author.getAuthorById(selectedBook.getAuthor_id())).getLastName();
                jTextField_Author.setText(fullName);
                
                jLabel_Genre_ID.setText(String.valueOf(selectedBook.getGenre_id()));
                
                // display the selected book genre in the jcombobox
                for(Map.Entry<String,Integer> entry : genresMap.entrySet()) {
                    if (Objects.equals(selectedBook.getGenre_id(), entry.getValue())) {
                        jComboBox_Genre.setSelectedItem(entry.getKey());
                        System.out.println(entry.getKey());
                    }
                }
                
                // display the date
                Date date_receive = new SimpleDateFormat("yyyy-MM-dd").parse(selectedBook.getDate_received());
                jDateChooser_Date.setDate(date_receive);
                
                byte[] image = selectedBook.getCover();
                func.displayImage(175, 150, image, "", jLabel_Image);
            
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null , "This Book Does Not Exists" + ex.getMessage(), "Book Not Found", 2); // Have an error on ex.getMessage
        }
            
        }
        
        
        
        
    }//GEN-LAST:event_jButton_SearchActionPerformed
    // display the selected author data
    public static void displayAuthor(int id, String fullName){
        jTextField_Author.setText(fullName);
        jLabel_Author_ID.setText(String.valueOf(id));
        
    }
    
    // create a function to verify the required fields
    public boolean verif() {
        
        if (jTextField_ISBN.getText().equals("") || jTextField_Author.getText().equals("") || 
                jTextField_Price.getText().equals("") || jTextField_Name.getText().equals("") || jLabel_Genre_ID.getText().equals("ID")) {
            return false;
        }
        else{
            return true;
        }
    }
    
     // create a function to populate the jcombox with genre name and user id using hashmap 
    public void fillJcomboboxWithGenres()
    {
        for (String genreName : genresMap.keySet())
        {
            jComboBox_Genre.addItem(genreName);
        }
    }
    
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
            java.util.logging.Logger.getLogger(EditBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel genreExit;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JPanel genrePanel;
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Edit;
    private javax.swing.JButton jButton_Search;
    private javax.swing.JButton jButton_SelectAuthor;
    private javax.swing.JButton jButton_SelectPicture;
    private javax.swing.JComboBox<String> jComboBox_Genre;
    private com.toedter.calendar.JDateChooser jDateChooser_Date;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private static javax.swing.JLabel jLabel_Author_ID;
    private javax.swing.JLabel jLabel_Genre_ID;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_ImagePath;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_Quantity;
    private javax.swing.JTextArea jTextArea_Description;
    private static javax.swing.JTextField jTextField_Author;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_ID2;
    private javax.swing.JTextField jTextField_ID5;
    private javax.swing.JTextField jTextField_ID6;
    private javax.swing.JTextField jTextField_ISBN;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_Price;
    private javax.swing.JTextField jTextField_Publisher;
    // End of variables declaration//GEN-END:variables
}