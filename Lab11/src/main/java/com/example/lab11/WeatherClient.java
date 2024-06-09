package com.example.lab11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;



public class WeatherClient {
    private double temperature;
    private int pressure;
    private int humidity;
    private static final String API_KEY = "83af4ed9d51e08619340beaa613af159";
    private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather";

    public static JsonObject getWeatherData(WeatherData city) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "?q=" + city + "&appid=" + API_KEY + "&units=metric"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        Gson gson = new Gson();
        JsonElement json = gson.fromJson(response.body(), JsonElement.class);
        JsonObject jsonObject = json.getAsJsonObject();
        WeatherData weatherData = new WeatherData();
        weatherData.setTemperature(jsonObject.get("main").getAsJsonObject().get("temp").getAsDouble());
        weatherData.setPressure(jsonObject.get("main").getAsJsonObject().get("pressure").getAsInt());
        weatherData.setHumidity(jsonObject.get("main").getAsJsonObject().get("humidity").getAsInt());

        return null;
    }



        public double getTemperature() {
            return temperature;
        }

        public void setTemperature(double temperature) {
            this.temperature = temperature;
        }

        public int getPressure() {
            return pressure;
        }

        public void setPressure(int pressure) {
            this.pressure = pressure;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

    public static double getTemperature(JsonObject weatherData) {
        return weatherData.getAsJsonObject("main").get("temp").getAsDouble();
    }

    public static int getPressure(JsonObject weatherData) {
        return weatherData.getAsJsonObject("main").get("pressure").getAsInt();
    }

    public static int getHumidity(JsonObject weatherData) {
        return weatherData.getAsJsonObject("main").get("humidity").getAsInt();
    }
}
