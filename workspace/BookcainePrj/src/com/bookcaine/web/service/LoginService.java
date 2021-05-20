package com.bookcaine.web.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bookcaine.web.entity.Member;

public class LoginService {
	
	public List<Member> getList() throws ClassNotFoundException, SQLException {
		
		List<Member> list = new ArrayList<>();

		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		String sql = "SELECT * FROM MEMBER";
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url, "book", "12345");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			String id = rs.getString("id");
			String pwd = rs.getString("pwd");
			
			Member member = new Member();
			member.setId(id);
			member.setPwd(pwd);
			
			
			list.add(member);
			
		}
		
		return list;

	}
	
	public int insert(Member member) throws ClassNotFoundException, SQLException {
		int result = 0;

		String sql = "INSERT INTO MEMBER(ID, PWD) VALUES(?,?)"; 
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url, "book", "12345");
		
		//데이터 넣는 방법
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, member.getId());
		st.setString(2, member.getPwd());
		
		result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
	
	//로그인 시 아이디, 비밀번호 체크 메서드 // 아이디 비밀번호 인자로 받음
	public int loginCheck(String id, String pwd) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		String sql = "SELECT * FROM MEMBER";
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		String dbPwd = ""; //db에서 꺼낸 비밀번호 담는 변수
		int x = -1;

		try {
			StringBuffer query = new StringBuffer(); // 입력된 아이디로 db에서 비번조회
			query.append("SELECT PWD FROM MEMBER WHERE ID=?");
			
			con = DriverManager.getConnection(url, "book", "12345");
			st = con.prepareStatement(query.toString());
			st.setString(1, id);
			rs = st.executeQuery(sql);
			
			if(rs.next()) {//입력된 아이디에 해당하는 비번 있을 경우
				dbPwd = rs.getString("PWD");
				
				if(dbPwd.equals(pwd))
					x = 1;
				else
					x = 0;
			}else {//해당 아이디 없을 경우
				x = -1;
			}
			
			return x;
			
		}catch(Exception sqle) {
			throw new RuntimeException(sqle.getMessage());
		}finally {
			try {
				if(st != null) { st.close(); st = null;}
				if(con != null) { con.close(); con = null;}
			}catch(Exception e) {
				throw new RuntimeException(e.getMessage());
			}
		}
		
		
	}
	
	
	
}
