package com.javassem.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javassem.domain.PagingVO;
import com.javassem.domain.ParkBlackVO;
import com.javassem.service.ParkBlackService;

@Controller
public class ParkBlackController {
	
	@Autowired
	public ParkBlackService parkBlackService;
	
	
	@RequestMapping("blacklist_condition.do")
	public String select(String searchCondition,String searchKeyword,Model m,PagingVO vo){
		HashMap map =new HashMap();
		map.put("searchCondition", searchCondition);
		map.put("searchKeyword", searchKeyword);
		
		System.out.println("검색");
		
		List<ParkBlackVO> list = parkBlackService.getBlackList(vo);
		m.addAttribute("blacklist",list);
		return "admin/adminPage.do";
	}
}
