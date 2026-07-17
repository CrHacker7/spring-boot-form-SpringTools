package com.divdev.springboot.form.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.divdev.springboot.form.app.models.domain.User;

@Controller
public class FormController {

	@GetMapping("/form")
	public String getForm(Model model) {
		model.addAttribute("title", "User Form");
		return "form";
	}

	@PostMapping("/form")
	public String postForm(User user, Model model) {
				
		model.addAttribute("title", "Form Result");
		model.addAttribute("user", user);
		
		return "result";
	}

}
