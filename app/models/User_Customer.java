/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import javax.persistence.Entity;
import play.db.jpa.Model;


/**
 * The USER_CUSTOMER table associates users with customers. It is possible
 * for a single user to have more than one customer. For example, a husband
 * and wife can be associated with a single user account.
 * 
 * @author William
 */

@Entity
public class User_Customer extends Model
{
    public static int userID;
    public static ArrayList<Integer> customerID = new ArrayList();
    
   public static void addNewCustomertoUser(User user, Customer customer)
   {
       user.customerID.add(customer.customerID);
       customer.userID = userID;
   }
}
