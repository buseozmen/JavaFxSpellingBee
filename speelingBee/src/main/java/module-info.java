module com.example.grup6 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.grup6 to javafx.fxml;
    exports com.example.grup6;
}