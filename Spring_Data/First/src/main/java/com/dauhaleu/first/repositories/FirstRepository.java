package com.dauhaleu.first.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dauhaleu.first.models.First;



@Repository
public interface FirstRepository extends CrudRepository<First, Long> {
	List<First> findAll();
	List<First> findByDescriptionContaining(String search);
	Long countByTitleContaining(String search);
    Long deleteByTitleStartingWith(String search);	
}
 