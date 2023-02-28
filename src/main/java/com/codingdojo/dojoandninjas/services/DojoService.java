package com.codingdojo.dojoandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojoandninjas.model.Dojo;

import com.codingdojo.dojoandninjas.repositories.DojoRepo;


@Service
public class DojoService {
	@Autowired
	private DojoRepo DojoRepo;

	// returns all the Dojos
	public List<Dojo> allDojos() {
		return DojoRepo.findAll();
	}
	
	// creates a Dojo
	public Dojo createDojo(Dojo d) {
		return DojoRepo.save(d);
	}

	public Dojo updateDojo(Dojo e) {
		return DojoRepo.save(e);
	}

	public void deleteDojo(long id) {
		DojoRepo.deleteById(id);

	}

	// retrieves a Dojo
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = DojoRepo.findById(id);
		if (optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;

		}
	}
}
