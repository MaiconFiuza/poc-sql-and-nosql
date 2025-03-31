package com.fiuza.product_catalog.controller;

import com.fiuza.product_catalog.model.dto.ProductRequest;
import com.fiuza.product_catalog.model.entities.Product;
import com.fiuza.product_catalog.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody ProductRequest productRequest) {
        var product = productService.create(productRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

}
