package com.javassem.dao;

import java.util.HashMap;
import java.util.List;

import com.javassem.domain.PagingVO;
import com.javassem.domain.ParkBlackVO;

public interface ParkBlackDAO {
	
	int countBoard();
	List<ParkBlackVO> getBlackList(PagingVO vo) ;
}
