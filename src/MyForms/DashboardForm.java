package MyForms;

import MyClasses.Functions;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

public final class DashboardForm extends javax.swing.JFrame {
    
    MyClasses.Functions func = new Functions();
    
    /**
     * Creates new form DashboardForm
     */
    public DashboardForm() {
        initComponents();
        
        //Center the form
        this.setLocationRelativeTo(null);
        
        //Displays the logo
        func.displayImage(DashboardLogo.getWidth(), DashboardLogo.getHeight(), null, "/MyImages/book_dashboard_logo.png", DashboardLogo);
        
        //Function calls
        addHeaderBorders();
        addButtonBorders();
        buttonHoverEffect();
    }
    
    public void addHeaderBorders() { //Add borders to some panel headers
        Border sideBarHeaderBorder = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(32, 54, 69));
        SideBarHeader.setBorder(sideBarHeaderBorder);
        Border dashboardPanel1HeaderBorder = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(85, 85, 153));
        dashboardPanel1Header.setBorder(dashboardPanel1HeaderBorder);
        Border dashboardPanel2HeaderBorder = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(141, 65, 140));
        dashboardPanel2Header.setBorder(dashboardPanel2HeaderBorder);
        Border dashboardPanel3HeaderBorder = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(78, 99, 59));
        dashboardPanel3Header.setBorder(dashboardPanel3HeaderBorder);
        Border dashboardPanel4HeaderBorder = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(21, 111, 171));
        dashboardPanel4Header.setBorder(dashboardPanel4HeaderBorder);
    }
    
    Border buttonHoverBorder = BorderFactory.createMatteBorder(1,0,1,0, new Color(32, 54, 69));
    Border buttonInvisibleBorder = BorderFactory.createMatteBorder(1,0,1,0, new Color(164,106,106));

    public void addButtonBorders() { //Adds invisible border to sidebar buttons so that they won't move
        Component[] comps = jPanel_Menu.getComponents(); //Gets all components in the sidebar
        for (Component comp: comps){ //Checks if the component is a button
            if (comp instanceof JButton){
                JButton button = (JButton) comp;
                
                button.setBorder(buttonInvisibleBorder);
            }
        }
    }
    
    public void buttonHoverEffect(){ //Adds hover effect to sidebar buttons
        Component[] comps = jPanel_Menu.getComponents(); //Gets all components in sidebar
        for (Component comp: comps){
            if (comp instanceof JButton){ //Checks if the component is a button
                JButton button = (JButton) comp;
                button.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent evt) {
                        button.setBorder(buttonHoverBorder);
                    }
                    @Override
                    public void mouseExited(MouseEvent evt) {
                        button.setBorder(buttonInvisibleBorder);
                    }
                });
            }
        }
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Menu = new javax.swing.JPanel();
        SideBarHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DashboardLogo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton_AddMember = new javax.swing.JButton();
        jButton_EditMember = new javax.swing.JButton();
        jButton_DeleteMember = new javax.swing.JButton();
        jButton_MembersList = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton_ManageGenre = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton_ManageAuthors = new javax.swing.JButton();
        dashboardPanel2 = new javax.swing.JPanel();
        dashboardPanel2Header = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dashboardPanel3 = new javax.swing.JPanel();
        dashboardPanel3Header = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dashboardPanel1 = new javax.swing.JPanel();
        dashboardPanel1Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dashboardPanel4 = new javax.swing.JPanel();
        dashboardPanel4Header = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(218, 186, 151));

        jPanel_Menu.setBackground(new java.awt.Color(164, 106, 106));

        SideBarHeader.setBackground(new java.awt.Color(47, 72, 88));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 236, 236));
        jLabel1.setText("KLD Library");

        javax.swing.GroupLayout SideBarHeaderLayout = new javax.swing.GroupLayout(SideBarHeader);
        SideBarHeader.setLayout(SideBarHeaderLayout);
        SideBarHeaderLayout.setHorizontalGroup(
            SideBarHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarHeaderLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(DashboardLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        SideBarHeaderLayout.setVerticalGroup(
            SideBarHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SideBarHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(DashboardLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(243, 236, 236));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Members");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton_AddMember.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_AddMember.setForeground(new java.awt.Color(243, 236, 236));
        jButton_AddMember.setText("Add member");
        jButton_AddMember.setContentAreaFilled(false);
        jButton_AddMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_AddMember.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_AddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddMemberActionPerformed(evt);
            }
        });

        jButton_EditMember.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_EditMember.setForeground(new java.awt.Color(243, 236, 236));
        jButton_EditMember.setText("Edit member");
        jButton_EditMember.setContentAreaFilled(false);
        jButton_EditMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_EditMember.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_EditMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditMemberActionPerformed(evt);
            }
        });

        jButton_DeleteMember.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_DeleteMember.setForeground(new java.awt.Color(243, 236, 236));
        jButton_DeleteMember.setText("Delete member");
        jButton_DeleteMember.setContentAreaFilled(false);
        jButton_DeleteMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_DeleteMember.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_DeleteMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteMemberActionPerformed(evt);
            }
        });

        jButton_MembersList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_MembersList.setForeground(new java.awt.Color(243, 236, 236));
        jButton_MembersList.setText("Member List");
        jButton_MembersList.setContentAreaFilled(false);
        jButton_MembersList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_MembersList.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_MembersList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MembersListActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(243, 236, 236));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Genres");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton_ManageGenre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_ManageGenre.setForeground(new java.awt.Color(243, 236, 236));
        jButton_ManageGenre.setText("Manage Genres");
        jButton_ManageGenre.setContentAreaFilled(false);
        jButton_ManageGenre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_ManageGenre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_ManageGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ManageGenreActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(243, 236, 236));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Authors");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton_ManageAuthors.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_ManageAuthors.setForeground(new java.awt.Color(243, 236, 236));
        jButton_ManageAuthors.setText("Manage Authors");
        jButton_ManageAuthors.setContentAreaFilled(false);
        jButton_ManageAuthors.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_ManageAuthors.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_ManageAuthors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ManageAuthorsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_MenuLayout = new javax.swing.GroupLayout(jPanel_Menu);
        jPanel_Menu.setLayout(jPanel_MenuLayout);
        jPanel_MenuLayout.setHorizontalGroup(
            jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SideBarHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ManageGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ManageAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_AddMember, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_EditMember, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_DeleteMember, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_MembersList, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel_MenuLayout.setVerticalGroup(
            jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                .addComponent(SideBarHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jButton_ManageGenre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jButton_ManageAuthors)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jButton_AddMember)
                .addGap(5, 5, 5)
                .addComponent(jButton_EditMember)
                .addGap(5, 5, 5)
                .addComponent(jButton_DeleteMember)
                .addGap(5, 5, 5)
                .addComponent(jButton_MembersList)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        dashboardPanel2.setBackground(new java.awt.Color(180, 100, 179));

        dashboardPanel2Header.setBackground(new java.awt.Color(141, 78, 140));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(243, 236, 236));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Members");

        javax.swing.GroupLayout dashboardPanel2HeaderLayout = new javax.swing.GroupLayout(dashboardPanel2Header);
        dashboardPanel2Header.setLayout(dashboardPanel2HeaderLayout);
        dashboardPanel2HeaderLayout.setHorizontalGroup(
            dashboardPanel2HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardPanel2HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
        );
        dashboardPanel2HeaderLayout.setVerticalGroup(
            dashboardPanel2HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanel2HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(243, 236, 236));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("50");

        javax.swing.GroupLayout dashboardPanel2Layout = new javax.swing.GroupLayout(dashboardPanel2);
        dashboardPanel2.setLayout(dashboardPanel2Layout);
        dashboardPanel2Layout.setHorizontalGroup(
            dashboardPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardPanel2Header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dashboardPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        dashboardPanel2Layout.setVerticalGroup(
            dashboardPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanel2Layout.createSequentialGroup()
                .addComponent(dashboardPanel2Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );

        dashboardPanel3.setBackground(new java.awt.Color(121, 151, 94));

        dashboardPanel3Header.setBackground(new java.awt.Color(89, 111, 69));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(243, 236, 236));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Authors");

        javax.swing.GroupLayout dashboardPanel3HeaderLayout = new javax.swing.GroupLayout(dashboardPanel3Header);
        dashboardPanel3Header.setLayout(dashboardPanel3HeaderLayout);
        dashboardPanel3HeaderLayout.setHorizontalGroup(
            dashboardPanel3HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardPanel3HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );
        dashboardPanel3HeaderLayout.setVerticalGroup(
            dashboardPanel3HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanel3HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(243, 236, 236));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("20");

        javax.swing.GroupLayout dashboardPanel3Layout = new javax.swing.GroupLayout(dashboardPanel3);
        dashboardPanel3.setLayout(dashboardPanel3Layout);
        dashboardPanel3Layout.setHorizontalGroup(
            dashboardPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardPanel3Header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dashboardPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        dashboardPanel3Layout.setVerticalGroup(
            dashboardPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanel3Layout.createSequentialGroup()
                .addComponent(dashboardPanel3Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );

        dashboardPanel1.setBackground(new java.awt.Color(125, 124, 192));

        dashboardPanel1Header.setBackground(new java.awt.Color(99, 99, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(243, 236, 236));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Books");

        javax.swing.GroupLayout dashboardPanel1HeaderLayout = new javax.swing.GroupLayout(dashboardPanel1Header);
        dashboardPanel1Header.setLayout(dashboardPanel1HeaderLayout);
        dashboardPanel1HeaderLayout.setHorizontalGroup(
            dashboardPanel1HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardPanel1HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        dashboardPanel1HeaderLayout.setVerticalGroup(
            dashboardPanel1HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanel1HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(243, 236, 236));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("100");

        javax.swing.GroupLayout dashboardPanel1Layout = new javax.swing.GroupLayout(dashboardPanel1);
        dashboardPanel1.setLayout(dashboardPanel1Layout);
        dashboardPanel1Layout.setHorizontalGroup(
            dashboardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardPanel1Header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dashboardPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );
        dashboardPanel1Layout.setVerticalGroup(
            dashboardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanel1Layout.createSequentialGroup()
                .addComponent(dashboardPanel1Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );

        dashboardPanel4.setBackground(new java.awt.Color(0, 168, 255));

        dashboardPanel4Header.setBackground(new java.awt.Color(41, 128, 185));

        javax.swing.GroupLayout dashboardPanel4HeaderLayout = new javax.swing.GroupLayout(dashboardPanel4Header);
        dashboardPanel4Header.setLayout(dashboardPanel4HeaderLayout);
        dashboardPanel4HeaderLayout.setHorizontalGroup(
            dashboardPanel4HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1112, Short.MAX_VALUE)
        );
        dashboardPanel4HeaderLayout.setVerticalGroup(
            dashboardPanel4HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout dashboardPanel4Layout = new javax.swing.GroupLayout(dashboardPanel4);
        dashboardPanel4.setLayout(dashboardPanel4Layout);
        dashboardPanel4Layout.setHorizontalGroup(
            dashboardPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardPanel4Header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dashboardPanel4Layout.setVerticalGroup(
            dashboardPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanel4Layout.createSequentialGroup()
                .addComponent(dashboardPanel4Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(321, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dashboardPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dashboardPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dashboardPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dashboardPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dashboardPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dashboardPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dashboardPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(dashboardPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ManageGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ManageGenreActionPerformed
        GenreForm manageGenre = new GenreForm();
        manageGenre.setVisible(true);
    }//GEN-LAST:event_jButton_ManageGenreActionPerformed

    private void jButton_ManageAuthorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ManageAuthorsActionPerformed
        AuthorsForm manageAuthor = new AuthorsForm();
        manageAuthor.setVisible(true);
    }//GEN-LAST:event_jButton_ManageAuthorsActionPerformed

    private void jButton_AddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddMemberActionPerformed
        AddMemberForm addMember = new AddMemberForm();
        addMember.setVisible(true);
    }//GEN-LAST:event_jButton_AddMemberActionPerformed

    private void jButton_EditMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditMemberActionPerformed
        EditMemberForm editMember = new EditMemberForm();
        editMember.setVisible(true);
    }//GEN-LAST:event_jButton_EditMemberActionPerformed

    private void jButton_DeleteMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteMemberActionPerformed
        DeleteMemberForm deleteMember = new DeleteMemberForm();
        deleteMember.setVisible(true);
    }//GEN-LAST:event_jButton_DeleteMemberActionPerformed

    private void jButton_MembersListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MembersListActionPerformed
        // show the Members List form
        MemberListForm memberList = new MemberListForm();
        memberList.setVisible(true);
    }//GEN-LAST:event_jButton_MembersListActionPerformed

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
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DashboardLogo;
    private javax.swing.JPanel SideBarHeader;
    private javax.swing.JPanel dashboardPanel1;
    private javax.swing.JPanel dashboardPanel1Header;
    private javax.swing.JPanel dashboardPanel2;
    private javax.swing.JPanel dashboardPanel2Header;
    private javax.swing.JPanel dashboardPanel3;
    private javax.swing.JPanel dashboardPanel3Header;
    private javax.swing.JPanel dashboardPanel4;
    private javax.swing.JPanel dashboardPanel4Header;
    private javax.swing.JButton jButton_AddMember;
    private javax.swing.JButton jButton_DeleteMember;
    private javax.swing.JButton jButton_EditMember;
    private javax.swing.JButton jButton_ManageAuthors;
    private javax.swing.JButton jButton_ManageGenre;
    private javax.swing.JButton jButton_MembersList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Menu;
    // End of variables declaration//GEN-END:variables
}
