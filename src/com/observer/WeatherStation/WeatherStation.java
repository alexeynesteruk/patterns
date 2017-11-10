package com.observer.WeatherStation;

import com.observer.Interfaces.Observable;
import com.observer.Interfaces.Subject;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class WeatherStation implements Subject {
    private ArrayList<Observable> _observerList = new ArrayList<>();

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
        notifySubscribers();
    }

    private void refreshMeasurements() {
        WeatherData weatherState = ServerWeather.getCurrentWeather();
        if (weatherState != null) {
            setMeasurements(weatherState);
        }
    }

    public void subscribe(Observable observer) {
        if (!_observerList.contains(observer)) {
            _observerList.add(observer);
        }
    }

    public void unSubscribe(Observable observer) {
        if (_observerList.contains(observer)) {
            _observerList.remove(observer);
        }
    }

    public void notifySubscribers() {
        _observerList.forEach((o) -> o.update(_currentTemp, _currentHumidity, _currentPressure));
    }
}