package fr.solutec.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data @Entity

public class Watchlist {
	@Id @OneToOne
	private User user;
	List<Movie> movies;
	boolean watched;
}
