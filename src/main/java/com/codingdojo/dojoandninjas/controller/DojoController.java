package com.codingdojo.dojoandninjas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojoandninjas.model.Dojo;
import com.codingdojo.dojoandninjas.services.DojoService;



@Controller
public class DojoController {
	@Autowired
	private DojoService DojoService;

	
	@GetMapping("/")
	public String index(@ModelAttribute("dojo") Dojo dojo,Model model ) {
		List<Dojo>dojos = DojoService.allDojos();
		model.addAttribute("dojos",dojos);
		return "dojo.jsp";
}

	@GetMapping("/show/{id}")
	public String show(@PathVariable("id") Long id,Model model) {
		Dojo dojo = DojoService.findDojo(id);
		model.addAttribute("dojo",dojo);
		return "show.jsp";
	}
	
	@PostMapping("/show/dojo/{id}")
	public String show(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result ,@PathVariable("dojoid") Long id,Model model) {
		List<Dojo>dojos = DojoService.allDojos();
		model.addAttribute("dojos",dojos);
		return "redirect:/show/"+ id;
	}

	@PostMapping("/new/dojo")
	public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result ,Model model) {
		if (result.hasErrors()) {
			return "dojo.jsp";
		}
		else {
			DojoService.createDojo(dojo);
			return "redirect:/new/ninja";
		}
		
	}

}


