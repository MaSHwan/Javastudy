package com.dbex;

import java.sql.*;

public class JdbcEx07 {
public static void main(String[] args) {
		
		// PreparedStatement 를 사용하는 경우
		// sql쿼리에서 실제 값으로 대체될 부분을 ? 로 처리한다. ** 중요
		// ? 는 DB에서 sql 실행시에 실제 값으로 대체됨
		
		
		
		StringBuffer sql = new StringBuffer();
		
		sql.append("select a.name, a.profno, a.position, b.dname from professor a, department b where a.deptno = b.deptno ");
		sql.append("and a.deptno = ? ");

		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {

			// DB연결
			con = ConnUtil.getConnection();
			System.out.println("데이터연결성공");
			
			pstmt = con.prepareStatement(sql.toString());
			
			
			
			//쿼리의 파라미터 세팅
			// 쿼리의 ?(바인딩 변수)에 대체될 실제값을 지정함
			pstmt.setInt(1, 203);
			

			// 쿼리실행
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("profno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.println(rs.getString("position") + "\t");
			}
			
			System.out.println("행이 수정 되었습니다.");
			
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException s) {
				s.printStackTrace();
			}
			
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
