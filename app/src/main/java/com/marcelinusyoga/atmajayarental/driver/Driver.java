package com.marcelinusyoga.atmajayarental.driver;

public class Driver {
    public String nama_driver;
    public String jenis_kelamin;
    public String tanggal_lahir;
    public String alamat;
    public String nomor_telepon;
    public String status;

    public Driver(String nama_driver, String jenis_kelamin, String tanggal_lahir, String alamat, String nomor_telepon, String status) {
        this.nama_driver = nama_driver;
        this.jenis_kelamin = jenis_kelamin;
        this.tanggal_lahir = tanggal_lahir;
        this.alamat = alamat;
        this.nomor_telepon = nomor_telepon;
        this.status = status;
    }

    public String getNama_driver() {
        return nama_driver;
    }

    public void setNama_driver(String nama_driver) {
        this.nama_driver = nama_driver;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
