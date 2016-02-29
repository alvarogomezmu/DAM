package es.cepal.valentina.siete_toast;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    // Variables
    // Lo primero es definir un objeto de la clase EditText y una variable entera donde almacenaremos el valor aleatorio que generamos y mostramos en un principio
    private EditText et_numero;
    private int numero;

    @Override
    // El onCreate es el primer método que se ejecuta al inicializar la aplicación.
    // Es donde inicializamos la referencia del EditText
    protected void onCreate(Bundle savedInstanceState) {

        String cadena;
        Toast notificacion;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_numero = (EditText)findViewById(R.id.et_numero);
        // Generamos un valor aleatorio comprendido entre 0 y 101 y lo almacenamos en la variable num
        numero = (int)(Math.random()*101);
        // Convertimos el valor entero a String ya que la clase Toast siempre hay que pasarte un String para mostrar
        cadena = String.valueOf(numero);
        notificacion = Toast.makeText(this,cadena,Toast.LENGTH_LONG);
        notificacion.show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void comprobar(View v){
        Toast notificacion;
        String valor_introducido = et_numero.getText().toString();
        int valor = Integer.parseInt(valor_introducido);


        if (valor == numero) {
            notificacion = Toast.makeText(this, "Es correcto",Toast.LENGTH_LONG);
            notificacion.show();
        }
        else{
            notificacion = Toast.makeText(this, "NO es correcto",Toast.LENGTH_LONG);
            notificacion.show();
        }

    }
}
