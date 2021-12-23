package com.javassem.domain;

import org.springframework.web.bind.annotation.RequestMapping;

public class ParkVO {
	
	
	private String supervisorId;
	private String supervisorPw;
	
	
	
	public String getSupervisorId() {
		return supervisorId;
	}
	public void setSupervisorId(String supervisorId) {
		this.supervisorId = supervisorId;
	}
	public String getSupervisorPw() {
		return supervisorPw;
	}
	public void setSupervisorPw(String supervisorPw) {
		this.supervisorPw = supervisorPw;
	}
	
	
}
