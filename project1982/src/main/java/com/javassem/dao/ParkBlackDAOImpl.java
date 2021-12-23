package com.javassem.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javassem.domain.PagingVO;
import com.javassem.domain.ParkBlackVO;


@Repository("parkBlackDAO")
public class ParkBlackDAOImpl implements ParkBlackDAO{

	@Autowired
	private SqlSessionTemplate mybatis1;

	public int countBoard() {
	    return (Integer) mybatis1.selectOne("blacklistBoard.countBoardList");
	}
	
	public List<ParkBlackVO> getBlackList(PagingVO vo) {
		System.out.println("===> Mybatis getBlackList() 호출");
		return mybatis1.selectList("blacklistBoard.getBlackList");
	}
}
