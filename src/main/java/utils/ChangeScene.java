package utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.stage.Stage;

import java.io.IOException;

public class ChangeScene {

    public static void changeWindow(Control control, String name_tab) {
        Stage old_stage =  (Stage)control.getScene().getWindow();
        old_stage.close();
        Parent root = null;
        try {
            root = FXMLLoader.load(control.getClass().getResource("/tabs/"+name_tab+".fxml"));
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        Stage new_stage = new Stage();
        new_stage.setTitle("FX Application");
        Scene sc = new Scene(root, 500, 1000);
        sc.getStylesheets().addAll(control.getClass().getResource("/css/style.css").toExternalForm());
        old_stage.setScene(sc);
        //stage.getIcons().add(new Image(StartApp.class.getResource("/image/logo.png").toExternalForm()));
        new_stage.setResizable(false);
        new_stage.show();
    }
}
