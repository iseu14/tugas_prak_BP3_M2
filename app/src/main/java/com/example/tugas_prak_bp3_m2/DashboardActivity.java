package com.example.tugas_prak_bp3_m2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    private Button btnSegitiga, btnPersegi, btnTrapesium, btnBelahKetupat;
    private Button btnLingkaran, btnPersegiPanjang, btnLayang, btnJajarGenjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Inisialisasi tombol
        btnSegitiga = findViewById(R.id.Bsegitiga);
        btnPersegi = findViewById(R.id.Bpersegi);
        btnTrapesium = findViewById(R.id.Btrapesium);
        btnBelahKetupat = findViewById(R.id.Bbelahketupat);
        btnLingkaran = findViewById(R.id.Blingkaran);
        btnPersegiPanjang = findViewById(R.id.Bpersegipanjang);
        btnLayang = findViewById(R.id.Blayang);
        btnJajarGenjang = findViewById(R.id.Bjajargenjajang);

        // Tambahkan fungsionalitas klik untuk masing-masing tombol
        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, dashboard_segitiga.class);
                startActivity(intent);
            }
        });

        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, dashboard_persegi.class);
                startActivity(intent);
            }
        });

        btnTrapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, dashboard_trapesium.class);
                startActivity(intent);
            }
        });

        btnBelahKetupat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, dashboard_belah_ketupat.class);
                startActivity(intent);
            }
        });

        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, dashboard_lingkaran.class);
                startActivity(intent);
            }
        });

        btnPersegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, dashboard_persegi_panjang.class);
                startActivity(intent);
            }
        });

        btnLayang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, dashboard_layang_layang.class);
                startActivity(intent);
            }
        });

        btnJajarGenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, dashboard_jajar_genjang.class);
                startActivity(intent);
            }
        });
    }
}
