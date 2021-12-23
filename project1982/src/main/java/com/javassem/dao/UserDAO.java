package com.javassem.dao;

import com.javassem.domain.UserVO;

public interface UserDAO {
	/**
	 * id 중복체트 기능 구현
	 */	
	UserVO  idCheck( UserVO vo );
	
	/**
	 * 회원가입기능 구현
	 */
	int userInsert(UserVO vo);
	
	/**
	 * 로그인 확인 기능 구현
	 */
	UserVO userLogin(UserVO vo);
	
}
