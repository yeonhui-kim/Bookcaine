package com.bookcaine.web.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookcaine.web.entity.Member;
import com.bookcaine.web.service.MemberService;

@WebServlet("/login/login")
public class LoginController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		MemberService service = new MemberService();
	
		try {
			Member member = new Member();
			member.setId(id);
			member.setPwd(pwd);
			
			service.insert(member);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		resp.sendRedirect("loginPro.jsp");
	
	}
	
	

}
