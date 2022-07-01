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
		 * department,properties �� ���ǵ� sql�� �����ͼ�
		 * preparedStatement ����
		 */
		
		try {
			
			// DB����
			con = ConnUtil.getConnection();
			System.out.println("�����Ϳ��Ἲ��");
			pstmt = con.prepareStatement(pro.getProperty("department_insert"));
			
			
			//������ �Ķ���� ����
			// ������ ?(���ε� ����)�� ��ü�� �������� ������
			pstmt.setInt(1, 100);
			pstmt.setString(2, "������а�");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "5ȣ��");

			
			// ��������
			int i = pstmt.executeUpdate();
			
			System.out.println(i + "���� �߰� �Ǿ����ϴ�.");
			
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
