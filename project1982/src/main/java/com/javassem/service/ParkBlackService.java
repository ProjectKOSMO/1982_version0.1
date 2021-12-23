package com.javassem.service;

import java.util.HashMap;
import java.util.List;

import com.javassem.domain.PagingVO;
import com.javassem.domain.ParkBlackVO;

public interface ParkBlackService {

	List<ParkBlackVO> getBlackList(PagingVO vo);
	int countBoard();
}
