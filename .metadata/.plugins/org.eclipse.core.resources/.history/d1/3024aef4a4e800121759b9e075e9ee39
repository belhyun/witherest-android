package com.teamteam.witherest.service.internal;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.teamteam.witherest.service.callback.ArticleServiceCallback;
import com.teamteam.witherest.service.callback.CategoryServiceCallback;
import com.teamteam.witherest.service.callback.RoomServiceCallback;
import com.teamteam.witherest.service.callback.UserServiceCallback;
import com.teamteam.witherest.service.callback.VersionServiceCallback;
import com.teamteam.witherest.service.callback.object.BaseResponseObject;

public class ServiceHandler extends Handler{
	UserServiceCallback userServiceCallback;
	CategoryServiceCallback categoryServiceCallback;
	VersionServiceCallback versionServiceCallback;
	RoomServiceCallback roomServiceCallback;
	ArticleServiceCallback articleServiceCallback;
	
	@Override
	public void handleMessage(Message msg) {
		BaseResponseObject obj = (BaseResponseObject)msg.obj;
	   
		if (obj.requestType >=0 && obj.requestType <100){
	    	versionServiceCallback.onVersionServiceCallback(obj);
	    }
	    
	    else if (obj.requestType >=100  && obj.requestType <200){
			userServiceCallback.onUserServiceCallback(obj);
		}
	    
	    else if (obj.requestType >=200 && obj.requestType <300){
			categoryServiceCallback.onCategoryServiceCallback((BaseResponseObject)msg.obj);
		}
	    
	    else if (obj.requestType >= 300 && obj.requestType<400){
			roomServiceCallback.onRoomServiceCallback((BaseResponseObject)msg.obj);
		}
	    
		else if (obj.requestType >= 400 && obj.requestType < 500){
			articleServiceCallback.onArticleServiceCallback((BaseResponseObject)msg.obj);
		}
	}

	public void setUserServiceCallback(UserServiceCallback userServiceCallback) {
		this.userServiceCallback = userServiceCallback;
	}

	public void setCategoryServiceCallback(CategoryServiceCallback categoryServiceCallback) {
		this.categoryServiceCallback = categoryServiceCallback;
	}

	public void setVersionServiceCallback(VersionServiceCallback callback) {
		this.versionServiceCallback = callback;
		
	}
	
	public void setRoomServiceCallback(RoomServiceCallback callback){
		this.roomServiceCallback = callback;
	}

	public void setArticleServiceCallback(ArticleServiceCallback callback) {
		this.articleServiceCallback = callback;
		
	}
}
