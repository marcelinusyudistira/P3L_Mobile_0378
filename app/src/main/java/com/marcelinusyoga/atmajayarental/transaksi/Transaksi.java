package com.marcelinusyoga.atmajayarental.transaksi;

public class Transaksi {
    public String id_transaksi;
    public String nama_mobil;
    public String tanggal_mulai;
    public String tanggal_selesai;
    public String tanggal_kembali;
    public String tanggal_transaksi;
    public String hari;
    public String metode_pembayaran;
    public String denda;
    public String diskon;
    public String total_biaya;
    public String status_transaksi;

    public Transaksi(String id_transaksi, String nama_mobil, String hari, String tanggal_mulai, String tanggal_selesai, String tanggal_kembali,
                     String tanggal_transaksi, String metode_pembayaran, String denda, String diskon, String total_biaya,
                     String status_transaksi) {
        this.id_transaksi = id_transaksi;
        this.nama_mobil = nama_mobil;
        this.hari = hari;
        this.tanggal_mulai = tanggal_mulai;
        this.tanggal_selesai = tanggal_selesai;
        this.tanggal_kembali = tanggal_kembali;
        this.tanggal_transaksi = tanggal_transaksi;
        this.metode_pembayaran = metode_pembayaran;
        this.denda = denda;
        this.diskon = diskon;
        this.total_biaya = total_biaya;
        this.status_transaksi = status_transaksi;
    }

    public String getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(String id_transaksi) {
        this.id_transaksi = id_transaksi;
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

    public String getMetode_pembayaran() {
        return metode_pembayaran;
    }

    public void setMetode_pembayaran(String metode_pembayaran) {
        this.metode_pembayaran = metode_pembayaran;
    }

    public String getDenda() {
        return denda;
    }

    public void setDenda(String denda) {
        this.denda = denda;
    }

    public String getDiskon() {
        return diskon;
    }

    public void setDiskon(String diskon) {
        this.diskon = diskon;
    }

    public String getTotal_biaya() {
        return total_biaya;
    }

    public void setTotal_biaya(String total_biaya) {
        this.total_biaya = total_biaya;
    }

    public String getStatus_transaksi() {
        return status_transaksi;
    }

    public void setStatus_transaksi(String status_transaksi) {
        this.status_transaksi = status_transaksi;
    }

    public String getNama_mobil() {
        return nama_mobil;
    }

    public void setNama_mobil(String nama_mobil) {
        this.nama_mobil = nama_mobil;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }
}
