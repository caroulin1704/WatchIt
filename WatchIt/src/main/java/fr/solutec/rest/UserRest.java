package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.User;
import fr.solutec.repository.UserRepository;

@RestController
@CrossOrigin("*")
public class UserRest {
	@Autowired
	private UserRepository userRepos;
	
	@GetMapping("allusers")
	public Iterable<User> getAllUsers(){
		return userRepos.findAll();
	}
	
	@PostMapping("login")
	public Optional<User> connexion(@RequestBody User u) {
		return userRepos.findByPseudoAndPassword(u.getPseudo(), u.getPassword());
	}
	
	@PostMapping("signup")
	public User inscrireUser(@RequestBody User u) {
		return userRepos.save(u);
	}
	
	@DeleteMapping("user/{id}")
	public boolean suppUser(@PathVariable Long id) {
		Optional<User> u = userRepos.findById(id);
		if(u.isPresent()) {
			userRepos.deleteById(id);
			return true;
		}
		return false;
	}
	
	@PutMapping("user/{id}")
	public User modifUser(@RequestBody User u, @PathVariable Long id) {
		u.setId(id);
		return userRepos.save(u);
	}
}
