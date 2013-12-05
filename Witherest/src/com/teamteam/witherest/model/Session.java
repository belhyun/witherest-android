package com.teamteam.witherest.model;

import org.apache.http.io.SessionInputBuffer;

public class Session {
	public static final int AUTHORIZED  = 0;
	public static final int NOT_AUTHORIZED =1;
	
	public User user;
	public String sessionKey;
	public int sessionStatus;
	
	private static Session session = null;
	public static Session getInstance(){
		if(session== null) 
			session = new Session();
		return session;
	}
	private Session(){
		this.user = null;
		this.sessionKey = null;
		this.sessionStatus = NOT_AUTHORIZED;
	}
	
	public void initialize(){
		this.user = null;
		this.sessionKey = null;
		this.sessionStatus = NOT_AUTHORIZED;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String getSessionKey() {
		return sessionKey;
	}
	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}
	public int getSessionStatus() {
		return sessionStatus;
	}
	public void setSessionStatus(int sessionStatus) {
		this.sessionStatus = sessionStatus;
	}
	
	
}


