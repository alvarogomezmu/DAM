package com.example.alumnot.xml_interno_lista;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by AlumnoT on 03/11/2015.
 */
public class DetalleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.relativel);

        TextView campoNombre = (TextView) findViewById(R.id.campoNombre);
        ImageView campoImagen = (ImageView) findViewById(R.id.campoImagen);
        TextView campoPosicion = (TextView) findViewById(R.id.campoPosicion);
        TextView campoHistoria = (TextView) findViewById(R.id.campoHistoria);

        Bundle extras = getIntent().getExtras();

        Futbolista futbolistaActual = (Futbolista) extras.getSerializable("Futbolistas");

        campoNombre.setText("Nombre: " + futbolistaActual.getNombre());
        campoPosicion.setText("Posicion: " + futbolistaActual.getPosicion());
        campoHistoria.setText(futbolistaActual.getHistoria());

        switch (futbolistaActual.getNombre()) {
            case "Zinedine Zidane":
                campoImagen.setImageDrawable(getResources().getDrawable(R.drawable.zidane));
                layout.setBackgroundDrawable(getResources().getDrawable(R.drawable.blanco));
                break;
            case "Juan Gómez González":
                campoImagen.setImageDrawable(getResources().getDrawable(R.drawable.juan));
                layout.setBackgroundDrawable(getResources().getDrawable(R.drawable.blanco));
                break;
            case "Raul González":
                campoImagen.setImageDrawable(getResources().getDrawable(R.drawable.raulgonzalez));
                layout.setBackgroundDrawable(getResources().getDrawable(R.drawable.blanco));
                break;
            case "Iker Casillas":
                campoImagen.setImageDrawable(getResources().getDrawable(R.drawable.iker));
                layout.setBackgroundDrawable(getResources().getDrawable(R.drawable.blanco));
                break;
        }
    }
}

