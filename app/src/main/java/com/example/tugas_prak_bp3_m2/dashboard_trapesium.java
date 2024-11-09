package com.example.tugas_prak_bp3_m2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class dashboard_trapesium extends AppCompatActivity {

    private Button buttonLuas, buttonKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_trapesium);

        // Inisialisasi tombol
        buttonLuas = findViewById(R.id.Bluast);
        buttonKeliling = findViewById(R.id.Bkelilingt);

        // Set listener untuk tombol luas
        buttonLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke aktivitas perhitungan luas trapesium
                Intent intent = new Intent(dashboard_trapesium.this,
                        luas_trapesium.class);
                startActivity(intent);
            }
        });

        // Set listener untuk tombol keliling
        buttonKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke aktivitas perhitungan keliling trapesium
                Intent intent = new Intent(dashboard_trapesium.this,
                        keliling_trapesium.class);
                startActivity(intent);
            }
        });
    }
}
