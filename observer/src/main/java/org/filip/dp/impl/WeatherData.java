package org.filip.dp.impl;

import org.filip.dp.Observer;
import org.filip.dp.Subject;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class WeatherData implements Subject {

    private List<Observer> observers;
    private boolean stateChanged;

    private float pressure;
    private float temperature;
    private float humidity;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (stateChanged) {
            observers.forEach(Observer::update);
            stateChanged = false;
        }
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        if (!smallChange(temperature, humidity, pressure)) {
            stateChanged = true;
        } else {
            stateChanged = false;
        }

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObservers();
    }

    private boolean smallChange(float temperature, float humidity, float pressure) {
        float tempDiff = getTemperature() - temperature;
        float humidityDiff = getHumidity() - humidity;
        float pressureDiff = getPressure() - pressure;

        return abs(tempDiff) + abs(humidityDiff) + abs(pressureDiff) < 5;
    }
}
