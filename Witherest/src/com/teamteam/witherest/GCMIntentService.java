package com.teamteam.witherest;

import com.google.android.gcm.GCMBaseIntentService;
import com.teamteam.witherest.alarm.AlarmWakeLock;
import com.teamteam.witherest.service.internal.Service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class GCMIntentService extends GCMBaseIntentService {

	private static final String TAG = "GCMIntentService";
	private static final String PROJECT_ID = "1022033162817";
	
	public GCMIntentService() {
		super(PROJECT_ID);
	}

	@Override
	protected void onError(Context context, String message) {
		Log.d(TAG, "on_error. errorId : " + message);

	}

	@Override
	protected void onMessage(Context context, Intent intent) {
		if (intent.getAction().equals("com.google.android.c2dm.intent.RECEIVE")) {
			generateNotification(context, intent);
		}
	}

	@Override
	protected void onRegistered(Context context, String regId) {
		if (!regId.equals("") || regId != null) {
			Log.d(TAG, "onRegistered!! ---> " + regId);
			((Witherest) context.getApplicationContext()).setGCMId(regId);
			((Witherest) context.getApplicationContext()).setGCMReady(true);
		}

	}

	@Override
	protected void onUnregistered(Context context, String regId) {
		Log.d(TAG, "onUnregistered!! " + regId);

	}

	@Override
	protected boolean onRecoverableError(Context context, String errorId) {
		Log.d(TAG, "onRecoverableError. errorId : " + errorId);
		return super.onRecoverableError(context, errorId);
	}

	private static void generateNotification(Context context, Intent i) {
	/*	String pushCode = i.getStringExtra("pushCode");
		String message = i.getStringExtra("message");
		
		message = message + " : " + pushCode;
		message = "puchCode " +pushCode + " : " + message;
		String title = context.getString(R.string.app_name);
		
		int icon = R.drawable.login_logo;
		long when = System.currentTimeMillis();
		AlarmWakeLock.acquire(context);
		NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
		Notification notification = new Notification(icon, title, when);
		notification.defaults = Notification.DEFAULT_ALL;
		
		
		Intent notificationIntent = new Intent(context, MainActivity.class);

		notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP| Intent.FLAG_ACTIVITY_SINGLE_TOP);
		PendingIntent intent = PendingIntent.getActivity(context, 0,notificationIntent, 0);

		notification.setLatestEventInfo(context, title, message, intent);
		notification.flags |= Notification.FLAG_AUTO_CANCEL;
		notificationManager.notify(0, notification);*/
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		
	}
	
	

}
