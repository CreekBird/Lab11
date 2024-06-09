package com.example.lab11;

import com.google.gson.JsonObject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Label cityLabel;

    @FXML
    private Label temperatureLabel;

    @FXML
    private Label humidityLabel;

    @FXML
    private Label pressureLabel;

    @FXML
    private TextField cityTextField;

    @FXML
    private TextField temperatureTextField;

    @FXML
    private TextField humidityTextField;

    @FXML
    private TextField pressureTextField;

    @FXML
    void getWeatherButton(ActionEvent event){
}
}
