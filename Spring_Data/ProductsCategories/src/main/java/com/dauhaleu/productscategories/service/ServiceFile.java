package com.dauhaleu.productscategories.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dauhaleu.productscategories.models.Category;
import com.dauhaleu.productscategories.models.Product;
import com.dauhaleu.productscategories.repositories.CategoriesRepository;
import com.dauhaleu.productscategories.repositories.ProductsRepository;

@Service
public class ServiceFile {

	public final CategoriesRepository cateRepo;
	public final ProductsRepository prodRepo ;
	
	public ServiceFile(CategoriesRepository cateRepo,ProductsRepository prodRepo) {
		this.cateRepo = cateRepo;
		this.prodRepo = prodRepo;
	}
	
	public Category createCategory(Category b) {
		return cateRepo.save(b);
	}
	public Product createProduct(Product b) {
		return prodRepo.save(b);
	}
	
	public List<Product> getProducts() {
		return prodRepo.findAll();
	}
	public List<Category> getCategories() {
		return cateRepo.findAll();
	}
}
