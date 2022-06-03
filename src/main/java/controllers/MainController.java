package controllers;

import View.MainView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.Model;

import static utils.ChangeScene.changeWindow;


public class MainController extends MainView {

    private Model model;

    @FXML
    public void getAction(ActionEvent actionEvent)
    {
        Button btn = (Button)actionEvent.getSource();
        String id_button = btn.getId();
        if(id_button.equals(btn_continue.getId()))
        {
            String selectedItem = cb_choice_category.getSelectionModel().getSelectedItem();
            model.getImageWhenChoiceCategory(selectedItem);
            changeWindow(btn,"SecondPage");
        }
    }


    @FXML
    void initialize() {
        model = new Model();
        init();
    }
}
