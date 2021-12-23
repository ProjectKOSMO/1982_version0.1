package com.javassem.service;

import java.util.List;

import com.javassem.domain.OwnerBoardVO;
import com.javassem.domain.OwnerVO;

public interface OwnerService {
	public OwnerVO idCheck_Login(OwnerVO vo);
	public int ownerInsert(OwnerVO vo );
	public String ownerDate(OwnerVO vo);
	public int ownerBoardInsert(OwnerBoardVO vo);
	
	List<OwnerBoardVO> getOwnerBoardList(OwnerBoardVO vo);
	
	public int insertShopInfo(OwnerVO vo);
	public String selectShopInfo(OwnerVO vo);
	public List<OwnerVO> getList(OwnerVO vo);

}
