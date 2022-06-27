package com.marcelinusyoga.atmajayarental.customer;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import androidx.databinding.DataBindingUtil;

import com.marcelinusyoga.atmajayarental.R;
import com.marcelinusyoga.atmajayarental.databinding.ProfileCustomerBinding;

public class TampilProfile extends AppCompatActivity {
    ArrayList<Customer> CustomerList;
    ProfileCustomerBinding binding;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.profile_customer);

        CustomerList = new ProfileCustomer().Customer;
        binding.setPgw(CustomerList.get(1));
    }
}
