package com.example.tugas_prak_bp3_m2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class dashboard_belah_ketupat extends AppCompatActivity {

    private Button buttonLuas;
    private Button buttonKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_belah_ketupat);

        // Hubungkan komponen UI
        buttonLuas = findViewById(R.id.Bluaskt);
        buttonKeliling = findViewById(R.id.Bkelilingkt);

        // Set OnClickListener untuk tombol Luas
        buttonLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard_belah_ketupat.this, luas_belah_ketupat.class);
                startActivity(intent);
            }
        });

        // Set OnClickListener untuk tombol Keliling
        buttonKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard_belah_ketupat.this, Keliling_belah_ketupat.class);
                startActivity(intent);
            }
        });
    }
}