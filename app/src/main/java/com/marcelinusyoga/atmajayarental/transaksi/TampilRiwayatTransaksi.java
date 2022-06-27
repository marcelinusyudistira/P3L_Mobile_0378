package com.marcelinusyoga.atmajayarental.transaksi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.marcelinusyoga.atmajayarental.R;
import com.marcelinusyoga.atmajayarental.databinding.ActivityTampilRiwayatTransaksiBinding;

import java.util.ArrayList;

public class TampilRiwayatTransaksi extends AppCompatActivity {
    ArrayList<Transaksi> ListTransaksi;
    ActivityTampilRiwayatTransaksiBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_riwayat_transaksi);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_tampil_riwayat_transaksi);

        ListTransaksi = new RiwayatTransaksi().Transaksi;

        RecyclerViewAdapterTransaksi adapter = new RecyclerViewAdapterTransaksi(ListTransaksi);

        binding.rvTransaksi.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        binding.rvTransaksi.setAdapter(adapter);
    }
}