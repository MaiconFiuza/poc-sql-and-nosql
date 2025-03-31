package com.fiuza.product_catalog.model.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
public class Review {
    private String name;
    private String email;
    private UUID productId;
    private int rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
