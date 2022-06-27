package com.marcelinusyoga.atmajayarental.transaksidrv;

import com.marcelinusyoga.atmajayarental.transaksi.Transaksi;

import java.util.ArrayList;

public class RiwayatTransaksiDriver {
    public ArrayList<TransaksiDriver> TransaksiDriver;
    public RiwayatTransaksiDriver(){
        TransaksiDriver = new ArrayList();
        TransaksiDriver.add(TRN1);
        TransaksiDriver.add(TRN2);
    }

    public static final TransaksiDriver TRN1 = new TransaksiDriver("TRN22052601-003","Honda Brio","2022-07-13 01:00:05","2022-07-15 01:00:10"
            ,"2022-07-15 02:00:00","2022-05-26 09:08:09", "2 Hari", "Selesai");
    public static final TransaksiDriver TRN2 = new TransaksiDriver("TRN22052801-005","Kijang Inova","2022-07-20 14:00:05","2022-07-23 14:10:00"
            ,"2022-07-23 16:00:10","2022-05-28 02:10:00", "3 Hari", "Selesai");
}
