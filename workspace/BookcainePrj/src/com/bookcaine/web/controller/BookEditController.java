package com.bookcaine.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookcaine.web.entity.Book;
import com.bookcaine.web.service.BookService;
import com.bookcaine.web.service.JdbcBookService;

@WebServlet("/Admin/book/edit")
public class BookEditController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String bD = req.getParameter("bookDetails");
		String aD = req.getParameter("authorDeatils");
	
		BookService bookService = new JdbcBookService();
		
		Book book;
		book = booKService.get(id);
		
		
//		book.setId(id);
//		book.setDetails(bD);
		
		bookService.update(book);
		
		response.sendRedirect("detail.jsp?id="+id);
		
		
	
	}
}
