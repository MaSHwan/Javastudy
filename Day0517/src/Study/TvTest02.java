package Study;

public class TvTest02 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		//t2 = t1;
		
		System.out.println("t1�� ���� ä�� ���� " + t1.channel + "�� �̴�.");
		System.out.println("t1�� ���� ä�� ���� " + t2.channel + "�� �̴�.");
		t2= t1;// t1�� �����ϰ� �ִ� �ּҰ��� t2�� �����Ѵ�.
		t1.channel = 7;
		System.out.println("t1�� ���� ä�� ���� 7������ ���� �Ǿ���");
		System.out.println("t2�� ���� ä�� ���� " + t2.channel + "�� �̴�.");
		
	}
}
