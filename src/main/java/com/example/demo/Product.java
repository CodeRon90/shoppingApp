package com.example.demo;

public class Product {

    int productID;
    String name;
    String description;
    int stock;
    double price;

    public Product(int productID, String name, String description, int stock, double price) {
        this.productID = productID;
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void updateStock(int newStock){

         int updatedStock = this.stock+=newStock;

    }


}