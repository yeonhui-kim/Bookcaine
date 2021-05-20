package com.bookcaine.web.service;

import java.util.List;

import com.bookcaine.web.entity.Book;

public interface BookService {

	List<Book> getList();
	List<Book> getList(String query);
	List<Book> getList(int page, String field, String query);
	Book get(int id);
	
	
}
