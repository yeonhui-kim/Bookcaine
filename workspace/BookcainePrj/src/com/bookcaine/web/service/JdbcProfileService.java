package com.bookcaine.web.service;

import java.sql.SQLException;
import java.util.List;

import com.bookcaine.web.entity.Book;
import com.bookcaine.web.entity.Gathering;
import com.bookcaine.web.entity.Review;

public class JdbcProfileService implements ProfileService {

	@Override
	public int getFollowerCount(String memberId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFollowingCount(String memberId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Gathering> getGatheringList(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getBookCount(String memberId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Book> getBookList(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getReviewCount(String memberId) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int update(Review review) throws ClassNotFoundException, SQLException {
		int result = 0;
		
		String sql = "INSERT INTO REVIEW(WRITER_ID, BOOK_ID, CONTENT) VALUES(?,?,?)";
		
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url, "BOOK", "12345");
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, review.getWriterId());
		st.setInt(2, review.getBookId());
		st.setString(3, review.getContent());
		
		result = st.executeUpdate(); // ex.Query():Select, ex.Update(): UPdate/Delete/Insert
		// 업데이트된 개수를 반환
		
		st.close();
		con.close();
		
		return result;
	}
	
}
