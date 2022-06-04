package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

import static model.Model.getModel;

public class DescriptionView extends AbstractView{
    @FXML
    private ImageView imageView_main;
    @FXML
    protected Button btn_back;
    @FXML
    private Label ll_name,ll_price;
    @FXML
    private TextArea ta_description;


    @Override
    public void init() {
        addImageToImageView(imageView_main,getModel().getBigIcon());
        ll_name.setText(getModel().getName());
        ta_description.setText(getModel().getDescription());
        ll_price.setText(getModel().getPrice());
    }
}
