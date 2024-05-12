package com.example.calorie_monitor.models;

public class HomeVerModel {
    int image;
    String product_name;
    String timing;
    String raiting;
    String price;

    public HomeVerModel(int image, String product_name, String timing, String raiting, String price) {
        this.image = image;
        this.product_name = product_name;
        this.timing = timing;
        this.raiting = raiting;
        this.price = price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getRaiting() {
        return raiting;
    }

    public void setRaiting(String raiting) {
        this.raiting = raiting;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
