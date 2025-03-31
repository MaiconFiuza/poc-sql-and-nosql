package com.fiuza.product_catalog.repositories;

import com.fiuza.product_catalog.model.entities.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.UUID;

public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
    List<Review> findAllByProductId(UUID productId);
}
