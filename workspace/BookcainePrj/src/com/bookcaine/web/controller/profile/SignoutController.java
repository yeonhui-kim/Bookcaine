package com.bookcaine.web.controller.profile;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bookcaine.web.service.JdbcLoginService;
import com.bookcaine.web.service.JdbcSignoutService;

@WebServlet("/sign/signout")
public class SignoutController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		HttpSession session = req.getSession();
		
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		JdbcSignoutService service = new JdbcSignoutService();
		
		resp.sendRedirect("/WEB-INF/view/sign/signout.jsp");
	}
}
