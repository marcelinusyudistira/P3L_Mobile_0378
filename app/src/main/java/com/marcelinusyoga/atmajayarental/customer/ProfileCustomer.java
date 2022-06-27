package com.marcelinusyoga.atmajayarental.customer;

import java.util.ArrayList;

public class ProfileCustomer {
    public ArrayList<Customer> Customer;
    public ProfileCustomer(){
        Customer = new ArrayList();
        Customer.add(Krisna);
        Customer.add(Krisna2);
        Customer.add(Krisna3);
    }
    public static final Customer Krisna = new Customer("Oktavianus Krisna","Laki-Laki","2001-08-15"
            ,"Sejati Trukan", "087839825461");
    public static final Customer Krisna2 = new Customer("Oktavianus Krisna","Laki-Laki","2001-08-15"
            ,"Sejati Trukan", "087839825461");
    public static final Customer Krisna3 = new Customer("Oktavianus Krisna","Laki-Laki","2001-08-15"
            ,"Sejati Trukan", "087839825461");
}
