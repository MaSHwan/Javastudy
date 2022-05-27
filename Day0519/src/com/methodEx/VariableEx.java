package com.methodEx;

/*
 * 		메소드 정의식 통일된 인자의 자료형에 '...'라고 명시하므로 이를 통해 메소드를 수행하는데
 * 		필요한 인자의 수를 유연하게(내부적으로 배열화 작업을 자동으로 해줌) 구현할수 있다.
 */
public class VariableEx {
	public void argsTest(String... n) {
		for (int i = 0; i < n.length; i++) {
			System.out.println("n[" + i + "] : " + n[i]);
		}
	}

	public static void main(String[] args) {
VariableEx ve = new VariableEx();
ve.argsTest("a", "b", "c");
ve.argsTest("100", "600", "1000", "10000");
	}
}
