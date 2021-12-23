package com.javassem.dao;

import java.util.List;

import com.javassem.domain.OwnerBoardVO;
import com.javassem.domain.OwnerVO;

public interface OwnerDAO {
	/**
	 * id 중복체트 기능 구현
	 */	
	OwnerVO  idCheck( OwnerVO vo );
	
	/**
	 * 회원가입기능 구현
	 */
	int ownerInsert(OwnerVO vo);
	
	/**
	 * 로그인 확인 기능 구현
	 */
	OwnerVO ownerLogin(OwnerVO vo);
	
	
	/**
	 * 
	 * 구인 공고 게시판 기능 구현
	 * 
	 */
	int ownerBoardInsert(OwnerBoardVO vo);
	
	List<OwnerBoardVO> getOwnerBoardList(OwnerBoardVO vo) ;
	
	
	/* 사업자 가게정보 입력기능
	 * */
	int shopInsert(OwnerVO vo);
	
	List<OwnerVO> getList(OwnerVO vo);
	
	String shopSelect(OwnerVO vo);
	
	//-----------------------------------------
	
	
}
