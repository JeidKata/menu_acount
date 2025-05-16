package com.globant.java.menu;

public class Dish {
    private String dish;
    private float price;

    public Dish(String dish, float price) {
        this.dish = dish;
        this.price = price;
    }

    public String getName() {
        return this.dish;
    }

    public void setName(String dish) {
        this.dish = dish;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}