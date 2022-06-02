package com.excp2;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		startInstall();//프로그램 설치 준비
		copyFiles();
		}catch (SpaceException e) {
			System.out.println("공간 부족");
			// TODO: handle exception
		}catch (MemoryException e) {
			System.out.println("메모리 부족");
			// TODO: handle exception
		}finally {
			deleteTempFiles();
		}
	}
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace()) {// 프로그램 설치시 공간이 부족한 경우
			throw new SpaceException("설치할 공간이 매우 부족");
		}
		if(!enoughMemory()) {
			throw new MemoryException("메모리가 부족");
		}
	}
	
	static boolean enoughSpace() {
		return false;
	}
	
	static boolean enoughMemory() {
		return true;
	}
	
	static void copyFiles() {// 파일 복사
		
	}
	static void deleteTempFiles() {// 임시 파일 삭제
		
	}
}
