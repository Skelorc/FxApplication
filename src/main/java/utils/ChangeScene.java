package utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.stage.Stage;

import java.io.IOException;

public class ChangeScene {

    public static void changeWindow(Control control, String name_tab) {
        Stage stage =  (Stage) control.getScene().getWindow();
        try {
            Parent tab = FXMLLoader.load(ChangeScene.class.getResource("/tabs/"+name_tab+".fxml"));
            Scene sc = new Scene(tab, 500, 1000);
            stage.setTitle(name_tab);
            sc.getStylesheets().addAll(ChangeScene.class.getResource("/css/style.css").toExternalForm());
            stage.setScene(sc);
            stage.setResizable(false);
            stage.show();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
