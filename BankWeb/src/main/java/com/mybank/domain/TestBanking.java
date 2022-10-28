package com.mybank.domain;

public class TestBanking {

    public static void main(String[] args) {
        
        
        Bank.addCustomer(1,"Jane", "Simms");
        Bank.addCustomer(2,"Owen", "Bryant");
        Bank.addCustomer(3,"Tim", "Soley");
        Bank.addCustomer(4,"Maria", "Soley");
        
        for ( int i = 0; i < Bank.getNumOfCustomers(); i++ ) {
            Customer customer = Bank.getCustomer(i);
            
            System.out.println("Customer [" + (i+1) + "] is "
                    + customer.getLastName()
                    + ", " + customer.getFirstName());
        }
    }
    
}