<%@page import="com.bookcaine.web.entity.Book"%>
<%@page import="com.bookcaine.web.service.BookService"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
String q = request.getParameter("q");

	String query = "";

	if (q != null && !q.equals(""))
		query = q;
	
	BookService bookService = new BookService();
	List<Book> list = bookService.getList(query);
%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <header id="header">
        <div class="float-content">
            <h1 class="logo"><div class="logo-1">책에 중독되는 순간</div> Bookcaine</h1>
            <section>
                <h1 class="d-none">헤더</h1>
                <nav id="user">
                    <ul>
                        <li><a href="sign_up/Main_Sign_Up.html"><input class="button" type="button" value="회원가입"></a></li>
                        <li><a href="login/login.html"><input class="button" type="button" value="로그인"></a></li>
                    </ul>
                </nav>

                <section class="book-search-form">
                    <h1 class="d-none">도서검색폼</h1>
                    <form action="index.jsp" method="get">
                        <legend class="d-none">도서 검색 필드</legend>
                        <input class="form-input" type="text" name="query" placeholder="제목,저자,출판사 검색">
                        <input class="button" type="submit" value="검색">
                    </form>
                </section>
    
                <nav class="quick-menu">
                    <h1 class="d-none">퀵메뉴</h1>
                    <ul>
                        <li class="home"><a href="#">홈</a></li>
                        <li><a href="">도전방</a></li>
                        <li><a href="profile/profile.jsp">프로필</a></li>
                    </ul>
                </nav>
            </section>
        </div>
    </header>

    <main>
        <h1 class="d-none">content</h1>
        <!--<nav>
            <h1 class="section-title">사람들이 지금 많이 읽고 있는 책</h1>
            <ol class="book-list">
            <%for (int i=0; i<2; i++) { %>
            <div>
            	<%for (int j=0; j<3; j++) {%>
	            	<a href="books/book1.html">
	                        <img src="images/book<%=list.get(3*i+j).getId()%>.jpg" alt="">
	                        <li><%=list.get(3*i+j).getTitle() %></li>
	                </a>
	            <%} %>
            </div>
            <%} %>
            </ol>
        </nav>-->
        <nav>
            <h1 class="section-title">BookCaine 추천</h1>
            <ul class="book-list">
            <%for (int i=0; i<6; i++) { %>
            <div>
            	<%for (int j=0; j<3; j++) {%>
	            	<a href="books/detail.jsp?id=<%=list.get(3*i+j).getId()%>">
	                        <img src="images/book<%=list.get(3*i+j).getId()%>.jpg" alt="">
	                        <li><%=list.get(3*i+j).getTitle() %></li>
	                </a>
	            <%} %>
            </div>
            <%} %>
            </ul>
        </nav>
        <!--<nav>
            <h1 class="section-title">베스트셀러</h1>
            <ol class="book-list">
	            <%for (int i=0; i<2; i++) { %>
	            <div>
	            	<%for (int j=0; j<3; j++) {%>
		            	<a href="books/book1.html">
		                        <img src="images/book<%=list.get(3*i+j+12).getId()%>.jpg" alt="">
		                        <li><%=list.get(3*i+j).getTitle() %></li>
		                </a>
		            <%} %>
	            </div>
	            <%} %>
            </ol>
        </nav> -->
    </main>

</body>

</html>