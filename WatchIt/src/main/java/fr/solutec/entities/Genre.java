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
	String name;
	@Enumerated(EnumType.STRING)
	String subgenre;
	
	public enum Name{
		Independant,
		Horror,
		Action,
		Adventure,
		Comedy,
		Mystery,
		Fantasy,
		Historical,
		Romance,
		SF,
		Thriller,
		
	}
}
