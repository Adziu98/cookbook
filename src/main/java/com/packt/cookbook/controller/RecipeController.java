package com.packt.cookbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.packt.cookbook.service.RecipeService;

@Controller
@RequestMapping("/recipes")
public class RecipeController {
	
	@RequestMapping
	public String list(Model model) {
		model.addAttribute("recipe", recipeService.getAllRecipe());
		return "recipes";
	}
	
	@RequestMapping("/all")
	public String allRecipe(Model model) {
		model.addAttribute("recipe", recipeService.getAllRecipe());
		return "recipes";
	}
	
	@Autowired
	private RecipeService recipeService;

}
