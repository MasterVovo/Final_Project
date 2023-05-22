package MyClasses;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Member {
    
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String gender;
    private byte[] picture;
    
    
    public Member () {}
    
    public Member(int _id, String _fname, String _lname, String _phoneNumber, String _email, String _gender, byte[] _picture) 
    {
        this.id = _id;
        this.firstName = _fname;
        this.lastName = _lname;
        this.phoneNumber = _phoneNumber;
        this.email = _email;
        this.gender = _gender;
        this.picture = _picture;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public byte[] getPicture() {
        return picture;
    }

    //Functions 
    
    
    //Insert a new members function
    public void addMember(String _fname, String _lname, String _phoneNumber, String _email, String _gender, byte[] _picture)
    {
     String insertQuery = "INSERT INTO `members`(`firstName`, `lastName`, `phoneNumber`, `email`, `gender`, `profile`) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _phoneNumber);
            ps.setString(4, _email);
            ps.setString(5, _gender);
            ps.setBytes(6, _picture);
            
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null , "Member Added", "Add member", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null , "Member Not Added", "Add member", 2);
            } 
           
            
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editMember(int _id, String _fname, String _lname, String _phoneNumber, String _email, String _gender, byte[] _picture)
    {
     String editQuery = "UPDATE `members` SET `firstName`=?, `lastName`=?, `phoneNumber`=?, `email`=?, `gender`=?, `profile=?` WHERE `id` = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _phoneNumber);
            ps.setString(4, _email);
            ps.setString(5, _gender);
            ps.setBytes(6, _picture);
            ps.setInt(7, _id);
            
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null , "Member edited", "Edit Member", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null , "Member Not Edited", "Edit Member", 2);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void removeMember(int _id)
    {
     String removeQuery = "DELETE FROM `members` WHERE `id` = ? ";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
 
            ps.setInt(1, _id);

            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null , "Member Deleted", "Member remove", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null , "Member Not Deleted", "Member remove", 2);
            } 
           
            
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
