package com.marcelinusyoga.atmajayarental.promo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.marcelinusyoga.atmajayarental.R;
import com.marcelinusyoga.atmajayarental.databinding.ActivityTampilPromoBinding;

import java.util.ArrayList;

public class TampilPromo extends AppCompatActivity {

    ArrayList<Promo> ListPromo;
    ActivityTampilPromoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_tampil_promo);

        ListPromo = new DaftarPromo().Promo;

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(ListPromo);

        binding.rvPromo.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        binding.rvPromo.setAdapter(adapter);
    }
}