package com.packt.cookbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("greeting", "Witaj w kucharskiej książce internetowej!");
		model.addAttribute("tagline", "Wyjątkowej i jedynej w swoim rodzaju");
		
		return "welcome";
	}
	@RequestMapping("/welcome/greeting")
	public String greetin() {
		return "welcome";
	}
}
