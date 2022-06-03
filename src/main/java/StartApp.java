import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class StartApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/tabs/StartPage.fxml"));
        stage.setTitle("FX Application");
        Scene sc = new Scene(root, 500, 1000);
        sc.getStylesheets().addAll(StartApp.class.getResource("/css/style.css").toExternalForm());
        stage.setScene(sc);
        //stage.getIcons().add(new Image(StartApp.class.getResource("/image/logo.png").toExternalForm()));
        stage.setResizable(false);
        stage.show();
    }
}
