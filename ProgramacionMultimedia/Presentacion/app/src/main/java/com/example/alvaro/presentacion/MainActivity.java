package com.example.alvaro.presentacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Variables modelo de datos
    private String numeroA = "";
    private String numeroB = "";
    private String operacion = "";

    // Variables de objetos de la vista
    private TextView campoPantalla;

    // Variables de la logica
    private boolean estadoA = true;
    private boolean estadoB = false;

    // Va a inicializar el programa
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoPantalla = (TextView) findViewById(R.id.campoPantalla);
    }

    public void pulsaNumero (View v){
        String teclaPulsada = String.valueOf(v.getTag());

        if(estadoA){
            numeroA+=teclaPulsada;
            campoPantalla.setText(numeroA);
        }
        if(estadoB){
            numeroB+= teclaPulsada;
            campoPantalla.setText(numeroA + " " + operacion + " " + numeroB);
        }
    } // End pulsaNumero

    public void pulsaOperacion (View v){
        int idPulsada = v.getId();

        if(idPulsada == R.id.btnSumar) {
            operacion = "+";
        }if(idPulsada == R.id.btnRestar) {
            operacion = "-";
        }if(idPulsada == R.id.btnMultiplicar){
            operacion = "x";
        }if(idPulsada == R.id.btnDividir){
            operacion = "/";
        }
        estadoA=false;
        estadoB=true;

        campoPantalla.setText(numeroA + " " + operacion);

    } //End pulsaOperacion

    public void pulsaResolver (View v){
        if(operacion == "+"){
            campoPantalla.setText(String.valueOf(Double.parseDouble(numeroA) + Double.parseDouble(numeroB)));
        }if(operacion == "-"){
            campoPantalla.setText(String.valueOf(Double.parseDouble(numeroA) - Double.parseDouble(numeroB)));
        }if(operacion == "x"){
            campoPantalla.setText(String.valueOf(Double.parseDouble(numeroA) * Double.parseDouble(numeroB)));
        }if(operacion == "/"){
            campoPantalla.setText(String.valueOf(Double.parseDouble(numeroA) / Double.parseDouble(numeroB)));
        }

        estadoA=true;
        estadoB=false;

        numeroA="";
        numeroB="";
        operacion="";
    }// End pulsaResolver

    public void pulsaC (View v){
        estadoA=true;
        estadoB=false;

        numeroA="";
        numeroB="";
        operacion="";

        campoPantalla.setText("");
    }

}
