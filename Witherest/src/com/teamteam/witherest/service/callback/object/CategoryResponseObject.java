package com.teamteam.witherest.service.callback.object;

import java.util.ArrayList;

import com.teamteam.witherest.model.Category;

public class CategoryResponseObject extends BaseResponseObject{
	
	public ArrayList<Category> categories;
	public CategoryResponseObject(){}
	public CategoryResponseObject( int resultCode, String resultMsg,int requestType, ArrayList<Category> categories) {
		super(resultCode, resultMsg, requestType);
		this.categories = categories;
	}
	public ArrayList<Category> getCategories() {
		return categories;
	}
	public void setCategories(ArrayList<Category> categories) {
		this.categories = categories;
	} 
	
	
	
}
