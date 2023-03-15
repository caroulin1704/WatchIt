package fr.solutec.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Data @Entity 

public class Review {
	@EmbeddedId
	private ReviewId id;
	private String review;
	
	@Embeddable @NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode
	public static class ReviewId implements Serializable {
		@Getter
		@Setter
		@ManyToOne private User user;
		@Getter
		@Setter
		@ManyToOne private Movie movie;
	}
}
