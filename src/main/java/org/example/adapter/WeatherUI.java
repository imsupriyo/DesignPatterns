package org.example.adapter;

public class WeatherUI {
    public int showWeather(String zipCode) {
        return WeatherAdapter.findTemperature(zipCode);
    }
}
