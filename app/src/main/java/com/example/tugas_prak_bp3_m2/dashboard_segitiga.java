package com.example.tugas_prak_bp3_m2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class dashboard_segitiga extends AppCompatActivity {

    // Deklarasi tombol
    private Button btnLuas;
    private Button btnSisiMiring;
    private Button btnKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_segitiga);

        // Inisialisasi tombol dengan ID dari XML
        btnLuas = findViewById(R.id.Bluas);
        btnSisiMiring = findViewById(R.id.Bsisimiring);
        btnKeliling = findViewById(R.id.Bkeliling);

        btnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard_segitiga.this, luas_segitiga.class);
                startActivity(intent);
            }
        });

        btnSisiMiring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard_segitiga.this, sisi_miring_segitiga.class);
                startActivity(intent);
            }
        });

        btnKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard_segitiga.this, keliling_segitiga.class);
                startActivity(intent);
            }
        });
    }
}
