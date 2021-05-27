package com.bookcaine.web.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookcaine.web.entity.Member;

public class JdbcSignoutService {
	
	public Member deleteMember(String id, String pwd) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PWD = ?";
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		Member deleteMember = null;
		
		try {
			con = DriverManager.getConnection(url, "book", "12345");
			st = con.prepareStatement(sql);
			st.setString(1, id);
			st.setString(2, pwd);
			
			rs = st.executeQuery();
			
			
				
		}
		
		return deleteMember;
	}
}
