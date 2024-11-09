package com.example.tugas_prak_bp3_m2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class luas_persegi extends AppCompatActivity {

    private EditText editTextPanjangSisi, editTextHasil;
    private Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi);

        // Inisialisasi komponen
        editTextPanjangSisi = findViewById(R.id.editTextpanjangsisi);
        editTextHasil = findViewById(R.id.editTexthasil);
        buttonHitung = findViewById(R.id.buttonchitung);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasPersegi();
            }
        });
    }

    private void hitungLuasPersegi() {
        String panjangSisiString = editTextPanjangSisi.getText().toString();

        // Cek apakah input panjang sisi kosong
        if (panjangSisiString.isEmpty()) {
            Toast.makeText(this, "Masukkan nilai panjang sisi!", Toast.LENGTH_SHORT).show();
            return;
        }

        // Konversi input ke double
        double panjangSisi = Double.parseDouble(panjangSisiString);
        // Hitung luas persegi
        double luas = panjangSisi * panjangSisi;

        // Tampilkan hasil
        editTextHasil.setText(String.format("%.2f", luas));
    }
}
