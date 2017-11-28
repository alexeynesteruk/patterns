package com.observer.WeatherStation;

import org.json.JSONObject;

public class WeatherData {
    float temp;
    float humidity;
    float pressure;

    WeatherData(JSONObject json){
        JSONObject weather = (JSONObject) json.get("main");
        temp = getValue(weather,"temp");
        humidity = getValue(weather,"humidity");
        pressure = getValue(weather,"pressure");
    }

    private float getValue(JSONObject obj, String pName){
        return Float.parseFloat( obj.get(pName).toString());
    }

    private float KtoC(float temp){
        return temp - 273;
    }
}
