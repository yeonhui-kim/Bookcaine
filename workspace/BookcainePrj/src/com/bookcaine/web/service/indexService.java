package com.bookcaine.web.service;

import java.sql.SQLException;
import java.util.List;

import com.bookcaine.web.entity.Book;

public interface indexService {

	List<Book> getList() throws ClassNotFoundException, SQLException;
	List<Book> getList(String query) throws ClassNotFoundException, SQLException;
	Book get(int id) throws SQLException, ClassNotFoundException;
	
}
