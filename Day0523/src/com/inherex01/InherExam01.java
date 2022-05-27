package com.inherex01;
/*
 * 		상속시 주의 사항
 * 
 * 		-상위 클래스에서 선언됨 멤버변수와 하위 클래스에서 선언한 멤버 변수가 같으면
 * 		 상위 클래스의 멤버변수가 무시됨
 * 		 이때, 상위 클래스의 멤버변수를 사용하기 위해서는 super라는 키워드를 이용함
 * 
 * 		- 동일한 이름의 멤버 변수나 동일한 이름의 메소드가 한 클래스 안에 정의 되는 경우는 에러가 발생됨
 */

// 부모 클래스
class SuperTest {
	protected double area;
	private String title;

	public SuperTest() {
		System.out.println("SuperTest() .. 인자가 없는 생성자...");
	}

	public SuperTest(String title) {
		this.title = title;
	}

	public void write() {
		System.out.println(title + " " + area);
	}
}

// 자식 클래스
class Rect extends SuperTest {
	/*
	 * protected double area;
	 * 
	 * public void write() { System.out.println(title + " " + area); }
	 */

	private int w, h;

	public Rect() {
		// super(); 생략가능
	}

	// 연산 메소드 구현
	public void calc(int w, int h) {
		this.w = w;
		this.h = h;
		area = (double) this.w * this.h;
		write();
	}

	@Override
	public void write() {
		/*
		 * 메소드 오버라이딩
		 * 
		 * 상위 클래스를 상속받은 하위 클래스에서 상위 클래스에 정의된 메소드를 재정의 하는것을 의미함
		 * 
		 * 객체지향 프로그램의 특징인 다형성을 나타냄
		 * 
		 * 재정의 반드시 상속관계에 있어야하며 메소드 이름, 리턴타입, 매개변수의 개수나 타입이 완전히 일치해야함
		 */

		System.out.println("w : " + w + ", h : " + h);
		System.out.println("사각형의 넓이는 " + area);
	}

}

class Circle extends SuperTest {
	public Circle(String title) {
		super(title);
	}

	public void calc(int r) {
		area = r * r * 3.1141592;
		write();
	}
}

public class InherExam01 {

	public static void main(String[] args) {
		Rect r = new Rect();

		Circle c = new Circle("원의 넓이 : ");

		r.calc(10, 5);
		c.calc(30);
	}

}

/*
 * super - static 으로 선언되지 않은 메소드에서 사용되며, 현재 클래스가 상속받은 하위클래스 객체를 가리킨다.
 * 
 * super는 상위 클래스의 생성자를 호출하거나 상위클래스의 멤버변수 또는 메소드를 호출할때 사용할 수 있다.
 * 
 * 하위 클래스는 생성자에서 상위 클래스의 생성자를 호출할때에는 하위클래스의 생성자 정의 구문에서 맨 처음에만 위치할 수 있다.
 * 
 * 생성자와 클래스의 상속간의 관계
 * 
 * 하위 클래스는 상위 클래스 멤버를 상속 받지만 생성자는 상속되지 않는다.
 * 
 * 하위 클래스의 생성자를 호출할때 자동적으로 상위 클래스의 생성자를 호출된다. 이떄, 상위 클래스의 생성자는 인수가 없는 생성자가 호출된다.
 * 
 * 상위클래스 및 하위 클래스를 작성할때 생성자를 작성하지 않거나 인수가 없는 생성자만을 작성한 경우 명시적으로 하위 클래스에서 상위 클래스의
 * 생성자를 호출하지 않아도 아무런 문제가 발생하지 않지만, 상위 클래스에 인자가 있는 생성자만 존재하는 경우는 문제가 발생될 수 있다.
 */

class A_class {
	public A_class(int n) { // 인자가 있는 생성자

	}
}

class B_class extends A_class {
	public B_class() {
		super(10); // 인자의 형태에 맞춰서 값을 입력하면 오류가 안남.
	}

}
class C_class{
	public C_class(String str) {
		// TODO Auto-generated constructor stub
	}
}

class D_class extends C_class{
	public D_class() {
		super("하이");
	}
}
/*-----------------------------------------------------------------------------------------------
 * 			상위 클래스				|			하위 클래스			| 	 결과					|
 * ----------------------------------------------------------------------------------------------
 * 		생성자를 정의하지 않음			|		  생성자 정의 안함			|	가능하다					|
 * 									|		 인자가 없는 생성자			|	가능하다					|
 * 									|		 인수가 있는 생성자			|	가능하다					|
 * ---------------------------------------------------------------------------------------------			
 * 		인수가 없는 생성자 정의			|		생성자 정의 안함			|	가능하다					|
 * 									|		인수가 없는 생성자			|	가능하다					|
 *									|		인수가 있는 생성자			|	가능하다					|
 *----------------------------------------------------------------------------------------------
 *		인수가 있는 생성자만 정의			|		생성자 정의 안함			|	에러가 발생				|
 *									|		인수가 없는 생성자			|	상위 클래스의 해당 생성자를	|
 *									|								|	호출하지 않으면 에러가 발생함	|
 *									|		인수가 있는 생성자			|	상위 클래스의 해당 생성자를	|
 *									|								|	호출하지 않으면 에러가 발생함	|
 * ----------------------------------------------------------------------------------------------
 */
