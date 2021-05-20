
<%@page import="com.bookcaine.web.entity.Book"%>
<%@page import="java.util.List"%>
<%@page import="com.bookcaine.web.service.JdbcBookService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
    String p = request.getParameter("p");
        String f = request.getParameter("f");
        String q = request.getParameter("q");

        int page_ = 1;
        String field = "title";
        String query = "";

        if (p!= null && !p.equals(""))
        	page_ = Integer.parseInt(p);
        if (f!= null && !f.equals(""))
        	field = f;
        if (q!= null && !q.equals(""))
        	query = q;

        JdbcBookService bookService = new JdbcBookService();
        List<Book> list = bookService.getList(page_, field, query);
    %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="../css/list_total.css" type="text/css" rel="stylesheet">
</head>

<body>
    <div id="root">
        <header id="header">
            <section>
                <h1 class="d-none">메인</h1>
                <section id="main-top">
                    <h1>관리자 도서 전체 리스트 | Bookcaine</h1>
                </section>
            </section>
        </header>
        <aside id="aside">
            <div class="font">
                <p>도서관리><b>도서리스트</b></p>
            </div>
            <form class=aside-search>
                <select name="f">
                    <option value="">전체</option>
                    <option value="ctg">분류</option>
                    <option value="title">제목</option>
                    <option value="author">저자</option>
                </select>
                <input type="search" value="" name="q">
                <input type="submit" value="검색">
            </form>
        </aside>
        <section class="book_total_content">
            <h1><a href="list_total.jsp">책 전체 목록</a></h1>
            <ul class="book_total_list"> 
            	<%for(Book b : list){%>
                <li class="book_total">
                    <input class="check" type="checkbox">
                    <a class="title" href="book_detail.html"><%=b.getTitle() %></a>
                    <img class="img" src="../images/book1.PNG">
                    <span class="info">
                        <span>진열여부:Y</span>
                    </span>
                    <span class="customer">
                        <span>별점평균:9.8점 |</span>
                        <span>등록리뷰:387건</span>
                    </span>
                    <span class="meetup">
                        <span>개설모임:1개 |</span>
                        <span>모임참가자:478명</span>
                    </span>
                </li>
                <% } %>
            </ul>
        </section>

        <section class="page-status mt-3">
            <h1 class="d-none">현재 페이지 정보</h1>
            <div>
                 <span class="text-strong">1</span> / 2 pages
            </div>
        </section>
        <nav class="pager mt-3">
            <h1 class="d-none">페이저</h1>
            <div class="button">이전</div>
            <ul>
                <li><a class="text-strong"" href="list_total.jsp?p=1&f=<%=field%>&q=<%=query%>">1</a></li>
                <li><a href="list_total.jsp?p=2&f=<%=field%>&q=<%=query%>">2</a></li>
                <li><a href="list_total.jsp?p=3&f=<%=field%>&q=<%=query%>">3</a></li>
                <li><a href="list_total.jsp?p=4&f=<%=field%>&q=<%=query%>">4</a></li>
                <li><a href="list_total.jsp?p=5&f=<%=field%>&q=<%=query%>">5</a></li>
            </ul>
            <div class="button">다음</div>
        </nav>
            <h1 class="d-none">상품 관리</h1>
            <form class="check_button">
                <a href="book_detail.html"><input type="button" value="상세 페이지"></a>
                <a href="book_add.html"><input type="button" value="상품 등록"></a>
                <input type="button" value="상품 수정">
                <input type="button" value="상품 삭제">
            </form>
    </div>
</body>
</html>