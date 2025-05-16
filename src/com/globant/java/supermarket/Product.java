package com.globant.java.supermarket;

public class Product {
    private String name = null;
    private float price;
    private int amount;
    private Product next;
    private Product previous;

    public Product(String name, float price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.next = null;
        this.previous = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Product getNext() {
        return next;
    }

    public void setNext(Product next) {
        this.next = next;
    }
}
