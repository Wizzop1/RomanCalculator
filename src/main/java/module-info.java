module com.example.digitconverter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.digitconverter to javafx.fxml;
    exports com.example.digitconverter;
}
