package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Member;

public class MemberService {
	public List<Member> getList() throws ClassNotFoundException, SQLException {
		List<Member> list = new ArrayList<>();

		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		String sql = "SELECT * FROM USER_";
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url, "book", "12345");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			String id = rs.getString("id");
			String pwd = rs.getString("pwd");
			String name = rs.getString("name");
			String gender = rs.getString("gender");
			String birthday = rs.getString("birthday");
			String phone = rs.getString("phone");
			String email = rs.getString("email");
			
			Member member = new Member();
			member.setId(id);
			member.setPwd(pwd);
			member.setName(name);
			member.setGender(gender);
			member.setBirthday(birthday);
			member.setPhone(phone);
			member.setEmail(email);
			
			list.add(member);
			//System.out.printf("아이디:%s,비밀번호:%s,이름:%s,성별:%s,생년월일:%s,핸드폰:%s,이메일%s\n",id,pwd,name,gender,birthday,phone,email);
		}
		
		return list;

	}
	
	public int insert(Member member) throws ClassNotFoundException, SQLException {
		int result = 0;

		String sql = "INSERT INTO USER_(ID, PWD, NAME, GENDER, BIRTHDAY, PHONE, EMAIL) VALUES(?,?,?,?,?,?,?)"; 
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url, "book", "12345");
		
		
		//데이터 넣는 방법
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, member.getId());
		st.setString(2, member.getPwd());
		st.setString(3, member.getName());
		st.setString(4, member.getGender());
		st.setString(5, member.getBirthday());
		st.setString(6, member.getPhone());
		st.setString(7, member.getEmail());
		
		result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
	
	//로그인 시 아이디, 비밀번호 체크 메서드 // 아이디 비밀번호 인자로 받음
	public int loginCheck(String id, String pw) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		String sql = "SELECT * FROM USER_";
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		String dbPw = ""; //db에서 꺼낸 비밀번호 담는 변수
		int x = -1;

		try {
			StringBuffer query = new StringBuffer(); // 입력된 아이디로 db에서 비번조회
			query.append("SELECT PWD FROM USER_ WHERE ID=?");
			
			con = DriverManager.getConnection(url, "book", "12345");
			st = con.prepareStatement(query.toString());
			st.setString(1, id);
			rs = st.executeQuery(sql);
			
			if(rs.next()) {//입력된 아이디에 해당하는 비번 있을 경우
				dbPw = rs.getString("PWD");
				
				if(dbPw.equals(pw))
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
