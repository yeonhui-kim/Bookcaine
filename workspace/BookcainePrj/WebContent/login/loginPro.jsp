<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="com.bookcaine.web.service.JdbcLoginService"%>

<!DOCTYPE html>
<html lang="en">
<head>
   
    <title>login 처리 jsp</title>
    
</head>

<body>

<%
//로그인 화면에 입력된 아이디 비번 가져오기
	String id = request.getParameter("ID");
	String pwd = request.getParameter("PWD");
	//db에서 아이디, 비번 확인
	JdbcLoginService service = new JdbcLoginService();
	int check = service.loginCheck(id, pwd);
	
	String msg = ""; // url및 로그인관련 메시지
	
	//로그인 성공한 경우 세션에 현재 아이디 세팅
	if(check == 1){
		session.setAttribute("sessionID", id);
		msg = "../index.jsp";
	}else if(check == 0){//비번틀린경우
		msg = "login.jsp?msg=0";
	}else{//아이디 틀린경우
		msg = "login.jsp?msg=-1";
	}
	
	response.sendRedirect(msg);
%>

    
</body>
</html>