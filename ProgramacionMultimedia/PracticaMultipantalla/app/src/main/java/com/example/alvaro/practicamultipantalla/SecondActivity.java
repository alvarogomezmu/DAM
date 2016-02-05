package com.example.alvaro.practicamultipantalla;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Alvaro on 05/02/2016.
 */
public class SecondActivity extends Activity {

    private TextView textNombre, textApellidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Declaracion de TextViews
        TextView textNombre = (TextView) findViewById(R.id.textNombre);
        TextView textApellidos = (TextView) findViewById(R.id.testApellido);

        // Cogemos la informacion pasada del otro layaut y lo metemos en Strings
        String nombre = getIntent().getStringExtra("nombre");
        String apellidos = getIntent().getStringExtra("apellido");

        // Anadimos los Strings a los TextViews
        textNombre.setText(nombre);
        textApellidos.setText(apellidos);

    }
}
