package MyClasses;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author johna
 */
public class Users {
    private int ID;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String userType;


    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    
    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getUserType() {
        return userType;
    }
    
    public Users() {
    }

    public Users(int _ID, String _firstName, String _lastName, String _userName, String _password, String _userType) {
        this.ID = _ID;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.userName = _userName;
        this.password = _password;
        this.userType = _userType;
    }
    
    public void addUser (String _fname, String _lname, String _username, String _password, String _userType)
    {
     String insertQuery = "INSERT INTO `users_table`(`firstName`, `lastName`, `userName`, `password`, `userType`) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _username);
            ps.setString(4, _password);
            ps.setString(5, _userType);
            
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null , "User Added", "Add user", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null , "User Not Added", "Add user", 2);
            } 
           
            
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
    // create a function to check if the username is already exists
    public boolean checkUsernameExists(int _id, String _username) 
    {
        
         MyClasses.Functions func = new Functions();
        
         ResultSet rs = func.getData("SELECT * FROM `users_table` WHERE `userName` = '"+ _username +"' AND `id` <> " + _id);
         boolean exists = false;
            
            try {
            
            if (rs.next())
            {
                exists = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);;
        }
        
            return exists;
    }
     

    
     //Edit user by id function

    /**
     *
     * @param _id
     * @param _fname
     * @param _lname
     * @param _username
     * @param _password
     * @param _userType
     */
    public void editUsers(int _id, String _fname, String _lname, String _username, String _password, String _userType)
    {
     String editQuery = "UPDATE `users_table` SET `firstName`=?,`lastName`=?,`userName`=?,`password`=?,`userType`=? WHERE `id`=?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _username);
            ps.setString(4, _password);
            ps.setString(5, _userType);
            ps.setInt(6, _id);
            
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null , "User Edited", "edit user", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null , "User Not Edited", "edit user", 2);
            } 
           
            
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void removeUser(int _id)
    {
        String removeQuery = "DELETE FROM `users_table` WHERE `id` = ? ";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
 
            ps.setInt(1, _id);

            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null , "User Deleted", "remove", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null , "User Not Deleted", "remove", 2);
            } 
           
            
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //fucntion to populate the arraylist with user
    public ArrayList<Users> usersList()
    {
        ArrayList<Users> uList = new ArrayList<>();
        
        
        MyClasses.Functions func = new Functions();
        
        try {
            
            ResultSet rs = func.getData("SELECT * FROM `users_table`");
            
            Users user; 
            
            while (rs.next())
            {
                // `id`, `firstName`, `lastName`, `userName`, `password`, `userType`
                user = new Users (rs.getInt("Id"), rs.getString("firstname"), rs.getString("lastname"), rs.getString("userName"), rs.getString("password"), rs.getString("userType"));
                uList.add(user);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return uList;
    }

    public void editUser(int id, String fname, String lname, String username, String password_1, String userType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
