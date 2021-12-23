package com.javassem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javassem.dao.ShopDAOImpl;
import com.javassem.domain.ShopVO;

@Service("shopService")
public class ShopServiceImpl implements ShopService {

		@Autowired
		private ShopDAOImpl shopDAO;
		
		public List<ShopVO> ShopList(ShopVO vo) {
			return shopDAO.ShopList(vo);
		}
		
}
