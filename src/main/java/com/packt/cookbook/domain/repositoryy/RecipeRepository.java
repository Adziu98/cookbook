package com.packt.cookbook.domain.repositoryy;

import java.util.List;

import com.packt.cookbook.domain.Recipe;

public interface RecipeRepository {
	List <Recipe> getAllRecipe();
	Recipe getRecipeById(String recipeId);
	List<Recipe> getRecipeByCategory(String category);
}
