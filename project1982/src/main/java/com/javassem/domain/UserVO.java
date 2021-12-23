package com.javassem.domain;

public class UserVO {
	
	private int usernum;
	private String userid;
	private String userpass;
	private String userpass2;
	private String username;
	private String usercode;
	private String usergender;
	private String userpn;
	private String useraddr;
	private String usermail;
	private String userimg;
	private String userdate;
	private String userbirth;
	
	public UserVO(){
		
	}
	
	public UserVO(String userid, String userpass, String userpass2, String username, String userpn, String usermail, String userbirth, String userdate) {
	super();
	this.userid= userid;
	this.userpass = userpass;
	this.userpass2 = userpass2;
	this.username = username;
	this.userpn = userpn;
	this.usermail= usermail;
	this.userbirth= userbirth;
	this.userdate = userdate;
	}
	
	public int getUsernum() {
		return usernum;
	}
	public void setUsernum(int usernum) {
		this.usernum = usernum;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public String getUserpass2() {
		return userpass2;
	}
	public void setUserpass2(String userpass2) {
		this.userpass2 = userpass2;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsercode() {
		return usercode;
	}
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
	public String getUsergender() {
		return usergender;
	}
	public void setUsergender(String usergender) {
		this.usergender = usergender;
	}
	public String getUserpn() {
		return userpn;
	}
	public void setUserpn(String userpn) {
		this.userpn = userpn;
	}
	public String getUseraddr() {
		return useraddr;
	}
	public void setUseraddr(String useraddr) {
		this.useraddr = useraddr;
	}
	public String getUsermail() {
		return usermail;
	}
	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}
	public String getUserimg() {
		return userimg;
	}
	public void setUserimg(String userimg) {
		this.userimg = userimg;
	}
	public String getUserdate() {
		return userdate;
	}
	public void setUserdate(String userdate) {
		this.userdate = userdate;
	}
	public String getUserbirth() {
		return userbirth;
	}
	public void setUserbirth(String userbirth) {
		this.userbirth = userbirth;
	}
	
	
}
