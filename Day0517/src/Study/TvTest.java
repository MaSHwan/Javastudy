package Study;

public class TvTest extends Tv{
	public static void main(String[] args) {

		Tv t; // Tv �ν��Ͻ��� �����ϱ� ���� ���� t�� �����ߴ�.
		t = new Tv(); // �ν��Ͻ��� �����ߴ�(�ν��Ͻ� = ��ü)
		t.channel = 24;	// Tv��ü�� ������� ä�� ���� 24�� �����ߴ�.
		t.channeldown();// 23 : ���մ���
		System.out.println("���� ä���� " + t.channel + " �Դϴ�.");
		
	}
}
