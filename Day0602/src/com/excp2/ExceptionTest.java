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
			startInstall();	// 파일의 프로그램 설치할 준비
			copyFiles();	// 파일을 복사
			
		}catch (SpaceException se) {
			InstallException ie = new InstallException("설치중 예외 발생..");
			ie.initCause(se);	// 지정한 예외를 원인으로 등록하는 기능
			throw ie;			// 원인예외를 반환함
		}catch (MemoryException me) {
			InstallException ie = new InstallException("설치중 예외 발생..");
			ie.initCause(me);	// 지정한 예외를 원인으로 등록하는 기능
			throw ie;			// 원인예외를 반환함
		}finally {
			deleteTempFiles();	// 프로그램 설치에 사용된 임시파일들을 제거한다.
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
