package com.dauhaleu.first.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dauhaleu.first.models.First;
import com.dauhaleu.first.repositories.FirstRepository;
import java.lang.IllegalArgumentException;

@Service
public class FirstService {
	private final FirstRepository fRepo;
	
	public FirstService(FirstRepository fRepo) {
		this.fRepo = fRepo; 
	}
	
	public List<First> allBooks() {
		return fRepo.findAll();
    }
	
	
	public First findBook(Long id) {
        Optional<First> optionalBook = fRepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
	}
	
	public First createBook(First b) {
		return fRepo.save(b);
	}
	
	public First updateBook(First b) {
		return fRepo.save(b);
	}

	public First updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		Optional <First> temp = fRepo.findById(id);
		if(temp != null) {
			temp.get().setTitle(title);
			temp.get().setDescription(desc);
			temp.get().setLanguage(lang);
			temp.get().setNumberOfPages(numOfPages);
			fRepo.save(temp.get());
			
			return temp.get();
		}else {
			return null;
		}
	}
	
	public void deleteBook(Long id) {
		fRepo.deleteById(id);
	}

}
