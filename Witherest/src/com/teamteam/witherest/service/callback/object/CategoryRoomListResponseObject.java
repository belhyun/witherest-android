package com.teamteam.witherest.service.callback.object;

import java.util.ArrayList;

import com.teamteam.witherest.service.callback.object.MyCheckResponseObject.CheckRoom;

public class CategoryRoomListResponseObject extends BaseResponseObject {
	public int totalRoomCount;
	public ArrayList<CheckRoom> roomList;
	
	public int getTotalRoomCount() {
		return totalRoomCount;
	}
	public void setTotalRoomCount(int totalRoomCount) {
		this.totalRoomCount = totalRoomCount;
	}
	public ArrayList<CheckRoom> getRoomList() {
		return roomList;
	}
	public void setRoomList(ArrayList<CheckRoom> roomList) {
		this.roomList = roomList;
	}
	
	
}
