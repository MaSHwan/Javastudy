package Study;

public class TvTest03 {
	public static void main(String[] args) {
		Tv[] tv; // ��ü �迭 ����
		tv = new Tv[5];
		
		
		for(int i = 0; i < tv.length; i++) {
			tv[i] = new Tv();
			tv[i].channel = i + 10; // tv[i]�� ä�ο� i + 10�� �����Ѵ�.
			System.out.println(tv[i].channel);
		}
		
		for(int i = 0; i < tv.length; i++) {
			tv[i].channelup();	// tv[i].channelup() �޼ҵ带 ȣ���Ͽ� ä���� 1����
			System.out.printf("tv[%d].channel = %d\n", i, tv[i].channel);
		}
	}
}
