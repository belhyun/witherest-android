package com.teamteam.witherest.service.callback.object;

import com.teamteam.witherest.model.User;

public class LoginResponseObject extends BaseResponseObject {
	public String token;
	public User user;

	public LoginResponseObject(){}
	public LoginResponseObject(int resultCode, String resultMsg,int requestType, String token) {
		super(resultCode, resultMsg, requestType);
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	} 
	
	
}
