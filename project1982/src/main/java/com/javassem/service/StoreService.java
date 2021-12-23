package com.javassem.service;

import java.util.HashMap;
import java.util.List;

import com.javassem.domain.StoreVO;

public interface StoreService {
	
	// 글 목록 조회
	List<StoreVO> StoreList(StoreVO vo);


}
