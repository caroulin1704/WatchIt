package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data @Entity

public class User {
	@Id @GeneratedValue
	private long id;
	private String pseudo;
	private String password;
	private String name;
	private String surname;
}
