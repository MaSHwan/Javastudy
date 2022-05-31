package com.inherex;

class Super {
	int x = 90;
	void superMethod() {
		System.out.println("super Method");
	}
}

class Sub extends Super{
	int y = 10;
	void subMethod() {
		System.out.println("sub Method");
	}
}

class Subsub extends Sub{
	int z = 20;
	void subSubMethod() {
		System.out.println("subSub Method");
	}
}


public class ExtendTest02 {
	public static void main(String[] args) {
		Subsub sb = new Subsub();
		System.out.println(sb.x);
		System.out.println(sb.y);
		System.out.println(sb.z);
		
		sb.superMethod();
		sb.subMethod();
		sb.subSubMethod();
	}
}
