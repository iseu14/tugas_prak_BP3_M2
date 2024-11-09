package com.example.tugas_prak_bp3_m2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class luas_lingkaran extends AppCompatActivity {

    private EditText editTextJariJari, editTextHasil;
    private Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);

        // Inisialisasi komponen
        editTextJariJari = findViewById(R.id.editTextangka1);
        editTextHasil = findViewById(R.id.editTexthasil);
        buttonHitung = findViewById(R.id.buttonchitung);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasLingkaran();
            }
        });
    }

    private void hitungLuasLingkaran() {
        String jariJariString = editTextJariJari.getText().toString();

        // Cek apakah input jari-jari kosong
        if (jariJariString.isEmpty()) {
            Toast.makeText(this, "Masukkan nilai jari-jari!", Toast.LENGTH_SHORT).show();
            return;
        }

        // Konversi input ke double
        double jariJari = Double.parseDouble(jariJariString);
        // Hitung luas lingkaran
        double luas = Math.PI * jariJari * jariJari;

        // Tampilkan hasil
        editTextHasil.setText(String.format("%.2f", luas));
    }
}
