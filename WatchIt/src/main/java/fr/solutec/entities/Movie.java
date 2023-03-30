package fr.solutec.entities;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
	private int runTime;
	private Date releaseDate;
	@Enumerated(EnumType.STRING)
	private Genre genre;
	@Enumerated(EnumType.STRING)
	private Subgenre subgenre;
	public enum Genre{
		Crime,
		Experimental,
		Gothic,
		Musical,
		Romance,
		Sports,
		Thriller,
		Action,
		Animation,
		Comedy,
		Drama, 
		Horror,
		Western,
		
	}
	public enum Subgenre{
		Adaptation,
		Detective,
		Noir,
		Thriller,
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
		War,
		Scifi,
		Fantasy,
		Historical,
		Period,
	}
}
