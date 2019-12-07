package com.dauhaleu.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dauhaleu.lookify.models.Lookify;
import com.dauhaleu.lookify.repositories.LookifyRepository;

@Service
public class LookifyService {
	
private final LookifyRepository lookifyR;
	
	public LookifyService(LookifyRepository lookifyR) {
		this.lookifyR = lookifyR; 
	}
	
	public List<Lookify> allSongs(){
		return lookifyR.findAll();
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
		

}
