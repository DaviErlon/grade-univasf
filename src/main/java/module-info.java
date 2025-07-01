module grade {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.appgrade;
    exports com.appgrade.ui;
    requires javafx.graphics;

    opens com.appgrade.ui to javafx.fxml;
}
