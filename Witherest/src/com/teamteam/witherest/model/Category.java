package com.teamteam.witherest.model;

public class Category {
	public int categoryId;
	public String categoryName;
	public String categoryDescription;
	
	public Category(){}
	public Category(int id, String name, String description) {
		this.categoryId = id;
		this.categoryName = name;
		this.categoryDescription = description;
	}
	public int getId() {
		return categoryId;
	}
	public void setId(int id) {
		this.categoryId = id;
	}
	public String getName() {
		return categoryName;
	}
	public void setName(String name) {
		this.categoryName = name;
	}
	public String getDescription() {
		return categoryDescription;
	}
	public void setDescription(String description) {
		this.categoryDescription = description;
	}
	
	
}