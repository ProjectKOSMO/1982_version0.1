package com.javassem.service;

import com.javassem.domain.UserVO;

public interface UserService {
	public UserVO idCheck_Login(UserVO vo);
	public int userInsert(UserVO vo );
	public String userDate(UserVO vo);
}
