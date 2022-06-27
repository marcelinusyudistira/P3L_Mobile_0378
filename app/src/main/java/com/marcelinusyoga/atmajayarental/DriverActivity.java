package com.marcelinusyoga.atmajayarental;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.marcelinusyoga.atmajayarental.Model.User;
import com.marcelinusyoga.atmajayarental.Preferences.UserPreferences;
import com.marcelinusyoga.atmajayarental.databinding.ActivityDriverBinding;
import com.marcelinusyoga.atmajayarental.driver.TampilProfileDriver;
import com.marcelinusyoga.atmajayarental.promo.TampilPromo;
import com.marcelinusyoga.atmajayarental.transaksi.TampilRiwayatTransaksi;
import com.marcelinusyoga.atmajayarental.transaksidrv.TampilRiwayatTransaksiDriver;

public class DriverActivity extends AppCompatActivity {

    ActivityDriverBinding binding;
    private User user;
    private UserPreferences userPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);

        userPreferences = new UserPreferences(DriverActivity.this);
        user = userPreferences.getUserLogin();

        checkLogin();

        binding = DataBindingUtil.setContentView(this, R.layout.activity_driver);
        binding.setActivity(this);
    }

    private void checkLogin() {
        if(!userPreferences.checkLogin()){
            startActivity(new Intent(DriverActivity.this, LoginActivity.class));
            finish();
        }else {
            Toast.makeText(DriverActivity.this, "Berhasil Login", Toast.LENGTH_SHORT).show();
        }
    }

    public View.OnClickListener btnProfileDrv = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            Intent driverActivity = new Intent(DriverActivity.this, TampilProfileDriver.class);
            startActivity(driverActivity);
        }
    };

    public View.OnClickListener btnRating = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            Intent driverActivity = new Intent(DriverActivity.this, TampilPromo.class);
            startActivity(driverActivity);
        }
    };

    public View.OnClickListener btnRiwayat = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            Intent driverActivity = new Intent(DriverActivity.this, TampilRiwayatTransaksiDriver.class);
            startActivity(driverActivity);
        }
    };

    public View.OnClickListener btnLogout = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            userPreferences.logout();
            Toast.makeText(DriverActivity.this, "Berhasil Logout", Toast.LENGTH_SHORT).show();
            checkLogin();
        }
    };
}