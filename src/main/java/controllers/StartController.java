package controllers;

import view.StartView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static constants.TextConstants.MARKET_PAGE;
import static model.Model.getModel;
import static utils.ChangeScene.changeWindow;


public class StartController extends StartView {

    @FXML
    public void started(ActionEvent actionEvent)
    {
        Button btn = (Button)actionEvent.getSource();
        String id_button = btn.getId();
        if(id_button.equals(btn_continue.getId()))
        {
            String selectedItem = cb_choice_category.getSelectionModel().getSelectedItem();
            getModel().getListKnifesByCategory(selectedItem);
            changeWindow(btn,MARKET_PAGE);
        }
    }


    @FXML
    void initialize() {
        init();
    }
}
