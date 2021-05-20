package com.bookcaine.web.service;

import java.util.List;

import com.bookcaine.web.entity.Book;

public interface indexService {

	List<Book> getList();
	List<Book> getList(String query);
	Book get(int id);
	
}
