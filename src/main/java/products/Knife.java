package products;

import java.util.Objects;

public class Knife {

    private String category;
    private String name;
    private String description;
    private int price;
    private String main_icon;
    private String big_icon;
    private String small_icon;


    public Knife() {
    }

    @Override
    public String toString() {
        return "Knife{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", main_icon='" + main_icon + '\'' +
                ", small_icon='" + small_icon + '\'' +
                ", big_icon='" + big_icon + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Knife knife = (Knife) o;
        return price == knife.price && Objects.equals(category, knife.category) && Objects.equals(name, knife.name) && Objects.equals(description, knife.description) && Objects.equals(main_icon, knife.main_icon) && Objects.equals(small_icon, knife.small_icon) && Objects.equals(big_icon, knife.big_icon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, name, description, price, main_icon, small_icon, big_icon);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMain_icon() {
        return main_icon;
    }

    public void setMain_icon(String main_icon) {
        this.main_icon = main_icon;
    }

    public String getSmall_icon() {
        return small_icon;
    }

    public void setSmall_icon(String small_icon) {
        this.small_icon = small_icon;
    }

    public String getBig_icon() {
        return big_icon;
    }

    public void setBig_icon(String big_icon) {
        this.big_icon = big_icon;
    }

    public Knife(String category, String name, String description, int price, String main_icon, String small_icon, String big_icon) {
        this.category = category;
        this.name = name;
        this.description = description;
        this.price = price;
        this.main_icon = main_icon;
        this.small_icon = small_icon;
        this.big_icon = big_icon;
    }
}
