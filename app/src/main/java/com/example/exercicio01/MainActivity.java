package com.example.exercicio01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView parabens = findViewById(R.id.imageView);
        parabens.setVisibility(View.INVISIBLE);
    }

    public void rodar(View view) {
        ImageView parabens = findViewById(R.id.imageView);

        TextView texto = findViewById(R.id.numeroSorteado);

        int numero = new Random().nextInt(11);

        EditText teste = findViewById(R.id.editTextTextPersonName);
        int teste4 = Integer.parseInt(teste.getText().toString());
        if (teste4 == numero){
            texto.setText("Parabéns, você ganhou!!!");
            parabens.setVisibility(View.VISIBLE);
        }
        else {
            texto.setText("Infelizmente os números não são iguais!");
        }

    }
}