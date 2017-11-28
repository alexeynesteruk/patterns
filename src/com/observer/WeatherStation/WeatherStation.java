package com.observer.WeatherStation;

import java.util.Observable;

import java.util.Timer;
import java.util.TimerTask;

public class WeatherStation extends Observable {

    private float _currentTemp = 0;
    private float _currentHumidity = 0;
    private float _currentPressure = 0;

    public WeatherStation() {
        refreshMeasurements();
        setUpdatePeriod();
    }

    private void setUpdatePeriod(){
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run()
            {
                refreshMeasurements();
            }
        };
        timer.schedule( task, 0L ,10000L );
    }

    private void setMeasurements(WeatherData currentWeather) {
        _currentTemp = currentWeather.temp;
        _currentHumidity = currentWeather.humidity;
        _currentPressure = currentWeather.pressure;

        measurementsChanged();
    }

    private void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    private void refreshMeasurements() {
        WeatherData weatherState = ServerWeather.getCurrentWeather();
        if (weatherState != null) {
            setMeasurements(weatherState);
        }
    }

    public float getTemp(){
        return _currentTemp;
    }

    public float getHumidity(){
        return _currentHumidity;
    }

    public float getPressure() {
        return _currentPressure;
    }
}