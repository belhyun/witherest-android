package com.teamteam.witherest.service.callback.object;

public class CheckRoomResponseObject extends BaseResponseObject {
	public int checkedMemberCount;
	
	public CheckRoomResponseObject(){}

	public int getCheckedMemberCount() {
		return checkedMemberCount;
	}

	public void setCheckedMemberCount(int checkedMemberCount) {
		this.checkedMemberCount = checkedMemberCount;
	}
	
	
}
