package com.marcelinusyoga.atmajayarental;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.marcelinusyoga.atmajayarental.Preferences.UserPreferences;

public class LoginActivity extends AppCompatActivity{
    private EditText etUsername, etPassword;
    private MaterialButton btnClear, btnLogin;
    private UserPreferences userPreferences;
    private int cek=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userPreferences = new UserPreferences(LoginActivity.this);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);

        btnClear = findViewById(R.id.btnClear);
        btnLogin = findViewById(R.id.btnLogin);

        checkLogin();

        btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                etUsername.setText("");
                etPassword.setText("");
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(validateForm()){
                    if(etUsername.getText().toString().trim().equals("krisna@gmail.com")
                            && etPassword.getText().toString().trim().equals("2001-08-15")){
                        userPreferences.setLogin(etUsername.getText().toString().trim(),etPassword.getText().toString().trim());
                        cek = 1;
                        checkLogin();
                    }else if(etUsername.getText().toString().trim().equals("agus@gmail.com")
                            && etPassword.getText().toString().trim().equals("1990-04-21")){
                        userPreferences.setLogin(etUsername.getText().toString().trim(),etPassword.getText().toString().trim());
                        cek = 2;
                        checkLogin();
                    }else {
                        Toast.makeText(LoginActivity.this, "Username atau Password Salah", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private void checkLogin() {
        if(userPreferences.checkLogin() && cek==1){
            cek = 0;
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        }else if(userPreferences.checkLogin() && cek==2){
            cek = 0;
            startActivity(new Intent(LoginActivity.this, DriverActivity.class));
            finish();
        }
    }

    private boolean validateForm() {
        if(etUsername.getText().toString().trim().isEmpty() || etPassword.getText().toString().trim().isEmpty()){
            Toast.makeText(LoginActivity.this, "Username atau Password Kosong", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

}