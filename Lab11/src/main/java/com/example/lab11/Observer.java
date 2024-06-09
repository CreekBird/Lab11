package com.example.lab11;

public interface Observer {
    void display(float temperature, float pressure, float humidity);

    void update(float temperature, float humidity, float pressure);
}
