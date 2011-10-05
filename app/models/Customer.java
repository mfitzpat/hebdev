/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import play.db.jpa.Model;

/**
 *
 * @author William
 */
public class Customer extends Model
{
    public String firstName;
    public String lastName;
    
    public long customerID;
    
    public Customer(String firstName, String lastName, long customerID)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerID = customerID;
    }
}
