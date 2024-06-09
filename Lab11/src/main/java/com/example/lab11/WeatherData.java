package com.example.lab11;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private  float temperature;
    private  float humidity;
    private  float pressure;

    private List<Observer> observers = new ArrayList<>();





    @Override
    public void registerObserver(Observer o) {
        if (! observers.contains(o ))observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {

        if(observers.contains(o)) observers.remove(o);

    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers)
            o.update(temperature,humidity,pressure);
    }

    public void measurementChanged(){

        temperature= (float )(15+(Math.random()-0.5)*20);
        humidity= (float)(100*Math.random());
        pressure=1000;
        notifyObserver();
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", observers=" + observers +
                '}';
    }

    public void setTemperature(double asDouble) {
    }

    public void setPressure(int asInt) {
    }

    public void setHumidity(int asInt) {
    }
}
