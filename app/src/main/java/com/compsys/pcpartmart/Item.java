package com.compsys.pcpartmart;

import java.io.Serializable;

public class Item implements Serializable {

    private String id;
    private String name;
    private String price;
    private int[] images;
    private String type;

    public Item(String id, String price, String name, String type, int[] images) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.images = images;
    }

    public String get_name() {
        return name;
    }

    public String get_price() {
        return price;
    }

    public int get_image(int i) {
        return images[i];
    }

    public String getType() {
        return this.type;
    }

    public int[] getImages() {
        return images;
    }
}
