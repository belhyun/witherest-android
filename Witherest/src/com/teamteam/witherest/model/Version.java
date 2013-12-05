package com.teamteam.witherest.model;

public class Version {
	public int majorVersion;
	public int minorVersion;
	
	public Version(){}
	public Version(int majorVersion, int minorVersion) {

		this.majorVersion = majorVersion;
		this.minorVersion = minorVersion;
	}
	public int getMajorVersion() {
		return majorVersion;
	}
	public void setMajorVersion(int majorVersion) {
		this.majorVersion = majorVersion;
	}
	public int getMinorVersion() {
		return minorVersion;
	}
	public void setMiorVersion(int minorVersion) {
		this.minorVersion = minorVersion;
	}
	
	
}
