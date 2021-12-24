package com.javassem.controller;

import com.javassem.domain.PagingVO;
import com.javassem.domain.ParkBlackVO;
import com.javassem.domain.ParkVO;
import com.javassem.domain.ParkownerVO;
import com.javassem.service.ParkBlackService;
import com.javassem.service.ParkService;
import com.javassem.service.ParkownerService;
import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ParkController {
  @Autowired
  public ParkService parkService;
  
  @Autowired
  public ParkBlackService parkBlackService;
  
  @Autowired
  public ParkownerService parkownerService;
  
  @Autowired
  private SqlSessionTemplate mybatis;
  
  @RequestMapping({"admin/{step}.do"})
  public String parkJoin(@PathVariable String step) {
    System.out.println("");
    return "/admin/" + step;
  }
  
  @RequestMapping({"admin/adminPage.do"})
  public String userLogin(ParkVO vo, Model m, Model m2, PagingVO vo1) {
    ParkVO result = this.parkService.idCheck_Login(vo);
    if (result != null) {
      System.out.println("");
      List<ParkBlackVO> list = this.parkBlackService.getBlackList(vo1);
      m.addAttribute("blacklist", list);
      List<ParkownerVO> list2 = this.parkownerService.getOwnerList(vo1);
      m2.addAttribute("ownerlist", list2);
      System.out.println(list);
      System.out.println(list2);
      int matching = ((Integer)this.mybatis.selectOne("hold.matching")).intValue();
      int whole = ((Integer)this.mybatis.selectOne("hold.wholeApply")).intValue();
      int matchingPercent = ((Integer)this.mybatis.selectOne("hold.matching_percent")).intValue();
      int reusing = ((Integer)this.mybatis.selectOne("hold.reusing")).intValue();
      int whole2 = ((Integer)this.mybatis.selectOne("hold.wholeUse")).intValue();
      int reusePercent = ((Integer)this.mybatis.selectOne("hold.reusePercent")).intValue();
      m.addAttribute("matching", Integer.valueOf(matching));
      m.addAttribute("wholeApply", Integer.valueOf(whole));
      m.addAttribute("matchingPercent", Integer.valueOf(matchingPercent));
      m.addAttribute("reusing", Integer.valueOf(reusing));
      m.addAttribute("wholeUse", Integer.valueOf(whole2));
      m.addAttribute("reusePercent", Integer.valueOf(reusePercent));
      return "/admin/adminPage";
    } 
    System.out.println("");
    return "./main";
  }
}
