package com.observer;

import com.observer.Interfaces.DisplayElement;
import com.observer.Interfaces.Observable;
import com.observer.Interfaces.Subject;
import com.observer.WeatherStation.WeatherStation;

class CurrentConditionsDisplay implements Observable,DisplayElement{
    private float _currentTemp = 0;
    private float _currentHumidity = 0;
    private float _currentPressure = 0;

    private Subject weatherData;

    CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.subscribe(this);
    }

    public void display() {
        System.out.println("Current conditions: "  +_currentTemp + " C degrees and " + _currentHumidity + "% humidity");
    }

    public void update(float temp, float humidity, float pressure) {
        this._currentTemp = temp;
        this._currentHumidity = humidity;
        this._currentPressure = pressure;
        display();
    }
}

public class Observer {
    public static void main(String[] args) {
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(new WeatherStation());
    }
}
