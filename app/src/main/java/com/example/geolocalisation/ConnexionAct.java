package com.example.geolocalisation;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

import android.os.Bundle;

public class ConnexionAct extends AppCompatActivity {

    Button connection_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);
        this.connection_btn = (Button) findViewById(R.id.btn);

        //EditText login = (EditText) findViewById(R.id.login);
        //EditText pwd = (EditText) findViewById(R.id.pwd);

        this.connection_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String token = null;
                String login = "root";
                String pwd = "root";
                try {
                    String url = "http://192.168.13.40:3000/connection/user/" + login + "/pswd/" + pwd;
                    token = APIConnection.get(url);
                    switchActivity(token);
                    Toast toast = Toast.makeText(ConnexionAct.this, token, Toast.LENGTH_LONG);
                    toast.show();
                    Log.e("aaaaaaa", token);
                } catch (IOException e) {
                    Log.e("OEEEEEEEEEE C'EST LA D", e.toString());
                }
            }
        });

    }


    private void switchActivity(String token) {
        Intent switchActivityIntent = new Intent(this, ListingProduit.class);
        switchActivityIntent.putExtra("token", token);
        startActivity(switchActivityIntent);
    }

}