package com.fiuza.product_catalog.repositories;

import com.fiuza.product_catalog.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
