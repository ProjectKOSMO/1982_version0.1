package com.javassem.dao;

import com.javassem.domain.SongLocationVO;
import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SongLocationDAOImpl implements SongLocationDAO {
  @Autowired
  private SqlSessionTemplate mybatis;
  
  public List<SongLocationVO> getLocationList(SongLocationVO vo) {
    return this.mybatis.selectList("Location.getLocationList", vo);
  }
  
  public void insertLocation(SongLocationVO vo) {
    this.mybatis.insert("Location.insertLocation", vo);
  }
  
  public int getLocationListCount(SongLocationVO vo) {
    System.out.println("DAO");
    return ((Integer)this.mybatis.selectOne("Location.getLocationListCount", vo)).intValue();
  }
}
