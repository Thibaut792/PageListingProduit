package com.example.geolocalisation;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ListingProduit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing_produit);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        List<Item> items = new ArrayList<Item>();

        URL url;
        String line = "";
        try {
            //String token = null;
            url = new URL ("http://192.168.56.1:3000/produits");
            //token  = APIConnection.get(url);
            //Toast toast = Toast.makeText(ListingProduit.this, token, Toast.LENGTH_LONG);
            //toast.show();
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            BufferedReader rd = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            line = rd.readLine();
            JSONArray produits = new JSONArray();

            try {
                produits = new JSONArray(line);
                for (int i = 0; i< produits.length(); i++) {
                    //Log.e("aaaa", produits.getJSONObject(i).getString("nom"));
                    String nom_produit = produits.getJSONObject(i).getString("pr_reference");
                    String quantite = produits.getJSONObject(i).getString("pr_description"); //remplacer par le champs nb_produit
                    int photo = produits.getJSONObject(i).getInt("pr_cout_unitaire_HT"); //remplacer par le champs ph_img

                    items.add(new Item(nom_produit, photo, quantite));

                }

            } catch (JSONException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));
    }}