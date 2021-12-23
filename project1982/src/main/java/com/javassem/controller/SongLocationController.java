package com.javassem.controller;

import com.javassem.domain.SongLocationVO;
import com.javassem.service.SongLocationService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongLocationController {
  @Autowired
  private SongLocationService songLocationService;
  
  int pagePost = 0;
  
  int maxPagePost = 4;
  
  @GetMapping({"getLocationList"})
  @ResponseBody
  public List<SongLocationVO> SelectAll(@RequestParam("searchCondition") String searchCondition, @RequestParam("searchKeyword") String searchKeyword, @RequestParam("pageNum") String pageNum, SongLocationVO vo) {
    int pageNumber;
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>getLocationList");
    vo.setSearchCondition(searchCondition);
    vo.setSearchKeyword(searchKeyword);
    if (pageNum == "") {
      pageNumber = 0;
    } else {
      pageNumber = Integer.parseInt(pageNum) - 1;
    } 
    System.out.println("");
    System.out.println(pageNumber);
    List<SongLocationVO> list = this.songLocationService.getLocationList(vo);
    List<SongLocationVO> result = new ArrayList<>();
    System.out.println(list.size());
    int i;
    for (i = 0; i < list.size(); i++) {
      double y = distance(vo.getCenterLocation_x(), vo.getCenterLocation_y(), ((SongLocationVO)list.get(i)).getLocation_x(), ((SongLocationVO)list.get(i)).getLocation_y());
      System.out.println(((SongLocationVO)list.get(i)).getShop_name());
      System.out.println(y);
      if (y < 1.0D) {
        if (this.pagePost > this.maxPagePost * pageNumber && this.pagePost < this.maxPagePost * (pageNumber + 1) + 1)
          result.add(list.get(i)); 
        this.pagePost++;
      } 
    } 
    System.out.println(result.size());
    for (i = 0; i < result.size(); i++)
      System.out.println(((SongLocationVO)result.get(i)).getShop_name()); 
    this.pagePost = 0;
    return result;
  }
  
  @GetMapping({"getLocationListCount"})
  @ResponseBody
  public SongLocationVO CountPage(@RequestParam("searchCondition") String searchCondition, @RequestParam("searchKeyword") String searchKeyword, @RequestParam("pageNum") String pageNum, SongLocationVO vo) {
    System.out.println("Count");
    int pageNumber = 0;
    vo.setSearchCondition(searchCondition);
    vo.setSearchKeyword(searchKeyword);
    if (pageNum == "") {
      pageNumber = 0;
    } else {
      pageNumber = Integer.parseInt(pageNum) - 1;
    } 
    System.out.println("");
    System.out.println(pageNumber);
    List<SongLocationVO> list = this.songLocationService.getLocationList(vo);
    List<SongLocationVO> result = new ArrayList<>();
    System.out.println(list.size());
    int i;
    for (i = 0; i < list.size(); i++) {
      double y = distance(vo.getCenterLocation_x(), vo.getCenterLocation_y(), ((SongLocationVO)list.get(i)).getLocation_x(), ((SongLocationVO)list.get(i)).getLocation_y());
      System.out.println(((SongLocationVO)list.get(i)).getShop_name());
      System.out.println(y);
      if (y < 1.0D)
        result.add(list.get(i)); 
    } 
    System.out.println(result.size());
    for (i = 0; i < result.size(); i++)
      System.out.println(((SongLocationVO)result.get(i)).getShop_name()); 
    int max = (int)Math.ceil((result.size() / 4));
    vo.setMaxPage(max);
    return vo;
  }
  
  private static double distance(double lat1, double lon1, double lat2, double lon2) {
    if (lat1 == lat2 && lon1 == lon2)
      return 0.0D; 
    double theta = lon1 - lon2;
    double dist = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
    dist = Math.acos(dist);
    dist = Math.toDegrees(dist);
    dist = dist * 60.0D * 1.1515D;
    dist *= 1.609344D;
    return dist;
  }
}
