package com.example.tugas_prak_bp3_m2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class keliling_jajar_genjang extends AppCompatActivity {

    private EditText editTextAlas, editTextPanjangSisi, editTextHasil;
    private Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_jajar_genjang);

        // Menghubungkan komponen dengan ID-nya
        editTextAlas = findViewById(R.id.editTextalas);
        editTextPanjangSisi = findViewById(R.id.editTextps);
        editTextHasil = findViewById(R.id.editTexthasil);
        buttonHitung = findViewById(R.id.buttonchitung);

        // Menambahkan fungsi pada tombol HITUNG
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    // Mengambil nilai alas dan panjang sisi dari input
                    double alas = Double.parseDouble(editTextAlas.getText().toString());
                    double panjangSisi = Double.parseDouble(editTextPanjangSisi.getText().toString());

                    // Menghitung keliling jajar genjang
                    double keliling = 2 * (alas + panjangSisi);

                    // Menampilkan hasil
                    editTextHasil.setText(String.valueOf(keliling));
                } catch (NumberFormatException e) {
                    // Menangani kesalahan jika input tidak valid
                    Toast.makeText(keliling_jajar_genjang.this,
                            "Masukkan nilai yang valid!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
