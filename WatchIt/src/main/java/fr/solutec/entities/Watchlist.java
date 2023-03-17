package fr.solutec.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data @Entity

public class Watchlist {
	@Id @GeneratedValue
	private Long id;
	@OneToOne
	private User user;
	private boolean watched;
	@OneToMany
	private List<Movie> movies;
}
