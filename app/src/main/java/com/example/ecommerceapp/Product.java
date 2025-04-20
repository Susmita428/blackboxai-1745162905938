package com.example.ecommerceapp;

public class Product {
    private String id;
    private String name;
    private String description;
    private double price;
    private int imageResource;

    public Product(String id, String name, String description, double price, int imageResource) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageResource = imageResource;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getImageResource() {
        return imageResource;
    }
}
