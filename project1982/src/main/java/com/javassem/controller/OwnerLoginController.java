package com.javassem.controller;

import com.javassem.domain.OwnerBoardVO;
import com.javassem.domain.OwnerVO;
import com.javassem.service.OwnerService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({"owner"})
public class OwnerLoginController {
  @Autowired
  public OwnerService ownerService;
  
  @RequestMapping({"{step}.do"})
  public String ownerJoin(@PathVariable String step) {
    return "/owner/" + step;
  }
  
  @RequestMapping({"ownerMypage.do"})
  public String ownerMypage(OwnerVO vo, Model model, HttpServletRequest request) throws Exception {
    HttpSession session = request.getSession();
    Integer ownernum = (Integer)session.getAttribute("ownernum");
    vo.setOwnernum(ownernum.intValue());
    List<OwnerVO> list = this.ownerService.getList(vo);
    model.addAttribute("shopList", list);
    if (list.isEmpty())
      return "/owner/ownerMypage"; 
    return "/owner/ownerViewPage";
  }
  
  @RequestMapping({"shopInsert.do"})
  public String ownerInsert(OwnerVO vo, Model model) {
    this.ownerService.insertShopInfo(vo);
    List<OwnerVO> list = this.ownerService.getList(vo);
    model.addAttribute("shopList", list);
    return "redirect:ownerList.do";
  }
  
  @RequestMapping({"ownerUpdate.do"})
  public String ownerUpdatePage(OwnerVO vo, Model model, HttpServletRequest request) throws Exception {
    HttpSession session = request.getSession();
    Integer ownernum = (Integer)session.getAttribute("ownernum");
    vo.setOwnernum(ownernum.intValue());
    List<OwnerVO> list = this.ownerService.getList(vo);
    model.addAttribute("shopInfo", list);
    return "/owner/ownerUpdate";
  }
  
  @RequestMapping({"shopUpdate.do"})
  public String shopUpdate(OwnerVO vo, Model model, HttpServletRequest request) throws Exception {
    this.ownerService.updateShopInfo(vo);
    List<OwnerVO> list = this.ownerService.getList(vo);
    Thread.sleep(5000L);
    return "redirect:ownerList.do";
  }
  
  @RequestMapping({"ownerList.do"})
  public String getList(OwnerVO vo, Model model, HttpServletRequest request) throws Exception {
    HttpSession session = request.getSession();
    Integer ownernum = (Integer)session.getAttribute("ownernum");
    vo.setOwnernum(ownernum.intValue());
    List<OwnerVO> list = this.ownerService.getList(vo);
    model.addAttribute("shopList", list);
    return "/owner/ownerViewPage";
  }
  
  @RequestMapping({"ownerInsert.do"})
  public String ownerInsert(OwnerVO vo) {
    this.ownerService.ownerInsert(vo);
    return "redirect:owner_login.do";
  }
  
  @RequestMapping({"ownerBoardInsert.do"})
  public String ownerBoardInsert(OwnerBoardVO vo, Model m) {
    String jobDate = vo.getJobDate();
    System.out.println(jobDate);
    this.ownerService.ownerBoardInsert(vo);
    List<OwnerBoardVO> list = this.ownerService.getOwnerBoardList(vo);
    m.addAttribute("ownerBoardList", list);
    return "/owner/job_positing";
  }
  
  @RequestMapping({"login.do"})
  public String ownerLogin(OwnerVO vo, OwnerBoardVO boardVo, Model m, HttpServletRequest request) throws Exception {
    OwnerVO result = this.ownerService.idCheck_Login(vo);
    if (result == null)
      return "/owner/owner_login"; 
    HttpSession session = request.getSession();
    session.setAttribute("ownernum", Integer.valueOf(result.getOwnernum()));
    session.setAttribute("ownerid", result.getOwnerid());
    List<OwnerBoardVO> list = this.ownerService.getOwnerBoardList(boardVo);
    m.addAttribute("ownerBoardList", list);
    return "/owner/job_positing";
  }
  
  @RequestMapping(value = {"idCheck.do"}, produces = {"application/text; charset=UTF-8"})
  @ResponseBody
  public String idCheck(OwnerVO vo) {
    OwnerVO result = this.ownerService.idCheck_Login(vo);
    String message = "존재하지 않는 아이디입니다.";
    if (result != null)
      message = "존재하는 아이디입니다."; 
    return message;
  }
}
