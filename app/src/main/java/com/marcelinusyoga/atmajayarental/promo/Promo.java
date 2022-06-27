package com.marcelinusyoga.atmajayarental.promo;

public class Promo {
    public String id_promo;
    public String kode_promo;
    public String jenis_promo;
    public String keterangan;
    public String potongan_harga;

    public Promo(String id_promo, String kode_promo, String jenis_promo, String keterangan, String potongan_harga) {
        this.id_promo = id_promo;
        this.kode_promo = kode_promo;
        this.jenis_promo = jenis_promo;
        this.keterangan = keterangan;
        this.potongan_harga = potongan_harga;
    }

    public String getId_promo() {
        return id_promo;
    }

    public void setId_promo(String id_promo) {
        this.id_promo = id_promo;
    }

    public String getKode_promo() {
        return kode_promo;
    }

    public void setKode_promo(String kode_promo) {
        this.kode_promo = kode_promo;
    }

    public String getJenis_promo() {
        return jenis_promo;
    }

    public void setJenis_promo(String jenis_promo) {
        this.jenis_promo = jenis_promo;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getPotongan_harga() {
        return potongan_harga;
    }

    public void setPotongan_harga(String potongan_harga) {
        this.potongan_harga = potongan_harga;
    }
}
