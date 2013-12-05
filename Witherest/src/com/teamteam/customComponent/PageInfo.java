package com.teamteam.customComponent;

public class PageInfo {
	public int roomId;
	public int page;                                // 페이지 번호
	public int totalRecordCount;                  // 전체 레코드 갯수
	public int curRecordCount;  
	public static final int PAGING_SIZE  = 10;
	
	public PageInfo(){}
	
	public PageInfo(int roomId, int page, int totalRecordCount){
		this.roomId = roomId;
		this.page = page;
		this.totalRecordCount = totalRecordCount;
	}
	
	public PageInfo(int page, int totalRecordCount){
		this.page = page;
		this.totalRecordCount = totalRecordCount;
	}

	public int getCurRecordCount(){
		return page * PAGING_SIZE;
	}
	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getTotalRecordCount() {
		return totalRecordCount;
	}

	public void setTotalRecordCount(int totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}
	
	
}
