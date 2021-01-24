package kungfulife;

import javafx.fxml.FXML;
import javafx.scene.layout.HBox;

public class testSceneController {

    @FXML
    public void initialize()
    {
        setTopPaneMouseDrag();
    }


    // Helpers
    @FXML
    HBox topBar;
    private double xOffset = 0, yOffset = 0;

    private void setTopPaneMouseDrag()
    {
        //drag it here
        topBar.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        topBar.setOnMouseDragged(event -> {
            topBar.getScene().getWindow().setX(event.getScreenX() - xOffset);
            topBar.getScene().getWindow().setY(event.getScreenY() - yOffset);
        });
    }
}
