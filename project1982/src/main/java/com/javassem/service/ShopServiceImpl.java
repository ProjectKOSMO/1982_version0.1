package com.javassem.service;

import com.javassem.dao.ShopDAOImpl;
import com.javassem.domain.ShopVO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("shopService")
public class ShopServiceImpl implements ShopService {
  @Autowired
  private ShopDAOImpl shopDAO;
  
  public List<ShopVO> ShopList(ShopVO vo) {
    return this.shopDAO.ShopList(vo);
  }
}
