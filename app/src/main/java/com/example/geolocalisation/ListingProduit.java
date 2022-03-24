package com.example.geolocalisation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

public class ListingProduit extends AppCompatActivity {

    //private String nom;
    //private int quantite;
    //private int photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing_produit);

        //String line;
        //URL url;

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        List<Item> items = new ArrayList<>();
        items.add(new Item("Chaussure",R.drawable.chaussure,"3"));
        items.add(new Item("Pentalon", R.drawable.chaussure, "2"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));



       /* try {
            url = new URL("http://192.168.43.2/all4sport/API/produitStocke.php");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            BufferedReader rd = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            line = rd.readLine();
            JSONObject jsonObject = new JSONObject(line);

            JSONArray array = new JSONArray(jsonObject.getString("stock"));

            /*for (int i = 0; i < array.length(); i++) {
                // On récupère un objet JSON du tableau
                JSONObject obj = new JSONObject(array.getString(i));
                // On fait le lien Personne - Objet JSON
                Item item = new Item(nom, quantite, photo);
                item.setNom(obj.getString("nom"));
                item.setQuantite(obj.getInt("quantite"));
                item.setPhoto(obj.getInt("photo"));
                RecyclerView recyclerView = findViewById(R.id.recyclerview);
                List<Item> items = new ArrayList<Item>();
                items.add(new Item("Chaussure",R.drawable.chaussure,3));
                // <uses-permission
                //android:name="android.permission.ACCESS_FINE_LOCATION"
                //tools:ignore="CoarseFineLocation" />
                recyclerView.setLayoutManager(new LinearLayoutManager(this));
                recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));
             }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        } */


    }
}