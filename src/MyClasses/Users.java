package MyClasses;

import java.sql.PreparedStatement;
import java.sql.SQLException;
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
}
