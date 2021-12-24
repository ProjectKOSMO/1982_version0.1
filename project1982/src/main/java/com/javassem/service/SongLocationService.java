package com.javassem.service;

import com.javassem.domain.SongLocationVO;
import java.util.List;

public interface SongLocationService {
  List<SongLocationVO> getLocationList(SongLocationVO paramSongLocationVO);
  
  int getLocationListCount(SongLocationVO paramSongLocationVO);
}
