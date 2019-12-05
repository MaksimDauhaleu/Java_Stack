package com.dauhaleu.first.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dauhaleu.first.models.First;
import com.dauhaleu.first.services.FirstService;


@RestController
public class FirstController {
	private final FirstService firstService;
	
	public FirstController(FirstService firstService) {
		this.firstService = firstService;
	}
	
	@RequestMapping("/api/books")
	public List<First> index() {
		return firstService.allBooks();
	}
	
	@RequestMapping(value="/api/books", method=RequestMethod.POST)
	    public First createBook(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
	        First book = new First(title, desc, lang, numOfPages);
	        return firstService .createBook(book);
	    }
	
	@RequestMapping("/api/books/{id}")
	    public First show(@PathVariable("id") Long id) {
	        First book = firstService.findBook(id);
	        return book;
	    }
	
}
