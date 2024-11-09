package com.example.tugas_prak_bp3_m2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class keliling_lingkaran extends AppCompatActivity {

    private EditText editTextJariJari, editTextHasil;
    private Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_lingkaran);

        // Inisialisasi komponen
        editTextJariJari = findViewById(R.id.editTextangka1);
        editTextHasil = findViewById(R.id.editTexthasil);
        buttonHitung = findViewById(R.id.buttonchitung);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungKelilingLingkaran();
            }
        });
    }

    private void hitungKelilingLingkaran() {
        // Ambil nilai jari-jari dari EditText
        String jariJariString = editTextJariJari.getText().toString();

        // Validasi input
        if (jariJariString.isEmpty()) {
            editTextHasil.setText("Masukkan nilai jari-jari!");
            return;
        }

        double jariJari = Double.parseDouble(jariJariString);

        // Hitung keliling lingkaran
        double keliling = 2 * Math.PI * jariJari;

        // Tampilkan hasil ke EditText
        editTextHasil.setText(String.valueOf(keliling));
    }
}
