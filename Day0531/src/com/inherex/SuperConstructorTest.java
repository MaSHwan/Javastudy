package com.inherex;


class Sawon2 {
	String name;
	String dept;
	int salary;

	

	public Sawon2(String name, String dept, int salary) {
//		super(); // 슈퍼 클래스의 생성자
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	String displayInfo() {
		return "이름 : " + name + ", 부서 : " + dept + ", 연봉 : " + salary;
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
			return super.displayInfo() + ", 수당 : " + commition;
		}
	}


public class SuperConstructorTest {

	public static void main(String[] args) {
		Sales2 s2 = new Sales2("홍길동", "개발", 1000, 500);
		System.out.println(s2.displayInfo());

	}

}
