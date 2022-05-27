package Study;

public class MethodEx_01 {
	public static void X() {
		for (int a = 0; a < 5; a++) {
			System.out.print("*");
		}
		return;
		// 결과형 return 값이 void일 경우 return문은 생략이 가능하다
	}

	public static void main(String[] args) {
		
		X();
		
//		for (int a = 0; a < 5; a++) {
//			System.out.print("*");
//		}
		System.out.println("\nHello");
		
		X();
//		for (int a = 0; a < 5; a++) {
//			System.out.print("*");
//		}
		System.out.println("\nJava");
		X();
//		for (int a = 0; a < 5; a++) {
//			System.out.print("*");
//		}
		System.out.println("\n!!!!");
//		for (int a = 0; a < 5; a++) {
//			System.out.print("*");
//		}
		X();
	}
}
