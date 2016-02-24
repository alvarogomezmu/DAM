package practicas.alvarogomez.com.customadapter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        //He tenido que crear el listener porque el onclick no funcionaba.
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creacion del intent
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                //Creacion de variables para obtencion de datos.
                EditText user = (EditText) findViewById(R.id.userin);
                EditText pass = (EditText) findViewById(R.id.passin);
                //Y añadimos los paquetes al intent
                intent.putExtra("usr", user.getText().toString());
                intent.putExtra("pass", pass.getText().toString());
                //Lanzamos intent.
                startActivity(intent);
            }
        });
    }
}
