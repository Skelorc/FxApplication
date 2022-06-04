package controllers;

import view.DescriptionView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import static constants.TextConstants.MARKET_PAGE;
import static utils.ChangeScene.changeWindow;

public class DescriptionController extends DescriptionView {

    @FXML
    public void backToMarket(ActionEvent actionEvent)
    {
        changeWindow(btn_back,MARKET_PAGE);
    }


    @FXML
    void initialize() {
        init();
    }
}
