package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;

    String correct_username = "Admin";
    String correct_password = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.txt1);
        password = findViewById(R.id.password);
        btnLogin = findViewById(R.id.button2);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(password.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Empty, provide data", Toast.LENGTH_LONG).show();
                }
                else if (username.getText().toString().equals(correct_username)) {
                    //check password
                    if (password.getText().toString().equals(correct_password)) {
                        Toast.makeText(MainActivity.this, "Successful", Toast.LENGTH_LONG).show();
                        Intent in = new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(in);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Invalid login", Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Invalid Username", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}