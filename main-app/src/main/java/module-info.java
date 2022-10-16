module com.frost1129.main.app {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.frost1129.main.app to javafx.fxml;
    exports com.frost1129.main.app;
}
