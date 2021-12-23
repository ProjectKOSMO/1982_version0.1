package com.javassem.service;

import com.javassem.dao.ParkBlackDAO;
import com.javassem.dao.ParkownerDAO;
import com.javassem.domain.PagingVO;
import com.javassem.domain.ParkBlackVO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ParkBlackService")
public class ParkBlackServiceImpl implements ParkBlackService {
  @Autowired
  private ParkBlackDAO parkBlackDAO;
  
  @Autowired
  private ParkownerDAO parkownerDAO;
  
  public int countBoard() {
    return this.parkBlackDAO.countBoard();
  }
  
  public List<ParkBlackVO> getBlackList(PagingVO vo) {
    System.out.println("");
    return this.parkBlackDAO.getBlackList(vo);
  }
}
