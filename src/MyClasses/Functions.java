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
        table.setSelectionBackground(new Color(248, 194, 145));
        table.setSelectionForeground(new Color(243,236,236));
        table.setFont(new Font("Tahoma", Font.PLAIN, 15));
        table.setRowHeight(30);
        table.setShowGrid(false);
        table.setBackground(new Color(243,236,236));
        table.setShowHorizontalLines(true);
        table.setGridColor(new Color(243,236,236)); // choose other color
    }
    
    
    // create a function to customize the jlabel
    public void customTableHeader(JTable table) 
    {
        table.getTableHeader().setBackground(new Color(164,106,106));//Need to fix it 
        table.getTableHeader().setForeground(Color.white);
        table.getTableHeader().setFont (new Font("Tahoma",Font.BOLD, 20));
        table.getTableHeader().setOpaque(false);
    }
    
    // create a function to select image
    // the function will return the image path
    public String selectPicture ()
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

    public void customTableHeader(JTable jTable_Members, Color color, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void customTable(JTable jTable_Members, Color color, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
