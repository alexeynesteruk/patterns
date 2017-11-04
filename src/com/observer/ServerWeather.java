package com.observer;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;

class ServerWeather {
    static WeatherData getCurrentWeather(){
        try{
            JSONObject serverWeatherData = ServerWeather.serverCall("http://api.openweathermap.org/data/2.5/weather?q=Minsk,By&&appid=23cc1c87ec97c91b2f924043b022dfc2");
            return new WeatherData(serverWeatherData);
        }
        catch(IOException error){
            System.out.println("Error: " + error.getMessage());
            return null;
        }
    }

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    private static JSONObject serverCall(String url) throws IOException, JSONException {
        try (InputStream is = new URL(url).openStream()) {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            return new JSONObject(jsonText);
        }
    }
}