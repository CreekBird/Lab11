module com.example.lab11 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;


    opens com.example.lab11 to javafx.fxml;
    exports com.example.lab11;
}