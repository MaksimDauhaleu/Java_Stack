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

import com.dauhaleu.lookify.models.Artists;
import com.dauhaleu.lookify.models.Lookify;
import com.dauhaleu.lookify.services.LookifyService;

@Controller
public class LookifyController {
	
	public final LookifyService serviceL;
	
	public  LookifyController(LookifyService serviceL) {
		this.serviceL = serviceL;
	}
	
	
	//Index
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	
	
	//DashBoard
	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		List<Lookify> songs = serviceL.allSongs();
		model.addAttribute("songs",songs);
		return "dashboard.jsp";
	}
	
	
	//Create
	@RequestMapping("/songs/new")
	public String newSong(@ModelAttribute("song") Lookify book){
		return "create.jsp";
	}
	
	
	//Create
	@RequestMapping(value = "/songs", method=RequestMethod.POST)
	public String create(@ModelAttribute("song") Lookify song, BindingResult result){
	    if (result.hasErrors()) {
            return "create.jsp";
        } else {
            serviceL.createSong(song);
            return "redirect:/dashboard";
        }
	}
	
	
	//Show
	@RequestMapping("/songs/{id}")
	public String show() {
		return "show.jsp";
	}
	
	//TopTen	
	@RequestMapping("/search/topTen")
	public String topTen(Model model) {
		List<Lookify> songs = serviceL.getTopTen();
		model.addAttribute("songs",songs);
		return "topTen.jsp";
	}
	
	//Search
	@RequestMapping("/search/{artist}")
	public String search(@PathVariable("artist") String artist, Model model) {
		List<Lookify> songs = serviceL.getSearchSongs(artist);
		model.addAttribute("artist", artist);
		model.addAttribute("songs", songs);
		return "search.jsp";
	}
	//Search
	@PostMapping("/search")
	public String search(@RequestParam("artist") String artist) {
		return "redirect:/search/"+artist;
	}
	
	//SearchArt
	@RequestMapping("/searchArt/{artist}")
	public String searchArt(@PathVariable("artist") String artist, Model model) {
		List<Artists> songs = serviceL.getSearchArtists(artist);
		model.addAttribute("artist", artist);
		model.addAttribute("songs", songs);
		return "searchArt.jsp";
	}
	//SearchArt
	@PostMapping("/searchArt")
	public String searchAr(@RequestParam("artist") String artist) {
		return "redirect:/searchArt/"+artist;
	}
	
	//Top 1000
		@RequestMapping("/search/topSingers")
		public String topSin(Model model) {
			List<Artists> songs = serviceL.allArtists();
			model.addAttribute("songs",songs);
			return "topSin.jsp";
		}
}



