package com.javassem.dao;

import com.javassem.domain.ShopVO;
import java.util.List;

public interface ShopDAO {
  List<ShopVO> ShopList(ShopVO paramShopVO);
}
