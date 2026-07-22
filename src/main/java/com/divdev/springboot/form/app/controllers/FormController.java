package com.divdev.springboot.form.app.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.divdev.springboot.form.app.models.domain.User;

@Controller
public class FormController {

	@GetMapping("/form")
	public String getForm(Model model) {
		User user = new User();
		model.addAttribute("title", "User Form");
		model.addAttribute("user", user);
		return "form";
	}

	@PostMapping("/form")
	public String postForm(@Valid User user,BindingResult result, Model model) {
		
		model.addAttribute("title", "Form Result");
		if(result.hasErrors()) {
			Map<String, String> errors = new HashMap<>();
			result.getFieldErrors().forEach(err -> {
				errors.put(err.getField(), "Filed ".concat(err.getField().concat(" ").concat(err.getDefaultMessage())));
			});
			model.addAttribute("error", errors);
			return "form";
		}
				
		
		model.addAttribute("user", user);
		
		return "result";
	}

}
