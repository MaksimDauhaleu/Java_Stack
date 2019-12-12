package com.dauhaleu.productscategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.dauhaleu.productscategories.models.Product;


@Repository
public interface ProductsRepository extends CrudRepository<Product, Long>{
	List<Product> findAll();
}
