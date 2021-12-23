package com.javassem.domain;

import java.util.Date;

public class OwnerBoardVO {
	private int board_owner_seq;
	public int getBoard_owner_seq() {
		return board_owner_seq;
	}
	public void setBoard_owner_seq(int board_owner_seq) {
		this.board_owner_seq = board_owner_seq;
	}


	private String  normal_emergency;
	private String jobDate;
	private String jobTime_start;
	private String jobTime_end;
	private String writer;
	private String content;
	private String shopname;
	
	
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getJobDate() {
		return jobDate;
	}
	public void setJobDate(String jobDate) {
		this.jobDate = jobDate;
	}


	public String getJobTime_start() {
		return jobTime_start;
	}
	public void setJobTime_start(String jobTime_start) {
		this.jobTime_start = jobTime_start;
	}
	public String getJobTime_end() {
		return jobTime_end;
	}
	public void setJobTime_end(String jobTime_end) {
		this.jobTime_end = jobTime_end;
	}


	private String need_Num; 
	public String getNormal_emergency() {
		return normal_emergency;
	}
	public void setNormal_emergency(String normal_emergency) {
		this.normal_emergency = normal_emergency;
	}



	public String getNeed_Num() {
		return need_Num;
	}
	public void setNeed_Num(String need_Num) {
		this.need_Num = need_Num;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	private Date regDate;
}
