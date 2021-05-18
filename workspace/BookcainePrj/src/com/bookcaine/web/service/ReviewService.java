package com.bookcaine.web.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bookcaine.web.entity.Review;

public class ReviewService {
	
	public List<Review> getList(int bookId) throws ClassNotFoundException, SQLException{
		List<Review> list = new ArrayList<>();
		
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		// 필터링, 정렬, 그룹핑, ... -> SQL에서 담당
		String sql = "SELECT * FROM REVIEW WHERE BOOK_ID=" + bookId + " ORDER BY REGDATE DESC";

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url, "BOOK", "12345");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			Review review = new Review();
			int id = rs.getInt("id");
			int memberId = rs.getInt("member_id");
			String content = rs.getString("content");
			
			review.setId(id);
			review.setMemberId(memberId);
			review.setBookId(bookId);
			review.setContent(content);
			
			list.add(review);
		}
		
		rs.close();
		st.close();
		con.close();
		
		return list;
	}
	
	public int insert(Review review) throws ClassNotFoundException, SQLException {
		int result = 0;
		
		String sql = "INSERT INTO Review(REVIEW_ID, MEMBER_ID, BOOK_ID, CONTENT) VALUES(?,?,?,?)";
		
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url, "BOOK", "12345");
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, review.getId());
		st.setInt(2, review.getMemberId());
		st.setInt(3, review.getBookId());
		st.setString(4, review.getContent());
		
		result = st.executeUpdate(); // ex.Query():Select, ex.Update(): UPdate/Delete/Insert
		// 업데이트된 개수를 반환
		
		st.close();
		con.close();
		
		return result;
	}
	
}
