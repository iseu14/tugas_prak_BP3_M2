package com.example.tugas_prak_bp3_m2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class keliling_persegi extends AppCompatActivity {

    private EditText editTextPanjangSisi, editTextHasil;
    private Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_persegi);

        // Inisialisasi komponen
        editTextPanjangSisi = findViewById(R.id.editTextangka1);
        editTextHasil = findViewById(R.id.editTexthasil);
        buttonHitung = findViewById(R.id.buttonchitung);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungKelilingPersegi();
            }
        });
    }

    private void hitungKelilingPersegi() {
        String panjangSisiString = editTextPanjangSisi.getText().toString();

        // Cek apakah input panjang sisi kosong
        if (panjangSisiString.isEmpty()) {
            editTextHasil.setText("Masukkan nilai jari-jari!");
            return;
        }

        // Konversi input ke double
        double panjangSisi = Double.parseDouble(panjangSisiString);
        // Hitung keliling persegi
        double keliling = 4 * panjangSisi;

        // Tampilkan hasil
        editTextHasil.setText(String.format("%.2f", keliling));
    }
}
