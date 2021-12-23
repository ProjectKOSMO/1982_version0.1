package com.javassem.service;

import com.javassem.dao.SongLocationDAO;
import com.javassem.domain.SongLocationVO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongLocationServiceImpl implements SongLocationService {
  @Autowired
  SongLocationDAO songLocationDAO;
  
  public List<SongLocationVO> getLocationList(SongLocationVO vo) {
    return this.songLocationDAO.getLocationList(vo);
  }
  
  public int getLocationListCount(SongLocationVO vo) {
    System.out.println("service");
    return this.songLocationDAO.getLocationListCount(vo);
  }
}
