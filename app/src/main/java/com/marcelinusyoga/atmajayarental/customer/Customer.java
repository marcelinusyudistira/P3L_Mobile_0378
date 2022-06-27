package com.marcelinusyoga.atmajayarental.customer;

public class Customer {
    public String nama_customer;
    public String jenis_kelamin;
    public String tanggal_lahir;
    public String alamat;
    public String nomor_telepon;

    public Customer(String nama_customer, String jenis_kelamin, String tanggal_lahir, String alamat, String nomor_telepon) {
        this.nama_customer = nama_customer;
        this.jenis_kelamin = jenis_kelamin;
        this.tanggal_lahir = tanggal_lahir;
        this.alamat = alamat;
        this.nomor_telepon = nomor_telepon;
    }

    public String getNama_customer() {
        return nama_customer;
    }

    public void setNama_customer(String nama_customer) {
        this.nama_customer = nama_customer;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomor_telepon() {
        return nomor_telepon;
    }

    public void setNomor_telepon(String nomor_telepon) {
        this.nomor_telepon = nomor_telepon;
    }
}
