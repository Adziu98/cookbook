package com.packt.cookbook.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.cookbook.domain.Recipe;
import com.packt.cookbook.domain.repositoryy.RecipeRepository;
import com.packt.cookbook.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private RecipeRepository recipeRepository;
	
	public void processOrder(String recipeId, int count) {
		Recipe recipeById = recipeRepository.getRecipeById(recipeId);
		if(recipeById.getUnitsInStock() < count ) {
			throw new IllegalArgumentException("Zbyt mała liczba pzrzepisów. Obecna lista przepisów to: " + recipeById.getUnitsInStock());
		}
			recipeById.setUnitsInStock(recipeById.getUnitsInStock() - count);
	}
}
	
