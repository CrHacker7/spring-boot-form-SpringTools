package com.divdev.springboot.form.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class FormController {

	@GetMapping("/form")
	public String getForm(Model model) {
		return "form";
	}
	
	@PostMapping("/form")
	public String postForm(Model model) {
		return "result";
	}
	
	
}
