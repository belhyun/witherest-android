package com.teamteam.witherest.model;


import android.os.Build;

public class AppInfo {
	
	public static final int APP_MAJOR_VERSION= 1;
	public static final int APP_MINOR_VERSION = 0;
	
	public static final String PREFS_FILE="withreset";
	public static final String KEY_VERSIONNAME="versionName";
	public static final String AGENT="android";

	public String versionName;
	public String agent;
	public String releaseVersion;
	public int sdkVersion; 
	public boolean needUpgrade; 
	
	public Version version;
	
	private static AppInfo appInfo = null;
	
	public static AppInfo getInstance(){
		if (appInfo == null){
			appInfo = new AppInfo();
		}
		return appInfo;
	}
	private AppInfo(){}
	
	public void loadAppInfo(){
		version = new Version();
		version.setMajorVersion(APP_MAJOR_VERSION);
		version.setMiorVersion(APP_MINOR_VERSION);
		
		sdkVersion = Build.VERSION.SDK_INT;
		releaseVersion = Build.VERSION.RELEASE;
		agent =AGENT;
		needUpgrade = false;
	}
	public String getVersionName() {
		return versionName;
	}
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public String getReleaseVersion() {
		return releaseVersion;
	}
	public void setReleaseVersion(String releaseVersion) {
		this.releaseVersion = releaseVersion;
	}
	public int getSdkVersion() {
		return sdkVersion;
	}
	public void setSdkVersion(int sdkVersion) {
		this.sdkVersion = sdkVersion;
	}
	public Version getVersion() {
		return version;
	}
	public void setVersion(Version version) {
		this.version = version;
	}
	
	
}
