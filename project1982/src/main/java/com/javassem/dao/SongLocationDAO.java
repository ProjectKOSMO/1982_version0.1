package com.javassem.dao;

import com.javassem.domain.SongLocationVO;
import java.util.List;

public interface SongLocationDAO {
  List<SongLocationVO> getLocationList(SongLocationVO paramSongLocationVO);
  
  void insertLocation(SongLocationVO paramSongLocationVO);
  
  int getLocationListCount(SongLocationVO paramSongLocationVO);
}
