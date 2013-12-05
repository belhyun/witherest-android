package com.teamteam.witherest.common;

import android.content.Context;

import com.teamteam.witherest.cacheload.ImageLoader;

public class WitherObject {
	private static ImageLoader imageLoader;
	
	public static ImageLoader getImageLoader(){
		return imageLoader;
	}
	
	public static void setImageLoader(Context context){
		imageLoader = new ImageLoader(context);
	}
}