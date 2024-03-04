package com.niq.assignment.dto;

public class ProductResponse {

    private String productId;
    private String category;
    private String brand;
    // Add more fields as needed

    // Constructors, getters, and setters

    public ProductResponse() {
    }

    public ProductResponse(String productId, String category, String brand) {
        this.productId = productId;
        this.category = category;
        this.brand = brand;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
