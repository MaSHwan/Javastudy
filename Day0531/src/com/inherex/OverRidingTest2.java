package com.inherex;

class OverridingPatent2 {
	int money = 20;
	void parentMethod() {
		System.out.println("parent Method");
	}
}

class OverridingChild2 extends OverridingPatent2{
	String money = "2원";
	void ParentMethod() {
		System.out.println("overriding Method");
	}
	
}


public class OverRidingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingChild2 oc2 = new OverridingChild2();
		oc2.money = "30";
//		oc2.money = 20; 부모의 인트형이 자식에게 상속되면서 스트링형으로 바껴서 오류가 난다.
		System.out.println(oc2.money);
	}

}
