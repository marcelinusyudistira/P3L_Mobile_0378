package com.marcelinusyoga.atmajayarental;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.marcelinusyoga.atmajayarental.Model.User;
import com.marcelinusyoga.atmajayarental.Preferences.UserPreferences;
import com.marcelinusyoga.atmajayarental.customer.TampilProfile;
import com.marcelinusyoga.atmajayarental.databinding.ActivityMainBinding;
import com.marcelinusyoga.atmajayarental.mobil.TampilMobil;
import com.marcelinusyoga.atmajayarental.promo.TampilPromo;
import com.marcelinusyoga.atmajayarental.transaksi.TampilRiwayatTransaksi;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private User user;
    private UserPreferences userPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userPreferences = new UserPreferences(MainActivity.this);
        user = userPreferences.getUserLogin();

        checkLogin();

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setActivity(this);
    }

    private void checkLogin() {
        if(!userPreferences.checkLogin()){
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            finish();
        }else {
            Toast.makeText(MainActivity.this, "Berhasil Login", Toast.LENGTH_SHORT).show();
        }
    }

    public View.OnClickListener btnProfile = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            Intent mainActivity = new Intent(MainActivity.this, TampilProfile.class);
            startActivity(mainActivity);
        }
    };

    public View.OnClickListener btnPromo = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            Intent mainActivity = new Intent(MainActivity.this, TampilPromo.class);
            startActivity(mainActivity);
        }
    };

    public View.OnClickListener btnRiwayat = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            Intent mainActivity = new Intent(MainActivity.this, TampilRiwayatTransaksi.class);
            startActivity(mainActivity);
        }
    };

    public View.OnClickListener btnMobil = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            Intent mainActivity = new Intent(MainActivity.this, TampilMobil.class);
            startActivity(mainActivity);
        }
    };

    public View.OnClickListener btnLogout = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            userPreferences.logout();
            Toast.makeText(MainActivity.this, "Berhasil Logout", Toast.LENGTH_SHORT).show();
            checkLogin();
        }
    };
}