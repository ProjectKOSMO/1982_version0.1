package com.javassem.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javassem.dao.BoardDAOImpl;
import com.javassem.domain.BoardVO;
import com.javassem.util.PagingVO;


@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAOImpl boardDAO;

	public void insertBoard(BoardVO vo) {
		boardDAO.insertBoard(vo);
	}

	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}

	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}

	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}

	public List<BoardVO> getBoardList(HashMap map) {
		return boardDAO.getBoardList(map);
	}
	
	public int countBoard() {
		return boardDAO.countBoard();
	}
	
	@Override
	public List<BoardVO> selectBoard(PagingVO vo) {
		return boardDAO.selectBoard(vo);
	}
	 
}
