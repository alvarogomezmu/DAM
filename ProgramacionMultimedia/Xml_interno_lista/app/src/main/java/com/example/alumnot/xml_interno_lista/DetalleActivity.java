package com.example.alumnot.xml_interno_lista;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by AlumnoT on 03/11/2015.
 */
public class DetalleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        TextView campoNombre = (TextView) findViewById(R.id.campoNombre);
        TextView campoImagen = (TextView) findViewById(R.id.campoImagen);
        TextView campoPosicion = (TextView) findViewById(R.id.campoPosicion);
        TextView campoHistoria = (TextView) findViewById(R.id.campoHistoria);

        Bundle extras = getIntent().getExtras();

        Futbolista futbolistaActual = (Futbolista) extras.getSerializable("Futbolistas");

        campoNombre.setText("Nombre: " + futbolistaActual.getNombre());
        campoImagen.setText("Imagen: " + futbolistaActual.getImagen());
        campoPosicion.setText("Posicion: " + futbolistaActual.getPosicion());
        campoHistoria.setText("Historia: " + futbolistaActual.getHistoria());

    }
}
