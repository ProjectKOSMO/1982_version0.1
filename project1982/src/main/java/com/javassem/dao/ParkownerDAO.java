package com.javassem.dao;

import java.util.List;

import com.javassem.domain.PagingVO;
import com.javassem.domain.ParkBlackVO;
import com.javassem.domain.ParkownerVO;

public interface ParkownerDAO {
	List<ParkownerVO> getOwnerList(PagingVO vo);
	int countBoard();
}
