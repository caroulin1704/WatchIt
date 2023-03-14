package fr.solutec.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data @Entity

public class Movie {
	@Id @GeneratedValue
	long id;
	String name;
	long runTime;
	Date releaseDate;
	@OneToMany
	private Genre genre;
}
