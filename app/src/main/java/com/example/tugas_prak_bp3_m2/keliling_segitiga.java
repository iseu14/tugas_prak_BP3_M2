package com.example.tugas_prak_bp3_m2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class keliling_segitiga extends AppCompatActivity {

    private EditText editTextAlas, editTextTinggi, editTextSisiMiring, editTextHasil;
    private Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_segitiga); // Pastikan layout ini sesuai dengan nama layout Anda

        // Inisialisasi view berdasarkan ID
        editTextAlas = findViewById(R.id.editTextalas);
        editTextTinggi = findViewById(R.id.editTexttinggi);
        editTextSisiMiring = findViewById(R.id.editTextsisi_miring);
        editTextHasil = findViewById(R.id.editTexthasil);
        buttonHitung = findViewById(R.id.buttonchitung);

        // Tambahkan listener pada tombol hitung
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ambil nilai dari input
                String alasStr = editTextAlas.getText().toString();
                String tinggiStr = editTextTinggi.getText().toString();
                String sisiMiringStr = editTextSisiMiring.getText().toString();

                // Validasi input kosong
                if (alasStr.isEmpty() || tinggiStr.isEmpty() || sisiMiringStr.isEmpty()) {
                    Toast.makeText(keliling_segitiga.this,
                            "Masukkan semua nilai", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Konversi input ke tipe numerik
                double alas = Double.parseDouble(alasStr);
                double tinggi = Double.parseDouble(tinggiStr);
                double sisiMiring = Double.parseDouble(sisiMiringStr);

                // Hitung keliling segitiga
                double keliling = alas + tinggi + sisiMiring;

                // Tampilkan hasil
                editTextHasil.setText(String.valueOf(keliling));
            }
        });
    }
}
