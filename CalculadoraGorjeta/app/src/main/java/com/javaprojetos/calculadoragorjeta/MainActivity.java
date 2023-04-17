package com.javaprojetos.calculadoragorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextView porcent, gorjet, tot;
    private SeekBar seekbar;
    private TextInputEditText inputUser;
    private double porcentagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        porcent = findViewById(R.id.textoPorcent);
        gorjet = findViewById(R.id.textoGorjeta);
        gorjet.setText("0.00");
        tot = findViewById(R.id.textoTotal);
        seekbar = findViewById(R.id.seekBar1);
        inputUser = findViewById(R.id.inputUsuario);

        //Adicionando listener
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                porcentagem = progress;
                porcent.setText(porcentagem + "%");
                calcular();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void calcular() {
        String aux = inputUser.getText().toString();
        if(aux.equals("") || aux == null){
            Toast.makeText(
                    getApplicationContext(),
                    "Digite um valor primeiro",
                    Toast.LENGTH_LONG
            ).show();
        }else{
            double valor = Double.parseDouble(inputUser.getText().toString());
            double gorjeta = (valor * porcentagem)/100;
            double total = valor + gorjeta;

            gorjet.setText("R$ " + gorjeta);
            tot.setText("R$ " + total);
        }
    }

}