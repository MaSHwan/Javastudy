package q;

class Z {
	public int a = 10;
// default �� ���������ڸ� ������ ��
// ex) int a;
	protected final int finalMethod() {return 0;}
}

class SubClass extends Z{
//	protected int finalMethod() {return 0;} //���� 
}

public class B extends Z {
	protected int n; // ���� ��Ű�� �������� ��������
						// ��Ű���� �޶����� ���� �Ұ�

//	private void g() {	// private�� ���� ���� ��Ű�� �������� ����
	public void g() {
		n = 5;
		Z z = new Z();

	}
}
