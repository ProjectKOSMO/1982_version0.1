package com.javassem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javassem.dao.OwnerDAOImpl;
import com.javassem.domain.BoardVO;
import com.javassem.domain.OwnerBoardVO;
import com.javassem.domain.OwnerVO;

@Service("ownerService")
public class OwnerServiceImpl implements OwnerService {

	@Autowired
	private OwnerDAOImpl ownerDAO;

	/**
	 * 아이디 중복 체크하는 sql + 로그인 기능 sql
	 */
	public OwnerVO idCheck_Login(OwnerVO vo) {
		return ownerDAO.idCheck(vo);
	}

	/**
	 * 회원가입 sql
	 */
	public int ownerInsert(OwnerVO vo) {
		return ownerDAO.ownerInsert(vo);
	}

	public String ownerDate(OwnerVO vo) {
		return ownerDAO.ownerDate(vo);
	}

	public int ownerBoardInsert(OwnerBoardVO vo) {
		return ownerDAO.ownerBoardInsert(vo);
	}

	public List<OwnerBoardVO> getOwnerBoardList(OwnerBoardVO vo) {
		return ownerDAO.getOwnerBoardList(vo);
	}

	public int insertShopInfo(OwnerVO vo) {

		return ownerDAO.shopInsert(vo);
	}

	public String selectShopInfo(OwnerVO vo) {
		return ownerDAO.shopSelect(vo);

	}

	public List<OwnerVO> getList(OwnerVO vo) {
		return ownerDAO.getList(vo);
	}
	
	


}
