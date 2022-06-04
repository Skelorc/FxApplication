package controllers;

import view.BasketView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static constants.TextConstants.*;
import static model.Model.getModel;
import static utils.ChangeScene.changeWindow;

public class BasketController extends BasketView {


    @FXML
    public void basketAction(ActionEvent actionEvent)
    {
        Button btn = (Button)actionEvent.getSource();
        String id_button = btn.getId();
        if(id_button.equals(btn_back.getId()))
        {
            changeWindow(btn,MARKET_PAGE);
        }
        if(id_button.equals(btn_clear_basket.getId()))
        {
            getModel().clearBasket();
        }
        if(id_button.equals(btn_create_order.getId()))
        {
            changeWindow(btn,CREATE_ORDER);
        }
    }

    @FXML
    void initialize() {
        init();
    }
}
