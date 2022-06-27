package com.marcelinusyoga.atmajayarental.mobil;

import com.marcelinusyoga.atmajayarental.promo.Promo;

import java.util.ArrayList;

public class DaftarMobil {
    public ArrayList<Mobil> Mobil;
    public DaftarMobil(){
        Mobil = new ArrayList();
        Mobil.add(MOB1);
        Mobil.add(MOB2);
        Mobil.add(MOB3);
        Mobil.add(MOB4);
        Mobil.add(MOB5);
        Mobil.add(MOB6);
    }

    public static final Mobil MOB1 = new Mobil("Toyota New Corolla","Sedan","AT","Pertamax"
            ,"AC, Multimedia, Air Bag","Rp. 400000,00","https://static.carmudi.co.id/LDox2FqaNXzUjb3sOtHeq-ByxTU=/900x405/https://trenotomotif.com/ncs/images/TOYOTA/All%20New%20Corolla%20Altis%202019/Toyota_All_New_Corolla_Altis.jpg");
    public static final Mobil MOB2 = new Mobil("Toyota Rush","SUV","AT","Pertamax"
            ,"AC","Rp. 1000000,00","https://www.toyota.astra.co.id/sites/default/files/2021-08/1-white.png");
    public static final Mobil MOB3 = new Mobil("Toyota New Avanza","MPV","CVT","Pertalite"
            ,"AC, Safety Bag","Rp. 300000,00","https://4.bp.blogspot.com/-jGNNDFDVSgU/Vv-9drfFBYI/AAAAAAAAAPE/9wR_lYYzaWAHaL2P-Z17O4AvuaDvy-kfA/s640/Warna%2BGrand%2BNew%2BAvanza-Silver%2BMetallic.png");
    public static final Mobil MOB4 = new Mobil("Honda Brio","City Car","MT","Pertalite"
            ,"AC, Honda Sensing","Rp. 250000,00","https://imgcdn.oto.com/medium/gallery/color/14/1995/honda-brio-color-867397.jpg");
    public static final Mobil MOB5 = new Mobil("Nissan Serena","Family Car","CVT","Pertalite"
            ,"AC, Safety Bag","Rp. 500000,00","https://www.semisena.com/wp-content/uploads/2020/02/Nissan-Serena-F.jpg");
    public static final Mobil MOB6 = new Mobil("Kijang Inova","Kijang Inova","MT","Pertamax"
            ,"AC","Rp. 850000,00","https://thumb.viva.co.id/media/frontend/thumbs3/2015/11/24/350027_kijang-innova-_1265_711.jpg");

}
