package com.marcelinusyoga.atmajayarental.promo;

import com.marcelinusyoga.atmajayarental.customer.Customer;

import java.util.ArrayList;

public class DaftarPromo {
    public ArrayList<Promo> Promo;
    public DaftarPromo(){
        Promo = new ArrayList();
        Promo.add(MHS);
        Promo.add(BDAY);
        Promo.add(WKN);
        Promo.add(MDK);
    }
    public static final Promo MHS = new Promo("1","MHS","Mahasiswa"
            ,"Promo bagi customer yang berusia mulai dari 17-22 tahun\n" +
            "dan memiliki kartu identitas pelajar/mahasiswa, mendapat \n" +
            "diskon sebesar 20%", "20%");
    public static final Promo BDAY = new Promo("2","BDAY","Birthday"
            ,"Promo bagi customer yang sedang berulang tahun, mendapat \n" +
            "diskon sebesar 15%.", "15%");
    public static final Promo WKN = new Promo("3","WKN","Weekend"
            ,"Promo bagi customer yang berusia mulai dari 17-22 tahun\n" +
            "dan memiliki kartu identitas pelajar/mahasiswa, mendapat \n" +
            "diskon sebesar 20%", "10%");
    public static final Promo MDK = new Promo("4","MDK","Mudik"
            ,"Promo berlaku selama masa libur Lebaran dan Nataru, \n" +
            "mendapat diskon sebesar 25%.", "25%");
}
