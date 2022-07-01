package com.dbex;

import java.sql.*;

/*
 *  Transaction
 *  
 *   - 트랜잭션은 여러개의 작업을 하나의 논리적인 작업 단위로 묶어주는 것을 말함
 *     하나의 작업단위내에 전체 작업들이 모두 올바르게 수행되거나, 또는 전체 작업이
 *     모두 수행되지 않도록 한다.
 *     
 *     메소드 종류
 *     
 *     commit(), rollback(), rollback(Savepoint),
 *     setSavepoint(String name), setAutoCommit(Boolean value)
 */
public class JdbcEx08 {
	public static void main(String[] args) {

		/*
		 * Transactiom : 논리적인 작업단위 insert, delete, update 드으이 작업들을 하나의 논리적인 작업단위로 묶어서 쿼리
		 * 실행시 모든 작업이 정상처리 된 경우에는 commit을 실행해서 db에 반영하고, 쿼리 실행 중 하나라도 정상처리되지 않은 경우
		 * rollback을 실행해서 작업단위내의 모든작업을 취소한다.
		 */

		StringBuffer sql = new StringBuffer();

		sql.append("insert into department values(?,?,?,?) ");
//		sql.append(" ");

		StringBuffer sq2 = new StringBuffer();

		sq2.append("update department set dname =?, loc=? where deptno=?");
//		sq2.append(" ");

		PreparedStatement pstmt = null;
		Connection con = null;

		try {

			// DB연결
			con = ConnUtil.getConnection();
			con.setAutoCommit(false);
			/*
			// 첫번째 작업시작
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 255);
			pstmt.setString(2, "핵물리학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "9호관");
			pstmt.executeUpdate();
			// 첫번째 작업 끝
			*/
			// 두번째 작업시작
			pstmt = con.prepareStatement(sq2.toString());
			pstmt.setString(1, "생명공학과");
			pstmt.setString(2, "8호관");
			pstmt.setInt(3, 255);
			pstmt.executeUpdate();
			// 두번째 작업끝
			con.commit();

			System.out.println("d b 변경");

		} catch (SQLException se) {
			try {
				con.rollback();
				System.out.println("db작업 취소");
			} catch (SQLException s) {
				s.printStackTrace();
			}
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
