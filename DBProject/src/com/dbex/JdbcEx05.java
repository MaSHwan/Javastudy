package com.dbex;

import java.sql.*;

/*
 * ����Ŭ�� ���۵� sql���� parsing -> execute plan -> fetch
 * �۾��� �� ���Ŀ� sql ���� �������� Data Buffer Cache �� ������
 * 
 * �Ȱ��� sql�� ���۵Ǹ� Library cache�� ����� sql�� Parsing �����
 * execute plan �� �״�� ����ϰ� ������ �ӵ� ��� ������ ��
 * 
 * cache(�ӽñ����ġ)
 * 
 * PreparedStatement�� sql�� ���´� �����ϳ� �����̳� �������� �ٸ� ������
 * ���ε������� ����ؼ����ε� ������ ����ؼ� ����ó�������ν� �׻� ������ sql���� 
 * �����ϰ� ó���ϰ� �� �� �ִ�.
 * 
 * -- PreparedStatement ��ü�� ������ ���ε� ������ ���
 * 	  ���ε� ������ ���������� ��ü�� �κп� �����
 *												  deptno, dname, college, loc 	  
 * 	  String sql = "insert into department values(?, ?, ?, ?)"; ����ǥ ��ü�� ���ε� ����
 *    PreparedStatement pstmt = con.prepareStatement(sql);
 *    ���ε� ������ ������ŭ ������� �ش� ������ ��ü�� ���� �������ش�.
 *    pstmt,setint(1,203);
 *    pstmt.setString(2, "��ǻ�Ͱ���");
 *    pstmt.setInt(3, 200);
 *    pstmt.setString(4,"7ȣ��");
 *    
 *    ���ε� ������ ���� �÷����� ����� �� ����.
 *    
 *    PreparedStatement�� PreparedStatement �� ���ε� ������ ���� �������ִ�setXXX() �޼ҵ带 �����Ѵ�.
 *    
 *    
 */
public class JdbcEx05 {
	public static void main(String[] args) {
		
		// PreparedStatement �� ����ϴ� ���
		// sql�������� ���� ������ ��ü�� �κ��� ? �� ó���Ѵ�. ** �߿�
		// ? �� DB���� sql ����ÿ� ���� ������ ��ü��
		
		
		
		StringBuffer sql = new StringBuffer();
		
		sql.append("insert into professor ");
		sql.append("values(?,?,?,?,?,sysdate,?,? )");
		
//		sql.append("insert into professor ");
//		sql.append("values(9920,'����ȯ','Ma Seung Hwan','���ӱ���',5000,sysdate,28,203 )");
		
		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			// DB����
			con = ConnUtil.getConnection();
			System.out.println("�����Ϳ��Ἲ��");
			
			pstmt = con.prepareStatement(sql.toString());
			
			//������ �Ķ���� ����
			// ������ ?(���ε� ����)�� ��ü�� �������� ������
			pstmt.setInt(1, 9920);
			pstmt.setString(2, "����ȯ");
			pstmt.setString(3, "Ma Seung Hwan");
			pstmt.setString(4, "���ӱ���");
			pstmt.setInt(5, 5000);
			pstmt.setInt(6, 28);
			pstmt.setInt(7, 203);
			
			// ��������
			int i = pstmt.executeUpdate();
			
			System.out.println(i + "���� �߰� �Ǿ����ϴ�.");
			
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
