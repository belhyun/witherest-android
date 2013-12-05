package com.teamteam.witherest.service.callback.object;

import java.util.ArrayList;

import com.teamteam.witherest.service.callback.object.RoomWithResponseObject.CheckedMember;

public class DateCheckedMembers extends BaseResponseObject {
	public ArrayList<CheckedMember> checkedMembers;

	public ArrayList<CheckedMember> getCheckedMembers() {
		return checkedMembers;
	}

	public void setCheckedMembers(ArrayList<CheckedMember> checkedMembers) {
		this.checkedMembers = checkedMembers;
	}
}
