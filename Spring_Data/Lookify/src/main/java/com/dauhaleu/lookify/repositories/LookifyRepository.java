package com.dauhaleu.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dauhaleu.lookify.models.Lookify;

@Repository
public interface LookifyRepository extends CrudRepository<Lookify, Long> {
	List<Lookify> findAll();
//	List<Lookify> findByDescriptionContaining(String search);
	Long countByTitleContaining(String search);
    Long deleteByTitleStartingWith(String search);
    List<Lookify> findTop10ByOrderByRatingDesc();
}
