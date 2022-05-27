package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodsEx03 {
	public static int plus(int su1, int su2) {

		return su1 + su2;
	}

	public static int minus(int x, int y) {

		return x - y;
	}

	public static int mul(int x, int y) {

		return x * y;
	}

	public static int div(int x, int y) {

		return x / y;
	}

	public static int per(int x, int y) {

		return x % y;
	}

	public static void disp(int a, char b, int c, int d) {
		// a : 첫번째 수, b : 연산자, c : 두번째 수, d : 결과값
		System.out.println("\n" + a + " " + b + " " + c + " = " + d);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 변수 선언
		int su1 = 0, su2 = 0, tot = 0;
		char yon = 0;

		System.out.print("첫번째 수 입력 : ");
		 su1 = Integer.parseInt(br.readLine());
		do {
			System.out.print("yon(+, -, *, /, %) : ");
			yon = (char) System.in.read();
			 System.in.read();
			 System.in.read();

			//System.in.skip(1);
		} while (yon != '+' && yon != '-' && yon != '*' && yon != '/' && yon != '%');
		System.out.print("두번째 수 입력 : ");
		su2 = Integer.parseInt(br.readLine());

		switch (yon) {
		case '+':
			//tot = su1 + su2;
			tot = plus(su1, su2);
			break;
		case '-':
			//tot = su1 - su2;
			tot = minus(su1, su2);
			break;
		case '*':
			//tot = su1 * su2;
			tot = mul(su1, su2);
			break;
		case '/':
			//tot = su1 / su2;
			tot = div(su1, su2);
			break;
		case '%':
			//tot = su1 % su2;
			tot = per(su1, su2);
			break;

		}
		//System.out.println(su1 + " " + yon + " " + su2 + " = " + tot);
		disp(su1,yon,su2,tot);
	}
}
