package com.example.modul2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText bil1 = findViewById(R.id.bil1);
        EditText bil2 = findViewById(R.id.bil2);
        EditText InHasil = findViewById(R.id.hasil);

        Button btnTambah = findViewById(R.id.btnTambah);
        Button btnKurang = findViewById(R.id.btnKurang);
        Button btnBagi = findViewById(R.id.btnBagi);
        Button btnKali = findViewById(R.id.btnKali);

        btnTambah.setOnClickListener(v -> {
            String Angka1S = bil1.getText().toString();
            String Angka2S = bil2.getText().toString();
            int angka1 = Integer.parseInt(Angka1S);
            int angka2 = Integer.parseInt(Angka2S);
            int Hasil = angka1 + angka2;

            String jawab = Integer.toString(Hasil);
            InHasil.setText(jawab);
        });

        btnKurang.setOnClickListener(v -> {
            String Angka1S = bil1.getText().toString();
            String Angka2S = bil2.getText().toString();
            int angka1 = Integer.parseInt(Angka1S);
            int angka2 = Integer.parseInt(Angka2S);
            int Hasil = angka1 - angka2;

            String jawab = Integer.toString(Hasil);
            InHasil.setText(jawab);
        });

        btnBagi.setOnClickListener(v -> {
            String Angka1S = bil1.getText().toString();
            String Angka2S = bil2.getText().toString();
            double angka1 = Double.parseDouble(Angka1S);
            double angka2 = Double.parseDouble(Angka2S);
            double Hasil = angka1 / angka2;

            String jawab = String.valueOf(Hasil);
            InHasil.setText(jawab);
        });

        btnKali.setOnClickListener(v -> {
            String Angka1S = bil1.getText().toString();
            String Angka2S = bil2.getText().toString();
            int angka1 = Integer.parseInt(Angka1S);
            int angka2 = Integer.parseInt(Angka2S);
            int Hasil = angka1 * angka2;

            String jawab = Integer.toString(Hasil);
            InHasil.setText(jawab);
        });
    }
}