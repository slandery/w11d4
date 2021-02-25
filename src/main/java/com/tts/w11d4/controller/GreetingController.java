package com.tts.w11d4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tts.w11d4.greetingRepository.GreetingRepository;
import com.tts.w11d4.model.W11d4;



@Controller

public class GreetingController {
	
	@Autowired
	private GreetingRepository greetingRepository;
	
	@GetMapping(value = "/")
	
	public String index(W11d4 form) {
		
		return "form/index";
	}
	
	private W11d4 form;
	
	@PostMapping(value = "/")
	public String addIndex(W11d4 form, Model model) {
		greetingRepository.save(new W11d4(form.getFirstName(), form.getLastName(), form.getSignedUp()));
		model.addAttribute("firstName",form.getFirstName());
		model.addAttribute("lastName", form.getLastName());

		return "form/result";
	}


}
