package com.javassem.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javassem.domain.StoreVO;
import com.javassem.service.StoreService;

@Controller
@RequestMapping("user")
public class StoreController {
	
	@Autowired
	private StoreService storeService;
	// 일자리 찾기 업체 가져오기.
	@RequestMapping("storeClose.do")
	public void select(StoreVO vo, Model m){
		List<StoreVO> list = storeService.StoreList(vo);
		m.addAttribute("StoreList", list);
		
	}

}
