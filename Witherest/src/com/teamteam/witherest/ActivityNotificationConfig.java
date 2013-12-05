package com.teamteam.witherest;

import com.teamteam.customComponent.SimpleProgressDialog;
import com.teamteam.witherest.alarm.WitherestAlarms;
import com.teamteam.witherest.common.AndroUtils;
import com.teamteam.witherest.common.CommonUtils;
import com.teamteam.witherest.model.Session;
import com.teamteam.witherest.service.callback.UserServiceCallback;
import com.teamteam.witherest.service.callback.object.BaseResponseObject;
import com.teamteam.witherest.service.internal.ConnectionErrorHandler;
import com.teamteam.witherest.service.internal.Service;
import com.teamteam.witherest.service.internal.ServiceManager;
import com.teamteam.witherest.service.internal.UserService;

import android.view.View;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.CheckBox;

public class ActivityNotificationConfig extends Activity implements  UserServiceCallback, OnClickListener {


	public CheckBox mRoomTimeBtn;
	public CheckBox mRoomManagerBtn;
	public CheckBox mReplyBtn;
	public CheckBox mWitheresBtn;
	
	public UserService userService;
	private SimpleProgressDialog waitProgressDialog;
	
	private int mCurChangeOption;
	private boolean mCurChangeOptionState ;
	
	public static final int CHANGE_OPTION_ROOM_TIME = 1;
	public static final int CHANGE_OPTION_MANAGER_NOTICE = 2;
	public static final int CHANGE_OPTION_REPLY = 3;
	public static final int CHANGE_OPTION_WITHEREST_NOTICE = 4;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    requestWindowFeature(Window.FEATURE_NO_TITLE);
	    setContentView(R.layout.activity_notificationconfig);
	    
