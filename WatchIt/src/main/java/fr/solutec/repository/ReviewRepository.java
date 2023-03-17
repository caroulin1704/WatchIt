package fr.solutec.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Review;

public interface ReviewRepository extends CrudRepository<Review, Review.ReviewId> {
	
	public Optional<Review> findById(Review.ReviewId id);
}
