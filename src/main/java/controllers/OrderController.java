package controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import view.OrderView;
import javafx.fxml.FXML;

import static constants.TextConstants.*;
import static utils.ChangeScene.changeWindow;

public class OrderController extends OrderView {

    @FXML
    public void orderAction(ActionEvent actionEvent)
    {
        Button btn = (Button)actionEvent.getSource();
        String id_button = btn.getId();
        if(id_button.equals(btn_back.getId()))
        {
            changeWindow(btn,BASKET_PAGE);
        }
        if(id_button.equals(btn_buy.getId()))
        {
            changeWindow(btn,BUY_PAGE);
        }
    }

    @FXML
    void initialize() {
        init();
    }
}
