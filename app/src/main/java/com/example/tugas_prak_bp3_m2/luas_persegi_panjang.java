package com.example.tugas_prak_bp3_m2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class luas_persegi_panjang extends AppCompatActivity {

    // Deklarasi variabel untuk komponen UI
    private EditText editTextPanjang, editTextLebar, editTexthasil;
    private Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi_panjang);

        // Inisialisasi elemen UI
        editTextPanjang = findViewById(R.id.editTextpanjangsisi);
        editTextLebar = findViewById(R.id.editTextlebar);
        editTexthasil = findViewById(R.id.editTexthasil);
        buttonHitung = findViewById(R.id.buttonchitung);

        // Set listener untuk tombol hitung
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ambil nilai panjang dan lebar dari EditText
                String panjangStr = editTextPanjang.getText().toString();
                String lebarStr = editTextLebar.getText().toString();

                // Validasi input
                if (panjangStr.isEmpty() || lebarStr.isEmpty()) {
                    editTexthasil.setText("Masukkan panjang dan lebar");
                    return;
                }

                // Konversi input menjadi angka
                double panjang = Double.parseDouble(panjangStr);
                double lebar = Double.parseDouble(lebarStr);

                // Hitung luas
                double luas = panjang * lebar;

                // Tampilkan hasil
                editTexthasil.setText(String.valueOf(luas));
            }
        });
    }
}
