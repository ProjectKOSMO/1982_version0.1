package com.javassem.service;

import java.util.List;

import com.javassem.domain.ShopVO;

public interface ShopService {

	
	// 글 목록 조회
	List<ShopVO> ShopList(ShopVO vo);

}
