package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Watchlist;

public interface WatchlistRepository extends CrudRepository<Watchlist, Long> {

}
