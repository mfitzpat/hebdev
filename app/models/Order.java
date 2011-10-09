/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

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
    public int upc;
    public int itemQuantity;
    public double totalRetailAmount;
    public double totalSalesAmount;
    public double totalDiscountAmount;
    public double totalTaxAmount;
    public char orderLocation;
    public char weightFlag;
    public char taxFlag;
    public char foodStampFlag;
    public char adFlag;
    public Date orderDate = new Date();
}
