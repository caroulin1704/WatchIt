package fr.solutec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Casting;
import fr.solutec.entities.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long> {
	
	@Query("SELECT m FROM Movie m WHERE m.name LIKE %?1%")
	public List<Movie> findMovieByName(String nom);

	@Query("SELECT m FROM Movie m WHERE m.genre =?1")
	public List<Movie> findMovieByGenre(String genre);
	
	@Query(value = "SELECT m FROM Movie m JOIN Casting c ON m.id = c.movie.id WHERE c.director =?1")
	public List<Movie> findMovieByDirector(String director);
	
}
