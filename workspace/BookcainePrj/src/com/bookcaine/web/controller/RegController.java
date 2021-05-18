package com.bookcaine.web.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookcaine.web.entity.Review;
import com.bookcaine.web.service.ReviewService;

//@WebServlet("books/reg")
public class RegController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		String content = request.getParameter("content");
		
		ReviewService service = new ReviewService();
		
		try {
			
			Review review = new Review();
			review.setId(Integer.parseInt(id));
			review.setContent(content);
			// 임시로 1로 고정
			review.setMemberId(1);
			service.insert(review);
			//service.insert(title, content);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("detail.jsp?id=" + id);
	
	}
	
}
