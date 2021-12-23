package com.javassem.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("{step}.do")
	public String userJoin(@PathVariable String step){
		return step;
	}

}
