package com.dbex;

import java.sql.*;
import java.io.*;
import java.util.*;
public class JdbcEx09 {
	public static void main(String[] args) throws IOException{
		
		Properties pro = new Properties();
		pro.load(new FileInputStream("src/department.properties"));
		
		PreparedStatement pstmt = null;
		Connection con = null;
		/*
		 * department,properties 에 정의된 sql을 가져와서
		 * preparedStatement 만듦
		 */
		
		try {
			
			// DB연결
			con = ConnUtil.getConnection();
			System.out.println("데이터연결성공");
			pstmt = con.prepareStatement(pro.getProperty("department_insert"));
			
			
			//쿼리의 파라미터 세팅
			// 쿼리의 ?(바인딩 변수)에 대체될 실제값을 지정함
			pstmt.setInt(1, 100);
			pstmt.setString(2, "산업공학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "5호관");

			
			// 쿼리실행
			int i = pstmt.executeUpdate();
			
			System.out.println(i + "행이 추가 되었습니다.");
			
		}
		catch (SQLException se) {
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
