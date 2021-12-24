package com.javassem.dao;

import com.javassem.domain.PagingVO;
import com.javassem.domain.ParkBlackVO;
import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("parkBlackDAO")
public class ParkBlackDAOImpl implements ParkBlackDAO {
  @Autowired
  private SqlSessionTemplate mybatis1;
  
  public int countBoard() {
    return ((Integer)this.mybatis1.selectOne("blacklistBoard.countBoardList")).intValue();
  }
  
  public List<ParkBlackVO> getBlackList(PagingVO vo) {
    System.out.println("===> Mybatis getBlackList()");
    return this.mybatis1.selectList("blacklistBoard.getBlackList");
  }
}
