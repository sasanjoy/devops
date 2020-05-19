package com.example.devops.web;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	Logger logger = LoggerFactory.getLogger(WelcomeController.class);

	@RequestMapping("/")
	public String welcome(Model model) {
		LocalDateTime today = LocalDateTime.now();
		model.addAttribute("course", "Devops Course");
		model.addAttribute("instructor", "Sanjoy sa");
		model.addAttribute("Time1", today);
		logger.info("========\"course\", \"Devops Course\" ");
		return "index";
	}

}
