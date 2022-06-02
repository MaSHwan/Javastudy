package q;

class Z {
	public int a = 10;
// default 는 접근제한자를 생략한 것
// ex) int a;
	protected final int finalMethod() {return 0;}
}

class SubClass extends Z{
//	protected int finalMethod() {return 0;} //오류 
}

public class B extends Z {
	protected int n; // 같은 패키지 내에서는 공유가능
						// 패키지가 달라지면 공유 불가

//	private void g() {	// private를 쓰면 같은 패키지 내에서도 에러
	public void g() {
		n = 5;
		Z z = new Z();

	}
}
