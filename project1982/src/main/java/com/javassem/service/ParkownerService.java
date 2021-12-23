package com.javassem.service;

import java.util.List;

import com.javassem.domain.PagingVO;
import com.javassem.domain.ParkBlackVO;
import com.javassem.domain.ParkownerVO;

public interface ParkownerService {
	int countBoard();
	List<ParkownerVO> getOwnerList(PagingVO vo);
}
