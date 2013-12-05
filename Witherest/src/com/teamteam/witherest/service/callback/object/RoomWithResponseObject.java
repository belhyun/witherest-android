package com.teamteam.witherest.service.callback.object;

import java.util.ArrayList;

public class RoomWithResponseObject extends BaseResponseObject {
	public CheckRoomWith checkRoomWith;
	
	public CheckRoomWith getCheckRoomWith() {return checkRoomWith;}
	public void setCheckRoomWith(CheckRoomWith checkRoomWith) {this.checkRoomWith = checkRoomWith;}

	public static class CheckRoomWith{
		public int roomId;
		public String roomTitle;
		public String roomPurpose;
		public String roomImagePath;
		public String startDate;
		public String endDate;
		public int curMemberCount;
		public int maxMemberCount;
    
        public String alarmTime;
        public int alarmLevel;
        public int publicLevel;
        public String periodType;
        

		public int roomOwner;
		public boolean isJoined;
		public String achievementRate;
		public ArrayList<CheckedMember> checkedMembers;
		
		
		public String getRoomImagePath() {return roomImagePath;}
		public void setRoomImagePath(String roomImagePath) {this.roomImagePath = roomImagePath;}
		public String getAlarmTime() {return alarmTime;}
		public void setAlarmTime(String alarmTime) {this.alarmTime = alarmTime;}
		public int getAlarmLevel() {return alarmLevel;}
		public void setAlarmLevel(int alarmLevel) {this.alarmLevel = alarmLevel;}
		public int getPublicLevel() {return publicLevel;}
		public void setPublicLevel(int publicLevel) {this.publicLevel = publicLevel;}
		public String getPeriodType() {return periodType;}
		public void setPeriodType(String periodType) {this.periodType = periodType;}
		public int getCurMemberCount() {return curMemberCount;}
		public void setCurMemberCount(int curMemberCount) {this.curMemberCount = curMemberCount;}
		public int getRoomId() {return roomId;}
		public void setRoomId(int roomId) {this.roomId = roomId;}
		public String getRoomTitle() {return roomTitle;}
		public void setRoomTitle(String roomTitle) {this.roomTitle = roomTitle;}
		public String getRoomPurpose() {return roomPurpose;}
		public void setRoomPurpose(String roomPurpose) {this.roomPurpose = roomPurpose;}
		public String getStartDate() {return startDate;}
		public void setStartDate(String startDate) {this.startDate = startDate;}
		public String getEndDate() {return endDate;}
		public void setEndDate(String endDate) {this.endDate = endDate;}
		public int getMaxMemberCount() {return maxMemberCount;}
		public void setMaxMemberCount(int maxMemberCount) {this.maxMemberCount = maxMemberCount;}
		public String getAchievementRate() {return achievementRate;}
		public void setAchievementRate(String achievementRate) {this.achievementRate = achievementRate;}
		public ArrayList<CheckedMember> getCheckedMembers() {return checkedMembers;}
		public void setCheckedMembers(ArrayList<CheckedMember> checkedMembers) {this.checkedMembers = checkedMembers;}
		public int getRoomOwner() {return roomOwner;}
		public void setRoomOwner(int roomOwner) {this.roomOwner = roomOwner;}
		public boolean isJoined() {return isJoined;}
		public void setJoined(boolean isJoined) {this.isJoined = isJoined;}	
		
	}
	
	public static class CheckedMember {
		public int checkedMemberId;
		public String checkedUserProfileImage;
		
		public int getCheckedMemberId() {return checkedMemberId;}
		public void setCheckedMemberId(int checkedMemberId) {this.checkedMemberId = checkedMemberId;}
		public String getCheckedUserProfileImage() {return checkedUserProfileImage;}
		public void setCheckedUserProfileImage(String checkedUserProfileImage) {this.checkedUserProfileImage = checkedUserProfileImage;}
		
	}
}
