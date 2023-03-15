package fr.solutec;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WatchItApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WatchItApplication.class, args);
		System.out.println("Lancement terminé");
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Lancement en cours");
	}

}
