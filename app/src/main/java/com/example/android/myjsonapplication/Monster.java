package com.example.android.myjsonapplication;

public class Monster {
    private String name;
    private String imageFile;
    private String caption;
    private String description;
    private Double price;
    private Integer scariness;

    public Monster(String name, String imageFile, String caption, String description, Double price, Integer scariness) {
        this.name = name;
        this.imageFile = imageFile;
        this.caption = caption;
        this.description = description;
        this.price = price;
        this.scariness = scariness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageFile() {
        return imageFile;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getScariness() {
        return scariness;
    }

    public void setScariness(Integer scariness) {
        this.scariness = scariness;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", imageFile='" + imageFile + '\'' +
                ", caption='" + caption + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", scariness=" + scariness +
                '}';
    }
}
