package messages;

import javafx.scene.control.Alert;
import javafx.scene.layout.Region;

public class Messages {

    public static void createErrorAlertDialog(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.getDialogPane().setStyle("-fx-font-family: Segoe UI; -fx-font-size: 24;-fx-font-weight: Bold;");
        String title_for_alert = "Ошибка!";
        alert.setTitle(title_for_alert);
        alert.setHeaderText("Ошибка");
        alert.setContentText(message);
        alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
        alert.showAndWait();
    }
}
