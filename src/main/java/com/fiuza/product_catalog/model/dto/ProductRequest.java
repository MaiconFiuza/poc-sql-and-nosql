package com.fiuza.product_catalog.model.dto;

import com.fiuza.product_catalog.model.enums.Category;

import java.util.Set;

public record ProductRequest(
        String name, String description, double price, Set<Category> categories
) {
}
