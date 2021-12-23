package com.javassem.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javassem.domain.BoardVO;
import com.javassem.service.BoardService;
import com.javassem.util.PagingVO;

@Controller
@RequestMapping("user")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/{step.do}")
	public String test(@PathVariable String step){
		return "/user/" + step;
	}
	
	@RequestMapping("/saveBoard.do")
	public String insertBoard(BoardVO vo) throws IOException{
	    System.out.println(vo);
	    System.out.println(vo.getB_name());
		boardService.insertBoard(vo);
		return "redirect:userBoard.do";
	}
	
	// 게시판 목록 보기 및 페이징처리
	@RequestMapping(value="/userBoard.do", method=RequestMethod.GET)
	public String select(String searchCondition, String searchKeyword, Model m, PagingVO vo
			, @RequestParam(value="nowPage", required=false)String nowPage
			, @RequestParam(value="cntPerPage", required=false)String cntPerPage){
		
		HashMap map = new HashMap();
		int total = boardService.countBoard();
		if (nowPage == null && cntPerPage == null) {
			nowPage = "1";
			cntPerPage = "5";
		} else if (nowPage == null) {
			nowPage = "1";
		} else if (cntPerPage == null) { 
			cntPerPage = "5";
		}
		
		vo = new PagingVO(total, Integer.parseInt(nowPage), Integer.parseInt(cntPerPage));
		
		map.put("searchCondition", searchCondition);
		map.put("searchKeyword", searchKeyword);
		map.put("start", vo.getStart());
		map.put("end", vo.getEnd());
		
		
		List<BoardVO> list = boardService.getBoardList(map);
		m.addAttribute("paging", vo);
		m.addAttribute("boardList", list);
		return "user/userBoard";
	}
	
	// 해당 글보기
	@RequestMapping("/getBoard.do")
	public void getBoard(BoardVO vo, Model m){
		BoardVO result = boardService.getBoard(vo);
		m.addAttribute("board", result);
	}
	
	@RequestMapping("/deleteBoard.do")
	public String delectBoard(BoardVO vo){
		boardService.deleteBoard(vo);
		return "redirect:userBoard.do";
	}
	
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo){
		boardService.updateBoard(vo);
		return "redirect:userBoard.do";
	}
	

}
