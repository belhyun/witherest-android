package com.teamteam.witherest.model;

import java.util.ArrayList;

import android.widget.TextView;

public class UserProfile {
	public String id;
	public String password;
	public String nickName;
	public String purpose;
	public String profileImagePath;
	public ArrayList<Category> caategories;
	
	public UserProfile(){}
	public UserProfile(String idl,String password,  String nickName, String purpose,
			String profileImagePath,
			ArrayList<Category> categories) {
		this.id = idl;
		this.nickName = nickName;
		this.purpose = purpose;
		this.password = password;
		this.profileImagePath = profileImagePath;
		this.caategories = categories;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getProfileImagePath() {
		return profileImagePath;
	}
	public void setProfileImagePath(String profileImagePath) {
		this.profileImagePath = profileImagePath;
	}
	public ArrayList<Category> getCaategories() {
		return caategories;
	}
	public void setCaategories(ArrayList<Category> caategories) {
		this.caategories = caategories;
	}

	
}
