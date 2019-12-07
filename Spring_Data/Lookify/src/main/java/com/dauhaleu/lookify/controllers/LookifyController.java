package com.dauhaleu.lookify.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dauhaleu.lookify.models.Lookify;
import com.dauhaleu.lookify.services.LookifyService;

@Controller
public class LookifyController {
	
	public final LookifyService serviceL;
	
	public  LookifyController(LookifyService serviceL) {
		this.serviceL = serviceL;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		List<Lookify> songs = serviceL.allSongs();
		model.addAttribute("songs",songs);
		return "dashboard.jsp";
	}
	
	@RequestMapping("/songs/new")
	public String newSong(@ModelAttribute("song") Lookify book){
		return "create.jsp";
	}
	
	@RequestMapping(value = "/songs", method=RequestMethod.POST)
	public String create(@ModelAttribute("song") Lookify song, BindingResult result){
	    if (result.hasErrors()) {
            return "create.jsp";
        } else {
            serviceL.createSong(song);
            return "redirect:/dashboard";
        }
	}
	
	@RequestMapping("/songs/{id}")
	public String show() {
		return "show.jsp";
	}
	
	@RequestMapping("/search/topTen")
	public String topTen(Model model) {
		List<Lookify> songs = serviceL.getTopTen();
		model.addAttribute("songs",songs);
		return "topTen.jsp";
	}
	

	@RequestMapping("/search/{artist}")
	public String search(@PathVariable("artist") String artist, Model model) {
		List<Lookify> songs = serviceL.getSearchSongs(artist);
		model.addAttribute("artist", artist);
		model.addAttribute("songs", songs);
		return "search.jsp";
	}
	
	@PostMapping("/search")
	public String search(@RequestParam("artist") String artist) {
		return "redirect:/search/"+artist;
	}
}
