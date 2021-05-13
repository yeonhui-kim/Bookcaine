package com.bookcaine.web.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bookcaine.web.entity.Book;

public class SearchService {
	public List<Book> getList(String query) throws ClassNotFoundException, SQLException{
		List<Book> list = new ArrayList<>();
		
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		// 필터링, 정렬, 그룹핑, ... -> SQL에서 담당
		String sql = "SELECT * FROM BOOK WHERE TITLE LIKE '%" + query + "%'";

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url, "BOOK", "12345");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			Book book = new Book();
			String title = rs.getString("title");
			String author = rs.getString("author");
			int pubYear = rs.getInt("pubYear");
			int readerNum = rs.getInt("readerNum");
			
			book.setTitle(title);
			book.setAuthor(author);
			book.setPubYear(pubYear);
			book.setReaderNum(readerNum);
			
			list.add(book);
		}
		
		return list;
	}
}
