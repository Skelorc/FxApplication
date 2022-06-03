package knifes;

public class Knife {

    private String name;
    private String path_to_icon;
    private String first_photo;
    private String second_photo;

    public Knife(String name, String path_to_icon, String first_photo, String second_photo) {
        this.name = name;
        this.path_to_icon = path_to_icon;
        this.first_photo = first_photo;
        this.second_photo = second_photo;
    }

    public String getName() {
        return name;
    }

    public String getPath_to_icon() {
        return path_to_icon;
    }

    public String getFirst_photo() {
        return first_photo;
    }

    public String getSecond_photo() {
        return second_photo;
    }
}
