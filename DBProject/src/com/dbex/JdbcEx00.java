package com.dbex;
import java.sql.*;
public class JdbcEx00 { // update : ������ ��ǻ�Ͱ������� �ٲٱ� ���� �а���ȣ = 203
	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		sql.append(" ");
		sql.append(" ");
		sql.append("");

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

/*
 *  JDBC(Java DataBase Connection)�� �̿��� �����ͺ��̽� ���� ���
 *  
 *  �� 6�ܰ�� �̷�����ִ�.
 *  
 *  1�ܰ�
 *   - import java.sql.*;
 *   
 *  2�ܰ�
 *   - Driver �˻��ܰ�
 *     oracle: oracle.jdbc.driver.OracleDriver
 *  3�ܰ�
 *   - DataBase�� ����
 *     Connection con = DriverManager.getConnection(url, id, password); �� �̿��ؼ� ����
 *     oracle url = jdbc:oracle:thin:@localhost:1521:SID(orcl)
 *     id = ����Ŭ ����� ����
 *     password = ����Ŭ ����� ������ ��й�ȣ
 *     
 * -------------------------------������� ������ �ؾߵǴ� �⺻----------------------------
 * 
 *  4�ܰ�
 *   - ������ �ۼ�
 *   
 *     ����
 *     Statement Class(����)
 *      - Statement stmt = con.createStatement();
 *     ����
 *     PreparedStatement(����)
 *      - PreparedStatement pstmt= con.prepareStatement(����);
 *      
 *  5�ܰ�
 *   - ���� ��� ����
 *   
 *     ����
 *     ResultSet rs = stmt.executeQuery(query); // select �� ��
 *     ResultSet rs = stmt.executeUpdate(query); // insert, update, delete
 *     
 *     ����
 *     ResultSet rs = pstmt.executeQuery(query); // select 
 *     ResultSet rs = pstmt.executeUpdate(query); // insert, update, delete
 *     
 *  6�ܰ�
 *   - ��� �� �ݵ�� close() �޼ҵ带 �����Ѵ�.
 *     ���� ����
 */

