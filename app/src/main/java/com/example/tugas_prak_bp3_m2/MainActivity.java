package com.example.tugas_prak_bp3_m2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputUsername, inputPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Menghubungkan elemen UI dengan variabel
        inputUsername = findViewById(R.id.inputLogin);
        inputPassword = findViewById(R.id.editTextTextPassword);
        btnLogin = findViewById(R.id.btnLogin);

        // Menambahkan fungsi login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = inputUsername.getText().toString();
                String password = inputPassword.getText().toString();

                // Mengecek apakah username dan password benar
                if (username.equals("admin") && password.equals("admin123")) {
                    Toast.makeText(MainActivity.this, "Login Berhasil!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this,
                                DashboardActivity.class);
                        startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Username atau Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
