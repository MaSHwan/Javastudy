package com.excp2;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		startInstall();//���α׷� ��ġ �غ�
		copyFiles();
		}catch (SpaceException e) {
			System.out.println("���� ����");
			// TODO: handle exception
		}catch (MemoryException e) {
			System.out.println("�޸� ����");
			// TODO: handle exception
		}finally {
			deleteTempFiles();
		}
	}
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace()) {// ���α׷� ��ġ�� ������ ������ ���
			throw new SpaceException("��ġ�� ������ �ſ� ����");
		}
		if(!enoughMemory()) {
			throw new MemoryException("�޸𸮰� ����");
		}
	}
	
	static boolean enoughSpace() {
		return false;
	}
	
	static boolean enoughMemory() {
		return true;
	}
	
	static void copyFiles() {// ���� ����
		
	}
	static void deleteTempFiles() {// �ӽ� ���� ����
		
	}
}
