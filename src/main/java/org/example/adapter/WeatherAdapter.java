package org.example.adapter;

public class WeatherAdapter {
    public static int findTemperature(String zipCode) {
        String city = null;
        if (zipCode.equals("742405")) {
            city = "Satui";
        } else {
            city = "Berhampore";
        }
        WeatherFinder finder = new WeatherFinder();
        return finder.getTemperature(city);
    }
}
