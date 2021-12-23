package com.javassem.controller;

import com.javassem.domain.UserVO;
import com.javassem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({"user"})
public class UserLoginController {
  @Autowired
  public UserService userService;
  
  @RequestMapping({"{step}.do"})
  public String userJoin(@PathVariable String step) {
    return "/user/" + step;
  }
  
  @RequestMapping({"userInsert.do"})
  public String userinsert(UserVO vo) {
    this.userService.userInsert(vo);
    return "redirect:user_login.do";
  }
  
  @RequestMapping({"login.do"})
  public String userLogin(UserVO vo) {
    UserVO result = this.userService.idCheck_Login(vo);
    if (result == null)
      return "redirect:user_login.do"; 
    return "userMain";
  }
  
  @RequestMapping(value = {"idCheck.do"}, produces = {"application/text; charset=UTF-8"})
  @ResponseBody
  public String idCheck(UserVO vo) {
    UserVO result = this.userService.idCheck_Login(vo);
    String message = "";
    if (result != null)
      message = ""; 
    return message;
  }
}
