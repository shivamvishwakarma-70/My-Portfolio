package com.example.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Cnotroller {
	@GetMapping("")
	public String homepage() {
		return "home";
	}
	@GetMapping("/about")
	public String about() {
		return "about";
		
	}
	@GetMapping("/skill")
	public String skills() {
		return "skill";
	}
	@GetMapping("/experience")
	public String exp() {
		return "experience";
	}
	@GetMapping("/project")
	public String project() {
		return "project";
	}
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	@PostMapping("/contact")
	public String saveContact()
	{
		return "contact";
	}
}
