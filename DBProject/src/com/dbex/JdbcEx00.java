package com.dbex;
import java.sql.*;
public class JdbcEx00 { // update : 과명을 컴퓨터공학으로 바꾸기 조건 학과번호 = 203
	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		sql.append(" ");
		sql.append(" ");
		sql.append("");

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

/*
 *  JDBC(Java DataBase Connection)을 이용한 데이터베이스 연결 방법
 *  
 *  총 6단계로 이루어져있다.
 *  
 *  1단계
 *   - import java.sql.*;
 *   
 *  2단계
 *   - Driver 검색단계
 *     oracle: oracle.jdbc.driver.OracleDriver
 *  3단계
 *   - DataBase의 연결
 *     Connection con = DriverManager.getConnection(url, id, password); 을 이용해서 연결
 *     oracle url = jdbc:oracle:thin:@localhost:1521:SID(orcl)
 *     id = 오라클 사용자 계정
 *     password = 오라클 사용자 계정의 비밀번호
 *     
 * -------------------------------여기까진 무조건 해야되는 기본----------------------------
 * 
 *  4단계
 *   - 쿼리문 작성
 *   
 *     정적
 *     Statement Class(정적)
 *      - Statement stmt = con.createStatement();
 *     동적
 *     PreparedStatement(동적)
 *      - PreparedStatement pstmt= con.prepareStatement(쿼리);
 *      
 *  5단계
 *   - 쿼리 결과 저장
 *   
 *     정적
 *     ResultSet rs = stmt.executeQuery(query); // select 일 때
 *     ResultSet rs = stmt.executeUpdate(query); // insert, update, delete
 *     
 *     동적
 *     ResultSet rs = pstmt.executeQuery(query); // select 
 *     ResultSet rs = pstmt.executeUpdate(query); // insert, update, delete
 *     
 *  6단계
 *   - 사용 후 반드시 close() 메소드를 실행한다.
 *     연결 해제
 */

