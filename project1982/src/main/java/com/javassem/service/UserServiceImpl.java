package com.javassem.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javassem.dao.UserDAOImpl;
import com.javassem.domain.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAOImpl userDAO;
	
	
	/**
	  * 아이디 중복 체크하는 sql + 로그인 기능 sql
	  */
	  public UserVO idCheck_Login(UserVO vo)
	  {
		  return userDAO.idCheck(vo);
	  }
	  
	  
	  /**
	   * 회원가입 sql
	   */
	   public int userInsert(UserVO vo )
	   {
		  return userDAO.userInsert(vo);
	   }
	   
	   public String userDate(UserVO vo){
		   return userDAO.userDate(vo);
	   }
	   
}
