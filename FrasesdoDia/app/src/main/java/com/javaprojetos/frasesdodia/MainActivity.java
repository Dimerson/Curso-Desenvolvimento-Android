package com.javaprojetos.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){
        String[] palavras = {"Lorem", "ipsum", "dolor", "sit", "amet",
                "consectetur", "adipiscing", "elit",
                "Nunc", "non", "malesuada", "eros", "Aliquam", "in", "efficitur", "tellus",
                "Duis", "lectus", "dolor", "interdum", "in", "placerat", "a", "rutrum", "sed", "justo",
                "Mauris", "bibendum", "maximus", "diam", "sit", "amet", "eleifend",
                "Donec", "condimentum"};
        String frase = "";

        for (int i = 0; i < 13; i++){
            int x = new Random().nextInt(35);
            frase = frase + palavras[x] + " ";
        }
        frase = frase.substring(0,frase.length()-1) + ".";
        TextView texto = findViewById(R.id.fraseGerada);
        texto.setText(frase);
    }

}