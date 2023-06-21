package MyClasses;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.Statement;
import javax.swing.table.DefaultTableCellRenderer;
import java.io.FileWriter;
import java.util.UUID;
import java.sql.Connection;

public class Functions {
    public void displayImage(int width, int height, byte[] imagebyte, String imagePath, JLabel label){ //Displays the logo in the dashboard
        //Gets the image
        ImageIcon imgIco;
        
        if (imagebyte != null) {
            imgIco = new ImageIcon(imagebyte);
        } else {
            try {
                imgIco = new ImageIcon(getClass().getResource(imagePath));
            } catch (Exception e) {
                imgIco = new ImageIcon(imagePath);
            }
            
        }
        
        //Scales the image
        Image image = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        //Sets the image to the container
        label.setIcon(new ImageIcon(image));
    }
    
    
    // create a function to customize the jlabel
    public void customTable(JTable table) 
    {
        table.setSelectionBackground(new Color(72, 197, 243));
        table.setSelectionForeground(new Color(6, 4, 6));
        table.setFont(new Font("Tahoma", Font.PLAIN, 15));
        table.setRowHeight(30);
        table.setShowGrid(false);
        table.setBackground(new Color(243,236,236));
        table.setForeground(new Color(6, 4, 6));
        table.setShowHorizontalLines(true);
        table.setGridColor(new Color(179,173,173)); // choose other color
    }
    
    
    // create a function to customize the jlabel
    public void customTableHeader(JTable table) 
    {
        ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        table.getTableHeader().setBackground(new Color(164,106,106));
        table.getTableHeader().setForeground(new Color(243,236,236));
        table.getTableHeader().setFont (new Font("Tahoma",Font.BOLD, 20));
        table.getTableHeader().setOpaque(false);
    }
    
    // create a function to select image
    // the function will return the image path
    public String selectPicture()
    {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Profile Picture");

        fileChooser.setCurrentDirectory(new File("C://Users"));

        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Image", ".png", ".jpg", ".jpeg");
        fileChooser.addChoosableFileFilter(extensionFilter);

        int filestate = fileChooser.showSaveDialog(null);
        
        String path = "";
    
        if (filestate == JFileChooser.APPROVE_OPTION){
            path = fileChooser.getSelectedFile().getAbsolutePath();
        }
        
        return path;
    }
    
    // create a function to return a resultSet
    // we will use this function to reduce the code when populating the arraylist
    public ResultSet getData(String query) 
    {
        PreparedStatement ps;
        ResultSet rs = null;
        
        try {
            ps = DB.getConnection().prepareStatement(query);
            rs= ps.executeQuery();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }     
    
    //create a function to count the member of data 
    public int countData(String tableName) {
        int total = 0;
        ResultSet rs;
        Statement st;
        
        try {
            st = DB.getConnection().createStatement();
             rs = st.executeQuery("SELECT COUNT(*) as total FROM `"+tableName+"`");
        if(rs.next()) {
            total = rs.getInt("total");
        }
        } catch (SQLException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
       
    }
    
    public void saveSession(String username, String password){
        UUID sessionId = UUID.randomUUID();
        try (FileWriter fileWriter = new FileWriter("session.txt")){
            fileWriter.write(username + "," + password + "," +sessionId.toString());
            updateSessionID(username, sessionId);
        } catch (Exception e) {
        }
    }
    
    public void updateSessionID(String username, UUID sessionId){
        Connection con = DB.getConnection();
        
        if (con == null){
            System.out.println("Failed to connect to the database");
        }
        
        String query = "UPDATE `users_table` SET `session_id` = ? WHERE `userName` = ?";
        try{
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, sessionId.toString());
            ps.setString(2, username);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
    }
    
    public boolean checkSessionID(String username, UUID sessionId){
        Connection con = DB.getConnection();
        
        if (con == null){
            System.out.println("Failed to connect to the database");
        }
        
        String query = "SELECT `session_id` FROM users_table WHERE `userName` = ?";
        
        try(PreparedStatement ps = con.prepareStatement(query)){
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                String storedSessionId = rs.getString("session_id");
                return sessionId.toString().equals(storedSessionId);
            }
        } catch (SQLException e){
        }
        
        return false;
    }
    
}

        
        