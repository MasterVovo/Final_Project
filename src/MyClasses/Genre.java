package MyClasses;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
/**
 *
 * @author User
 */
public class Genre {
    private int id;
    private String name;

   
    // Constructor
    public Genre (){};
    
    public Genre (int _id, String _name)
    {
    this.id= _id;
    this.name= _name;
    }
    
    
    // Getters and Setters
     public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int _id) {
        this.id = _id;
    }

    public void setName(String _name) {
        this.name = _name;
    }
    
    //Functions 
    
    
    //Insert a new genre function
    public void addGenre (String _name)
    {
     String insertQuery = "INSERT INTO `book_genres`(`name`) VALUES (?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
            ps.setString(1, _name);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null , "Genre Added", "Add genre", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null , "Genre Not Added", "add genre", 2);
            } 
           
            
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
     //Edit genre by id function
    public void EditGenre (int _id, String _name)
    {
     String editQuery = "UPDATE `book_genres` SET `name` = ? WHERE `id`= ? ";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            
            ps.setString(1,_name);
            ps.setInt(2, _id);
            
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null , "Genre Edit", "edit genre", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null , "Genre Not Edited", "edit genre", 2);
            } 
           
            
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
    
     //Remove genre by id 
    public void removeGenre (int _id)
    {
     String removeQuery = "DELETE FROM `book_genres` WHERE `id` = ? ";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
 
            ps.setInt(1, _id);

            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null , "Genre Deleted", "remove", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null , "Genre Not Deleted", "remove", 2);
            } 
           
            
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
    //fucntion to populate the arraylist with genres 
    public ArrayList<Genre> genreList()
    {
        ArrayList<Genre> gList = new ArrayList<>();
        
         MyClasses.Functions func = new Functions();
        
        try {
           
            ResultSet rs = func.getData("SELECT * FROM `book_genres`");
            
            Genre genre; 
            
            while (rs.next())
            {
                genre = new Genre (rs.getInt("Id"), rs.getString("name"));
                gList.add(genre);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return gList;
    }
    
}
