package com.fiuza.product_catalog.service;

import com.fiuza.product_catalog.mapper.ProductMapper;
import com.fiuza.product_catalog.model.dto.ProductRequest;
import com.fiuza.product_catalog.model.entities.Product;
import com.fiuza.product_catalog.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product create(ProductRequest productRequest) {
        var product = ProductMapper.toProduct(productRequest);
        return productRepository.save(product);
    }
}
