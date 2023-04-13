package com.javaprojetos.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){
        this.opcaoSelecionada("pedra");
    }

    public void selecionadoPapel(View view){
        this.opcaoSelecionada("papel");
    }

    public void selecionadoTesoura(View view){
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String opcaoEscolhida){
        ImageView imageResultado = findViewById(R.id.imagemEscolhaApp);
        TextView textUser = findViewById(R.id.textoUser);
        int numero = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opcaoAPP = opcoes[numero];

        switch(opcaoAPP){
            case "pedra":
                imageResultado.setImageResource(R.drawable.pedra);
                switch (opcaoEscolhida){
                    case "papel":
                        textUser.setText("Você Ganhou! :)");
                        break;
                    case "tesoura":
                        textUser.setText("Você perdeu! :/");
                        break;
                    default:
                        textUser.setText("Empate XXXXX");
                }
                break;
            case "papel":
                imageResultado.setImageResource(R.drawable.papel);
                switch (opcaoEscolhida){
                    case "tesoura":
                        textUser.setText("Você Ganhou! :)");
                        break;
                    case "pedra":
                        textUser.setText("Você perdeu! :/");
                        break;
                    default:
                        textUser.setText("Empate XXXXX");
                }
                break;
            default:
                imageResultado.setImageResource(R.drawable.tesoura);
                switch (opcaoEscolhida){
                    case "pedra":
                        textUser.setText("Você Ganhou! :)");
                        break;
                    case "papel":
                        textUser.setText("Você perdeu! :/");
                        break;
                    default:
                        textUser.setText("Empate XXXXX");
                }
        }
    }

}