package com.bookcaine.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookcaine.web.entity.Author;
import com.bookcaine.web.entity.Book;
import com.bookcaine.web.service.AuthorService;
import com.bookcaine.web.service.BookService;
import com.bookcaine.web.service.JdbcAuthorService;
import com.bookcaine.web.service.JdbcBookService;

@WebServlet("/Admin/book/edit")
public class BookEditController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id_ = request.getParameter("id");
		int id = Integer.parseInt(id_);
		String bD = request.getParameter("bookDetails");
		String aD = request.getParameter("authorDeatils");
	
	    BookService bookService = new JdbcBookService();
	    Book book = bookService.get(id); 
	    
	    AuthorService authorService = new JdbcAuthorService();
	    Author author = authorService.get(id);
	    
	    request.setAttribute("book", book);
	    request.setAttribute("author", author);
	    request.getRequestDispatcher("edit.jsp").forward(request, response);
	  
		bookService.update(book);
		response.sendRedirect("/Adimin/book/detail?id="+id);
		
		
	
	}
}
