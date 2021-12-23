<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <title>Document</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/FortAwesome/Font-Awesome@5.14.0/css/all.min.css">
    <link type="text/css" href="/project1982/resources/css/5_store.css" rel="stylesheet"/>
</head>
<body>
 

        <!--메뉴바  ------------------------------------------------->
        <header class="header" >
         <!-- 로고-->
            
            <a href="#" class="logo">
                <img src="./3.jpg"/>
            </a>
            
            <!--메뉴-->   
            <h1>업체 상세 페이지</h1>
            <!-- 오른쪽 메뉴-->
            <div class="right-menu">
                <!--검색 -->
                <a href="#" class="search">
                    <i class="fas fa-search"></i>
                </a>
                <!--유저 -->
                <a href="#" class="user">
                    <i class="far fa-user"></i>
                </a>
                <!--카트  -->
                <a href="#">
                    <i class="fas fa-shopping-cart">
                    <!--카트 상품-->
                    <span class="num-cart-product">0</span>
                    </i>
                </a>
            </div>

        </header>

    <!-- 메인 ---------------------------------------------------------------->
        <main class="main">
            <div class="main_img">
                <img src="" alt="" />
            </div>
            <div >
                <form action="friends.html" method="get" id="login-form">
                    <input name="username" type="text" placeholder="업체명" />
                    <input name="password" type="password" placeholder="주소" />
                    <input name="password" type="password" placeholder="연락처" />
                    <input name="password" type="password" placeholder="날짜" />
                    <input name="password" type="password" placeholder="업종" />
                    <input type="submit" value="길찾기" />
                  </form>
                  <div class="review_star">
                      <div>리뷰 및 별점</div>
                      <div class="star">
                          <i class="far fa-star"></i>
                          <i class="fas fa-star"></i>
                          <i class="fas fa-star"></i>
                          <i class="fas fa-star"></i>
                          <i class="fas fa-star"></i>
                        4.3/5</div>
                      <button>지원하기</button>
                  </div>
            </div>
        </main>

        <!-- -------------------------------------------------------------------->

        <section class="section_main">
            <div class="main_title">
                <select name="" id="">
                    <option value="">1</option>
                    <option value="">2</option>
                    <option value="">3</option>
                </select>
                <input name="password" type="password" placeholder="내용을 입력해주세요" class="main_input"/>
                <button class="button">검색</button>
            </div>
            <div class="chart_title">             
                    <div><a href="#">작성일순</a></div>
                    <div><a href="#">별점순</a></div>
                    <div>총 4건</div>
            </div>
            <div>
                
                <table border='1'>
                    <tr>
                      <td>Product</td>
                      <td>Price</td>
                      <td>Product</td>
                      <td>Price</td>
                      <td>Product</td>
                      
                    </tr>
                    <tr>
                      <td>Apple</td>
                      <td>3000</td>
                      <td>Product</td>
                      <td>Price</td>
                      <td>Product</td>
                   
                    </tr>
                    <tr>
                      <td>Banana</td>
                      <td>2000</td>
                      <td>Product</td>
                      <td>Price</td>
                      <td>Product</td>
                     
                    </tr>
                    <tr>
                        <td>Banana</td>
                        <td>2000</td>
                        <td>Product</td>
                        <td>Price</td>
                        <td>Product</td>
                    </tr>                    
                  </table>
                  
            </div>

        </section>











<!-- footer --------------------------------------------------------------------->
    <footer>
        <div id="footer">
            <div class="wrap_inner">
                <div class="left_area">
                    <h4 class="rap_inner_h4">
                        일구하자 1982
                    </h4>
                    <div class="left_text">
                        <div class="left_text_margin">
                            <h5>고객센터</h5>
                            <p class="left_phone">1566-1982</p>
                            <p> 
                                <div>평일 AM 09:00 ~ PM 05:30</div>
                                <div>점심 PM 12:00 ~ PM 01:00</div>
                            </p>
                        </div>
                    </div>
                    <div class="footer_icon">
                        <div><a href="#"><i class="fab fa-facebook-f fa-2x" style="color:rgba(0,0,0,0.5)"></i></a></div>
                        <div><a href="#"><i class="fab fa-twitter fa-2x" style="color:rgba(0,0,0,0.5)"></i></a></div>
                        <div><a href="#"><i class="fab fa-youtube fa-2x" style="color:rgba(0,0,0,0.5)"></i></a></div>
                        <div><a href="#"><i class="fab fa-instagram fa-2x" style="color:rgba(0,0,0,0.5)"></i></a></div>
                    </div>
                </div>


                <div class="right_area">
                    <div class="right_ul">
                        <p>이용약관 | </p>
                        <p>개인정보처리방침 | </p>
                        <p>일구하자 이용안내 | </p>
                        <p>고객요청</p>
                    </div>
                    <div class="right_address">
                        <p>
                            <span>주식회사 1982 |</span>
                            <a href="#">

                                <span>대표이사 : 한세호 |</span>
                            </a>
                                <span>사업자등록번호 : 123-12-12345</span>
                            </p>
                        <p>
                            <span>통신판매업신고 : 2021-서울가산-1982 |</span>
                            <span>WEBMASTER : 한세호</span>
                        </p>
                        <p>
                            <span>주소 : 00000 서울 금천구 벚꽃로 309 </span>
                        </p>
                        <p>
                            <span>TEL : 1566-1982</span>
                            <span>E - mail : 1982@seho.co.kr</span>
                            <span>호스팅제공자 : 코스모(주)</span>
                        </p>
                    </div>
                    <p class="right_copyright">
                        Copyright by
                        <span>일구하자 1982</span>
                        all rights reserved.
                    </p>
                </div>        
            </div>
        </div>

    </footer>
</body>
</html>