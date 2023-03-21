package fr.solutec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Movie;

public interface MovieRepository extends CrudRepository<MovieRepository, Long> {
	
	@Query("SELECT m FROM Movie m WHERE m.name =?1")
	public List<Movie> findMovieByName(String nom);
	
	@Query("SELECT m FROM Movie m LEFT JOIN Casting c ON casting.movie_id = movie.id WHERE c.director = ?1")
	public List<Movie> findMovieByDirector(String nom);
	
	@Query("SELECT m FROM Movie m LEFT JOIN Genre g ON movie.genre_id = genre.id WHERE g.name = ?1")
	public List<Movie> findMovieByGenre(String nom);
	
}
