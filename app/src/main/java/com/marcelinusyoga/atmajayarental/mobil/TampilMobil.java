package com.marcelinusyoga.atmajayarental.mobil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.marcelinusyoga.atmajayarental.R;
import com.marcelinusyoga.atmajayarental.databinding.ActivityRvadapterMobilBinding;
import com.marcelinusyoga.atmajayarental.databinding.ActivityTampilMobilBinding;
import com.marcelinusyoga.atmajayarental.databinding.ActivityTampilRiwayatTransaksiBinding;
import com.marcelinusyoga.atmajayarental.transaksi.RecyclerViewAdapterTransaksi;
import com.marcelinusyoga.atmajayarental.transaksi.RiwayatTransaksi;
import com.marcelinusyoga.atmajayarental.transaksi.Transaksi;

import java.util.ArrayList;

public class TampilMobil extends AppCompatActivity {
    ArrayList<Mobil> ListMobil;
    ActivityTampilMobilBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_mobil);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_tampil_mobil);

        ListMobil = new DaftarMobil().Mobil;

        RVAdapterMobil adapter = new RVAdapterMobil(ListMobil);

        binding.rvMobil.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        binding.rvMobil.setAdapter(adapter);
    }
}