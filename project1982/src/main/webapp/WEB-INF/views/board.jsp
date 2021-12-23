<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>board.jsp</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/FortAwesome/Font-Awesome@5.14.0/css/all.min.css">
  	<link type="text/css" href="/project1982/resources/style/style.css" rel="stylesheet"/>
    <link type="text/css" href="/project1982/resources/style/header.css" rel="stylesheet"/>
</head>
<body>
        <!--메뉴바  ------------------------------------------------->
        <header class="header" >
            <!-- 로고-->
               <div>
               <a href="main.do" class="logo">
                   <h1>1982</h1>
               </a>
               </div>
               <!--메뉴--> 
             
               
               <!-- 오른쪽 메뉴-->
               <div class="right-menu">
                   <!--검색 -->
                   <a href="user/storeClose.do" class="search">
                   일자리찾기
                   </a>
                   <a href="owner/job_positing.do" class="search">
                    구인공고
                   </a>
                   <!--유저 -->
                   <a href="user/userMypage.do" class="user">
                   마이페이지
                   </a>
                   <!--카트  -->
                   <a href="board.do">
                   고객센터
                       <!--카트 상품-->
                       
                   </a>
               </div>
   
           </header>

    <!-- 메인 ---------------------------------------------------------------->
        <main>
            <ul class="left_nav">
                <li class="left_nav_text"><a class="home" href="#">홈</a></li>
                <li class="left_nav_text"><a href="#">새소식</a></li>
                <li class="left_nav_text"><a href="#">상품</a></li>
                <li class="left_nav_text"><a href="#">회사</a></li>
            </ul>

            <div class="body_container"> <!-- 페이지 컨테이너 시작-->
             
                <div class="body_container_center"> <!-- 중간 메뉴바 시작-->
                   <div class="body_container_center_title"> 고객센터</div>
                   <div class="search_input">
                       <select name="" id="" >
                           <option value="">제목</option>
                           <option value="">작성일</option>
                           <option value="">작성자</option>
                           <option value="">구분</option>
                           <option value="">제목+내용</option>
                        </select>

                        <input type="text" placeholder="내용을 입력해주세요.">

                        <button>검색</button>
                   </div>
                   <div class="divTable minimalistBlack">
                    <div class="divTableHeading">
                    <div class="divTableRow">
                    <div class="divTableHead">head1</div>
                    <div class="divTableHead">head2</div>
                    <div class="divTableHead">head3</div>
                    <div class="divTableHead">head4</div>
                    </div>
                    </div>
                    <div class="divTableBody">
                    <div class="divTableRow">
                    <div class="divTableCell">cell1_1</div>
                    <div class="divTableCell">cell2_1</div>
                    <div class="divTableCell">cell3_1</div>
                    <div class="divTableCell">cell4_1</div>
                    </div>
                    <div class="divTableRow">
                    <div class="divTableCell">cell1_2</div>
                    <div class="divTableCell">cell2_2</div>
                    <div class="divTableCell">cell3_2</div>
                    <div class="divTableCell">cell4_2</div>
                    </div>
                    </div>
                    <div class="divTableFoot tableFootStyle">
                    <div class="divTableRow">
                    <div class="divTableCell">foot1</div>
                    <div class="divTableCell">foot2</div>
                    <div class="divTableCell">foot3</div>
                    <div class="divTableCell">foot4</div>
                    </div>
                    </div>
                    </div>
                   <div class="buttons">
                       <button class="border_write">글 쓰기</button> 

                       <div class="links">
                        <a href="#">&laquo;</a>
                            <a class="active" href="#">1</a> 
                            <a href="#">2</a> 
                            <a href="#">3</a> 
                            <a href="#">4</a> 
                        <a href="#">&raquo;</a>
                        </div>
                   </div>
                </div><!--중간 메뉴바 종료-->
               
           
            </div><!-- 페이지 컨테이너 종료--       
        
        </main>
        
        
        
        
        
        
        
        
        
        
        
 






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