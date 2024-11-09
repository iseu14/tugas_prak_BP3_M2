package com.example.tugas_prak_bp3_m2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class luas_layang_layang extends AppCompatActivity {

    private EditText editTextDiagonal1;
    private EditText editTextDiagonal2;
    private EditText editTextHasil;
    private Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_layang_layang);

        editTextDiagonal1 = findViewById(R.id.editTextd1);
        editTextDiagonal2 = findViewById(R.id.editTextd2);
        editTextHasil = findViewById(R.id.editTexthasil);
        buttonHitung = findViewById(R.id.buttonchitung);

        // Mengatur aksi untuk tombol "HITUNG"
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
            }
        });
    }

    private void hitungLuas() {
        try {
            // Mendapatkan nilai diagonal
            double diagonal1 = Double.parseDouble(editTextDiagonal1.getText().toString());
            double diagonal2 = Double.parseDouble(editTextDiagonal2.getText().toString());

            // Menghitung luas layang-layang
            double luas = (diagonal1 * diagonal2) / 2;

            // Menampilkan hasil pada EditText hasil
            editTextHasil.setText(String.valueOf(luas));
        } catch (NumberFormatException e) {
            // Menampilkan pesan error jika input tidak valid
            Toast.makeText(this, "Masukkan angka yang valid", Toast.LENGTH_SHORT).show();
        }
    }
}
