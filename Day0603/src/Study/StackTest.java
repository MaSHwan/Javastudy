package Study;

import java.util.Stack;

public class StackTest {

	private static final String colors[] = { // 배열(객체) 생성
			" 검정", " 노랑", " 녹색", " 청색", " 빨강", " 연두"
	};
	
	//생성자 생성
	public StackTest() {
		Stack<String> st = new Stack<>();
		for(String color : colors)
			st.push(color);
			popStack(st);
		
	}
	
	public void popStack(Stack<String>st) {
		System.out.println("pop");
		// 스택이 비어있지 않으면 
		// pop 해라
		while (!st.empty()) {
			System.out.println(st.pop());
		}
		
	}
	
	
	public static void main(String[] args) {
		StackTest st = new StackTest();
	}

}
