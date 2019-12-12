package com.dauhaleu.productscategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dauhaleu.productscategories.models.Category;




@Repository
public interface CategoriesRepository extends CrudRepository<Category, Long>{
	List<Category> findAll();
}

