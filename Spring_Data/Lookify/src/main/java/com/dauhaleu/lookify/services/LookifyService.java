package com.dauhaleu.lookify.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;


import com.dauhaleu.lookify.models.Artists;
import com.dauhaleu.lookify.models.Lookify;
import com.dauhaleu.lookify.models.User;
import com.dauhaleu.lookify.repositories.ArtistsRepository;
import com.dauhaleu.lookify.repositories.LookifyRepository;
import com.dauhaleu.lookify.repositories.UserRepository;

@Service
public class LookifyService {
	
private final LookifyRepository lookifyR;
private final ArtistsRepository artistsR;
private final UserRepository userRepository;


	public LookifyService(LookifyRepository lookifyR, ArtistsRepository artistsR,UserRepository userRepository) {
		this.lookifyR = lookifyR; 
		this.artistsR = artistsR; 
		this.userRepository = userRepository;
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
		return lookifyR.findTop30ByOrderByRatingDesc();
	}
	

	public List<Lookify> getSearchSongs(String artist){
		return lookifyR.findByArtist(artist);
	}
		
	
	public List<Artists> getSearchArtists(String artist){
		return artistsR.findByArtist(artist);
	}

    // register user and hash their password
    public User registerUser(User user) {
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashed);
        return userRepository.save(user);
    }
    
    // find user by email
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    
    // find user by id
    public User findUserById(Long id) {
    	Optional<User> u = userRepository.findById(id);
    	
    	if(u.isPresent()) {
            return u.get();
    	} else {
    	    return null;
    	}
    }
    // authenticate user
    public boolean authenticateUser(String email, String password) {
    	User user = userRepository.findByEmail(email);
    	if(user == null) {
    		return false;
    	} else {
    		if(BCrypt.checkpw(password, user.getPassword())) {
    			return true;
    		} else {
    			return false;
    		}
    	}
    }
  //Find All Users
    public List<User> findUsers() {
    	return userRepository.findAll();
    }
	
	
	
}
