package com.javassem.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javassem.domain.ShopVO;

	@Repository("shopDAO")
	public class ShopDAOImpl implements ShopDAO {
		
		@Autowired
		private SqlSessionTemplate mybatis;
		
		public List<ShopVO> ShopList(ShopVO vo) {
			System.out.println("===> Mybatis ShopList() 호출");
			return mybatis.selectList("ShopDAO.ShopList", vo);
		
	
		}
}
