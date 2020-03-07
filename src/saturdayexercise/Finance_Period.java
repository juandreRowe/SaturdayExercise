/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saturdayexercise;

/**
 *
 * @author juandre
 */
public class Finance_Period extends Customer{
    
    public double PayInterest(){
        if(getNumberOfMonths() > 3){
            return(0.25);
        }
        return(0);
    }
    
    @Override
    public double calculate_repayment(){
        repaymentAmount = getProductPrice() / getNumberOfMonths();
        //Add interest
        repaymentAmount *= (1 + PayInterest());
        return(repaymentAmount);
    }
    
    @Override
    public String toString(){
        return("Customer name: " + getCustomerName() 
                + "\nCustomer Phone number: " + getCustomerPhoneNumber()
                + "\nProduct price: R" + getProductPrice()
                + "\nNumber of months: " + getNumberOfMonths()
                + "\nRepayment: R" + Math.round(calculate_repayment() * 100.0) / 100.0
                + "\nTotal due: R" + Math.round(calculate_repayment() * getNumberOfMonths() * 100.0) / 100.0);
    }
    
}
