package com.example.influances;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import io.github.muddz.styleabletoast.StyleableToast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       // Toolbar toolbar = findViewById(R.id.toolbar);
      //  setSupportActionBar(toolbar);
    }

    public void submitDetails(View v) {



        EditText usernameField = (EditText) findViewById(R.id.username_field);
        String name = usernameField.getText().toString();

        EditText passwordField = (EditText) findViewById(R.id.password_field);
        String pass = passwordField.getText().toString();


        String myName = "Judith";
        String myPass = "judy";



             if(name.isEmpty()){

                 StyleableToast.makeText(this,"username cannot be empty",Toast.LENGTH_SHORT,R.style.mytoast).show();



             }else if(pass.isEmpty()){
                 StyleableToast.makeText(this,"password cannot be empty",Toast.LENGTH_SHORT,R.style.mytoast).show();


             }else if(name.equals(myName) && pass.equals(myPass)){
                 StyleableToast.makeText(this,"Login Successful",Toast.LENGTH_SHORT,R.style.loginToast).show();


             }else{

                 StyleableToast.makeText(this,"Incorrect Details",Toast.LENGTH_SHORT,R.style.mytoast).show();



             }
        }
    }

