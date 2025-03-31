package com.fiuza.product_catalog.mapper;

import com.fiuza.product_catalog.model.dto.ProductRequest;
import com.fiuza.product_catalog.model.entities.Product;

public abstract class ProductMapper {

    public static Product toProduct(ProductRequest productRequest) {
        return new Product(
                productRequest.name(),
                productRequest.description(),
                productRequest.price(),
                productRequest.categories()
        );
    }
}
