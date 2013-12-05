package com.teamteam.witherest.service.callback.object;

import com.teamteam.witherest.model.Version;

public class VersionResponseObject extends BaseResponseObject {
	public Version version;
	
	public VersionResponseObject(){}
	public VersionResponseObject(int resultCode, String resultMsg, int requestType, Version version){
		super(resultCode, resultMsg, requestType);
		this.version = version;
	}
	public Version getVersion() {
		return version;
	}

	public void setVersion(Version version) {
		this.version = version;
	}
}
