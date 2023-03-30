package fr.solutec;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.entities.Casting;
import fr.solutec.entities.Movie;
import fr.solutec.entities.Movie.Genre;
import fr.solutec.entities.Movie.Subgenre;
import fr.solutec.entities.User;
import fr.solutec.repository.CastingRepository;
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
	@Autowired
	private CastingRepository castingRepos;
	
	public static void main(String[] args) {
		SpringApplication.run(WatchItApplication.class, args);
		System.out.println("Lancement terminé");
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Lancement en cours");
		DateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		
		User u1 = new User(null, "mweoon", "1234", "Caroline", "MATHIEU");
		User u2 = new User(null, "JM92", "cinéphile", "Jean-Michel", "LUMIERE");
		User u3 = new User(null, "PatB", "Beau", "Patrick", "BEAU");
		
		Movie m1 = new Movie(null, "Pride and Prejudice", 127, d.parse("16/09/2005"), Genre.Romance, Subgenre.Adaptation);
		Casting c1 = new Casting(null, m1,  "Joe Wright", "Universal Pictures/StudioCanal", "Deborah Moggach/Emma Thompson", "Keira Knightley", "Matthew Macfadyen", "Rosamund Pike");
		Movie m2 = new Movie(null, "Atonement", 123, d.parse("07/09/2007"), Genre.Drama, Subgenre.War);
		Casting c2 = new Casting(null, m2, "Joe Wright", "Working Title Films/Studiocanal", "Christopher Hampton", "Keira Knightley", "James McAvoy", "Saoirse Ronan");
		Movie m3 = new Movie(null, "Anna Karenina", 130, d.parse("05/12/2012"), Genre.Drama, Subgenre.Adaptation);
		Casting c3 = new Casting(null, m3, "Joe Wright", "Working Title/Studiocanal", "Tom Stoppard", "Keira Knightley", "Jude Law", "Aaron Taylor-Johnson");
		Movie m4 = new Movie(null, "Everything Everywhere All At Once", 139, d.parse("25/03/2022"), Genre.Comedy, Subgenre.Scifi);
		Casting c4 = new Casting(null, m4, "The Daniels", "A24", "The Daniels", "Michelle Yeoh", "Stephanie Hsu", "Ke Huy Quan");
		Movie m5 = new Movie(null, "My Neighbor Totoro", 86, d.parse("16/04/1988"), Genre.Animation, Subgenre.Fantasy);
		Casting c5 = new Casting(null, m5, "Hayao Miyazaki", "Studio Ghibli", "Hayao Miyazaki", "Chika Sakamoto", "Noriko Hidaka", "Hitoshi Takagi");
		Movie m6 = new Movie(null, "Kiki's Delivery Service", 103, d.parse("29/07/1989"), Genre.Animation, Subgenre.Fantasy);
		Casting c6 = new Casting(null, m6, "Hayao Miyazaki", "Studio Ghibli", "Hayao Miyazaki", "Minami Takayama", "Rei Sakuma", "Kappei Tamaguchi");
		Movie m7 = new Movie(null, "Princess Mononoke", 133, d.parse("12/07/1997"), Genre.Animation, Subgenre.Fantasy);
		Casting c7 = new Casting(null, m7, "Hayao Miyazaki", "Studio Ghibli", "Hayao Miyazaki", "Yoji Matsuda", "Yuriko Ishida", "Yuko Tanaka");
		Movie m8 = new Movie(null, "Spirited Away", 125, d.parse("20/07/2001"), Genre.Animation, Subgenre.Fantasy);
		Casting c8 = new Casting(null, m8, "Hayao Miyazaki", "Studio Ghibli", "Hayao Miyazaki", "Rumi Hiiragi", "Miyu Irino", "Mari Natsuki");
		Movie m9 = new Movie(null, "Ponyo", 101, d.parse("19/07/2008"), Genre.Animation, Subgenre.Fantasy);
		Casting c9 = new Casting(null, m9, "Hayao Miyazaki", "Studio Ghibli", "Hayao Miyazaki", "Tomoko Yamaguchi", "Kazushige Nagashima", "Yuki Amami");
		Movie m10 = new Movie(null, "The Wind Rises", 126, d.parse("20/07/2013"), Genre.Animation, Subgenre.Fantasy);
		Casting c10 = new Casting(null, m10, "Hayao Miyazaki", "Studio Ghibli", "Hayao Miyazaki", "Hideaki Anno", "Miori Takimoto", "Hidetoshi Nishjima");
		Movie m11 = new Movie(null, "X-men: First Class", 131, d.parse("03/06/2011"), Genre.Action, Subgenre.Superhero); 
		Casting c11 = new Casting(null, m11, "Matthew Vaughn", "Marvel Entertainment", "Ashley Edward Miller Zack Stentz Jane Goldman", "James McAvoy", "Michael Fassbender", "Jennifer Lawrence");
		Movie m12 = new Movie(null, "X-Men: Days Of Future Past", 132, d.parse("23/05/2014"), Genre.Action, Subgenre.Superhero);
		Casting c12 = new Casting(null, m12, "Bryan Singer", "Marvel Entertainment", "Simon Kinberg", "James McAvoy", "Hugh Jackman", "Jennifer Lawrence");
		Movie m13 = new Movie(null, "Parasite", 132, d.parse("30/05/2019"), Genre.Comedy, Subgenre.Thriller);
		Casting c13 = new Casting(null, m13, "Bong Joon-ho", "Barunson E&A", "Bong Joon-oh Han Jin-won", "Song Kang-ho", "Lee Sun-kyun", "Cho Yeo-jeong");
		Movie m14 = new Movie(null, "The Handmaiden", 144, d.parse("01/06/2016"), Genre.Thriller, Subgenre.Psychological);
		Casting c14 = new Casting(null, m14, "Park Chan-wook", "Moho Film", "Park Chan-wook Jeong Seon-kyeong", "Kim Min-hee", "Kim Tae-ri", "Ha, Jung-woo");
		Movie m15 = new Movie(null, "Little Women", 135, d.parse("25/12/2019"), Genre.Drama, Subgenre.Period);
		Casting c15 = new Casting(null, m15, "Greta Gerwig", "Columbia Pictures Regency Enterprises", "Greta Grawig", "Saoirse Ronan", "Emma Watson", "Florence Pugh");
		Movie m16 = new Movie(null, "Birds of Prey", 109, d.parse("25/01/2020"), Genre.Action, Subgenre.Superhero);
		Casting c16 = new Casting(null, m16, "Cathy Yan", "Warner Bros. Pictures", "Christina Hodson", "Margot Robbie", "Mary Elizabeth Winstead", "Jurnee Smollett-Bell" );
		Movie m17 = new Movie(null, "Wonder Woman", 141, d.parse("02/06/2017"), Genre.Action, Subgenre.Superhero);
		Casting c17 = new Casting(null, m17, "Patty Jenkins", "Warner Bros. Pictures", "Allan Heinberg", "Gal Gadot", "Chris Pine", "Robin Wright");
		Movie m18 = new Movie(null, "Eternal Sunshine of the Spotless Mind", 108, d.parse("19/03/2004"), Genre.Drama, Subgenre.Scifi);
		Casting c18 = new Casting(null, m18, "Michel Gondry", "Anonymous Content", "Charlie Kaufman", "Jim Carrey", "Kate Winslet", "Kristen Dunst");
		Movie m19 = new Movie(null, "La Cité de la Peur", 93, d.parse("09/03/1994"), Genre.Comedy, Subgenre.Thriller);
		Casting c19 = new Casting(null, m19, "Alain Berbérian", "Téléma Studio Canal+", "Les Nuls", "Alain Chabat", "Dominique Farrugia", "Chantal Lauby");
		Movie m20 = new Movie(null, "Knock at the Cabin", 100, d.parse("03/02/2023"), Genre.Horror, Subgenre.Thriller);
		Casting c20 = new Casting(null, m20, "M. Night Shyamalan", "Blinding Edge Pictures", "M. Night Shyamalan", "Dave Bautista", "Jonathan Groff", "Ben Aldridge");

		Stream.of(u1, u2, u3).forEach(u ->{
			userRepos.save(u); 
		});
		
		Stream.of(m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17, m18, m19, m20).forEach(m ->{
			movieRepos.save(m);
		});
		Stream.of(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20).forEach(c ->{
			castingRepos.save(c);
		});
	}

}
