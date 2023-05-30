/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClasses;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Issue_Book {
    
    private int book_id;
    private int member_id;
    private String status; // issue - returned - lost 
    private String issue_date;
    private String Return_date;
    private String note;
    
    Book book = new Book();
    
    // add a new issue 
    public void addIssue (int _book_id, int _member_id, String _status, String _issue_date, String _return_date, String _note)
    {
        String insertQuery = "INSERT INTO `issue_book`(`book_id`, `member_id`, `status`, `issue_date`, `return_date`, `note`) VALUES (?,?,?,?,?,?)";
         try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
            ps.setInt(1, _book_id);
            ps.setInt(2, _member_id);
            ps.setString(3, _status);
            ps.setString(4, _issue_date);
            ps.setString(5, _return_date);
            ps.setString(6, _note);
            
            
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null , "Issue Added", "Add issue", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null , "Issue Not Added", "Add issue", 2);
            } 
           
            
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    // check if the this book is available 
    // how to do that 
    // get the book quantity from the table books and compare it to 
    //the number of books issued in the table isse_book
    public boolean checkBookAvailability(int _book_id)
    {
        boolean availability = false;
        try {
            // first get the book quantity
            Book selectedBook = book.getBookById(_book_id);
            int quantity = selectedBook.getQuantity();
            
            //get the number of books issued (the same book)
            int issued_book_count  = countData(_book_id);
            
            if (quantity > issued_book_count)
            {
                availability = true;
            }
            else
            {
                availability = false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return availability;
        
    }
    
    //create a function to count the member of issued book 
    public int countData(int _book_id) 
    {
        int total = 0;
        ResultSet rs;
        PreparedStatement ps;
        
        try {
            ps = DB.getConnection().prepareStatement("SELECT COUNT(*) as total FROM `issue_book` WHERE book_id = ? and `status` = 'issued'");
            
            ps.setInt(1, _book_id);
            
            rs = ps.executeQuery();
            
     
                 
        if(rs.next()) 
        {
            total = rs.getInt("total");
        }
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
       
        }
    
}
