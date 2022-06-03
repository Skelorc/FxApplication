package View;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.ImageView;
import model.Model;

public class MainView implements View {

    @FXML
    protected ComboBox<String> cb_choice_category;
    @FXML
    protected Button btn_continue,btn_back,btn_basket;
    @FXML
    private ImageView imageView;


    private void addStyleToButton(Button btn, String path_to_image)
    {
        ImageView imageView = new ImageView(getClass().getResource("/images/"+path_to_image).toExternalForm());
        btn.setGraphic(imageView);
        btn.setPrefWidth(imageView.getFitWidth());
        btn.setPrefHeight(imageView.getFitHeight());
        btn.setContentDisplay(ContentDisplay.CENTER);
    }

    protected void addImage(String path)
    {
        imageView = new ImageView(getClass().getResource("/images/"+path).toExternalForm());
    }


    @Override
    public void init() {
        Model model = new Model();
        cb_choice_category.getItems().addAll(model.getCategories());
        addStyleToButton(btn_continue,"1_screen/Button_continue.png");
        addStyleToButton(btn_basket,"2_screen/Button_basket.png");
    }

}
