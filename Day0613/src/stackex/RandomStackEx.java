package stackex;

import java.util.Random;
import java.util.Stack;

public class RandomStackEx {
	public static void main(String[] args) {
		
		// ���� ��ü ����
		Random r = new Random();
		
		// ���� ��ü ����
		Stack<Integer> stack = new Stack<>();
		
		int a;

		for (int i = 0; i < 10; i++) {
			a = (int) (Math.random() * 100);
			System.out.print(stack.push(a) + "  ");
			
		}
		System.out.println();
		
		// 10���� ������ ���� ���ÿ� ����
		System.out.print("���ÿ� ����� �� : ");
		for (int i = 0; i < 10; i++) {
			r.setSeed(r.nextLong()); //seed ����
			a = (r.nextInt() % 100); // 0 ~ 99 ������ ���� ����
			stack.push(a); // ���ÿ� ����
			System.out.print(" " +  a);
		}
		// ���ÿ� ���� ���� ���
		System.out.println();
		System.out.print("���ÿ� ����� �� ��� : ");
		for(int i = 0; i < 10; i++) {
			System.out.print(stack.pop() + "  ");
		}
	}
}
