package com.javassem.dao;

import com.javassem.domain.UserVO;

public interface UserDAO {
  UserVO idCheck(UserVO paramUserVO);
  
  int userInsert(UserVO paramUserVO);
  
  UserVO userLogin(UserVO paramUserVO);
}
