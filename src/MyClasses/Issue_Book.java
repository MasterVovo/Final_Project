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
import java.util.ArrayList;
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

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setIssue_date(String issue_date) {
        this.issue_date = issue_date;
    }

    public void setReturn_date(String Return_date) {
        this.Return_date = Return_date;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getBook_id() {
        return book_id;
    }

    public int getMember_id() {
        return member_id;
    }

    public String getStatus() {
        return status;
    }

    public String getIssue_date() {
        return issue_date;
    }

    public String getReturn_date() {
        return Return_date;
    }

    public String getNote() {
        return note;
    }

    public Book getBook() {
        return book;
    }

    public Issue_Book() {
    }

    public Issue_Book(int book_id, int member_id, String status, String issue_date, String Return_date, String note) {
        this.book_id = book_id;
        this.member_id = member_id;
        this.status = status;
        this.issue_date = issue_date;
        this.Return_date = Return_date;
        this.note = note;
    }
    
    Functions func = new Functions();
    
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
     
    // update issue 
    public void updateIssue (int _book_id, int _member_id, String _status, String _issue_date,String _return_date, String _note)
    {
        String updateQuery = "UPDATE `issue_book` SET `status`= ?,`return_date`= ?,`note`=? WHERE `book_id`=? AND`member_id`=? AND`issue_date` = ?";
         try {
            PreparedStatement ps = DB.getConnection().prepareStatement(updateQuery);
            
            
            ps.setString(1, _status);
            ps.setString(2, _return_date);
            ps.setString(3, _note);
             ps.setInt(4, _book_id);
            ps.setInt(5, _member_id);
            ps.setString(6, _issue_date);
            
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null , "Status Updated ", "Book issue", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null , "Status Not Added", "Book  issue", 2);
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
    
    //fucntion to populate the arraylist with issued/returned/lost books
    public ArrayList<Issue_Book> issuedBookList(String status)
    {
        //Create a list
        ArrayList<Issue_Book> iList = new ArrayList<>();
        String query;
        
        if(status.equals("")){ //If  the status is empty, show all data
            query = "SELECT * FROM `issue_book`";
        } else { //Show data depending on the status
            query = "SELECT * FROM `issue_book` WHERE `status` = '" + status + "'";
        }
        
        try {
            ResultSet rs = func.getData(query);
            
            Issue_Book issbook; 
            
            while (rs.next())
            {
                
                issbook = new Issue_Book(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
                                rs.getString(5), rs.getString(6));
                iList.add(issbook);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return iList;
    }
}
