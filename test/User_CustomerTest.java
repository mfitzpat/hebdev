import org.junit.*;
import play.test.*;
import play.mvc.*;
import play.mvc.Http.*;
import models.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mfitzpat
 */
public class User_CustomerTest extends UnitTest{
    
    @Test
    public void addNewCustomerToUser_succeeds(){
        User testUser = new User(5, "mfitzpat", "password", "Matt", "Fitz");
        User_Customer.addNewCustomertoUser(testUser, new Customer(42, "Will", "Shep", testUser.userID));
    }
    
    @Test
    public void addNewCustomerToUser_actuallyAddsNewCustomer(){
        User testUser = new User(5, "mfitzpat", "password", "Matt", "Fitz");
        User_Customer.addNewCustomertoUser(testUser, new Customer(42, "Will", "Shep", testUser.userID));
        assertEquals(new Integer(42), testUser.customerID.get(1));
    }
    
    
   
    
}
