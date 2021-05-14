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

@WebServlet("/sign_up/Sign_Up")
public class Sign_Up_Controller extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String birthday1 = req.getParameter("birthdayYY");
		//String[] birthday2 = req.getParameterValues("birthdayMM");
		String birthday2 = req.getParameter("birthdayMM");
		String birthday3 = req.getParameter("birthdayDD");
		String birthday = birthday1 + birthday2 + birthday3;
		
		String phone = req.getParameter("phone");
		String email = req.getParameter("email");
		
		MemberService service = new MemberService();
	
		try {
			Member member = new Member();
			member.setId(id);
			member.setPwd(pwd);
			member.setName(name);
			member.setGender(gender);
			member.setBirthday(birthday);
			member.setPhone(phone);
			member.setEmail(email);
			//member.setBirthdays(birthday2);
			service.insert(member);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		resp.sendRedirect("Sign_Up.jsp");
	
	}
	
	

}
