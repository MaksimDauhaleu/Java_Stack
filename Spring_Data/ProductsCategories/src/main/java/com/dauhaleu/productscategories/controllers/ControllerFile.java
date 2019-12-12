package com.dauhaleu.productscategories.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dauhaleu.productscategories.models.Category;
import com.dauhaleu.productscategories.models.Product;
import com.dauhaleu.productscategories.service.ServiceFile;

@Controller
public class ControllerFile {

	public final ServiceFile service;
	
	public ControllerFile(ServiceFile service) {
		this.service = service;
	}
	//Index page
	@RequestMapping("/")
	public String index() {
		return "redirect/:/newProduct";
	}
	
	//New Product
	@RequestMapping("/newProduct")
	public String newProductPage(@ModelAttribute("product") Product pro) {
		return "newProduct.jsp";
	}
	
	//New Product
	@RequestMapping(value = "/newProduct", method = RequestMethod.POST)
	public String newProductPage(@ModelAttribute("product") Product product,  BindingResult result) {
		if(result.hasErrors()) {
			return "newProduct.jsp";
		}else {
			Product test = new Product(product);
			service.createProduct(test);
			return "redirect:/newCategory";
		}
		
		
	}
	
	
	
	
	//New Category
	@RequestMapping("/newCategory")
	public String newCategoryPage(@ModelAttribute("category") Category cat) {
		return "newCategory.jsp";
	}
	
	//New Category
	@RequestMapping(value = "/newCategory", method = RequestMethod.POST)
	public String newCategory(@ModelAttribute("name") String name, BindingResult result) {
		if(result.hasErrors()) {
			return"newCategory";
		}else {
			Category test = new Category(name);
			service.createCategory(test);
			return"redirect:/";
		}
	}
		
	
	//Show 
	@RequestMapping("/show")
	public String show(Model model){
		List<Product> products = service.getProducts();
		List<Category> categories = service.getCategories();
		model.addAttribute("categories", categories);
		model.addAttribute("products",products);
		return "show.jsp";
				
	}
	
}
