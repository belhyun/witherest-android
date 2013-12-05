package com.teamteam.witherest.service.callback.object;

public class CreateRoomResponseObject extends BaseResponseObject {
	public int roomId;
	public CreateRoomResponseObject(){}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
}
