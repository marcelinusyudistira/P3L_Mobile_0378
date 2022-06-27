package com.marcelinusyoga.atmajayarental.driver;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.marcelinusyoga.atmajayarental.R;
import com.marcelinusyoga.atmajayarental.databinding.ProfileDriverBinding;

import java.util.ArrayList;

public class TampilProfileDriver extends AppCompatActivity {
    ArrayList<Driver> DriverList;
    ProfileDriverBinding binding;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.profile_driver);

        DriverList = new ProfileDriver().Driver;
        binding.setDrv(DriverList.get(1));
    }
}
