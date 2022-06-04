package view;

import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import products.Knife;

import static model.Model.getModel;

public class BasketView extends AbstractView {

    @FXML
    private TableView tableView;
    @FXML
    private Label ll_sum;
    @FXML
    protected Button btn_create_order, btn_clear_basket, btn_back;


    private void createTable() {
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        tableView.getStyleClass().add("noheader");
        tableView.setSelectionModel(null);
        TableColumn<Knife, ImageView> imageCol = new TableColumn<>("Изображение");
        imageCol.setCellValueFactory(param -> {
            Image image = new Image(param.getValue().getSmall_icon());
            ImageView imageView = new ImageView(image);
            return new SimpleObjectProperty<>(imageView);
        });
        TableColumn<Knife, String> nameCol = new TableColumn<>("Название");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        nameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        tableView.setItems(getModel().getBasketProducts());
        tableView.getColumns().setAll(imageCol, nameCol);
    }

    @Override
    public void init() {
        createTable();
        ll_sum.setText(getModel().getSum());
    }
}
