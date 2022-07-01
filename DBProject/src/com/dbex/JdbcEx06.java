package com.dbex;

import java.sql.*;
public class JdbcEx06 {
public static void main(String[] args) {
		
		// PreparedStatement 를 사용하는 경우
		// sql쿼리에서 실제 값으로 대체될 부분을 ? 로 처리한다. ** 중요
		// ? 는 DB에서 sql 실행시에 실제 값으로 대체됨
		
		
		
		StringBuffer sql = new StringBuffer();
		
		sql.append("update professor ");
		sql.append("set sal =? where name=?");

		
		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			// DB연결
			con = ConnUtil.getConnection();
			System.out.println("데이터연결성공");
			
			pstmt = con.prepareStatement(sql.toString());
			
			//쿼리의 파라미터 세팅
			// 쿼리의 ?(바인딩 변수)에 대체될 실제값을 지정함
			pstmt.setInt(1, 7000);
			pstmt.setString(2, "마승환");

			// 쿼리실행
			int i = pstmt.executeUpdate();
			
			System.out.println(i + "행이 수정 되었습니다.");
			
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {

			try {
				if (pstmt != null)
					pstmt.close();
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
