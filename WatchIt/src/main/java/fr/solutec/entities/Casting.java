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
	private Long id;
	@OneToOne
	private Movie movie;
	private String director;
	private String producer;
	private String screenwriter;
	private String actor1;
	private String actor2;
	private String actor3;
}
