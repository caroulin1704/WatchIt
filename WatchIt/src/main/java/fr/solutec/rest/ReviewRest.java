package fr.solutec.rest;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Review;
import fr.solutec.repository.ReviewRepository;

@RestController
@CrossOrigin("*")
public class ReviewRest {
	@Autowired
	private ReviewRepository reviewRepos;
	
	@GetMapping("allreviews")
	public Iterable<Review> getAllReviews(){
		return reviewRepos.findAll();
	}
	
	@PostMapping("newReview")
	public Review saveReview(@RequestBody Review r) {
		return reviewRepos.save(r);
	}
	
	@DeleteMapping("delete/{id}")
	public boolean deleteReview(@PathVariable Review.ReviewId id) {
		Optional<Review> r = reviewRepos.findById(id);
		if(r.isPresent()) {
			reviewRepos.deleteById(id);
			return true;
		}
		return false;
	}
	
	@PutMapping("review/{id}")
	public Review modifReview(@RequestBody Review r, @PathVariable Review.ReviewId id) {
		r.setId(id);
		return reviewRepos.save(r);
	}

}
