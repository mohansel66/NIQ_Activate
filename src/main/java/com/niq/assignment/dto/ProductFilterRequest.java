package com.niq.assignment.dto;

public class ProductFilterRequest {
    private String productId;
    private String category;
    private String brand;
    private int limit;

    // Constructors, getters, and setters

    public ProductFilterRequest() {
    }

    public ProductFilterRequest(String productId, String category, String brand, int limit) {
        this.productId = productId;
        this.category = category;
        this.brand = brand;
        this.limit = limit;
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

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
