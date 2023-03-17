package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Rating;
import fr.solutec.entities.Review;
import fr.solutec.repository.RatingRepository;

@RestController
@CrossOrigin("*")
public class RatingRest {
	@Autowired
	private RatingRepository ratingRepos;
	
	@PostMapping("newRating")
	public Rating saveRating(@RequestBody Rating r) {
		return ratingRepos.save(r);
	}
	
	@DeleteMapping("Rating/{id}")
	public boolean deleteRating(@PathVariable Rating.RatingId id) {
		Optional<Rating> r = ratingRepos.findById(id);
		if(r.isPresent()) {
			ratingRepos.deleteById(id);
			return true;
		}
		return false;
	}
	
	@PutMapping("Rating/{id}")
	public Rating modifRating(@RequestBody Rating r, @PathVariable Rating.RatingId id) {
		r.setId(id);
		return ratingRepos.save(r);
	}
}
