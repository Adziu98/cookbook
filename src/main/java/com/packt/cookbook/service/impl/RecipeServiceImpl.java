package com.packt.cookbook.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.cookbook.domain.Recipe;
import com.packt.cookbook.domain.repositoryy.RecipeRepository;
import com.packt.cookbook.service.RecipeService;

@Service
public class RecipeServiceImpl implements RecipeService{
	
	@Autowired
	private RecipeRepository recipeRepository;

	public List<Recipe> getAllRecipe() {
		return recipeRepository.getAllRecipe();
	}

	public Recipe getProductById(String recipeID) {
		return recipeRepository.getRecipeById(recipeID);
	}

	@Override
	public Recipe getRecipeById(String recipeId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Recipe> getRecipeByCategory(String category) {
		return recipeRepository.getRecipeByCategory(category);
	}
	
	public Set<Recipe> getRecipesByFilter(Map<String, List<String>> filterParams) {
		return recipeRepository.getRecipesByFilter(filterParams);
	}
	
	public void addRecipe(Recipe recipe) {
		recipeRepository.addRecipe(recipe);
	}

}