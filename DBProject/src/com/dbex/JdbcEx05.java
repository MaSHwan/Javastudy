package com.dbex;

import java.sql.*;

/*
 * 오라클로 전송된 sql문은 parsing -> execute plan -> fetch
 * 작업을 한 이후에 sql 문을 수행결과를 Data Buffer Cache 에 저장함
 * 
 * 똑같은 sql이 전송되면 Library cache에 저장된 sql의 Parsing 결과와
 * execute plan 의 그대로 사용하게 됨으로 속도 향상에 도움을 줌
 * 
 * cache(임시기억장치)
 * 
 * PreparedStatement는 sql의 형태는 동일하나 조건이나 변수값이 다른 문장을
 * 바인딩변수를 사용해서바인딩 변수를 사용해서 변수처리함으로써 항상 동일한 sql문을 
 * 동일하게 처리하게 할 수 있다.
 * 
 * -- PreparedStatement 객체의 생성과 바인딩 변수의 사용
 * 	  바인딩 변수는 실제값으로 대체될 부분에 사용함
 *												  deptno, dname, college, loc 	  
 * 	  String sql = "insert into department values(?, ?, ?, ?)"; 물음표 자체가 바인딩 변수
 *    PreparedStatement pstmt = con.prepareStatement(sql);
 *    바인딩 변수의 개수만큼 순서대로 해당 변수와 대체될 값을 지정해준다.
 *    pstmt,setint(1,203);
 *    pstmt.setString(2, "컴퓨터공학");
 *    pstmt.setInt(3, 200);
 *    pstmt.setString(4,"7호관");
 *    
 *    바인딩 변수는 절대 컬럼명에는 사용할 수 없다.
 *    
 *    PreparedStatement는 PreparedStatement 의 바인딩 변수에 값을 지정해주는setXXX() 메소드를 제공한다.
 *    
 *    
 */
public class JdbcEx05 {
	public static void main(String[] args) {
		
		// PreparedStatement 를 사용하는 경우
		// sql쿼리에서 실제 값으로 대체될 부분을 ? 로 처리한다. ** 중요
		// ? 는 DB에서 sql 실행시에 실제 값으로 대체됨
		
		
		
		StringBuffer sql = new StringBuffer();
		
		sql.append("insert into professor ");
		sql.append("values(?,?,?,?,?,sysdate,?,? )");
		
//		sql.append("insert into professor ");
//		sql.append("values(9920,'마승환','Ma Seung Hwan','전임교수',5000,sysdate,28,203 )");
		
		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			// DB연결
			con = ConnUtil.getConnection();
			System.out.println("데이터연결성공");
			
			pstmt = con.prepareStatement(sql.toString());
			
			//쿼리의 파라미터 세팅
			// 쿼리의 ?(바인딩 변수)에 대체될 실제값을 지정함
			pstmt.setInt(1, 9920);
			pstmt.setString(2, "마승환");
			pstmt.setString(3, "Ma Seung Hwan");
			pstmt.setString(4, "전임교수");
			pstmt.setInt(5, 5000);
			pstmt.setInt(6, 28);
			pstmt.setInt(7, 203);
			
			// 쿼리실행
			int i = pstmt.executeUpdate();
			
			System.out.println(i + "행이 추가 되었습니다.");
			
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
