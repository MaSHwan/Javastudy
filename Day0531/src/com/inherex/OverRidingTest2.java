package com.inherex;

class OverridingPatent2 {
	int money = 20;
	void parentMethod() {
		System.out.println("parent Method");
	}
}

class OverridingChild2 extends OverridingPatent2{
	String money = "2��";
	void ParentMethod() {
		System.out.println("overriding Method");
	}
	
}


public class OverRidingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingChild2 oc2 = new OverridingChild2();
		oc2.money = "30";
//		oc2.money = 20; �θ��� ��Ʈ���� �ڽĿ��� ��ӵǸ鼭 ��Ʈ�������� �ٲ��� ������ ����.
		System.out.println(oc2.money);
	}

}
