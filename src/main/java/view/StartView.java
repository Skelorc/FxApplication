package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;

import static model.Model.getModel;

public class StartView extends AbstractView {

    @FXML
    protected ComboBox<String> cb_choice_category;
    @FXML
    protected Button btn_continue;
    @FXML
    private ImageView imageView_logo;

    @Override
    public void init() {
        cb_choice_category.getItems().addAll(getModel().getCategories());
        addStyleToButton(btn_continue,"Button_continue.png");
        addImageToImageView(imageView_logo,"/images/Other/Logo.png");
    }



}
