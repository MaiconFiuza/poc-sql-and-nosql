package com.fiuza.product_catalog.controller;

import com.fiuza.product_catalog.model.entities.Product;
import com.fiuza.product_catalog.model.entities.Review;
import com.fiuza.product_catalog.service.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/review")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping
    public ResponseEntity<Review> create(@RequestBody Review input) {
        var review = reviewService.create(input);
        return ResponseEntity.status(HttpStatus.CREATED).body(review);
    }


    @GetMapping("/{id}")
    public ResponseEntity<List<Review>> getAllProductReviews(@PathVariable UUID id) {
        var products = reviewService.getAllReviewByProductId(id);
        return ResponseEntity.ok(products);
    }

}
