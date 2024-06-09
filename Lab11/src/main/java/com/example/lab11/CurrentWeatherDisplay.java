package com.example.lab11;

public class CurrentWeatherDisplay implements Display,Observer {
    private  float temperature;
    private  float humidity;
    private float pressure;


    @Override
    public void display(float temperature, float pressure, float humidity) {
        System.out.println("CURRENT WEATHER DATA");
        System.out.println("Current temp: " + temperature);
        System.out.println("Current hum: " + humidity);
        System.out.println("Current press: " + pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
    }

    @Override
    public void display() {

    }
}
