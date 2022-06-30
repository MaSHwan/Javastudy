package com.dbex;

import java.sql.*;

public class JdbcEx04 {
	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		sql.append("select deptno, dname, college, loc ");
		sql.append("from department ");
		sql.append("");

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		/*
		 * select ������ ���� ��� ���հ� ������տ��� �����͸� ������ �� �ִ� �޼ҵ�
		 * �� ������ �ִ� ��ü�� ResultSet ��ü��
		 */
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // ����̺�˻�

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String password = "tiger";
			
			// DB����
			con = DriverManager.getConnection(url, id, password);
			stmt = con.createStatement();
			
			/*
			 *  �����ϰ��� �ϴ� sql�� select�� ���
			 *  ���� ������ ��������� ���Ϲ��� �� �ִ�
			 *  executeQuery(0 �� �����
			 */
			rs = stmt.executeQuery(sql.toString());
			/*
			 *  ResultSet ��ü�κ��� ������ ����
			 *  ResultSet�� next() �޼ҵ�� Ŀ���� ���������� �̵���Ŵ
			 *  �̵��� ��ġ�� row(��)�� �����ϸ� true, �������� ������ false�� ��ȯ��
			 *  
			 *  rs.next()�� ���� ����, �� ��� ���տ� ���� �����ϴ� ���� ResultSet���κ���
			 *  �����͸� ������
			 *  
			 *  while(rs.next()){
			 *  
			 *  }
			 */
			
			while(rs.next()) {
				// Ŀ���� ��ġ�� row�� column���� ���� �����ϱ�
				// ResultSet �� getXXX(int, string, ...)(�÷��� ��ġ), getXXX("�÷��� �̸�")
				// �޼ҵ带 �̿��ؼ� column���� ������
				
				int i = rs.getInt(1);// �÷��� ��ġ�� ����� rs.getint("deptno");
				String s1 = rs.getString(2);
				int j = rs.getInt(3);// rs.getInt("college");
				String s2 = rs.getString("loc");
				System.out.println(i + "\t" + s1 + "\t" + j + "\t" + s2);
			}
		
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
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
