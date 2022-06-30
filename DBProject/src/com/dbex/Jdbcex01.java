package com.dbex;

import java.sql.*; // DB ����

public class Jdbcex01 {

	public static void main(String[] args) {
		Connection con = null; // ���� ��ü ����
		Statement stmt = null;

		try {
			// jdbc ����̺� �޸𸮿� �ε��ϱ�
			Class.forName("oracle.jdbc.driver.OracleDriver"); // �̸�����

			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");// ���� ��ü ���
			System.out.println("�����ͺ��̽� ���� ����");

			// �����̵� ���� ���Ŀ� �ؾ���
			// Statement ��ü���
			stmt = con.createStatement();

			// sql ������ �ۼ�
			StringBuffer sql = new StringBuffer();

			sql.append("insert into department ");// department �ڿ� �ݵ�� ������ �־����
			sql.append("values(203, '����������а�', 200, '7ȣ��')");

			// ������ ����
			int result = stmt.executeUpdate(sql.toString()); // executeupdate �� ����, ����, �����Ҷ� �����
			// executeUpdate(sql.toString()); �� insert ,update, delete
			// select : executeQuery(sql.toString());
			System.out.println(result + "�� ���� �߰��Ǿ����ϴ�.");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {

			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException s) {
			}

			try {
				if (con != null)
					con.close();
			} catch (SQLException s) {
			}
		}
	}

}
