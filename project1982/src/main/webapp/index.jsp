<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
	<title>intro.jsp</title>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/FortAwesome/Font-Awesome@5.14.0/css/all.min.css">
    <link type="text/css" href="/project1982/resources/css/1_intro.css" rel="stylesheet"/>
</head>
<body>

        <!--메뉴바  ------------------------------------------------->
        <header class="header" >
         <!-- 로고-->
            
            <a href="main.do" class="logo">
                <img src="./3.jpg"/>
            </a>
            
            <!--메뉴-->   
            <ul class="menu">
               
                <li class="nav-item"><a class="nav-link" href="#soge">소개</a></li>
                <li class="nav-item"><a class="nav-link" href="#team">팀 소개</a></li>
                <li class="nav-item"><a class="nav-link" href="admin/admin_login.do">관리자로그인</a></li>
                
            </ul>
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

    <div class="main">
        <a class="main_button" href="user/user_login.do">구직자 로그인</a>    
        <a class="main_button" href="owner/owner_login.do">사업자 로그인</a>
    </div>
<!-- main------------------------------------------------------------------>
    <section>
        <div class="title" id="soge">1982 소개</div>
        <div class="title_wrap">
            <div>
                <div class="circle"></div>
                <p class="small">신뢰성</p>
            </div>
            <div>
                <div class="circle"></div>
                <p class="small">신뢰성</p>
            </div>
            <div>
                <div class="circle"></div>
                <p class="small">신뢰성</p>
            </div>
        </div>
        <div class="lorem">Lorem ipsum dolor sit amet consectetur adipisicing elit. Recusandae reiciendis molestiae inventore sint, veniam aperiam voluptatem cupiditate laborum ab, amet illo? Nostrum illum perferendis molestias placeat odit accusamus? Fugit, reprehenderit.</div>
    </section>

    <article>
        <div class="title" id="team">팀 소개</div>
        <div class="title_wrap">
            <div>
                <div class="circle"></div>
                <p class="small">한세호</p>
            </div>
            <div>
                <div class="circle"></div>
                <p class="small">이성대</p>
            </div>
            <div>
                <div class="circle"></div>
                <p class="small">송현석</p>
            </div>
            <div>
                <div class="circle"></div>
                <p class="small">이혁철</p>
            </div>
            <div>
                <div class="circle"></div>
                <p class="small">신뢰성</p>
            </div>
            <div>
                <div class="circle"></div>
                <p class="small">신뢰성</p>
            </div>
            <div>
                <div class="circle"></div>
                <p class="small">신뢰성</p>
            </div>
            <div>
                <div class="circle"></div>
                <p class="small">신뢰성</p>
            </div>
            <div>
                <div class="circle"></div>
                <p class="small">신뢰성</p>
            </div>
        </div>
    </article>










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
                            <a href="/project1982/admin/admin_login.do">

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

