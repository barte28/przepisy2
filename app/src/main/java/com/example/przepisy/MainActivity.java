package com.example.przepisy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listViewKategorie;
    public static final String KATEGORIA = "kategoria";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewKategorie = findViewById(R.id.ListVIewKategorie);
        listViewKategorie.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String kategoria = listViewKategorie.getItemAtPosition(i).toString();
                        Toast.makeText(MainActivity.this, "Wybrano kategorie "+kategoria, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, ListaPrzepisowActivity.class);
                        intent.putExtra(KATEGORIA,kategoria);
                        startActivity(intent);
                    }
                }
        );
    }
}