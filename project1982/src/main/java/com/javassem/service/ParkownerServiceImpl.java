package com.javassem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javassem.dao.ParkownerDAO;
import com.javassem.domain.PagingVO;
import com.javassem.domain.ParkBlackVO;
import com.javassem.domain.ParkownerVO;

@Service("parkownerService")
public class ParkownerServiceImpl implements ParkownerService{
	
	@Autowired
	private ParkownerDAO parkownerDAO;
	
	public int countBoard(){
		return parkownerDAO.countBoard();
	}
	
	public List<ParkownerVO> getOwnerList(PagingVO vo) {
		System.out.println("서비스");
		return parkownerDAO.getOwnerList(vo);
	}

}
