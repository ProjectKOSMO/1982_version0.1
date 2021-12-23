package com.javassem.controller;


import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javassem.domain.StoreVO;
import com.javassem.domain.UserVO;
import com.javassem.service.StoreService;
import com.javassem.service.UserService;

@Controller
@RequestMapping("user")
public class UserLoginController {
	
	@RequestMapping("{step}.do")
	public String userJoin(@PathVariable String step){
		return "/user/" + step;
	}
	
	@Autowired
	public UserService userService;
	
	
	// DB에 아이디 비번 넣기
	@RequestMapping("userInsert.do")
	public String userinsert(UserVO vo){
		userService.userInsert(vo);
		return "redirect:user_login.do";
	}
	//로그인 기능
	@RequestMapping("login.do")
	public String userLogin(UserVO vo)
	{
		UserVO result =  userService.idCheck_Login(vo);
		if(result == null){
			
			return "redirect:user_login.do";
			
		}else{
			return "userMain";
		}
	}
	
	
	
	// db에 중복아이디 확인
	@RequestMapping(value="idCheck.do", produces="application/text; charset=UTF-8")
	@ResponseBody
	public String idCheck(UserVO vo){
		UserVO result = userService.idCheck_Login(vo);
		String message = "사용가능한 아이디 입니다.";
		if(result != null) message = "이미 사용중인 아이디 입니다.";
		return message;
	}
	
	

}
