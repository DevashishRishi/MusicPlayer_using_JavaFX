module com.example.midfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.graphics;

    opens com.example.midfx to javafx.fxml;

    exports com.example.midfx;
}
