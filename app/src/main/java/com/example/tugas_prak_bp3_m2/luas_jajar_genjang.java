package com.example.tugas_prak_bp3_m2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class luas_jajar_genjang extends AppCompatActivity {

    private EditText editTextAlas, editTextTinggi, editTextHasil;
    private Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_jajar_genjang);

        // Menghubungkan komponen dengan ID-nya
        editTextAlas = findViewById(R.id.editTextalas);
        editTextTinggi = findViewById(R.id.editTexttinggi);
        editTextHasil = findViewById(R.id.editTexthasil);
        buttonHitung = findViewById(R.id.buttonchitung);

        // Menambahkan fungsi pada tombol HITUNG
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    // Mengambil nilai alas dan tinggi dari input
                    double alas = Double.parseDouble(editTextAlas.getText().toString());
                    double tinggi = Double.parseDouble(editTextTinggi.getText().toString());

                    // Menghitung luas jajar genjang
                    double luas = alas * tinggi;

                    // Menampilkan hasil
                    editTextHasil.setText(String.valueOf(luas));
                } catch (NumberFormatException e) {
                    // Menangani kesalahan jika input tidak valid
                    Toast.makeText(luas_jajar_genjang.this,
                            "Masukkan nilai yang valid!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
