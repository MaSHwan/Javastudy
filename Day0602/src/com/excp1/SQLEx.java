package com.excp1;
import java.sql.*;
public class SQLEx {
	public static void main(String[] args) {
		Connection con = null;
		Statement stnt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:orcl", "scott","tiger");
		}catch(ClassNotFoundException ce) {
			System.out.println("드라이버가 없습니다.");
		}catch(SQLException se) {
			System.out.println("드라이버 연결 실패");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try{if(stnt != null) stnt.close();}catch(SQLException se) {}
			try {if(con != null) con.close();} catch(SQLException se) {}
		}
	}
}
