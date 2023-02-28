package com.codingdojo.dojoandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.codingdojo.dojoandninjas.model.Dojo;


public interface DojoRepo extends CrudRepository<Dojo, Long>{
    List<Dojo> findAll();
    // this method finds o with descriptions containing the search string
    
   

}
