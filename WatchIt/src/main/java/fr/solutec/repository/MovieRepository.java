package fr.solutec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long> {
	
	@Query("SELECT m FROM Movie m WHERE m.name =?1")
	public List<Movie> findMovieByName(String nom);
	
}
