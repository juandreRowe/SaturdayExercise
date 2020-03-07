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
public class Customer_Finance {
    
    public static void main(String[] args){
        Finance_Period firstObject = new Finance_Period();
        
        firstObject.setCustomerName();
        firstObject.setCustomerPhoneNumber();
        firstObject.setNumberOfMonths();
        firstObject.setProductPrice();
        
        JOptionPane.showMessageDialog(null, firstObject.toString());
        
        Finance_Period secondObject = new Finance_Period();
        
        secondObject.setCustomerName();
        secondObject.setCustomerPhoneNumber();
        secondObject.setNumberOfMonths();
        secondObject.setProductPrice();
        
        JOptionPane.showMessageDialog(null, secondObject.toString());
    }
    
}
