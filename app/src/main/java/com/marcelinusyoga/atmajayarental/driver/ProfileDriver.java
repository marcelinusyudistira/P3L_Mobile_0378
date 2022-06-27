package com.marcelinusyoga.atmajayarental.driver;

import java.util.ArrayList;

public class ProfileDriver {
    public ArrayList<Driver> Driver;
    public ProfileDriver(){
        Driver = new ArrayList();
        Driver.add(Agus);
        Driver.add(Agus2);
    }
    public static final Driver Agus = new Driver("Agus","Laki-Laki","1990-04-21"
            ,"Tempel, Sleman", "087741210407","Available");
    public static final Driver Agus2 = new Driver("Agus","Laki-Laki","1990-04-21"
            ,"Tempel, Sleman", "087741210407","Available");
}
