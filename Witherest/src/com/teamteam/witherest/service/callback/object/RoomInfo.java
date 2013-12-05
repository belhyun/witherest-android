package com.teamteam.witherest.service.callback.object;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.teamteam.witherest.model.AppCache;
import com.teamteam.witherest.model.Category;

public class RoomInfo {
	public int roomId;
	public  String roomTitle;
	public  String roomPurpose;
	public  String roomImagePath;
	public  Category category;
		
	public  Date startDate;
	public  Date endDate;
	
	// 실천주기는 매일, 월,화,수,목,금,토,일 총 8가지 분류가 있으며, 8자리 문자열로 구성되며
	// 해당되는 자리에 1로 세팅이 된다.
	public String periodType;
	public int period;
	
	//1: 알람 받음, 0:알람받지 않음
	public int alarmLevel;
	
	public int alarmHour;
	public int alarmMin;
	
	public int publicLevel;
	public int maxMemberCount;

	//0 : 공개 , 1:비공개
	
	
	public int periodTypeMode;
	public boolean is24Time;
	
	public static final int ROOM_PUBLIC_OK = 0;
	public static final int ROOM_PUBLIC_NOT =1;
	
	public static final int ROOM_ALARM_OK =0;
	public static final int ROOM_ALARM_NOT=1;
	
	public static final int DEFAULT_ROOM_MAXMEMBERS = 10;
	
	public static final int SELECT_DAILY_MODE = 0;
	public static final int SELECT_DATE_MODE = 1;
	
	public RoomInfo(){
		this.roomImagePath = "";
		this.roomTitle ="";
		this.roomPurpose = "";
		
		this.startDate = new Date();
		this.periodType = "10000000";
		Calendar ca = Calendar.getInstance();
		ca.setTime(startDate);
		ca.add(Calendar.DATE, 7);  // 기간은 디폴트로 7일로 세팅한다.
		this.endDate  = ca.getTime();
		
		this.alarmLevel = ROOM_ALARM_OK;
		
		Calendar cal = new GregorianCalendar();
    	this.alarmHour = cal.get(Calendar.HOUR_OF_DAY);
    	this.alarmMin = cal.get(Calendar.MINUTE);
    	this.publicLevel = ROOM_PUBLIC_OK;
    	this.maxMemberCount = DEFAULT_ROOM_MAXMEMBERS;
    	this.periodTypeMode = SELECT_DAILY_MODE;
    	
    	this.is24Time = false;	
	}
	
	public void setRoomId(int roomId){this.roomId= roomId;}
	public void setRoomTitle(String roomTitle){this.roomTitle = roomTitle;}
	public void setRoomPurpose(String roomPurpose){this.roomPurpose = roomPurpose;}
	
	public void setCategory(int categoryId){
		ArrayList<Category> appCategories = AppCache.getInstance().getAppCategory();
		for (Category cat : appCategories){
			if (cat.categoryId == categoryId){
				category = cat;
				break;
			}
		}	
	}
	
	public void setStartDate(String date){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.startDate = format.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public void setEndDate(String date){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.endDate = format.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public void setPeriodType(String periodType){this.periodType = periodType;}
	public void setAlarmLevel(int alarmLevel){this.alarmLevel = alarmLevel;}
	
	public void setAlarmTime(String alarmTime){
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		Date time = null;
		try {
		   time = format.parse(alarmTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
		
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(time);
		alarmHour = cal.get(Calendar.HOUR_OF_DAY);
		alarmMin = cal.get(Calendar.MINUTE);
	}
	
	public void setPublicLevel(int publicLevel){this.publicLevel = publicLevel;}
	public void setMaxMemberCount(int count){this.maxMemberCount = count;}
}
