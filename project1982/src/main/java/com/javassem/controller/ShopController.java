package com.javassem.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javassem.domain.ShopVO;
import com.javassem.service.ShopService;

@Controller
@RequestMapping("user")
public class ShopController {
	
	@Autowired
	private ShopService shopService;
	// 일자리 찾기 업체 가져오기.
	
	@RequestMapping("storeClose.do")
	public void select(ShopVO vo, Model m){
		List<ShopVO> list = shopService.ShopList(vo);
		m.addAttribute("ShopList", list);
		
	}
	
	
}
