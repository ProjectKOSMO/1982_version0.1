package com.javassem.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javassem.domain.UserVO;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO{

	@Autowired
	private SqlSessionTemplate mybatis;
	
	@Override
	public UserVO idCheck(UserVO vo) {
		System.out.println("===> UserMapper idCheck 호출");
		return mybatis.selectOne("user.idCheck", vo);
	}

	@Override
	public int userInsert(UserVO vo) {
		System.out.println("===>  MemberMapper userInsert() 호출");
		return mybatis.insert("user.userInsert", vo);
	}

	@Override
	public UserVO userLogin(UserVO vo) {
		System.out.println("===> UserMapper idCheck 호출");
		return mybatis.selectOne("user.idCheck", vo);
	}
	
	public String userDate(UserVO vo){
		return mybatis.selectOne("sample.getDate", vo);
	}
}
