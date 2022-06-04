package view;

import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

abstract class AbstractView implements View{

    protected void addStyleToButton(Button btn, String path_to_image)
    {
        ImageView imageView = new ImageView(getClass().getResource("/images/Other/" +path_to_image).toExternalForm());
        btn.setGraphic(imageView);
        btn.setPrefWidth(imageView.getFitWidth());
        btn.setPrefHeight(imageView.getFitHeight());
        btn.setContentDisplay(ContentDisplay.CENTER);
    }

    protected void addImageToImageView(ImageView imageView, String path)
    {
        Image image = new Image(path);
        imageView.setImage(image);
    }

    @Override
    public void init() {
    }
}
