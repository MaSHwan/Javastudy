package com.dbex;

import java.sql.*;

public class JdbcEx02 { // update : 과명을 컴퓨터공학으로 바꾸기 조건 학과번호 = 203
	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		sql.append("update department ");
		sql.append("set dname='컴퓨터공학과' ");
		sql.append("where deptno=203");

		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이브검색

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String password = "tiger";

			con = DriverManager.getConnection(url, id, password);
			stmt = con.createStatement();
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + " 개의 행이 수정되었습니다.");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException s) {
				s.printStackTrace();
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException s) {
				s.printStackTrace();
			}
		}
	}
}
