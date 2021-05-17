package com.bookcaine.web.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bookcaine.web.entity.Book;

public class BookService {
	public List<Book> getList() throws ClassNotFoundException, SQLException{
		List<Book> list = new ArrayList<>();
		
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		// 필터링, 정렬, 그룹핑, ... -> SQL에서 담당
		String sql = "SELECT * FROM BOOK";

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url, "BOOK", "12345");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			Book book = new Book();
			int id = rs.getInt("id");
			String title = rs.getString("title");
			String author = rs.getString("author");
			String yn = rs.getString("yn");
			String details = rs.getString("details");
			
			book.setId(id);
			book.setTitle(title);
			book.setAuthor(author);
			book.setYn(yn);
			book.setDetails(details);
			
			list.add(book);
		}
		
		rs.close();
		st.close();
		con.close();
		
		return list;
	}
	
	public List<Book> getList(String query) throws ClassNotFoundException, SQLException{
		List<Book> list = new ArrayList<>();
		
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		// 필터링, 정렬, 그룹핑, ... -> SQL에서 담당
		String sql = "SELECT * FROM BOOK WHERE TITLE LIKE '%" + query + "%' ORDER BY ID";

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url, "BOOK", "12345");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			Book book = new Book();
			int id = rs.getInt("id");
			String title = rs.getString("title");
			String author = rs.getString("author");
			String yn = rs.getString("yn");
			String details = rs.getString("details");
			
			book.setId(id);
			book.setTitle(title);
			book.setAuthor(author);
			book.setYn(yn);
			book.setDetails(details);
			
			list.add(book);
		}
		
		rs.close();
		st.close();
		con.close();
		
		return list;
	}
	
	public Book get(int id) throws SQLException, ClassNotFoundException {
		
		Book book = new Book();
		
		String sql = "SELECT * FROM BOOK WHERE ID=" + id;
		
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url, "BOOK", "12345");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		if(rs.next()) {
			String title = rs.getString("title");
			String author = rs.getString("author");
			
			book.setId(id);
			book.setTitle(title);
			book.setAuthor(author);
		}

		rs.close();
		st.close();
		con.close();

		return book;
		
	}

}
