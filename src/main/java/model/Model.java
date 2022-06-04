package model;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import products.Knife;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static messages.Messages.createErrorAlertDialog;


public class Model {

    private static final Model model = new Model();

    public static Model getModel() {
        return model;
    }
    private List<Knife> list;
    private List<Knife> list_for_view;
    private ObservableList<Knife> list_basket = FXCollections.observableArrayList(new ArrayList<>());
    private Knife knife;

    public Model() {
        getProductsFromJson();
    }

    public String getSmallImage() {
        return list_for_view.get(0).getSmall_icon();
    }

    public String getNextImage() {
        knife = list_for_view.stream().filter(x -> !x.equals(this.knife)).findFirst().orElse(null);
        return knife.getSmall_icon();
    }



    public List<Knife> getListKnifesByCategory(String selectedItem) {
        if (selectedItem != null && !selectedItem.isEmpty()) {
            list_for_view = new ArrayList<>();
            list_for_view = list.stream().filter(x -> x.getCategory().equals(selectedItem)).collect(Collectors.toList());
            knife = list_for_view.get(0);
            return list_for_view;
        } else {
            createErrorAlertDialog("Вы не выбрали категорию!");
            throw new NullPointerException("Категория не выбрана");
        }
    }

    private void getProductsFromJson() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            list = mapper.readValue(new File("products storage/knifes.json"), new TypeReference<List<Knife>>() {
            });
        } catch (JsonMappingException e) {
            System.out.println("Проблема с считыванием характеристик товаров!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Не найден файл с настройками товаров!");
            e.printStackTrace();
        }
    }


    public ObservableList<String> getCategories() {
        Set<String> categories = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            String category = list.get(i).getCategory();
            categories.add(category);
        }
        return FXCollections.observableArrayList(new ArrayList<>(categories));
    }

    public String getMainIcon() {
        return list_for_view.get(0).getMain_icon();
    }

    public String getBigIcon()
    {
        return knife.getBig_icon();
    }

    public String getName() {
        return knife.getName();
    }
    public String getDescription()
    {
        return knife.getDescription();
    }
    public String getPrice()
    {
        String s = String.valueOf(knife.getPrice());
        return s+" Р.";
    }

    public void addProductToBasket() {
        list_basket.add(knife);
    }

    public ObservableList<Knife> getBasketProducts() {
        return list_basket;
    }

    public void clearBasket()
    {
        list_basket.clear();
    }

    public String getSum() {
        int sum = 0;
        for (int i = 0; i < list_for_view.size(); i++) {
            sum +=list_for_view.get(i).getPrice();
        }
        String s = String.valueOf(sum);
        return s+" P.";
    }
}
