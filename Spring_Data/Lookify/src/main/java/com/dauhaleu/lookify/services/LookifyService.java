package com.dauhaleu.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dauhaleu.lookify.models.Artists;
import com.dauhaleu.lookify.models.Lookify;
import com.dauhaleu.lookify.repositories.ArtistsRepository;
import com.dauhaleu.lookify.repositories.LookifyRepository;

@Service
public class LookifyService {
	
private final LookifyRepository lookifyR;
private final ArtistsRepository artistsR;


	public LookifyService(LookifyRepository lookifyR, ArtistsRepository artistsR) {
		this.lookifyR = lookifyR; 
		this.artistsR = artistsR; 
	}
	
	public List<Lookify> allSongs(){
		return lookifyR.findAll();
	}
	
	public List<Artists> allArtists(){
		return artistsR.findAll();
	}
	
	public Lookify findSong(Long id){
		Optional<Lookify> optionalLook = lookifyR.findById(id);
		 if(optionalLook.isPresent()) {
			 return optionalLook.get();
		 } else {
			 return null;
		 }
	}
	
	public Lookify createSong(Lookify b) {
		return lookifyR.save(b);
	}
	
		
	public void deleteSong(Long id) {
		lookifyR.deleteById(id);
	}
	
	public List<Lookify> getTopTen(){
		return lookifyR.findTop10ByOrderByRatingDesc();
	}
	

	public List<Lookify> getSearchSongs(String artist){
		return lookifyR.findByArtist(artist);
	}
		
	
	public List<Artists> getSearchArtists(String artist){
		return artistsR.findByArtist(artist);
	}

}
