package com.teamteam.witherest.service.external;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.google.android.gcm.GCMRegistrar;
import com.teamteam.witherest.Witherest;

public class GCMController {
	private static final String TAG = "GCMController";
	private static final String PROJECT_ID = "1022033162817";

	public Context context;

	public GCMController(Context context) {
		this.context = context;
	}

	public String registGCM() {
		String regId = null;
		try {
			GCMRegistrar.checkDevice(context);
			GCMRegistrar.checkManifest(context);

			regId = GCMRegistrar.getRegistrationId(context);
			if ("".equals(regId) || regId == null) {
				GCMRegistrar.register(context, PROJECT_ID);
			} else {
				Log.v(TAG, "GCM Id Already Registered : " + regId);
				((Witherest) context.getApplicationContext()).setGCMId(regId);
				((Witherest) context.getApplicationContext()).setGCMReady(true);
				return regId;
			}
			
			// 장비가 GCM 서비스를 지원하지 않을 경우 발생
		} catch (UnsupportedOperationException e) {
			// 메니페스트 파일에서 문제가 생기거나, GCM 관련 모든 의존성이 설치되지 않았을 때 발생
		} catch (IllegalStateException e) {
		}
		return null;
	}
	
}
