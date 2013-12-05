package com.teamteam.witherest;

import com.teamteam.witherest.cacheload.ImageLoader;
import com.teamteam.witherest.common.WitherObject;
import com.teamteam.witherest.service.internal.ServiceManager;

import android.app.Application;
import android.util.Log;

public class Witherest extends Application {
	private static final String TAG="Witherest Application";
	private boolean mIsGCMReady = false;
	private String mGCMId;
	
	
	public boolean isGCMReady() {
		return mIsGCMReady;
	}
	public void setGCMReady(boolean isGCMReady) {
		this.mIsGCMReady = isGCMReady;
	}
	public String getGCMId() {
		return mGCMId;
	}
	public void setGCMId(String gCMId) {
		mGCMId = gCMId;
	}
	@Override
	public void onCreate() {
		super.onCreate();
		WitherObject.setImageLoader(getApplicationContext());
		new ImageLoader(getApplicationContext()).clearCache();

	}
	
	@Override
	public void onTerminate() {
		super.onTerminate();
	}
	
	
	
	
	
}
