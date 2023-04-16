package com.javaprojetos.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextView textoResult;
    private TextInputEditText dadoAlcool, dadoGasol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.dadoAlcool = findViewById(R.id.inputAlcool);
        this.dadoGasol = findViewById(R.id.inputGas);
        this.textoResult = findViewById(R.id.textoResultado);
    }

    public void  calcular (View view) {
        String stringAlcool = dadoAlcool.getText().toString();
        String stringGasol = dadoGasol.getText().toString();

        if (stringAlcool == "" || stringAlcool == null || stringGasol == "" || stringGasol == null)
            textoResult.setText("Preencha os preços primeiro!");
        else {
            float precoAlcool = Float.parseFloat(stringAlcool);
            float precoGas = Float.parseFloat(stringGasol);

            if (precoAlcool / precoGas < 0.7)
                textoResult.setText("Melhor usar Álcool");
            else
                textoResult.setText("Melhor usar Gasolina");
        }
    }
}