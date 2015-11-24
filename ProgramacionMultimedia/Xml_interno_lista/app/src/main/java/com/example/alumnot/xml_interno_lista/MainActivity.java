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
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by AlumnoT on 05/11/2015.
 */
public class MainActivity extends Activity {
    private ArrayList<Futbolista> listaFutbolistas = new ArrayList<Futbolista>();

    /*
    listaFutbolistas.add(2);
    listaFutbolistas.add(1);
    listaFutbolistas.add(3);
    listaFutbolistas.add(4);

    Collections.sort(listaFutbolistas);

    Comparator<String> comparador = Collections.reverseOrder();
    Collections.sort(listaFutbolistas, comparador);

    Collections.sort(Futbolista, new Comparator() {
        @Override
        public int compare(Futbolista f1, Futbolista f2) {
            return new Integer(f1.getNombre()).compareTo(new Integer(f2.getNombre()));
        }
    })


    Collections.sort(ListaFutbolistas, new Comparator Futbolista(){
        @Override
        public int compare(final Futbolista nombre1, final Futbolista nombre2){
            return nombre1.name.compareTo(nombre2.name);
        }
    }
    );
    */
    private ArrayList<String> listaTitulos = new ArrayList<String>();

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

        XmlPullParser parser = getResources().getXml(R.xml.futbolistas);
        int eventType = -1;

        while (eventType != XmlResourceParser.END_DOCUMENT) {
            eventType = parser.next();
            if (eventType == XmlResourceParser.START_TAG) {
                String currentTagName = parser.getName();
                if (currentTagName.equals("futbolista")) {
                    String nombreValue = parser.getAttributeValue(null, "nombre");
                    String posicionValue = parser.getAttributeValue(null, "posicion");
                    String historia = parser.getAttributeValue(null, "historia");
                    String imagen = parser.getAttributeValue(null, "imagen");

                    Futbolista futbolistaActual= new Futbolista(nombreValue, posicionValue, historia);

                    listaFutbolistas.add(futbolistaActual);
                    listaTitulos.add(nombreValue);
                }
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

                i.putExtra("Futbolistas",listaFutbolistas.get(position));
                startActivity(i);
            }
        });
    }
}

