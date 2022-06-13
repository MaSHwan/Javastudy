package stackex;

import java.util.Random;
import java.util.Stack;

public class RandomStackEx {
	public static void main(String[] args) {
		
		// 랜덤 객체 생성
		Random r = new Random();
		
		// 스택 객체 생성
		Stack<Integer> stack = new Stack<>();
		
		int a;

		for (int i = 0; i < 10; i++) {
			a = (int) (Math.random() * 100);
			System.out.print(stack.push(a) + "  ");
			
		}
		System.out.println();
		
		// 10개의 생성된 수를 스택에 저장
		System.out.print("스택에 저장된 수 : ");
		for (int i = 0; i < 10; i++) {
			r.setSeed(r.nextLong()); //seed 생성
			a = (r.nextInt() % 100); // 0 ~ 99 사이의 숫자 생성
			stack.push(a); // 스택에 저장
			System.out.print(" " +  a);
		}
		// 스택에 저장 수를 출력
		System.out.println();
		System.out.print("스택에 저장된 수 출력 : ");
		for(int i = 0; i < 10; i++) {
			System.out.print(stack.pop() + "  ");
		}
	}
}
