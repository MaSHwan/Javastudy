package q;

class Z {
	public int a = 10;
// default �� ���������ڸ� ������ ��
// ex) int a;
}

public class B extends Z {
	protected int n;	// ���� ��Ű�� �������� ��������
						// ��Ű���� �޶����� ���� �Ұ�

//	private void g() {	// private�� ���� ���� ��Ű�� �������� ����
		public void g() {
		n = 5;
		Z z = new Z();

	}
}
