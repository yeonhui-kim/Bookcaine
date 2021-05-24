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

@WebServlet("/Admin/book/detail")
public class BookDetailController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id_ = request.getParameter("id");
		int id = Integer.parseInt(id_);
		
	    BookService bookService = new JdbcBookService();
	    Book book = null;
	    		
	    book = bookService.get(id); 
	    
	    request.setAttribute("book", book); // "" 안에가 key값
	    request.getRequestDispatcher("detail.jsp").forward(request, response);
	    
	
	    
		
		
	}
}
