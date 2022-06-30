package com.dbex;

import java.sql.*; // DB 연결

public class Jdbcex01 {

	public static void main(String[] args) {
		Connection con = null; // 연결 객체 선언
		Statement stmt = null;

		try {
			// jdbc 드라이브 메모리에 로드하기
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 이름설정

			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");// 연결 객체 얻기
			System.out.println("데이터베이스 연결 성공");

			// 연결이된 상태 이후에 해야함
			// Statement 객체얻기
			stmt = con.createStatement();

			// sql 쿼리문 작성
			StringBuffer sql = new StringBuffer();

			sql.append("insert into department ");// department 뒤에 반드시 공백이 있어야함
			sql.append("values(203, '제어계측공학과', 200, '7호관')");

			// 쿼리문 실행
			int result = stmt.executeUpdate(sql.toString()); // executeupdate 는 생성, 삭제, 수정할때 사용함
			// executeUpdate(sql.toString()); 는 insert ,update, delete
			// select : executeQuery(sql.toString());
			System.out.println(result + "개 행이 추가되었습니다.");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {

			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException s) {
			}

			try {
				if (con != null)
					con.close();
			} catch (SQLException s) {
			}
		}
	}

}
