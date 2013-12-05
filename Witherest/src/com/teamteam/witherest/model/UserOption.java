package com.teamteam.witherest.model;

public class UserOption {
	
	public static final String KEY_ROOMTIME_NOTICE = "isRoomTimeNotice";
	public static final String KEY_ROOMMANGER_NOTICE = "isRoomManagerNotice";
	public static final String KEY_APPLY_NOTICE = "isApplyNotice";
	public static final String KEY_WITHEREST_NOTICE = "isWitherestNotice";

	
	public boolean isRoomTimeNotice;
	public boolean isRoomManagerNotice;
	public boolean isReplyNotice;
	public boolean isWitherestNotice;
	public boolean isAutoLogin; 
	
	public UserOption(){
		this.isRoomTimeNotice = false;
		this.isRoomManagerNotice = false;
		this.isReplyNotice = false;
		this.isWitherestNotice = false;

	}

	public boolean isRoomTimeNotice() {
		return isRoomTimeNotice;
	}

	public void setRoomTimeNotice(boolean isRoomTimeNotice) {
		this.isRoomTimeNotice = isRoomTimeNotice;
	}

	public boolean isRoomManagerNotice() {
		return isRoomManagerNotice;
	}

	public void setRoomManagerNotice(boolean isRoomManagerNotice) {
		this.isRoomManagerNotice = isRoomManagerNotice;
	}

	public boolean isReplyNotice() {
		return isReplyNotice;
	}

	public void setReplyNotice(boolean isReplyNotice) {
		this.isReplyNotice = isReplyNotice;
	}

	public boolean isWitherestNotice() {
		return isWitherestNotice;
	}

	public void setWitherestNotice(boolean isWitherestNotice) {
		this.isWitherestNotice = isWitherestNotice;
	}

	public boolean isAutoLogin() {
		return isAutoLogin;
	}

	public void setAutoLogin(boolean isAutoLogin) {
		this.isAutoLogin = isAutoLogin;
	}
	
	
}
