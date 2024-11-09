package com.example.tugas_prak_bp3_m2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class dashboard_lingkaran extends AppCompatActivity {

    private Button buttonLuas, buttonKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_lingkaran); // Pastikan layout file ini sesuai

        // Inisialisasi tombol
        buttonLuas = findViewById(R.id.Bluas);
        buttonKeliling = findViewById(R.id.Bkeliling);

        // Set listener untuk tombol luas
        buttonLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard_lingkaran.this, luas_lingkaran.class);
                startActivity(intent);
            }
        });

        // Set listener untuk tombol keliling
        buttonKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard_lingkaran.this, keliling_lingkaran.class);
                startActivity(intent);
            }
        });
    }
}