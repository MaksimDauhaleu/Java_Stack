package com.dauhaleu.dojoninja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dauhaleu.dojoninja.models.Dojo;
import com.dauhaleu.dojoninja.models.Ninja;
import com.dauhaleu.dojoninja.repositories.DojoRepository;
import com.dauhaleu.dojoninja.repositories.NinjaRepository;

@Service	
public class ServiceFile {
	
	private final NinjaRepository ninjaRepo;
	private final DojoRepository dojoRepo;
	
		public ServiceFile(NinjaRepository ninjaRepo,DojoRepository dojoRepo) {
			this.dojoRepo = dojoRepo;
			this.ninjaRepo = ninjaRepo;
		}
	//Find All Dojos	
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	
	//Find All Ninjas
	public List<Ninja> allNinjas(){
		return ninjaRepo.findAll();
	}
	
	//Create Dojo
	public Dojo createDojo(Dojo b) {
		return dojoRepo.save(b);
	}
	
	//Create Ninja
	public Ninja createNinja(Ninja b) {
		return ninjaRepo.save(b);
	}
	//Show Dojo
	public Dojo singleDojo(Long id) {
		Optional<Dojo> dojo = dojoRepo.findById(id);
		if(dojo.isPresent()) {
			return dojo.get();
		}else {
			return null;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
