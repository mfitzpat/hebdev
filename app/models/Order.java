/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import play.db.jpa.Model;
import java.util.Date;
import javax.persistence.Entity;

/**
 * The ORDER_HEADER table contains the summary information for each shopping
 * trip or order; there is only one record for each order. Orders are
 * associated with customers through the USER_CUSTOMER table
 * 
 * @author William
 */

@Entity
public class Order extends Model
{
    public int orderID;
    public int storeID;
    public int itemCount;
    public double totalRetailAmount;
    public double totalSalesAmount;
    public double totalDiscountAmount;
    public double totalTaxAmount;
    public char orderLocation;
    public char weightFlag;
    public char taxFlag;
    public char foodStampFlag;
    public char adFlag;
    public ArrayList<Integer> itemQuantity;
    public ArrayList<Integer> upc;
    public Date orderDate = new Date();
    
    public Order(int OrderID,int storeID, int itemCount, int upc, int itemQuantity,
    double totalRetailAmount, double totalSalesAmount, double totalDiscountAmount,
    double totalTaxAmount, char orderLocation, char weightFlag, char foodStampFlag,
    char adFlag, Date orderDate)
    {
        
        
    }
    
    //Returns true if ID > 0
    private boolean validID(int ID)
    {
        boolean check = false;
        
        if (ID > 0) 
            check = true;
        else
            return check;
        
        return check;
    }
    
    private boolean validAmount(double amount)
    {
        boolean check = false;
        
        if (amount > 0)
            check = true;
        else
            return check;
        
        return check;
    }
}
