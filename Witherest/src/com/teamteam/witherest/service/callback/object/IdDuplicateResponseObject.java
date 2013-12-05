package com.teamteam.witherest.service.callback.object;

public class IdDuplicateResponseObject extends BaseResponseObject {
	public boolean isDuplication;

	public IdDuplicateResponseObject(){}
	public IdDuplicateResponseObject( int resultCode, String resultMsg,int requestType, boolean isDuplication) {
		super(resultCode, resultMsg, requestType);
		this.isDuplication = isDuplication;
	}
	public boolean isDuplicated() {
		return isDuplication;
	}
	public void setDuplicated(boolean isDuplication) {
		this.isDuplication = isDuplication;
	} 
}
