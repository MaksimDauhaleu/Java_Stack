package com.dauhaleu.first.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	    
	    @RequestMapping("books/{id}")
	    public String show(@PathVariable("id") Long id, Model model) {
	    	First book = bookService.findBook(id);
	    	model.addAttribute("book", book);
	    	return "show.jsp";
	    }
	    
	    @RequestMapping("/books/{id}/edit")
	    public String edit(@PathVariable("id") Long id, Model model) {
	        First book = bookService.findBook(id);
	        model.addAttribute("book", book);
	        return "/edit.jsp";
	    }
	    
	    @RequestMapping(value="/books/{id}", method=RequestMethod.PUT)
	    public String update(@Valid @ModelAttribute("book") First book, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/books/edit.jsp";
	        } else {
	            bookService.updateBook(book);
	            return "redirect:/books";
	        }
	    }
	    
	    @RequestMapping(value="/books/{id}")
	    public String destroy(@PathVariable("id") Long id) {
	        bookService.deleteBook(id);
	        return "redirect:/books";
	    }
	}

