/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.Entity;
import play.db.jpa.Model;
import java.util.Date;

/**
 *The Customer has entries for the people who actually make the shopping trips.
 * Customers will be associated to individual shopping trips or orders.
 * 
 * @author William
 */

@Entity
public class Customer extends Model
{
    public int customerID;
    public int orderCount;
    public String firstName;
    public String lastName;
    public Date birthday;
    public Date lastPurchaseDate;
    public char gender;
    public int userID;
    
    
    public Customer(int customerID, String firstName, String lastName, 
    Date birthday, char gender)
    {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
        this.orderCount = 0;
    }
    
    public void setLastPurchaseDate(Date lastPurchaseDate)
    {
        this.lastPurchaseDate = lastPurchaseDate;
    }
    
    public void setOrderCount(int orderCount)
    {
        this.orderCount = orderCount;
    }
    
    public void updateOrderCount()
    {
        orderCount++;
    }
}
