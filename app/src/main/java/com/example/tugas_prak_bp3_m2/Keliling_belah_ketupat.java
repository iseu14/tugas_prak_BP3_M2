package com.example.tugas_prak_bp3_m2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Keliling_belah_ketupat extends AppCompatActivity {

    private EditText editTextSisi, editTextHasil;
    private Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_belah_ketupat);

        editTextSisi = findViewById(R.id.editTextd1);
        editTextHasil = findViewById(R.id.editTexthasil);
        buttonHitung = findViewById(R.id.buttonchitung);

        // Set OnClickListener untuk tombol Hitung
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungKelilingBelahKetupat();
            }
        });
    }

    private void hitungKelilingBelahKetupat() {
        try {
            // Ambil nilai panjang sisi dari EditText
            double sisi = Double.parseDouble(editTextSisi.getText().toString());

            // Hitung keliling belah ketupat (4 x panjang sisi)
            double keliling = 4 * sisi;

            // Tampilkan hasil ke EditText hasil
            editTextHasil.setText(String.valueOf(keliling));
        } catch (NumberFormatException e) {
            // Tampilkan pesan jika input tidak valid
            Toast.makeText(this, "Masukkan nilai yang valid untuk panjang sisi", Toast.LENGTH_SHORT).show();
        }
    }
}
