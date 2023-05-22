package MyClasses;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;

public class Functions {
    public void displayImage(int width, int height, String imagePath, JLabel label){ //Displays the logo in the dashboard
        //Gets the image
        ImageIcon imgIco = new ImageIcon(getClass().getResource(imagePath));
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
    
}
