package com.codingdojo.dojoandninjas.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.codingdojo.dojoandninjas.model.Ninja;
import com.codingdojo.dojoandninjas.repositories.NinjaRepo;


@Service
public class NinjaService {
	  private NinjaRepo NinjaRepo;
	public NinjaService(NinjaRepo NinjaRepo) {
		  this.NinjaRepo = NinjaRepo;
    }
    // returns all the Ninja
    public List<Ninja> allNinjas() {
        return NinjaRepo.findAll();
    }
    // creates a Ninja
    public Ninja createNinja(Ninja n) {
        return NinjaRepo.save(n);
    }
    // updates a Ninja
    public Ninja updateNinja(Ninja n) {
    	return NinjaRepo.save(n);
    }
    // deletes a Ninja
    public void deleteNinja(long id) {
    	NinjaRepo.deleteById(id);
    		
    	
    }
    // retrieves a Ninja 
    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja = NinjaRepo.findById(id);
        if(optionalNinja.isPresent()) {
            return optionalNinja.get();
        } else {
            return null;
        }
    }
}
