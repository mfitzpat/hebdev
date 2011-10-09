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
public class UserTest extends UnitTest{
    
    @Test
    public void instantiationTest(){
        new User(5, "mfitzpat", "password", "Matt", "Fitz");
    }
    
    @Test
    public void jpaTest(){
        User testUser = new User(5, "mfitzpat", "password", "Matt", "Fitz");
        testUser.save();
        assertNotNull(User.findById(testUser.id));
    }
    
    @Test
    public void newUser_spawnsNewCustomer(){
        User savedUser = new User(5, "mfitzpat", "password", "Matt", "Fitz");
        savedUser.save();
        System.out.println("CustomerId Stored is this: " + savedUser.customerID.get(0));
        User retrievedUser = User.findById(savedUser.id);
        assertEquals(savedUser.customerID.get(0), retrievedUser.customerID.get(0));
    }
    
}
