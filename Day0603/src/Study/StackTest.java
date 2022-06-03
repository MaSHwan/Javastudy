package Study;

import java.util.Stack;

public class StackTest {

	private static final String colors[] = { // �迭(��ü) ����
			" ����", " ���", " ���", " û��", " ����", " ����"
	};
	
	//������ ����
	public StackTest() {
		Stack<String> st = new Stack<>();
		for(String color : colors)
			st.push(color);
			popStack(st);
		
	}
	
	public void popStack(Stack<String>st) {
		System.out.println("pop");
		// ������ ������� ������ 
		// pop �ض�
		while (!st.empty()) {
			System.out.println(st.pop());
		}
		
	}
	
	
	public static void main(String[] args) {
		StackTest st = new StackTest();
	}

}
