package com.observer;

import com.observer.Interfaces.DisplayElement;
import com.observer.WeatherStation.WeatherData;
import com.observer.WeatherStation.WeatherStation;

import java.util.Observable;
import java.util.Observer;


class CurrentConditionsDisplay implements Observer,DisplayElement{
    private float _currentTemp = 0;
    private float _currentHumidity = 0;
    private float _currentPressure = 0;

    private Observable observable;


    CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    private float computeHeatIndex(float t, float rh) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }

    public void display() {
        System.out.println("Current conditions: "  +_currentTemp + "F degrees and " + _currentHumidity + "% humidity and pressure: "+ _currentPressure + " P");
        System.out.println("Heat index is " + computeHeatIndex(_currentTemp,_currentHumidity));
    }

    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherStation){
            WeatherStation weatherStation = (WeatherStation)obs;
            this._currentTemp = weatherStation.getTemp();
            this._currentHumidity = weatherStation.getHumidity();
            this._currentPressure = weatherStation.getPressure();
            display();
        }
    }
}

public class PObserver {
    public static void main(String[] args) {
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(new WeatherStation());
    }
}