package com.javassem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javassem.dao.ParkDAO;
import com.javassem.dao.ParkDAOImpl;
import com.javassem.domain.ParkVO;

@Service("parkService")
public class ParkServiceImpl implements ParkService{
	
	@Autowired
	private ParkDAO parkDAO;

	public ParkVO idCheck_Login(ParkVO vo) {
		
		return parkDAO.idCheck(vo);
	}
}
