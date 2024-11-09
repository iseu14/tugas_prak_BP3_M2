package com.example.tugas_prak_bp3_m2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class sisi_miring_segitiga extends AppCompatActivity {

    private EditText editTextAlas, editTextTinggi, editTextHasil;
    private Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sisi_miring_segitiga);

        // Inisialisasi komponen
        editTextAlas = findViewById(R.id.editTextalas);
        editTextTinggi = findViewById(R.id.editTexttinggi);
        editTextHasil = findViewById(R.id.editTexthasil);
        buttonHitung = findViewById(R.id.buttonchitung);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungSisiMiring();
            }
        });
    }

    private void hitungSisiMiring() {
        // Ambil nilai alas dan tinggi dari EditText
        String alasString = editTextAlas.getText().toString();
        String tinggiString = editTextTinggi.getText().toString();

        // Validasi input
        if (alasString.isEmpty() || tinggiString.isEmpty()) {
            Toast.makeText(sisi_miring_segitiga.this,
                    "Masukkan nilai alas dan tinggi!", Toast.LENGTH_SHORT).show();
            return;
        }

        double alas = Double.parseDouble(alasString);
        double tinggi = Double.parseDouble(tinggiString);

        // Hitung sisi miring segitiga menggunakan rumus Pythagoras
        double sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));

        // Tampilkan hasil ke EditText
        editTextHasil.setText(String.valueOf(sisiMiring));
    }
}