package com.dbex;

import java.sql.*;
public class JdbcEx06 {
public static void main(String[] args) {
		
		// PreparedStatement �� ����ϴ� ���
		// sql�������� ���� ������ ��ü�� �κ��� ? �� ó���Ѵ�. ** �߿�
		// ? �� DB���� sql ����ÿ� ���� ������ ��ü��
		
		
		
		StringBuffer sql = new StringBuffer();
		
		sql.append("update professor ");
		sql.append("set sal =? where name=?");

		
		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			// DB����
			con = ConnUtil.getConnection();
			System.out.println("�����Ϳ��Ἲ��");
			
			pstmt = con.prepareStatement(sql.toString());
			
			//������ �Ķ���� ����
			// ������ ?(���ε� ����)�� ��ü�� �������� ������
			pstmt.setInt(1, 7000);
			pstmt.setString(2, "����ȯ");

			// ��������
			int i = pstmt.executeUpdate();
			
			System.out.println(i + "���� ���� �Ǿ����ϴ�.");
			
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
