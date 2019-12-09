package com.dauhaleu.lookify.controllers;

import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dauhaleu.lookify.models.Artists;
import com.dauhaleu.lookify.services.LookifyService;


@RestController
public class ArtistsController {
	
	public final LookifyService artSer;
	
	public ArtistsController(LookifyService artSer) {
		this.artSer = artSer;
	}
	
	@RequestMapping("/api/artists")
	public List<Artists> art() {
		return artSer.allArtists();
	}
	
}