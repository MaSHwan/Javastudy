package com.excep3;

public class Exception02 {

	public static void main(String[] args) throws Exception{
		
		
		int x = 100;
		int y = 0;
		int tot = 0;
		try {
			tot = x/y;
		}catch(ArithmeticException ae){
			MyException me = new MyException("³ª´°¼À", ae);
			// throw me;
			me.printStackTrace();
		}
		System.out.println("tot : " + tot);
		
	}

}
