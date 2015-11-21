package com.example.alumnot.xml_interno_lista;

import android.app.Activity;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by AlumnoT on 05/11/2015.
 */
public class MainActivity extends Activity {
    private ArrayList<Personaje> listaPersonajes = new ArrayList<Personaje>();
    private ArrayList<String> listaTitulos = new ArrayList<String>();
    private ArrayList<Personaje> getListaPersonajesOrdenados=new ArrayList<Personaje>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            parsearXML();
            montarListView();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void parsearXML() throws XmlPullParserException, IOException {

        XmlPullParser parser = getResources().getXml(R.xml.personajes);
        int eventType = -1;

        while (eventType != XmlResourceParser.END_DOCUMENT) {
            eventType = parser.next();
            if (eventType == XmlResourceParser.START_TAG) {
                String currentTagName = parser.getName();
                if (currentTagName.equals("personaje")) {
                    String nombreValue = parser.getAttributeValue(null, "nombre");
                    String rolValue = parser.getAttributeValue(null, "rol");
                    String historia = parser.getAttributeValue(null, "historia");

                    Personaje personajeActual= new Personaje(nombreValue, rolValue, imagen, historia);

                    listaPersonajes.add(personajeActual);
                    listaTitulos.add(nombreValue);
                }
            }
        }
    }

    // listaTitulos sorted by name
    Collections.sort(listaTitulos);

    //Algorithm for sort the objects by attribute "nombre"
    for(int i=0;i<listaTitulos.size();i++){
        for(int j=0;j<listaPersonajes.size();j++){
            if(listaTitulos.get(i).equals(listaPersonajes.get(j).getNombre())){
                getListaPersonajesOrdenados.add(listaPersonajes.get(j));
            }
        }
    }

    private void montarListView() {
        ListView listView = (ListView) findViewById(R.id.lista);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, listaTitulos);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, DetalleActivity.class);

                i.putExtra("Personaje", getListaPersonajesOrdenados.get(position));
                startActivity(i);
            }
        });
    }
}
