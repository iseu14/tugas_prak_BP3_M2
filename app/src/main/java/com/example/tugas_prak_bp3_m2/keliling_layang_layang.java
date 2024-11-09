package com.example.tugas_prak_bp3_m2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class keliling_layang_layang extends AppCompatActivity {

    private EditText editTextSisi1;
    private EditText editTextSisi2;
    private EditText editTextHasil;
    private Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_layang_layang);

        // Menghubungkan komponen UI
        editTextSisi1 = findViewById(R.id.editTextangka1);
        editTextSisi2 = findViewById(R.id.editTextlebar);
        editTextHasil = findViewById(R.id.editTexthasil);
        buttonHitung = findViewById(R.id.buttonchitung);

        // Mengatur aksi untuk tombol "HITUNG"
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungKeliling();
            }
        });
    }

    private void hitungKeliling() {
        try {
            // Mendapatkan nilai sisi yang sama
            double sisi1 = Double.parseDouble(editTextSisi1.getText().toString());
            double sisi2 = Double.parseDouble(editTextSisi2.getText().toString());

            // Menghitung keliling layang-layang
            double keliling = 2 * (sisi1 + sisi2);

            // Menampilkan hasil pada EditText hasil
            editTextHasil.setText(String.valueOf(keliling));
        } catch (NumberFormatException e) {
            // Menampilkan pesan error jika input tidak valid
            Toast.makeText(this, "Masukkan angka yang valid", Toast.LENGTH_SHORT).show();
        }
    }
}
