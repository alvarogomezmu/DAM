package com.example.alumnot.proyectointent;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.util.Locale;

/**
 * Created by Alumnot on 15/10/2015.
 */
public class ImplicitosActivity extends Activity {
    //Miembros de la clase
    private final int RC_SELECT_PHOTO=1;
    private final int RC_TAKE_PHOTO=2;

    private String imagePath=null;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicitos);
    }
    @Override
    protected void onPause() {
        super.onPause();

        if (imagePath != null) {
            Log.i("myApp", "onPause");
            File imgToDelete = new File(imagePath);
            imgToDelete.delete();
        }
    }
    public void lanzarActivity(View v){
        Intent i;

        switch (v.getId()){//Start switch
            case R.id.verWeb:
                //Open web browser
                i=new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.google.es"));
                startActivity(Intent.createChooser(i,"Select web App"));
                break;

            case R.id.verContactos:
                //Open contacts
                i=new Intent(Intent.ACTION_VIEW,
                        Uri.parse("content://contacts/people"));
                startActivity(i);
                break;

            case R.id.llamar:
                //Open dialer
                i=new Intent(Intent.ACTION_VIEW,
                        Uri.parse("tel://112"));
                startActivity(i);
                break;

            case R.id.google:
                //Search something in Google
                i=new Intent(Intent.ACTION_WEB_SEARCH);
                i.putExtra(SearchManager.QUERY, "android");
                startActivity(i);
                break;

            case R.id.mail:
                //Generates an e-mail
                i=new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_EMAIL, new String[]{"test@gmail.com"});
                i.putExtra(Intent.EXTRA_SUBJECT, "asunto del correo");
                i.putExtra(Intent.EXTRA_TEXT, "cuerpo del correo");
                startActivity(Intent.createChooser(i, "Select email app"));
                break;

            case R.id.mapas:
                //Search your position in Google Maps
                try{
                    //Pregunta si tiene instalado el sistema google Maps del paquete Google APIs
                    Class.forName("com.google.android.maps.MapActivity");
                    //Si esta linea da error, pasa directamente al catch.
                    float latitud=40.423806f;
                    float longitud=-3.670431f;
                    int zoom=15;

                    String geoURI=String.format(Locale.US,"geo:%f,%f?z=%d",latitud,longitud,zoom);
                    i=new Intent(Intent.ACTION_VIEW, Uri.parse(geoURI));
                    startActivity(i);
                }catch(Exception e){
                    Toast toast= Toast.makeText(this,"No tienes Google APIs",
                            Toast.LENGTH_LONG);
                    toast.show();
                }
                break;

            case R.id.galeria:
                //Open galery
                i=new Intent(Intent.ACTION_PICK);
                i.setType("image/*");
                startActivityForResult(i, RC_SELECT_PHOTO);
                break;

            case R.id.camara:
                //Launch camera
                i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                imagePath= Environment.getExternalStorageDirectory().getAbsolutePath()+"/tmp_image.jpg";
        }//End switch
    }


}
