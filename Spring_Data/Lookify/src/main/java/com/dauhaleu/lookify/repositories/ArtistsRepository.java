package com.dauhaleu.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dauhaleu.lookify.models.Artists;
import com.dauhaleu.lookify.models.Lookify;

@Repository
public interface ArtistsRepository extends CrudRepository<Artists, Long> {
	List<Artists> findAll();

	List<Artists> findByArtist(String artist);	Long countByartistContaining(String search);
}

