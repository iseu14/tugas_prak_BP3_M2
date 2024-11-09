package com.example.tugas_prak_bp3_m2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class dashboard_jajar_genjang extends AppCompatActivity {

    private Button buttonLuas, buttonKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_jajar_genjang);

        // Hubungkan tombol dengan ID-nya
        buttonLuas = findViewById(R.id.Bluast);
        buttonKeliling = findViewById(R.id.Bkelilingt);

        // Set OnClickListener untuk tombol "LUAS JAJAR GENJANG"
        buttonLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard_jajar_genjang.this,
                        luas_jajar_genjang.class);
                startActivity(intent);
            }
        });

        // Set OnClickListener untuk tombol "KELILING JAJAR GENJANG"
        buttonKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard_jajar_genjang.this,
                        keliling_jajar_genjang.class);
                startActivity(intent);
            }
        });
    }
}
