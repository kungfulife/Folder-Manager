package kungfulife;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class JavaFxMain extends Application {

    @Override
    public void start(Stage primaryStage) {
        Parent root = null;

        try {
            root = FXMLLoader.load(getClass().getResource("overview.fxml"));
        }catch (IOException e)
        {
            e.printStackTrace();
        }

        primaryStage.setScene(new Scene(root, 800,600));
        primaryStage.setTitle("File Manager");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
