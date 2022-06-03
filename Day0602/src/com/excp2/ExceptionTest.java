package com.excp2;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			Install();
		}catch(InstallException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void Install() throws InstallException{
		
		try {
			startInstall();	// ������ ���α׷� ��ġ�� �غ�
			copyFiles();	// ������ ����
			
		}catch (SpaceException se) {
			InstallException ie = new InstallException("��ġ�� ���� �߻�..");
			ie.initCause(se);	// ������ ���ܸ� �������� ����ϴ� ���
			throw ie;			// ���ο��ܸ� ��ȯ��
		}catch (MemoryException me) {
			InstallException ie = new InstallException("��ġ�� ���� �߻�..");
			ie.initCause(me);	// ������ ���ܸ� �������� ����ϴ� ���
			throw ie;			// ���ο��ܸ� ��ȯ��
		}finally {
			deleteTempFiles();	// ���α׷� ��ġ�� ���� �ӽ����ϵ��� �����Ѵ�.
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
