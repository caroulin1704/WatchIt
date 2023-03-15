package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Rating;

public interface RatingRepository extends CrudRepository<Rating, Rating.RatingId> {

}
