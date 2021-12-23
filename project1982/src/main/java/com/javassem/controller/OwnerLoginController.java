package com.javassem.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javassem.domain.OwnerBoardVO;
import com.javassem.domain.OwnerVO;
import com.javassem.service.OwnerService;

@Controller
@RequestMapping("owner")
public class OwnerLoginController {

	@RequestMapping("{step}.do")
	public String ownerJoin(@PathVariable String step) {
		return "/owner/" + step;
	}

	@Autowired
	public OwnerService ownerService;

	// 업자의 업체 정보 출력 게시판 : 만약, 등록 업체가 있다면 업체 게시판으로, 아니라면 업체 등록 페이지로
	// 이동--------------------------------------------------------------------------------------------------------------

	@RequestMapping("ownerMypage.do")
	public String ownerMypage(OwnerVO vo, Model model, HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();

		Integer ownernum = (Integer) session.getAttribute("ownernum");
		vo.setOwnernum(ownernum);

		List<OwnerVO> list = ownerService.getList(vo);

		model.addAttribute("shopList", list);

		if (list.isEmpty()) {
			return "/owner/ownerMypage";
		} else {
			return "/owner/ownerViewPage";
		}

	}
	// ---------------------------------------------------------------------

	@RequestMapping("shopInsert.do")
	public String ownerInsert(OwnerVO vo, Model model) {
		
		System.out.println(vo.getShopname());
		
		ownerService.insertShopInfo(vo); // 업체정보 인설트

		List<OwnerVO> list = ownerService.getList(vo);
		model.addAttribute("shopList", list);

		return "redirect:ownerList.do";
	}

	@RequestMapping("ownerUpdate.do")
	public String ownerViewPage(OwnerVO vo) {
		ownerService.selectShopInfo(vo); // 업체정보 셀렉트

		return "redirect:ownerViewPage.do";

	}

	@RequestMapping("ownerList.do")
	public String getList(OwnerVO vo, Model model, HttpServletRequest request) throws Exception {

		HttpSession session = request.getSession();

		Integer ownernum = (Integer) session.getAttribute("ownernum");
		vo.setOwnernum(ownernum);

		List<OwnerVO> list = ownerService.getList(vo);
		model.addAttribute("shopList", list);
		return "/owner/ownerViewPage";
	}
	//---------------------------------------------------------------------

	@RequestMapping("ownerInsert.do")
	public String ownerInsert(OwnerVO vo) {
		ownerService.ownerInsert(vo);
		return "redirect:owner_login.do";
	}

	@RequestMapping("ownerBoardInsert.do")
	public String ownerBoardInsert(OwnerBoardVO vo, Model m) {

		String jobDate = vo.getJobDate();
//		vo.setJobDate(jobDate);
		System.out.println(jobDate);

		ownerService.ownerBoardInsert(vo); // 정보 입력
		// ---------------------------------------------------
		List<OwnerBoardVO> list = ownerService.getOwnerBoardList(vo); // 정보 표시
		m.addAttribute("ownerBoardList", list);
		return "/owner/job_positing";
//		return "redirect:getBoardList.do";

	}
	
//	@RequestMapping("getBoardList.do")
//	public String select(OwnerBoardVO vo, Model m) {
//		List<OwnerBoardVO> list = ownerService.getOwnerBoardList(vo);
//		m.addAttribute("ownerBoardList",list);
//		return "/owner/job_positing";
//	}
	
	@RequestMapping("login.do")
	public String ownerLogin(OwnerVO vo, OwnerBoardVO boardVo, Model m, HttpServletRequest request) throws Exception{
		
		//--------------------------------------------------
		OwnerVO result =  ownerService.idCheck_Login(vo);
		
		if(result == null){
			return "/owner/owner_login";
			
		}else{
			// 세션에  owernnum, ownerid 추가 --------------------------------------------------

			HttpSession session = request.getSession();
			session.setAttribute("ownernum", result.getOwnernum());
			session.setAttribute("ownerid", result.getOwnerid());
			// 게시판 리스트 추가 --------------------------------------------------
			List<OwnerBoardVO> list = ownerService.getOwnerBoardList(boardVo);
			m.addAttribute("ownerBoardList",list);		
		
			return "/owner/job_positing"; // 로그인 성공시 세션으로 아이디를 저장하는 페이지로 이동
		}
	}
	
	@RequestMapping(value="idCheck.do", produces="application/text; charset=UTF-8")
	@ResponseBody
	public String idCheck(OwnerVO vo){
		OwnerVO result = ownerService.idCheck_Login(vo);
		String message = "사용가능한 아이디 입니다.";
		if(result != null) message = "이미 사용중인 아이디 입니다.";
		return message;
	}

}
