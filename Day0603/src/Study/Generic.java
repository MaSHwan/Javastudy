package Study;
/*
 * 		���׸�
 * 
 * 		Generic�� �÷���(�ڷᱸ��) ��, ���� ���ؼ� ��ü���� �����ϴ� �������� ������ �����ϱ� ���� ����
 * 
 * 		������� ���̶�� Ư�� ��ü���ִ�. �� ���� ���� ���� �� �ִ� �� ��, �Ǵ� �� ���� �ֽ��� ������ �ִ� �ֽ���
 * 		�̷��� ��¡���� ���� �ٷ� Generics
 * 
 * 		���׸��� �ʿ伺
 * 		Ư�� �÷��ǿ� ���ϴ� ��ü Ÿ���� ����Ͽ� �����ϱ� ���� �����ϴܰ迡�� ������ ��ü�� �ƴϸ� ����
 * 		������ �Ұ����ϰ� �Ҽ� �ִ�.
 * 	
 * 		���� ���������� �ݵ�� �����Ͽ� �÷��ǿ� �ִ� �ڿ����� �ϳ��� �����Ͽ� Ȯ���� ���ۿ� ������.
 * 		object�κ��� ��ӹ��� ��ü�� ��� ������ �����ߴ� ������ ��������� �޸� ���� ü�����̶� �Ҽ� �ִ�.
 * 		����� �ڿ� ������ �ϰ� �Ǹ� ������ �� ��ȯ(castring)�� �ʿ� ���� <>���̿� �����Ͽ���
 * 		��ü �ڷ� ������ ����Ǿ� ��
 * 
 * 		Generic_class��<������_Generic)Type> ������; // ����
 */

class Box<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}

public class Generic {
	
	
	
	public static void main(String[] args) {
		
		Box<Integer> bi = new Box<Integer>();
		bi.setT(100);
		System.out.println(bi.getT());
		
		Box<String> bs = new Box<String>();
		bs.setT("������");
		System.out.println(bs.getT());
		
		Box<Integer> bit;
		bit = createBox();
		
	}
	
	static Box createBox() {
		
		return new Box();
	}
}
