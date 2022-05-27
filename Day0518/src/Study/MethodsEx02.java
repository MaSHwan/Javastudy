package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 		여러가지 기능
 * 		
 * 		1. 최대 수, 2. 사이의 합계, 3. 수열, 4. 종료
 */
public class MethodsEx02 {

	// 최대값 구하는 메소드 작성
	public static int aaa() throws IOException {
		BufferedReader br = new BufferedReader( 
				new InputStreamReader(System.in));
		System.out.print("첫번째 수 입력 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("두번째 수 입력 : ");
		int b = Integer.parseInt(br.readLine());

		if (a > b) {
			return a;
		}
		return b;

	}//end aaa
	//두 수의 합계를 구하는 메소드
	public static void bbb() throws IOException {
		BufferedReader br = new BufferedReader( 
				new InputStreamReader(System.in));
		System.out.print("첫번째 수 입력 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("두번째 수 입력 : ");
		int b = Integer.parseInt(br.readLine());

		//누적 변수 선언
		int tot = 0;
		if(a>b) {
		a = a^b;
		b = b^a;
		a = a^b;
		}
		
		for(int i = a; i <= b; i++) {
			tot += i;
		}
		System.out.println(a + "~~~" + b + "사이의 합계 : " + tot);
	}//end bbb
	
	// 큰 순서대로 나열하는 수열을 구현하는 메소드
	public static String ccc(int x, int y, int z) {// first = x, second = y, third = z
		if(y >= x && y >= z) {
			// swap
			int temp = x;
			x = y;
			y = temp;
		}else if(z >= x && z>= y) {
			int temp = x;
			x = z;
			z = temp;
		}if(z >=y) {
			int temp = y;
			y = z;
			z = temp;
		}
		String abc = x + ">=" + y + ">=" + z;
		return abc;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( // InputStreamReader 와
				new InputStreamReader(System.in)); // BufferedReade 를 같이 쓴것

		int x = 0;

		while (true) {
			System.out.print("1: 최대수 2: 사이 합계 3: 수열 4: 종료");
			x = Integer.parseInt(br.readLine());
			
			if(x == 1) {
				int k = aaa();
				System.out.println("두 수중 최대값은 " + k + " 입니다.");
				
			}else if(x == 2) {// Call by Name
				bbb();
				
			}else if(x == 3) {// Call by Value
				System.out.print("첫번째 수 입력 : ");
				int first = Integer.parseInt(br.readLine());
				System.out.print("두번째 수 입력 : ");
				int second = Integer.parseInt(br.readLine());
				System.out.print("세번째 수 입력 : ");
				int third = Integer.parseInt(br.readLine());
				
				String str = ccc(first, second, third);
				System.out.println("큰 순으로 나열은 " + str);
			}else if(x == 4) {
				break;
			}else {System.out.println("잘못입력 하셨습니다.");}
		}

	}
}
