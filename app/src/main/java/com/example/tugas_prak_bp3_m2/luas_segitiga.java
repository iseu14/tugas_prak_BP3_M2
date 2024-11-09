package com.example.tugas_prak_bp3_m2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class luas_segitiga extends AppCompatActivity {

    private EditText editTextAlas, editTextTinggi, editTextHasil;
    private Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);

        // Inisialisasi komponen
        editTextAlas = findViewById(R.id.editTextangka1);
        editTextTinggi = findViewById(R.id.editTextangka2);
        editTextHasil = findViewById(R.id.editTexthasil);
        buttonHitung = findViewById(R.id.buttonchitung);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasSegitiga();
            }
        });
    }

    private void hitungLuasSegitiga() {
        // Ambil nilai alas dan tinggi dari EditText
        String alasString = editTextAlas.getText().toString();
        String tinggiString = editTextTinggi.getText().toString();

        // Validasi input kosong
        if (alasString.isEmpty() || tinggiString.isEmpty()) {
            Toast.makeText(luas_segitiga.this,
                    "Masukkan nilai alas dan tinggi", Toast.LENGTH_SHORT).show();
            return;

        }

        double alas = Double.parseDouble(alasString);
        double tinggi = Double.parseDouble(tinggiString);

        // Hitung luas segitiga
        double luas = 0.5 * alas * tinggi;

        // Tampilkan hasil ke EditText
        editTextHasil.setText(String.valueOf(luas));
    }
}
