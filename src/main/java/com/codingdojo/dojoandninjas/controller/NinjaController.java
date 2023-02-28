package com.codingdojo.dojoandninjas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojoandninjas.model.Dojo;
import com.codingdojo.dojoandninjas.model.Ninja;
import com.codingdojo.dojoandninjas.services.DojoService;
import com.codingdojo.dojoandninjas.services.NinjaService;


@Controller
public class NinjaController {
	@Autowired
	private NinjaService NinjaService;
	@Autowired
	private DojoService DojoService;
		

	@GetMapping("/new/ninja")
	public String index(@ModelAttribute("ninja") Ninja ninja,Model model ) {
//		List<Ninja>ninjas = NinjaService.allNinjas();
//		model.addAttribute("ninjas",ninjas);
		List<Dojo>dojos = DojoService.allDojos();
		model.addAttribute("dojos",dojos);
		return "ninja.jsp";
}

	@PostMapping("/create/ninja")
	public String addNinja( 
			@Valid @ModelAttribute("ninja") Ninja ninja,BindingResult result,Model model){ 
			if(result.hasErrors()){
			 model.addAttribute("dojos", DojoService.allDojos());
		return "ninja.jsp";
			}else{
			Ninja this_ninja = NinjaService.createNinja(ninja);
			Long dojo_id = this_ninja.getDojo().getId();
			return "redirect:/show/"+ dojo_id;
		}
	}		
}		
	




