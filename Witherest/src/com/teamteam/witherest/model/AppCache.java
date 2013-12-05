package com.teamteam.witherest.model;

import java.util.ArrayList;

public class AppCache {
	
	private static AppCache appCache = null;
	
	private ArrayList<Category> appCategory;
	
	public static AppCache getInstance(){
		if (appCache == null){
			appCache = new AppCache();
		}
		return appCache;
	}
	private AppCache(){}
	
	public ArrayList<Category> getAppCategory() {
		return appCategory;
	}
	public void setAppCategory(ArrayList<Category> appCategory) {
		this.appCategory = appCategory;
	}
	
	
	
}
