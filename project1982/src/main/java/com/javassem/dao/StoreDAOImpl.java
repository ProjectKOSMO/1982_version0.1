package com.javassem.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javassem.domain.StoreVO;

@Repository("storeDAO")
public class StoreDAOImpl implements StoreDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<StoreVO> StoreList(StoreVO vo) {
		System.out.println("===> Mybatis StoreList() 호출");
		return mybatis.selectList("StoreDAO.StoreList", vo);
	}
	
	
	
}
