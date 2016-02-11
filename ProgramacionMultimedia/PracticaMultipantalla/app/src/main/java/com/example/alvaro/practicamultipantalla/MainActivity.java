package com.example.alvaro.practicamultipantalla;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText campoNombre, campoPass;
    private Button miBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declaracion de EditTexts
        final EditText campoNombre = (EditText) findViewById(R.id.EditNombre);
        final EditText campoPass = (EditText) findViewById(R.id.EditPass);
        // Declaracion de Button
        Button miBoton = (Button) findViewById(R.id.BotonPasar);

        // Cogemos le texto de los EditTexts y lo pasamos a la siguiente activity
        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("nombre", campoNombre.getText() + "");
                i.putExtra("contraseña", campoPass.getText() + "");
                startActivity(i);
            }
        });
    }
}
