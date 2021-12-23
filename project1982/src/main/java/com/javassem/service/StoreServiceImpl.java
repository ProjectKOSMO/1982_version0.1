package com.javassem.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javassem.dao.StoreDAOImpl;
import com.javassem.domain.StoreVO;

@Service("storeService")
public class StoreServiceImpl implements StoreService{
	
	@Autowired
	private StoreDAOImpl storeDAO;
	
	public List<StoreVO> StoreList(StoreVO vo) {
		return storeDAO.StoreList(vo);
	}
	
}
