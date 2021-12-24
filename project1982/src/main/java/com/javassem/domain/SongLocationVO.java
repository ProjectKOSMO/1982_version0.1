package com.javassem.domain;

public class SongLocationVO {
  private double location_y;
  
  private double location_x;
  
  private String road_address;
  
  private String shop_phone_number;
  
  private String shop_name;
  
  private double CenterLocation_y;
  
  private double CenterLocation_x;
  
  private String searchCondition;
  
  private String searchKeyword;
  
  private int postNum;
  
  private int displayPost;
  
  private int maxPage;
  
  public int getPostNum() {
    return this.postNum;
  }
  
  public void setPostNum(int postNum) {
    this.postNum = postNum;
  }
  
  public int getDisplayPost() {
    return this.displayPost;
  }
  
  public void setDisplayPost(int displayPost) {
    this.displayPost = displayPost;
  }
  
  public int getMaxPage() {
    return this.maxPage;
  }
  
  public void setMaxPage(int maxPage) {
    this.maxPage = maxPage;
  }
  
  public double getCenterLocation_y() {
    return this.CenterLocation_y;
  }
  
  public void setCenterLocation_y(double centerLocation_y) {
    this.CenterLocation_y = centerLocation_y;
  }
  
  public double getCenterLocation_x() {
    return this.CenterLocation_x;
  }
  
  public void setCenterLocation_x(double centerLocation_x) {
    this.CenterLocation_x = centerLocation_x;
  }
  
  public String getSearchCondition() {
    return this.searchCondition;
  }
  
  public void setSearchCondition(String searchCondition) {
    this.searchCondition = searchCondition;
  }
  
  public String getSearchKeyword() {
    return this.searchKeyword;
  }
  
  public void setSearchKeyword(String searchKeyword) {
    this.searchKeyword = searchKeyword;
  }
  
  public double getLocation_y() {
    return this.location_y;
  }
  
  public void setLocation_y(double location_y) {
    this.location_y = location_y;
  }
  
  public double getLocation_x() {
    return this.location_x;
  }
  
  public void setLocation_x(double location_x) {
    this.location_x = location_x;
  }
  
  public String getRoad_address() {
    return this.road_address;
  }
  
  public void setRoad_address(String road_address) {
    this.road_address = road_address;
  }
  
  public String getShop_phone_number() {
    return this.shop_phone_number;
  }
  
  public void setShop_phone_number(String shop_phone_number) {
    this.shop_phone_number = shop_phone_number;
  }
  
  public String getShop_name() {
    return this.shop_name;
  }
  
  public void setShop_name(String shop_name) {
    this.shop_name = shop_name;
  }
}
