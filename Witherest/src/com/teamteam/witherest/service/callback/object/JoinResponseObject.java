package com.teamteam.witherest.service.callback.object;

public class JoinResponseObject extends BaseResponseObject {
	public String acc_token;
	public int user_id;
	
	public String getAcc_token() {return acc_token;}
	public void setAcc_token(String acc_token) {this.acc_token = acc_token;}

	public int getUser_id() {return user_id;}
	public void setUser_id(int user_id) {this.user_id = user_id;}
}
