package com.example.przepisy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaPrzepisowActivity extends AppCompatActivity {
    private ListView listViewPrzepisy;
    private ArrayAdapter<Przepis> arrayAdapter;
    private ArrayList<Przepis> wybranePrzepisy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_przepisow);
        String kategoria = getIntent().getExtras().get(MainActivity.KATEGORIA).toString();
        TextView textView = findViewById(R.id.textViewNazwaKategori);
        textView.setText(kategoria);

        wybranePrzepisy = RepozytoriumPrzepisow.wypiszPrzepisy(kategoria);
        arrayAdapter = new ArrayAdapter<>(
                ListaPrzepisowActivity.this,
                android.R.layout.simple_list_item_1,
                wybranePrzepisy
        );
        listViewPrzepisy = findViewById(R.id.listViewPrzepisy);
        listViewPrzepisy.setAdapter(arrayAdapter);

        Intent intent = new Intent(ListaPrzepisowActivity.this, )
    }
}