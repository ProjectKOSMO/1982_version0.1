package com.javassem.dao;

import com.javassem.domain.PagingVO;
import com.javassem.domain.ParkBlackVO;
import java.util.List;

public interface ParkBlackDAO {
  int countBoard();
  
  List<ParkBlackVO> getBlackList(PagingVO paramPagingVO);
}
