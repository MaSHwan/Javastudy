package com.dbex;

import java.sql.*;

/*
 *  Transaction
 *  
 *   - Ʈ������� �������� �۾��� �ϳ��� ������ �۾� ������ �����ִ� ���� ����
 *     �ϳ��� �۾��������� ��ü �۾����� ��� �ùٸ��� ����ǰų�, �Ǵ� ��ü �۾���
 *     ��� ������� �ʵ��� �Ѵ�.
 *     
 *     �޼ҵ� ����
 *     
 *     commit(), rollback(), rollback(Savepoint),
 *     setSavepoint(String name), setAutoCommit(Boolean value)
 */
public class JdbcEx08 {
	public static void main(String[] args) {

		/*
		 * Transactiom : ������ �۾����� insert, delete, update ������ �۾����� �ϳ��� ������ �۾������� ��� ����
		 * ����� ��� �۾��� ����ó�� �� ��쿡�� commit�� �����ؼ� db�� �ݿ��ϰ�, ���� ���� �� �ϳ��� ����ó������ ���� ���
		 * rollback�� �����ؼ� �۾��������� ����۾��� ����Ѵ�.
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

			// DB����
			con = ConnUtil.getConnection();
			con.setAutoCommit(false);
			/*
			// ù��° �۾�����
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 255);
			pstmt.setString(2, "�ٹ����а�");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "9ȣ��");
			pstmt.executeUpdate();
			// ù��° �۾� ��
			*/
			// �ι�° �۾�����
			pstmt = con.prepareStatement(sq2.toString());
			pstmt.setString(1, "������а�");
			pstmt.setString(2, "8ȣ��");
			pstmt.setInt(3, 255);
			pstmt.executeUpdate();
			// �ι�° �۾���
			con.commit();

			System.out.println("d b ����");

		} catch (SQLException se) {
			try {
				con.rollback();
				System.out.println("db�۾� ���");
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
