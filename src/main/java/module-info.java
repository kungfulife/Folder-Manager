module FileManager {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens kungfulife to javafx.graphics, javafx.fxml;
}