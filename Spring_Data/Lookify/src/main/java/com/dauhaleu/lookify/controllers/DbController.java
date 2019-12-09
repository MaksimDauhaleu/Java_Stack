package com.dauhaleu.lookify.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dauhaleu.lookify.models.Lookify;
import com.dauhaleu.lookify.services.LookifyService;

@RestController
public class DbController {
	
	public final LookifyService lookifySer;
	
	public DbController(LookifyService lookifySer) {
		this.lookifySer = lookifySer;
	}
	
	@RequestMapping("/api/lookify")
	public List<Lookify> index() {
		return lookifySer.allSongs();
	}
	
	
	@RequestMapping("/api/lookify/{id}")
	    public Lookify show(@PathVariable("id") Long id) {
	        Lookify book = lookifySer.findSong(id);
	        return book;
	    }
	
	
	@RequestMapping(value="/api/lookify", method=RequestMethod.POST)
	public Lookify createBook(@RequestParam(value="title") String title, @RequestParam(value="artist") String artist, @RequestParam(value="rating") Integer rating) {
		Lookify book = new Lookify(title, artist,rating);
		return lookifySer.createSong(book);
	}
	
    
    @RequestMapping(value="/api/lookify/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
    	lookifySer.deleteSong(id);
    }
}
