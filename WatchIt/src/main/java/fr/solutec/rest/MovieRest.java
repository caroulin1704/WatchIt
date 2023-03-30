package fr.solutec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Movie;
import fr.solutec.repository.MovieRepository;

@RestController
@CrossOrigin("*")
public class MovieRest {
	@Autowired
	private MovieRepository movieRepos;
	
	@GetMapping("movie/{name}")
	public List<Movie> getMovieByName(@PathVariable String name){
		return movieRepos.findMovieByName(name);
	}
	@GetMapping("movie/{genre}")
	public List<Movie> getMovieByGenre(@PathVariable String genre){
		return movieRepos.findMovieByGenre(genre);
	}
	@GetMapping("movie/{director}")
	public List<Movie> getMovieByDirrector(@PathVariable String director){
		return movieRepos.findMovieByDirector(director);
	}
}
