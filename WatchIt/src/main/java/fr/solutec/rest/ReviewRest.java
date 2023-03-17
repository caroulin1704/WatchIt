package fr.solutec.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
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
	

}
