package Study;

public class Tv {

	// Ŭ������ �������(�Ӽ� + �޼ҵ�)
	// �Ӽ�(�⺭ ����, �ʵ�)
	String color;
	boolean power;
	int channel;
	
	
	// Tv�� ���(�޼ҵ�)
	public void power() {
		power = !power; // ó��
		//����� ������
		 // return power;
	}
	
	public void channelup() {
		++channel;
	}
	
	public void channeldown() {
		--channel;
	}
}
