package com.bookcaine.web.service;

import java.util.List;

import com.bookcaine.web.entity.Book;

public interface Mng_listTotalService {

	List<Book> getBookList();
	List<Book> getBookList(int page, String field, String query);
	Book get(int id);
	
	int getCount(String field, String query);
	int update(Book book);
	int insert (Book book);
	int delete(int id);
}
