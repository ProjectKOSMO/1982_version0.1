package com.javassem.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javassem.dao.ParkBlackDAO;
import com.javassem.dao.ParkownerDAO;
import com.javassem.domain.PagingVO;
import com.javassem.domain.ParkBlackVO;

@Service("ParkBlackService")
public class ParkBlackServiceImpl implements ParkBlackService{
	
	@Autowired
	private ParkBlackDAO parkBlackDAO;
	@Autowired
	private ParkownerDAO parkownerDAO;
	
	
	public int countBoard() {
		return parkBlackDAO.countBoard();
	}


	public List<ParkBlackVO> getBlackList(PagingVO vo) {
		System.out.println("서비스");
		return parkBlackDAO.getBlackList(vo);
	}
}
