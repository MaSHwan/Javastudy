package com.inherex;

class OverridingParent{
	void parentMethod() {
		System.out.println("parentMethod");
	}
}

class OverridingChild extends OverridingParent{
	void parentMethod() {
		System.out.println("childMethod");
	}
}
/*
 * 		�������̵��� ������ �� �ִ� ��Ģ
 * 		1. �θ� Ŭ������ �ڽ� Ŭ���� ���̿����� �����Ѵ�.
 * 		2. static �޼ҵ�� Ŭ������ ���ϴ� �޼ҵ��̱� ������ ��� ��ü�� �ȵȴ�.
 * 			���� �������̵��� �� �� ����.
 * 		3. ���� �����ڰ� private�� ���ǵ� �޼ҵ�� ��� ��ü�� ���� �ʴ´�.
 * 		4. interface�� �����ؼ� �޼ҵ带 �������̵� �Ҷ��� �ݵ�� ���������ڸ� public���� ���� �ؾ��Ѵ�.
 * 		5. �޼ҵ��� ������ ������ Ÿ��(�ڷ���)�� ������ ��ġ�ؾ��ϰ� ����Ÿ�Ա��� ��ġ�ؾ��Ѵ�.
 * 		6. �θ�Ŭ������ �޼ҵ��� ���� �����ں��� �� ������ �� ����.
 * 			public > protect > default > private
 * 		7. �θ� Ŭ������ �޼ҵ庸�� �� ���� ���ܸ� ���� �� ����.
 * 		8.��final ���� ������ �޼ҵ�� �������̵� �� �� ����.
 */

public class OverRidingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingChild oc = new OverridingChild();
		oc.parentMethod();
	}

}
