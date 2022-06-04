package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class OrderView extends AbstractView{

    @FXML
    private ComboBox<String> cb_type_payment;
    @FXML
    protected Button btn_buy,btn_back;
    @FXML
    protected CheckBox chb_take;
    @FXML
    private TextField tf_name,tf_surname,tf_patronymic,tf_city,tf_address,tf_mail;

    @Override
    public void init() {
        btn_buy.setDisable(true);
        cb_type_payment.getItems().addAll("Банковская карта","Наличные");
        addBindToButton();
    }


    private void addBindToButton()
    {
        chb_take.selectedProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue)
            {
                btn_buy.setDisable(false);
            }
            else
            {
                btn_buy.setDisable(true);
            }
        });
    }
}
