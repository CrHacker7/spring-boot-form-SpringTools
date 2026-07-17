package com.divdev.springboot.form.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.divdev.springboot.form.app.models.domain.User;

@Controller
public class FormController {

	@GetMapping("/form")
	public String getForm(Model model) {
		model.addAttribute("title", "User Form");
		return "form";
	}

	@PostMapping("/form")
	public String postForm(Model model, 
			@RequestParam String username, 
			@RequestParam String password,
			@RequestParam String email) {
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);

		
		model.addAttribute("title", "Form Result");
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		model.addAttribute("email", email);
		return "result";
	}

}
