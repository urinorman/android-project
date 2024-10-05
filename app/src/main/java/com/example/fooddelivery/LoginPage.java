package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class LoginPage extends AppCompatActivity {
    Button registrationbt;
    Button loginbt;
    Button Backbt;
    EditText Email_login;
    EditText Password_login;
    UserDetails user;
    CheckBox Showpasswdbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        // Initialize UI components
        Showpasswdbt = findViewById(R.id.Showpasswdbt);
        Email_login = findViewById(R.id.Email_login);
        Password_login = findViewById(R.id.Password_login);
        loginbt = findViewById(R.id.Loginbt);
        Backbt = findViewById(R.id.Backbt);

        // Handle checkbox to show/hide password
        Showpasswdbt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Password_login.setTransformationMethod(null);
                } else {
                    Password_login.setTransformationMethod(new PasswordTransformationMethod());
                }
            }
        });

        // Handle login button click
        loginbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Extract email and password
                String emailogin = Email_login.getText().toString();
                String passwdlogin = Password_login.getText().toString();
                // You may want to implement actual login logic here
            }
        });

       registrationbt = findViewById(R.id.regbt);
       registrationbt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(LoginPage.this, Registration.class);
               startActivity(intent);
           }
       });

        // Handle back button click
        Backbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
