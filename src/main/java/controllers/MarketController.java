package controllers;

import view.MarketView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static constants.TextConstants.*;
import static model.Model.getModel;
import static utils.ChangeScene.changeWindow;

public class MarketController extends MarketView {

    @FXML
    public void marketAction(ActionEvent actionEvent)
    {
        Button btn = (Button)actionEvent.getSource();
        String id_button = btn.getId();
        if(id_button.equals(btn_back.getId()))
        {
            changeWindow(btn,START_PAGE);
        }
        if(id_button.equals(btn_next.getId()) || id_button.equals(btn_previous.getId()))
        {
            nextValue();
        }
        if(id_button.equals(btn_more.getId()))
        {
            changeWindow(btn,DESCRIPTION_PAGE);
        }
        if(id_button.equals(btn_basket.getId()))
        {
            changeWindow(btn,BASKET_PAGE);
        }
        if(id_button.equals(btn_add_to_basket.getId()))
        {
            getModel().addProductToBasket();
        }


    }


    @FXML
    void initialize() {
        init();
    }
}
