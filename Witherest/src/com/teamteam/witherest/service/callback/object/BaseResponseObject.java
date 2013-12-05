package com.teamteam.witherest.service.callback.object;

public class BaseResponseObject {   
	public int resultCode;  
	public String resultMsg;    
	public int requestType;  
	
	public BaseResponseObject(){}

	public BaseResponseObject(int resultCode, String resultMsg, int requestType) {
		this.resultCode =resultCode;
		this.resultMsg = resultMsg;
		this.requestType = requestType;
	}
	public int getRequestType() {
		 return requestType;
	}
	public void setRequestType(int requestType) {
		this.requestType = requestType;
	}
	public int getResultCode() {
		return resultCode;
	}
	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	
	
}
