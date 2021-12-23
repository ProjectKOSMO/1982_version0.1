package com.javassem.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javassem.domain.PagingVO;
import com.javassem.domain.ParkBlackVO;
import com.javassem.domain.ParkownerVO;

@Repository("ParkownerDAO")
public class ParkownerDAOImpl implements ParkownerDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;


	public int countBoard() {
		return mybatis.selectOne("depositlist.countdepositList");
	}
	public List<ParkownerVO> getOwnerList(PagingVO vo) {
		System.out.println("===> Mybatis getdepositlist() 호출");
		return mybatis.selectList("depositlist.getdepositlist");
	}

}
