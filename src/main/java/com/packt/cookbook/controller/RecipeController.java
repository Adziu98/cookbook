package com.packt.cookbook.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.packt.cookbook.domain.Recipe;
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
	@RequestMapping("/{category}")
	public String getRecipeByCategory(Model model, @PathVariable("category") String recipeCategory) {
		model.addAttribute("recipe", recipeService.getRecipeByCategory(recipeCategory));
		return "recipes";
	}
	@RequestMapping("/filter/{ByCriteria}")
	public String getRecipesByFilter(@MatrixVariable(pathVar="ByCriteria") Map<String, List<String>> filterParams, Model model) {
		model.addAttribute("recipe", recipeService.getRecipesByFilter(filterParams));
		return "recipes";
	}
	@RequestMapping("/recipes")
	public String getRecipeById(@RequestParam("id") String recipeId, Model model) {
		model.addAttribute("recipe", recipeService.getRecipeById(recipeId));
		return "recipes";
	}
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getAddNewRecipeForm(Model model) {
		Recipe newRecipe = new Recipe();
		model.addAttribute("newRecipe", newRecipe);
		return "addRecipe";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewRecipeForm(@ModelAttribute("newRecipe")Recipe newRecipe) {
		recipeService.addRecipe(newRecipe);
		return "redirect:/recipes";
	}
	@Autowired
	private RecipeService recipeService;

}
