package com.example.practica4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button botonEmpezar, botonSalir, boton4Rondas, boton6Rondas, boton8Rondas, boton10Rondas, botonAtras, botonAnadir;
    int nRondas;
    EditText nombreParticipante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonEmpezar = findViewById(R.id.botonEmpezar);
        botonEmpezar.setOnClickListener(this);
        botonSalir = findViewById(R.id.botonSalir);
        botonSalir.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.botonEmpezar:
                setContentView(R.layout.layout_seleccion_rondas);
                boton4Rondas = findViewById(R.id.boton4Rondas);
                boton4Rondas.setOnClickListener(this);
                boton6Rondas = findViewById(R.id.boton6Rondas);
                boton6Rondas.setOnClickListener(this);
                boton8Rondas = findViewById(R.id.boton8Rondas);
                boton8Rondas.setOnClickListener(this);
                boton10Rondas = findViewById(R.id.boton10Rondas);
                boton10Rondas.setOnClickListener(this);
                botonAtras = findViewById(R.id.botonAtras);
                botonAtras.setOnClickListener(this);
                break;
            case R.id.botonSalir:

                break;
            case R.id.botonAtras:
                setContentView(R.layout.activity_main);
               break;
            case R.id.boton4Rondas:
                nRondas = 4;
                setContentView(R.layout.layout_creador_pj);
                //TODO: todo esto crashea la app
                //Hay que cambiarlo
                botonAnadir = findViewById(R.id.botonAnadir);
                botonAnadir.setOnClickListener(this);
                agregarParticipante agregar = new agregarParticipante();
                agregar.agregar(String.valueOf(nombreParticipante.getText()));
                break;
            case R.id.boton6Rondas:
                nRondas = 6;
                setContentView(R.layout.layout_creador_pj);
                break;
            case R.id.boton8Rondas:
                nRondas = 8;
                setContentView(R.layout.layout_creador_pj);
                break;
            case R.id.boton10Rondas:
                nRondas = 10;
                setContentView(R.layout.layout_creador_pj);
                break;

        }
    }
}