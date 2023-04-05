package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Rating;
import fr.solutec.repository.RatingRepository;

@RestController
@CrossOrigin("*")
public class RatingRest {
	@Autowired
	private RatingRepository ratingRepos;
	
	@GetMapping("allRatings")
	public Iterable<Rating> getAllRating(){
		return ratingRepos.findAll();
	}
	
	@PostMapping("newRating")
	public Rating saveRating(@RequestBody Rating r) {
		return ratingRepos.save(r);
	}
	
}
