package com.example.tugas_prak_bp3_m2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class luas_trapesium extends AppCompatActivity {

    private EditText editTextpanjangsa;
    private EditText editTextpanjangsb;
    private EditText editTexttinggi;
    private EditText editTexthasil;
    private Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_trapesium);

        editTextpanjangsa = findViewById(R.id.editTextpanjangsa);
        editTextpanjangsb = findViewById(R.id.editTextpanjangsb);
        editTexttinggi = findViewById(R.id.editTexttinggi);
        editTexthasil = findViewById(R.id.editTexthasil);
        buttonHitung = findViewById(R.id.buttonchitung);

        // Menambahkan listener pada tombol hitung
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasTrapesium();
            }
        });
    }

    private void hitungLuasTrapesium() {
        // Mendapatkan nilai dari EditText
        String panjangSisiAtasStr = editTextpanjangsa.getText().toString();
        String panjangSisiBawahStr = editTextpanjangsb.getText().toString();
        String tinggiStr = editTexttinggi.getText().toString();

        // Validasi input
        if (panjangSisiAtasStr.isEmpty() || panjangSisiBawahStr.isEmpty() || tinggiStr.isEmpty()) {
            editTexthasil.setText("Input tidak valid!");
            return;
        }

        // Mengonversi nilai dari string ke float
        float panjangSisiAtas = Float.parseFloat(panjangSisiAtasStr);
        float panjangSisiBawah = Float.parseFloat(panjangSisiBawahStr);
        float tinggi = Float.parseFloat(tinggiStr);

        // Menghitung luas trapesium
        float luas = 0.5f * (panjangSisiAtas + panjangSisiBawah) * tinggi;

        // Menampilkan hasil
        editTexthasil.setText(String.valueOf(luas));
    }
}
