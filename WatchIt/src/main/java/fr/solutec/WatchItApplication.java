package fr.solutec;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.entities.User;
import fr.solutec.repository.MovieRepository;
import fr.solutec.repository.RatingRepository;
import fr.solutec.repository.ReviewRepository;
import fr.solutec.repository.UserRepository;
import fr.solutec.repository.WatchlistRepository;

@SpringBootApplication
public class WatchItApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepos;
	@Autowired
	private MovieRepository movieRepos;
	@Autowired
	private RatingRepository ratingRepos;
	@Autowired
	private ReviewRepository reviewRepos;
	@Autowired
	private WatchlistRepository watchlistRepos;
	
	public static void main(String[] args) {
		SpringApplication.run(WatchItApplication.class, args);
		System.out.println("Lancement terminé");
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Lancement en cours");
		
		User u1 = new User(null, "mweoon", "1234", "Caroline", "MATHIEU");
		User u2 = new User(null, "JM92", "cinéphile", "Jean-Michel", "LUMIERE");
		Stream.of(u1, u2).forEach(u ->{
			userRepos.save(u);
		});
		
		
	}

}
