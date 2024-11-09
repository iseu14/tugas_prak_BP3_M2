package com.example.tugas_prak_bp3_m2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class dashboard_layang_layang extends AppCompatActivity {

    private Button buttonLuas;
    private Button buttonKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_layang_layang);

        // Menghubungkan komponen UI
        buttonLuas = findViewById(R.id.Bluast);
        buttonKeliling = findViewById(R.id.Bkelilingt);

        // Mengatur aksi untuk tombol "LUAS LAYANG-LAYANG"
        buttonLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menuju ke activity perhitungan luas layang-layang
                Intent intent = new Intent(dashboard_layang_layang.this,
                        luas_layang_layang.class);
                startActivity(intent);
            }
        });

        // Mengatur aksi untuk tombol "KELILING LAYANG-LAYANG"
        buttonKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menuju ke activity perhitungan keliling layang-layang
                Intent intent = new Intent(dashboard_layang_layang.this,
                        keliling_layang_layang.class);
                startActivity(intent);
            }
        });
    }
}
