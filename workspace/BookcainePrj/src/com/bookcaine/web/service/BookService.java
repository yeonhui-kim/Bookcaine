package com.bookcaine.web.service;

import java.util.List;

import com.bookcaine.web.entity.Book;

public interface BookService {

	List<Book> getList();
	List<Book> getList(String field, String query);
	List<Book> getList(int page, String field, String query);
	Book get(int id);
	int update(Book book);
	int insert (Book book);
	int delete(int id);
	
	
}
