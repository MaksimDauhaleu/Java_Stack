package com.dauhaleu.first.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dauhaleu.first.models.First;
import com.dauhaleu.first.repositories.FirstRepository;

@Service
public class FirstService {
	private final FirstRepository fRepo;
	
	public FirstService(FirstRepository fRepo) {
		this.fRepo = fRepo; 
	}
	
	public List<First> allBooks() {
		return fRepo.findAll();
    }
	
	public First createBook(First b) {
        return fRepo.save(b);
    }
	
	public First findBook(Long id) {
        Optional<First> optionalBook = fRepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
  	}
}
