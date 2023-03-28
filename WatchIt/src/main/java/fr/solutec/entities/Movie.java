package fr.solutec.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data @Entity

public class Movie {
	@Id @GeneratedValue
	private Long id;
	private String name;
	private Long runTime;
	private Date releaseDate;
	@Enumerated(EnumType.STRING)
	private Genre genre;
	@Enumerated(EnumType.STRING)
	private Subgenre subgenre;
	
	public enum Genre{
		Crime,
		Experimental,
		Gothic,
		Fantasy,
		Musical,
		Romance,
		Sports,
		Thriller,
		Action,
		Animation,
		Comedy,
		Drama,
		Historical, 
		Horror,
		ScienceFiction,
		Western,
		
	}
	public enum Subgenre{
		Detective,
		Noir,
		Gangster,
		Heist,
		UrbanFantasy,
		DarkFantasy,
		HighFantasy,
		Superhero,
		Psychological,
		Bollywood,
		Mockumentary,
		Melodrama,
		Political,
		Teen,
		Dystopian,
		Utopian,
	}
}
