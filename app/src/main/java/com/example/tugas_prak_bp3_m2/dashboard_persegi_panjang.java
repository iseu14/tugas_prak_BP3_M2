package com.example.tugas_prak_bp3_m2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class dashboard_persegi_panjang extends AppCompatActivity {

    private Button buttonLuasPP, buttonKelilingPP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_persegi_panjang);

        // Inisialisasi tombol
        buttonLuasPP = findViewById(R.id.Bluaspp);
        buttonKelilingPP = findViewById(R.id.Bkelilingpp);

        // Set listener untuk tombol luas
        buttonLuasPP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard_persegi_panjang.this,
                        luas_persegi_panjang.class);
                startActivity(intent);
            }
        });

        // Set listener untuk tombol keliling
        buttonKelilingPP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard_persegi_panjang.this,
                        keliling_persegi_panjang.class);
                startActivity(intent);
            }
        });
    }
}
