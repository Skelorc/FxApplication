package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BuyView extends AbstractView{

    @FXML
    private Label ll_thx;

    @Override
    public void init() {
        ll_thx.setText("Спасибо за покупку!");
    }
}
