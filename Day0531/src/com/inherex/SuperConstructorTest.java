package com.inherex;


class Sawon2 {
	String name;
	String dept;
	int salary;

	

	public Sawon2(String name, String dept, int salary) {
//		super(); // ���� Ŭ������ ������
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	String displayInfo() {
		return "�̸� : " + name + ", �μ� : " + dept + ", ���� : " + salary;
	}
}
	class Sales2 extends Sawon2 {
		int commition;
		public Sales2(String name, String dept, int salary, int commition) {
			super(name, dept, salary);
			this.commition = commition;
		}
		@Override
		String displayInfo() {
			// TODO Auto-generated method stub
			return super.displayInfo() + ", ���� : " + commition;
		}
	}


public class SuperConstructorTest {

	public static void main(String[] args) {
		Sales2 s2 = new Sales2("ȫ�浿", "����", 1000, 500);
		System.out.println(s2.displayInfo());

	}

}
