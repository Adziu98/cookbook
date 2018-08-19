package com.packt.cookbook.domain;

import java.math.BigDecimal;

public class Recipe {
	
	private String recipeId;
	private String name;
	private BigDecimal price;
	private String description;
	private String category;
	private String ingredients;
	private String serving;
	private String preparationTime;
	private long unitsInStock;
	public long getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public long getUnitsInOrder() {
		return unitsInOrder;
	}

	public void setUnitsInOrder(long unitsInOrder) {
		this.unitsInOrder = unitsInOrder;
	}

	private long unitsInOrder;
	
	public Recipe() {
		super();
	}
	
	public Recipe(String recipeId, String name, BigDecimal price) {
	this.recipeId = recipeId;
	this.name = name;
	this.price = price;
	}
	
	
	public String getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(String recipeId) {
		this.recipeId = recipeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getServing() {
		return serving;
	}

	public void setServing(String serving) {
		this.serving = serving;
	}

	public String getPreparationTime() {
		return preparationTime;
	}

	public void setPreparationTime(String preparationTime) {
		this.preparationTime = preparationTime;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recipe other = (Recipe) obj;
		if (recipeId == null) {
			if (other.recipeId != null)
				return false;
		} else if (!recipeId.equals(other.recipeId))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Przepis [recipeId=" + recipeId + ", nazwa=" + name +"]";
	}
}

