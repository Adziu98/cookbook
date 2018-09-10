package com.packt.cookbook.domain.repository.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.packt.cookbook.domain.Recipe;
import com.packt.cookbook.domain.repositoryy.RecipeRepository;

@Repository
public class InMemoryRecipeRepository implements RecipeRepository {
	
	private List<Recipe> listOfRecipe = new ArrayList<Recipe>();
	
	public InMemoryRecipeRepository() {
		
		Recipe scrambledEggs =  new Recipe("1", "jajecznica", new BigDecimal(10));
		scrambledEggs.setDescription("Jest domeną prostej kuchni, ponieważ nie wymaga umiejętności kulinarnych ani techniki."
				+ "Jajecznica ma długą historię, przewija się w dziejach, występuje w polskiej tradycji,"
				+ " wielokrotnie przytaczano ją w literaturze, a obecnie jest również elementem życia "
				+ "społecznego na publicznie organizowanych festynach i zabawach.");
		scrambledEggs.setCategory("breakfast");
		scrambledEggs.setIngredients("4 jajka, sól, pieprz, boczek");
		scrambledEggs.setServing("jajecznica z 2 jajek = 1 osoba, prosta matematyka");
		scrambledEggs.setPreparationTime("5-10 minut");
		
		Recipe scrambledEggsA =  new Recipe("1", "jajecznica", new BigDecimal(10));
		scrambledEggsA.setDescription("Jest domeną prostej kuchni, ponieważ nie wymaga umiejętności kulinarnych ani techniki."
				+ "Jajecznica ma długą historię, przewija się w dziejach, występuje w polskiej tradycji,"
				+ " wielokrotnie przytaczano ją w literaturze, a obecnie jest również elementem życia "
				+ "społecznego na publicznie organizowanych festynach i zabawach.");
		scrambledEggsA.setCategory("breakfast");
		scrambledEggsA.setIngredients("4 jajka, sól, pieprz, boczek");
		scrambledEggsA.setServing("jajecznica z 2 jajek = 1 osoba, prosta matematyka");
		scrambledEggsA.setPreparationTime("5-10 minut");
		
		Recipe scrambledEggsB =  new Recipe("1", "jajecznica", new BigDecimal(10));
		scrambledEggsB.setDescription("Jest domeną prostej kuchni, ponieważ nie wymaga umiejętności kulinarnych ani techniki."
				+ "Jajecznica ma długą historię, przewija się w dziejach, występuje w polskiej tradycji,"
				+ " wielokrotnie przytaczano ją w literaturze, a obecnie jest również elementem życia "
				+ "społecznego na publicznie organizowanych festynach i zabawach.");
		scrambledEggsB.setCategory("breakfast");
		scrambledEggsB.setIngredients("4 jajka, sól, pieprz, boczek");
		scrambledEggsB.setServing("jajecznica z 2 jajek = 1 osoba, prosta matematyka");
		scrambledEggsB.setPreparationTime("5-10 minut");
		
		listOfRecipe.add(scrambledEggs);
		listOfRecipe.add(scrambledEggsA);
		listOfRecipe.add(scrambledEggsB);
	}
	
	public List<Recipe> getAllRecipe() {
		return listOfRecipe;
	}
	
	public Recipe getRecipeById(String recipeId) {
		Recipe recipeById = null;
		for (Recipe recipe : listOfRecipe) {
			if(recipe != null && recipe.getRecipeId()!=null && recipe.getRecipeId().equals(recipeId)) {
				recipeById = recipe;
				break;
			}
		}
		if(recipeById == null) {
			throw new IllegalArgumentException("Brak przepisu o wskazanym id: " + recipeId); 
		}
		return recipeById;
	}
	
	public List<Recipe> getRecipeByCategory(String category) {
		List<Recipe> recipeByCategory = new ArrayList<Recipe>();
		for(Recipe recipe: listOfRecipe) {
			if(category.equalsIgnoreCase(recipe.getCategory())) {
				recipeByCategory.add(recipe);
			}
		}
		return recipeByCategory;
	}
	
	public Set<Recipe> getRecipesByFilter(Map<String, List<String>> filterParams) {
		Set<Recipe> recipesByCategory = new HashSet<Recipe>();
		Set<String> criterias = filterParams.keySet();
		if(criterias.contains("category")) {
			for(String category: filterParams.get("category")) {
				recipesByCategory.addAll(this.getRecipeByCategory(category));
			}
		}
		return recipesByCategory;
	}
	
	public void addRecipe(Recipe recipe) {
		listOfRecipe.add(recipe);
	}


}
