package com.codingdojo.dojoandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.codingdojo.dojoandninjas.model.Ninja;


public interface NinjaRepo extends CrudRepository<Ninja, Long>{
    List<Ninja> findAll();
    // this method finds o with descriptions containing the search string
//    List<Ninja> findByNinjaContaining(String search);
    // this method counts how many titles contain a certain string

}
