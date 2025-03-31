package com.fiuza.product_catalog.service;

import com.fiuza.product_catalog.model.entities.Review;
import com.fiuza.product_catalog.repositories.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;
    // depois colocar o repository do user para verificar se ele existe mesmo

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Review create(Review review){
        return reviewRepository.save(review);
    }

    public List<Review> getAllReviewByProductId(UUID productId) {
        return reviewRepository.findAllByProductId(productId);
    }
}
