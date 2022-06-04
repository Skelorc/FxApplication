package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import static model.Model.getModel;


public class MarketView extends AbstractView {

    @FXML
    protected Button btn_back, btn_basket, btn_add_to_basket,
            btn_more, btn_previous, btn_next;

    @FXML
    private ImageView imageView_main, imageView_product;
    @FXML
    protected Label label_name;

    protected void nextValue()
    {
        addImageToImageView(imageView_product, getModel().getNextImage());
        label_name.setText(getModel().getName());
    }

    @Override
    public void init() {
        addStyleToButton(btn_basket, "Button_basket.png");
        addImageToImageView(imageView_main, getModel().getMainIcon());
        addImageToImageView(imageView_product, getModel().getSmallImage());
        label_name.setText(getModel().getName());
    }
}
