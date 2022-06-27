package com.marcelinusyoga.atmajayarental.mobil;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

public class Mobil {
    public String nama_mobil;
    public String jenis_mobil;
    public String transmisi;
    public String bahan_bakar;
    public String fasilitas;
    public String harga;
    public String url;

    public Mobil(String nama_mobil, String jenis_mobil, String transmisi, String bahan_bakar, String fasilitas, String harga, String url) {
        this.nama_mobil = nama_mobil;
        this.jenis_mobil = jenis_mobil;
        this.transmisi = transmisi;
        this.bahan_bakar = bahan_bakar;
        this.fasilitas = fasilitas;
        this.harga = harga;
        this.url = url;
    }

    public String getNama_mobil() {
        return nama_mobil;
    }

    public void setNama_mobil(String nama_mobil) {
        this.nama_mobil = nama_mobil;
    }

    public String getJenis_mobil() {
        return jenis_mobil;
    }

    public void setJenis_mobil(String jenis_mobil) {
        this.jenis_mobil = jenis_mobil;
    }

    public String getTransmisi() {
        return transmisi;
    }

    public void setTransmisi(String transmisi) {
        this.transmisi = transmisi;
    }

    public String getBahan_bakar() {
        return bahan_bakar;
    }

    public void setBahan_bakar(String bahan_bakar) {
        this.bahan_bakar = bahan_bakar;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @BindingAdapter("android:loadImage")
    public static void loadImage(ImageView imageView, String url) {
        Glide.with(imageView)
                .load(url)
                .into(imageView);
    }
}
