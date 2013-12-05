package com.teamteam.witherest.service.callback.object;

import java.util.ArrayList;

public class CategoryRoomCountResponseObject extends BaseResponseObject {

	public ArrayList<CategoryRoomCount> allCategoriesRoomCount;
	
	public CategoryRoomCountResponseObject(){}
	
	public ArrayList<CategoryRoomCount> getAllCategoriesRoomCount() {
		return allCategoriesRoomCount;
	}

	public void setAllCategoriesRoomCount(
			ArrayList<CategoryRoomCount> allCategoriesRoomCount) {
		this.allCategoriesRoomCount = allCategoriesRoomCount;
	}

	public static class CategoryRoomCount {
		public int categoryId;
		public int roomCount;
		
		public CategoryRoomCount(){}

		public int getCategoryId() {return categoryId;}
		public void setCategoryId(int categoryId) {this.categoryId = categoryId;}
		public int getRoomCount() {return roomCount;}
		public void setRoomCount(int roomCount) {this.roomCount = roomCount;}	
	}
}
