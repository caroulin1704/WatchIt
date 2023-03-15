package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data @Entity

public class Casting {
	@Id @GeneratedValue
	private long id;
	@OneToOne
	private Movie movie;
	String director;
	String producer;
	String screenwriter;
	String actor1;
	String actor2;
	String actor3;
}
