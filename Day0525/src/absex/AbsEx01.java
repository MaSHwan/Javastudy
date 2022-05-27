package absex;

public abstract class AbsEx01 {
	int a = 10; // 변수
	final String str = "abstract"; // 상수

	public String getStr() { // 일반 메소드
		return str;
	}
	// 추상메소드
	abstract public int getA();
}
