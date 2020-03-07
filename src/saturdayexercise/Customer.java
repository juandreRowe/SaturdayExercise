/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saturdayexercise;

import javax.swing.JOptionPane;

/**
 *
 * @author juandre
 */
public class Customer {
    
    //Fields for customer class
    private String customerName;
    private String customerPhoneNumber;
    private double productPrice;
    private int numberOfMonths;
    protected double repaymentAmount;
    
    public String getCustomerName(){
        return(customerName);
    }
    
    public void setCustomerName(){
        //Sets customer name with JOptionPane
        this.customerName = JOptionPane.showInputDialog(null, "Enter customer name", "Customer name", 3);
    }
    
    public String getCustomerPhoneNumber(){
        return(customerPhoneNumber);
    }
    
    public void setCustomerPhoneNumber(){
        this.customerPhoneNumber = JOptionPane.showInputDialog(null, "Enter phone number", "Phone number", 3);
    }
    
    public double getProductPrice(){
        return(productPrice);
    }
    
    public void setProductPrice(){
        this.productPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter product price", "Product price", 3));
    }
    
    public int getNumberOfMonths(){
        return(numberOfMonths);
    }
    
    public void setNumberOfMonths(){
        this.numberOfMonths = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of months", "Number of months", 3));
        //Check if months is bigger than 12
        if(this.numberOfMonths > 12){
            JOptionPane.showMessageDialog(null, this.numberOfMonths + " is an invalid amount of months.");
            //Recursive method
            setNumberOfMonths();
        }
    }
    
    public double calculate_repayment(){
        repaymentAmount = getProductPrice() / getNumberOfMonths();
        return(repaymentAmount);
    }
}
