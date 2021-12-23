package com.javassem.domain;

public class ParkBlackVO {
	
	private String userID;	// 계정명
	private String reason;	//경고 사유
	private String userPN;	//구직자 연락처
	private String userName;//구직자명
	private int warnCnt;	//경고 횟수
	
	
	public int getWarnCnt() {
		return warnCnt;
	}
	public void setWarnCnt(int warnCnt) {
		this.warnCnt = warnCnt;
	}

	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getUserPN() {
		return userPN;
	}
	public void setUserPN(String userPN) {
		this.userPN = userPN;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

//	public int getWarnCnt() {
//		return WarnCnt;
//	}
//	public void setWarnCnt(int WarnCnt) {
//		this.WarnCnt = WarnCnt;
//	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
}
