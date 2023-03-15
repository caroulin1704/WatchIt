package fr.solutec.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
	@ManyToOne
	private Genre genre;
}
