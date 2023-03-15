package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Review;

public interface ReviewRepository extends CrudRepository<Review, Review.ReviewId> {
	
}
