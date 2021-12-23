package com.javassem.domain;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public class OwnerVO {
	private int ownernum;
	private String ownerid;
	private String ownerpass;
	private String ownername;
	private String ownerbirth;
	private String ownercode;
	private String ownergender;
	private String ownerpn;
	private String ownermail;
	private String ownerdate;
	
	private String shopname;
	private String shopaddr;
	private String shoppn;
	private String shopcontent;
	private String shopnum;
	

	
	public String getShopnum() {
		return shopnum;
	}
	public void setShopnum(String shopnum) {
		this.shopnum = shopnum;
	}
	private String si_fname;
	private String si_realname;
	private long si_fsize;
	
	MultipartFile file;	// write.jsp에 파일첨부시 name="file"과 동일한 변수명
	
	public MultipartFile getFile() {
		return file;
	}
	
	public void setFile(MultipartFile file) {
		this.file = file;
		
		// 업로드 파일 접근
		if(! file.isEmpty()){
			this.si_fname = file.getOriginalFilename();
			this.si_fsize = file.getSize();
			
			UUID uuid = UUID.randomUUID();
			this.si_realname = uuid.toString()+"_"+si_fname;
			//***********************************************
			// 해당 경로로 변경
//			File f = new File("D:\\project1982\\project1982\\src\\main\\webapp\\resources\\upload\\"+si_realname);
			File f = new File("C:\\Users\\Kosmo\\git\\project1982\\project1982\\src\\main\\webapp\\resources\\upload\\"+si_realname);

			
			try {
				file.transferTo(f);
				
			} catch (IllegalStateException e) {				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
	public int getOwnernum() {
		return ownernum;
	}
	public void setOwnernum(int ownernum) {
		this.ownernum = ownernum;
	}
	public String getOwnerid() {
		return ownerid;
	}
	public void setOwnerid(String ownerid) {
		this.ownerid = ownerid;
	}
	public String getOwnerpass() {
		return ownerpass;
	}
	public void setOwnerpass(String ownerpass) {
		this.ownerpass = ownerpass;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getOwnercode() {
		return ownercode;
	}
	public void setOwnercode(String ownercode) {
		this.ownercode = ownercode;
	}
	public String getOwnergender() {
		return ownergender;
	}
	public void setOwnergender(String ownergender) {
		this.ownergender = ownergender;
	}
	public String getOwnerpn() {
		return ownerpn;
	}
	public void setOwnerpn(String ownerpn) {
		this.ownerpn = ownerpn;
	}
	public String getOwnermail() {
		return ownermail;
	}
	public void setOwnermail(String ownermail) {
		this.ownermail = ownermail;
	}
	public String getOwnerdate() {
		return ownerdate;
	}
	public void setOwnerdate(String ownerdate) {
		this.ownerdate = ownerdate;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getShopaddr() {
		return shopaddr;
	}
	public void setShopaddr(String shopaddr) {
		this.shopaddr = shopaddr;
	}
	public String getShoppn() {
		return shoppn;
	}
	public void setShoppn(String shoppn) {
		this.shoppn = shoppn;
	}
	public String getShopcontent() {
		return shopcontent;
	}
	public void setShopcontent(String shopcontent) {
		this.shopcontent = shopcontent;
	}

	public String getSi_fname() {
		return si_fname;
	}
	public void setSi_fname(String si_fname) {
		this.si_fname = si_fname;
	}
	public String getSi_realname() {
		return si_realname;
	}
	public void setSi_realname(String si_realname) {
		this.si_realname = si_realname;
	}
	public long getSi_fsize() {
		return si_fsize;
	}
	public void setSi_fsize(long si_fsize) {
		this.si_fsize = si_fsize;
	}

}
