package com.example.przepisy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ListaPrzepisowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_przepisow);
        String kategoria = getIntent().getExtras().get(MainActivity.KATEGORIA).toString();
        TextView textView = findViewById(R.id.textViewNazwaKategori);
        textView.setText(kategoria);
    }
}