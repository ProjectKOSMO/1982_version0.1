package com.javassem.controller;

import com.javassem.domain.PagingVO;
import com.javassem.domain.ParkBlackVO;
import com.javassem.service.ParkBlackService;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ParkBlackController {
  @Autowired
  public ParkBlackService parkBlackService;
  
  @RequestMapping({"blacklist_condition.do"})
  public String select(String searchCondition, String searchKeyword, Model m, PagingVO vo) {
    HashMap<Object, Object> map = new HashMap<>();
    map.put("searchCondition", searchCondition);
    map.put("searchKeyword", searchKeyword);
    System.out.println("");
    List<ParkBlackVO> list = this.parkBlackService.getBlackList(vo);
    m.addAttribute("blacklist", list);
    return "admin/adminPage.do";
  }
}
