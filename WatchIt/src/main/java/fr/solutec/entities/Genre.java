package fr.solutec.entities;

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

public class Genre {
	@Id @GeneratedValue
	long id;
	@Enumerated(EnumType.STRING)
	private Name name;
	@Enumerated(EnumType.STRING)
	private Subgenre subgenre;
	
	public enum Name{
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
