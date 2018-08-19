package com.packt.cookbook.service;

import java.util.List;

import com.packt.cookbook.domain.Recipe;

public interface RecipeService {
	List<Recipe> getAllRecipe();
	Recipe getRecipeById(String recipeId);
}
