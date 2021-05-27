package com.bookcaine.web.controller.profile;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/profile/profile")
public class ProfileController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 만약 현재 사용자가 login 프로세스를 통해 인증되지 않았다면
		HttpSession session = req.getSession();
		String id = (String) session.getAttribute("id");
		//인증하고 오세요
		if(id == null) {
			resp.sendRedirect("/login/login.jsp?returnURL=/profile/profile");
			return;	
		}
		
		resp.sendRedirect("/profile/profile.jsp");
	}
}
