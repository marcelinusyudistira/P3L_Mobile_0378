package com.marcelinusyoga.atmajayarental.transaksidrv;

public class TransaksiDriver {
    public String id_transaksi;
    public String nama_mobil;
    public String tanggal_mulai;
    public String tanggal_selesai;
    public String tanggal_kembali;
    public String tanggal_transaksi;
    public String hari;
    public String status_transaksi;

    public TransaksiDriver(String id_transaksi, String nama_mobil, String tanggal_mulai, String tanggal_selesai,
                           String tanggal_kembali, String tanggal_transaksi, String hari, String status_transaksi) {
        this.id_transaksi = id_transaksi;
        this.nama_mobil = nama_mobil;
        this.tanggal_mulai = tanggal_mulai;
        this.tanggal_selesai = tanggal_selesai;
        this.tanggal_kembali = tanggal_kembali;
        this.tanggal_transaksi = tanggal_transaksi;
        this.hari = hari;
        this.status_transaksi = status_transaksi;
    }

    public String getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(String id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public String getNama_mobil() {
        return nama_mobil;
    }

    public void setNama_mobil(String nama_mobil) {
        this.nama_mobil = nama_mobil;
    }

    public String getTanggal_mulai() {
        return tanggal_mulai;
    }

    public void setTanggal_mulai(String tanggal_mulai) {
        this.tanggal_mulai = tanggal_mulai;
    }

    public String getTanggal_selesai() {
        return tanggal_selesai;
    }

    public void setTanggal_selesai(String tanggal_selesai) {
        this.tanggal_selesai = tanggal_selesai;
    }

    public String getTanggal_kembali() {
        return tanggal_kembali;
    }

    public void setTanggal_kembali(String tanggal_kembali) {
        this.tanggal_kembali = tanggal_kembali;
    }

    public String getTanggal_transaksi() {
        return tanggal_transaksi;
    }

    public void setTanggal_transaksi(String tanggal_transaksi) {
        this.tanggal_transaksi = tanggal_transaksi;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getStatus_transaksi() {
        return status_transaksi;
    }

    public void setStatus_transaksi(String status_transaksi) {
        this.status_transaksi = status_transaksi;
    }
}
