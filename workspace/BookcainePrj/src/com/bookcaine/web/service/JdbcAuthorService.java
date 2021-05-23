package com.bookcaine.web.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bookcaine.web.entity.Author;
import com.bookcaine.web.entity.Book;

public class JdbcAuthorService implements AuthorService {

	public Author get (int id) {
		
		Author author = new Author();
		
		String sql = "SELECT * FROM Author WHERE ID=" + id;
		
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection(url, "BOOK", "12345");
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			if(rs.next()) {
				String name = rs.getString("name");
				String details = rs.getString("details");
				
				author.setName(name);
				author.setDetails(details);
			}
	
			rs.close();
			st.close();
			con.close();
		} catch (Exception e) {
			throw new ServiceException();
		}
		
		return author;
		
	}

}
