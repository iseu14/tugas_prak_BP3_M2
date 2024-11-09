package com.example.tugas_prak_bp3_m2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class luas_belah_ketupat extends AppCompatActivity {

    private EditText editTextDiagonal1, editTextDiagonal2, editTextHasil;
    private Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_belah_ketupat);

        // Hubungkan komponen UI
        editTextDiagonal1 = findViewById(R.id.editTextd1);
        editTextDiagonal2 = findViewById(R.id.editTextd2);
        editTextHasil = findViewById(R.id.editTexthasil);
        buttonHitung = findViewById(R.id.buttonchitung);

        // Set OnClickListener untuk tombol Hitung
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasBelahKetupat();
            }
        });
    }

    private void hitungLuasBelahKetupat() {
        try {
            // Ambil nilai diagonal dari EditText
            double diagonal1 = Double.parseDouble(editTextDiagonal1.getText().toString());
            double diagonal2 = Double.parseDouble(editTextDiagonal2.getText().toString());

            // Hitung luas belah ketupat
            double luas = (diagonal1 * diagonal2) / 2;

            // Tampilkan hasil ke EditText hasil
            editTextHasil.setText(String.valueOf(luas));
        } catch (NumberFormatException e) {
            // Tampilkan pesan jika input tidak valid
            Toast.makeText(this, "Masukkan nilai yang valid untuk kedua diagonal", Toast.LENGTH_SHORT).show();
        }
    }
}
