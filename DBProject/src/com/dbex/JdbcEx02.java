package com.dbex;

import java.sql.*;

public class JdbcEx02 { // update : ������ ��ǻ�Ͱ������� �ٲٱ� ���� �а���ȣ = 203
	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		sql.append("update department ");
		sql.append("set dname='��ǻ�Ͱ��а�' ");
		sql.append("where deptno=203");

		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // ����̺�˻�

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String password = "tiger";

			con = DriverManager.getConnection(url, id, password);
			stmt = con.createStatement();
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + " ���� ���� �����Ǿ����ϴ�.");
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
