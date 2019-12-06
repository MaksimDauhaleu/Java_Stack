package com.dauhaleu.first.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dauhaleu.first.models.First;
import com.dauhaleu.first.services.FirstService;

@Controller
	public class BooksController {
	    private final FirstService bookService;
	 
	    public BooksController(FirstService bookService) {
	        this.bookService = bookService;
	    }
	    
	    @RequestMapping("/books")
	    public String index(Model model) {
	        List<First> books = bookService.allBooks();
	        model.addAttribute("books", books);
	        return "index.jsp";
	    }
	    
	    @RequestMapping("/books/new")
	    public String newBook(@ModelAttribute("book") First book) {
	        return "new.jsp";
	    }
	    
	    @RequestMapping(value="/books", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("book") First book, BindingResult result) {
	        if (result.hasErrors()) {
	            return "new.jsp";
	        } else {
	            bookService.createBook(book);
	            return "redirect:/books";
	        }
	    }
	}

