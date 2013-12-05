package com.teamteam.witherest.service.callback.object;

import java.util.ArrayList;

public class MyCheckResponseObject extends BaseResponseObject {
	
	public int createRoomCount;
	public int joinRoomCount;
	public int userStarCount;
	public ArrayList<CheckRoom> roomList;
	public MyCheckResponseObject(){}
	
	public int getCreateRoomCount() {return createRoomCount;}
	public void setCreateRoomCount(int createRoomCount) {this.createRoomCount = createRoomCount;}
	public int getJoinRoomCount() {return joinRoomCount;}
	public void setJoinRoomCount(int joinRoomCount) {this.joinRoomCount = joinRoomCount;}
	public int getUserStarCount() {return userStarCount;}
	public void setUserStarCount(int userStarCount) {this.userStarCount = userStarCount;}
	public ArrayList<CheckRoom> getRoomList() {return roomList;}
	public void setRoomList(ArrayList<CheckRoom> roomList) {this.roomList = roomList;}

	public static class CheckRoom{
		 public int roomId;
		public int roomOwner;
		public String roomTitle;
		public String roomPurpose;
		public String roomImagePath;
		public String startDate;
		public String endDate;
		public int checkedMemberCount;
		public int maxMemberCount;
		public int curMemberCount;
		public boolean checked;
		public String alarmTime;
		public int alarmLevel;
     
		public CheckRoom(){}

		
		
		public String getAlarmTime() {return alarmTime;}
		public void setAlarmTime(String alarmTime) {this.alarmTime = alarmTime;}
		public int getAlarmLevel() {return alarmLevel;}
		public void setAlarmLevel(int alarmLevel) {this.alarmLevel = alarmLevel;}
		public int getRoomId() {return roomId;}
		public void setRoomId(int roomId) {this.roomId = roomId;}
		public int getRoomOwner() {return roomOwner;}
		public void setRoomOwner(int roomOwner) {this.roomOwner = roomOwner;}
		public String getRoomTitle() {return roomTitle;}
		public void setRoomTitle(String roomTitle) {this.roomTitle = roomTitle;}
		public String getRoomImagePath() {return roomImagePath;}
		public void setRoomImagePath(String roomImagePath) {this.roomImagePath = roomImagePath;}
		public String getStartDate() {return startDate;}
		public void setStartDate(String startDate) {this.startDate = startDate;}
		public String getEndDate() {return endDate;}
		public void setEndDate(String endDate) {this.endDate = endDate;}
		public int getMaxMemberCount() {return maxMemberCount;}
		public void setMaxMemberCount(int maxMemberCount) {this.maxMemberCount = maxMemberCount;}
		public int getCurMemberCount() {return curMemberCount;}
		public void setCurMemberCount(int curMemberCount) {this.curMemberCount = curMemberCount;}
		public boolean isChecked() {return checked;}
		public void setChecked(boolean checked) {this.checked = checked;}
		public String getRoomPurpose() {return roomPurpose;}
		public void setRoomPurpose(String roomPurpose) {this.roomPurpose = roomPurpose;}
		public int getCheckedMemberCount() {return checkedMemberCount;}
		public void setCheckedMemberCount(int checkedMemberCount) {this.checkedMemberCount = checkedMemberCount;}	
	}
	
}
