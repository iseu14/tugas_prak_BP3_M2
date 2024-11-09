package com.example.tugas_prak_bp3_m2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class keliling_trapesium extends AppCompatActivity {

    private EditText editTextpanjangsa;
    private EditText editTextpanjangsb;
    private EditText editTextpanjangska;
    private EditText editTextpanjangski;
    private EditText editTexthasil;
    private Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_trapesium);

        // Menghubungkan komponen UI
        editTextpanjangsa = findViewById(R.id.editTextpanjangsa);
        editTextpanjangsb = findViewById(R.id.editTextpanjangsb);
        editTextpanjangska = findViewById(R.id.editTextpanjangska);
        editTextpanjangski = findViewById(R.id.editTextpanjangski);
        editTexthasil = findViewById(R.id.editTexthasil);
        buttonHitung = findViewById(R.id.buttonchitung);

        // Menambahkan listener pada tombol hitung
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungKelilingTrapesium();
            }
        });
    }

    private void hitungKelilingTrapesium() {
        // Mendapatkan nilai dari EditText
        String panjangSisiAtasStr = editTextpanjangsa.getText().toString();
        String panjangSisiBawahStr = editTextpanjangsb.getText().toString();
        String panjangSisiKananStr = editTextpanjangska.getText().toString();
        String panjangSisiKiriStr = editTextpanjangski.getText().toString();

        // Validasi input
        if (panjangSisiAtasStr.isEmpty() || panjangSisiBawahStr.isEmpty() ||
                panjangSisiKananStr.isEmpty() || panjangSisiKiriStr.isEmpty()) {
            editTexthasil.setText("Input tidak valid!");
            return;
        }

        // Mengonversi nilai dari string ke float
        float panjangSisiAtas = Float.parseFloat(panjangSisiAtasStr);
        float panjangSisiBawah = Float.parseFloat(panjangSisiBawahStr);
        float panjangSisiKanan = Float.parseFloat(panjangSisiKananStr);
        float panjangSisiKiri = Float.parseFloat(panjangSisiKiriStr);

        // Menghitung keliling trapesium
        float keliling = panjangSisiAtas + panjangSisiBawah + panjangSisiKanan + panjangSisiKiri;

        // Menampilkan hasil
        editTexthasil.setText(String.valueOf(keliling));
    }
}
