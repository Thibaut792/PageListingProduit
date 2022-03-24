package com.example.geolocalisation;
import android.os.StrictMode;
import android.util.Log;

import com.google.android.gms.common.api.Response;

import java.io.IOException;


public abstract class APIConnection {
    public static String get(String url) throws IOException {
        try {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);

            OkHttpClient client = new OkHttpClient().newBuilder().build();

            Request request = new Request.Builder().url(url).method("GET", null).addHeader("Content-Type", "application/json").build();

            Response response = client.newCall(request).execute();

            response.body().string();
        } catch (Exception e) {
            Log.e("Connection error: ", e.toString());
            return ("Error");
        }
    }
}