	    initInstance();
	    initView();
	    initListener();
	}

	private void initInstance() {
		userService = ServiceManager.getServiceManager().getUserService();
	}

	private void initView() {
		mRoomTimeBtn = (CheckBox)findViewById(R.id.activity_noti_roomtime_btn);
		mRoomManagerBtn = (CheckBox)findViewById(R.id.activity_noti_roommanager_btn);
		mReplyBtn = (CheckBox)findViewById(R.id.activity_noti_reply_btn);
		mWitheresBtn = (CheckBox)findViewById(R.id.activity_noti_witherestinfo_btn);
		
		mRoomTimeBtn.setChecked(Session.getInstance().user.isRoomTimeNotice);
		mRoomManagerBtn.setChecked(Session.getInstance().user.isRoomManagerNotice);
		mReplyBtn.setChecked(Session.getInstance().user.isReplyNotice);
		mWitheresBtn.setChecked(Session.getInstance().user.isWitherestNotice);
	}

	private void initListener() {
		mRoomTimeBtn.setOnClickListener( this);
		mRoomManagerBtn.setOnClickListener(this);
		mReplyBtn.setOnClickListener(this);
		mWitheresBtn.setOnClickListener(this);
	}

	public void onClick(View v) {
		CheckBox button = (CheckBox)v;
		switch(button.getId()){
		case R.id.activity_noti_roomtime_btn:
			Session.getInstance().user.setIsRoomTimeNotice(button.isChecked());
			mCurChangeOptionState = button.isChecked();
			mCurChangeOption = CHANGE_OPTION_ROOM_TIME;
			break;
			
		case R.id.activity_noti_roommanager_btn:
			Session.getInstance().user.setIsRoomManagerNotice(button.isChecked());
			mCurChangeOptionState = button.isChecked();
			mCurChangeOption = CHANGE_OPTION_MANAGER_NOTICE;
			break;
			
		case R.id.activity_noti_reply_btn:
			Session.getInstance().user.setIsReplyNotice(button.isChecked());
			mCurChangeOptionState =button.isChecked();
			mCurChangeOption = CHANGE_OPTION_REPLY;;
			break;
			
		case R.id.activity_noti_witherestinfo_btn:
			Session.getInstance().user.setIsWitherestNotice(button.isChecked());
			mCurChangeOptionState =button.isChecked();
			mCurChangeOption = CHANGE_OPTION_WITHEREST_NOTICE;
			break;
		}
		
		updateAlarm();
		
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		waitProgressDialog = new SimpleProgressDialog(this, getString(R.string.wait_title),getString(R.string.wait_message));
		waitProgressDialog.start();
	}
	
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		SimpleProgressDialog.end(waitProgressDialog);
	}

	private void updateAlarm() {
		if (CommonUtils.isNullOrEmpty(Session.getInstance().user.getAlarmParam()) ){
			return;
		}
		
		if (!waitProgressDialog.isShowing()){
			waitProgressDialog.show();
		}
		
		userService.setOnUserCallback(this);
		userService.updateAlarm(Session.getInstance().user.getAlarmParam());
	}

	public void reverseUserSettings(){
		switch(mCurChangeOption){
		case CHANGE_OPTION_ROOM_TIME:
			Session.getInstance().user.setIsRoomTimeNotice(!Session.getInstance().user.isRoomTimeNotice);
			mRoomTimeBtn.setChecked(!mRoomTimeBtn.isChecked());
			break;
			
		case CHANGE_OPTION_MANAGER_NOTICE:
			Session.getInstance().user.setIsRoomManagerNotice(!Session.getInstance().user.isRoomManagerNotice);
			mRoomManagerBtn.setChecked(!mRoomManagerBtn.isChecked());
			break;
			
		case CHANGE_OPTION_REPLY:
			Session.getInstance().user.setIsReplyNotice(!Session.getInstance().user.isReplyNotice);
			mReplyBtn.setChecked(!mReplyBtn.isChecked());
			break;
			
		case CHANGE_OPTION_WITHEREST_NOTICE:
			Session.getInstance().user.setIsWitherestNotice(!Session.getInstance().user.isWitherestNotice);
			mWitheresBtn.setChecked(!mWitheresBtn.isChecked());
			break;
		}
	}
	
	public void onUserServiceCallback(BaseResponseObject object) {
		
		if (waitProgressDialog.isShowing()){
			waitProgressDialog.dismiss();
		}
		
		if (object.resultCode == Service.RESULT_FAIL) {
			reverseUserSettings();
			mCurChangeOption = -1;
			return;
		}
		
		switch(object.requestType){
		case Service.REQUEST_TYPE_ALARM_UPDATE:
			if (object.resultCode == ConnectionErrorHandler.COMMON_ERROR || object.resultCode == ConnectionErrorHandler.NETWORK_DISABLE ||
					object.resultCode == ConnectionErrorHandler.PARSING_ERROR){
				
				reverseUserSettings();
				AlertDialog.Builder builder = new AlertDialog.Builder(this);
				builder.setTitle(R.string.fatal_network_error);
				builder.setMessage(R.string.fatal_network_error_message);
				builder.setCancelable(false);
				builder.setPositiveButton(R.string.confirm,
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								finish();
							}
						});
				builder.create().show();
				return;
				
			}else if (object.resultCode == ConnectionErrorHandler.CONNECTION_TIMEOUT || object.resultCode == ConnectionErrorHandler.READ_TIMEOUT){
				
				reverseUserSettings();
				AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
				builder2.setTitle(R.string.tempo_network_error);
				builder2.setMessage(R.string.tempo_network_error_message);
				builder2.setCancelable(false);
				builder2.setPositiveButton(R.string.confirm,
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								new Handler().postDelayed(new Runnable() {
									public void run() {
										reverseUserSettings();
										updateAlarm();
									}
								}, 100);
							}
						});

				builder2.setNegativeButton(R.string.no,
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
							}
						});
				builder2.create().show();
				return;
			}
			
			if (mCurChangeOption == CHANGE_OPTION_ROOM_TIME){
				WitherestAlarms alarms = new WitherestAlarms(this);
				alarms.userOptionChanged(mCurChangeOptionState);
				alarms.close();
			}
			mCurChangeOption = -1;
			break;
		}	
		
	}

}
