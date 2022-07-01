package com.dbex;

import java.sql.*;

public class JdbcEx07 {
public static void main(String[] args) {
		
		// PreparedStatement �� ����ϴ� ���
		// sql�������� ���� ������ ��ü�� �κ��� ? �� ó���Ѵ�. ** �߿�
		// ? �� DB���� sql ����ÿ� ���� ������ ��ü��
		
		
		
		StringBuffer sql = new StringBuffer();
		
		sql.append("select a.name, a.profno, a.position, b.dname from professor a, department b where a.deptno = b.deptno ");
		sql.append("and a.deptno = ? ");

		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {

			// DB����
			con = ConnUtil.getConnection();
			System.out.println("�����Ϳ��Ἲ��");
			
			pstmt = con.prepareStatement(sql.toString());
			
			
			
			//������ �Ķ���� ����
			// ������ ?(���ε� ����)�� ��ü�� �������� ������
			pstmt.setInt(1, 203);
			

			// ��������
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("profno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.println(rs.getString("position") + "\t");
			}
			
			System.out.println("���� ���� �Ǿ����ϴ�.");
			
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
