package com.javassem.dao;

import com.javassem.domain.UserVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
  @Autowired
  private SqlSessionTemplate mybatis;
  
  public UserVO idCheck(UserVO vo) {
    System.out.println("===> UserMapper idCheck");
    return (UserVO)this.mybatis.selectOne("user.idCheck", vo);
  }
  
  public int userInsert(UserVO vo) {
    System.out.println("===>  MemberMapper userInsert()");
    return this.mybatis.insert("user.userInsert", vo);
  }
  
  public UserVO userLogin(UserVO vo) {
    System.out.println("===> UserMapper idCheck");
    return (UserVO)this.mybatis.selectOne("user.idCheck", vo);
  }
  
  public String userDate(UserVO vo) {
    return (String)this.mybatis.selectOne("sample.getDate", vo);
  }
}
