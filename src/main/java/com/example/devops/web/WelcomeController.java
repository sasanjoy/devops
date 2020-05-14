package com.example.devops.web;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String welcome(Model model) {
		LocalDateTime today = LocalDateTime.now();
		model.addAttribute("course", "Devops Course");
		model.addAttribute("instructor", "Sanjoy sa");
		model.addAttribute("Time1", today);
		return "index";
	}

}
