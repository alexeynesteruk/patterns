package com.observer;

import org.json.JSONObject;

class WeatherData {
    float temp;
    float humidity;
    float pressure;

    WeatherData(JSONObject json){
        JSONObject weather = (JSONObject) json.get("main");
        temp = KtoC(getValue(weather,"temp"));
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
