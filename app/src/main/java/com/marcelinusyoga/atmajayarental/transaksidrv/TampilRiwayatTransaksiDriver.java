package com.marcelinusyoga.atmajayarental.transaksidrv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.marcelinusyoga.atmajayarental.R;
import com.marcelinusyoga.atmajayarental.databinding.ActivityTampilRiwayatTransaksiDriverBinding;

import java.util.ArrayList;

public class TampilRiwayatTransaksiDriver extends AppCompatActivity {
    ArrayList<TransaksiDriver> ListTransaksi;
    ActivityTampilRiwayatTransaksiDriverBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_riwayat_transaksi_driver);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_tampil_riwayat_transaksi_driver);

        ListTransaksi = new RiwayatTransaksiDriver().TransaksiDriver;

        RVAdapterTransaksiDriver adapter = new RVAdapterTransaksiDriver(ListTransaksi);

        binding.rvTransaksi.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        binding.rvTransaksi.setAdapter(adapter);
    }
}