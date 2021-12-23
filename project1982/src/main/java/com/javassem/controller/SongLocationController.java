package com.javassem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javassem.domain.SongLocationVO;
import com.javassem.service.SongLocationService;

@RestController
public class SongLocationController {
	
	@Autowired
	private SongLocationService songLocationService;
	
	int pagePost=0;				//db에서 페이지에 표시할 게시글 수
	int maxPagePost=4;
	
	@GetMapping("getLocationList")
	@ResponseBody
	public List<SongLocationVO> SelectAll(
			@RequestParam("searchCondition") String searchCondition,
			@RequestParam("searchKeyword") String searchKeyword,
			@RequestParam("pageNum") String pageNum,SongLocationVO vo){
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>getLocationList");
		vo.setSearchCondition(searchCondition);
		vo.setSearchKeyword(searchKeyword);
		int pageNumber;
		if(pageNum=="") {
			pageNumber=0;
		}else {
			pageNumber=Integer.parseInt(pageNum)-1;
		}
		
		System.out.println("페이지 넘버");
		System.out.println(pageNumber);
		
		List<SongLocationVO> list = songLocationService.getLocationList(vo);
		List<SongLocationVO> result=new ArrayList();
		System.out.println(list.size());
		
		for(int i = 0; i<list.size();i++) {
			double y=distance(vo.getCenterLocation_x(),vo.getCenterLocation_y(),list.get(i).getLocation_x(),list.get(i).getLocation_y());
			System.out.println(list.get(i).getShop_name());
			System.out.println(y);
			
			if(y<1) {
				if(pagePost>maxPagePost*pageNumber&&pagePost<maxPagePost*(pageNumber+1)+1) {
					result.add(list.get(i));	
			}
				pagePost+=1;
		}//1234
		}
		System.out.println(result.size());
		for(int i = 0; i<result.size();i++) {
			System.out.println(result.get(i).getShop_name());
		}
		
		pagePost=0;
		
		return result;
	}
	//마지막 페이지 처리용
	@GetMapping("getLocationListCount")
	@ResponseBody
	public SongLocationVO CountPage(
			@RequestParam("searchCondition") String searchCondition, @RequestParam("searchKeyword") String searchKeyword,
			@RequestParam("pageNum") String pageNum,SongLocationVO vo){
		System.out.println("Count호출");
		int pageNumber=0;
		vo.setSearchCondition(searchCondition);
		vo.setSearchKeyword(searchKeyword);
		if(pageNum=="") { 
			pageNumber=0;
		}else {
			pageNumber=Integer.parseInt(pageNum)-1;
		}
		
		System.out.println("페이지 넘버");
		System.out.println(pageNumber);
		
		List<SongLocationVO> list = songLocationService.getLocationList(vo);
		List<SongLocationVO> result=new ArrayList();
		System.out.println(list.size());
		
		for(int i = 0; i<list.size();i++) {
			double y=distance(vo.getCenterLocation_x(),vo.getCenterLocation_y(),list.get(i).getLocation_x(),list.get(i).getLocation_y());
			System.out.println(list.get(i).getShop_name());
			System.out.println(y);
			
			if(y<1) {
				result.add(list.get(i));	
		}//1234
		}
		System.out.println(result.size());
		for(int i = 0; i<result.size();i++) {
			System.out.println(result.get(i).getShop_name());
		}
		
		int max=(int) Math.ceil(result.size()/4);
		
		vo.setMaxPage(max);
		
		return vo;
	}
	
	//거리 계산용
	private static double distance(double lat1, double lon1, double lat2, double lon2) {
		if ((lat1 == lat2) && (lon1 == lon2)) {
			return 0;
		}
		else {
			double theta = lon1 - lon2;
			double dist = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
			dist = Math.acos(dist);
			dist = Math.toDegrees(dist);
			dist = dist * 60 * 1.1515;
			dist = dist * 1.609344;
			
			return (dist);
		}
	}
	
}
