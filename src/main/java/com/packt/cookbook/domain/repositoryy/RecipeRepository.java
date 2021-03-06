package com.packt.cookbook.domain.repositoryy;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.packt.cookbook.domain.Recipe;

public interface RecipeRepository {
	List <Recipe> getAllRecipe();
	Recipe getRecipeById(String recipeId);
	List<Recipe> getRecipeByCategory(String category);
	Set<Recipe> getRecipesByFilter(Map<String, List<String>> filterParams);
	void addRecipe(Recipe recipe);
}
