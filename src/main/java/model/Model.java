package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import knifes.Knife;

import java.util.ArrayList;
import java.util.List;

import static constants.TextConstants.*;


public class Model {

    public ObservableList<String> getCategories()
    {
        List<String> categories = new ArrayList<>();
        categories.add(CHIEF_KNIFE);
        categories.add(UNIVERSAL_KNIFE);
        categories.add(BREAD_KNIFE);
        return FXCollections.observableArrayList(categories);
    }

    public Knife getImageWhenChoiceCategory(String selectedItem) {
        if(selectedItem != null && !selectedItem.isEmpty())
        switch (selectedItem)
        {
            case CHIEF_KNIFE:
                return new Knife(CHIEF_KNIFE,)

        }
    }



    public String getCategory() {
        return category;
    }
}
