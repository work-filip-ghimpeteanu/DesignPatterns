package org.filip.dp.impl;

import org.filip.dp.DisplayElement;
import org.filip.dp.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;
    private float temperatureSum = 0.0f;
    private float maxTemperature = 0;
    private float minTemperature = 200.0f;
    private int nrReadings = 0;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {

        System.out.println(String.format("Avg/Max/Min temperature: %.2f/%.2f/%.2f",
                temperatureSum / nrReadings,
                maxTemperature,
                minTemperature));
    }

    @Override
    public void update() {
        float currentTemperature = weatherData.getTemperature();
        temperatureSum += currentTemperature;
        nrReadings++;

        if (currentTemperature > maxTemperature) {
            maxTemperature = currentTemperature;
        }

        if (currentTemperature < minTemperature) {
            minTemperature = currentTemperature;
        }

        display();
    }
}
