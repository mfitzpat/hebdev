/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import javax.persistence.Entity;
import play.db.jpa.Model;
import java.util.Date;

/**
 *The User table contains the login credentials for users of your web application.
 * The email address is used as their login ID.
 * 
 * @author William
 */

@Entity
public class User extends Model
{
    public int userID;
    public String emailAddress;
    public String password;
    public String firstName;
    public String lastName;
    public Date lastLogin;
    
    public User(int userID, String emailAddress, String password, 
    String firstName, String lastName)
    {
        this.userID = userID;
        this.emailAddress = emailAddress;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public void updateLastLogin(Date lastLogin)
    {
        this.lastLogin = lastLogin;
    }
}
