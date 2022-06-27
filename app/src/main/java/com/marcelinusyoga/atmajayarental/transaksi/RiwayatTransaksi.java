package com.marcelinusyoga.atmajayarental.transaksi;

import java.util.ArrayList;

public class RiwayatTransaksi {
    public ArrayList<Transaksi> Transaksi;
    public RiwayatTransaksi(){
        Transaksi = new ArrayList();
        Transaksi.add(TRN1);
        Transaksi.add(TRN2);
    }
    public static final Transaksi TRN1 = new Transaksi("TRN22051300-001","Toyota New Avanza","2 Hari","2022-05-01 20:00:00"
            ,"2022-05-03 22:00:00","2022-05-04 01:05:00", "2022-05-13 00:03:57","Transfer"
            , "Rp. 300000,00", "Rp. 60000.00", "Rp. 840.000,00", "Selesai");
    public static final Transaksi TRN2 = new Transaksi("TRN22052401-002", "Nissan Serena","3 Hari","2022-06-10 13:00:00"
            ,"2022-06-13 13:04:00","2022-06-16 14:05:00", "2022-05-24 11:58:50","Transfer"
            , "-", "Rp. 420000,00", "Rp. 2680000,00", "Selesai");
}
